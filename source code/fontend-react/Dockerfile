# Build stage
FROM node:16-alpine as build

WORKDIR /app

# Copy package files
COPY fontend-react/package*.json ./

# Install dependencies
RUN npm install

# Copy source files
COPY fontend-react/ .

# Build the app
RUN npm run build

# Production stage
FROM nginx:alpine

# Copy built assets from build stage
COPY --from=build /app/build /usr/share/nginx/html

# Copy nginx configuration
COPY fontend-react/nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
