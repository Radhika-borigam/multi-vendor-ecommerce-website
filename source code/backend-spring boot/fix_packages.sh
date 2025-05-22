#!/bin/bash

# Move everything from com.zosh to com.tillu
find src/main/java/com/zosh -type f -name "*.java" | while read file; do
    filename=$(basename "$file")
    dirname=$(dirname "$file" | sed 's/zosh/tillu/')
    mkdir -p "$dirname"
    
    # If a file with same name exists in tillu, diff them and keep the newer one
    if [ -f "${file/zosh/tillu}" ]; then
        if [ "$file" -nt "${file/zosh/tillu}" ]; then
            cp "$file" "${file/zosh/tillu}"
        fi
    else
        cp "$file" "${file/zosh/tillu}"
    fi

    # Update package declaration
    sed -i 's/package com.zosh/package com.tillu/' "${file/zosh/tillu}"
    sed -i 's/import com.zosh/import com.tillu/' "${file/zosh/tillu}"
done

# Remove the zosh directory after copying is done
rm -rf src/main/java/com/zosh
