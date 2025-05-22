package com.tillu.ai.services;

import com.tillu.exception.ProductException;
import com.tillu.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
