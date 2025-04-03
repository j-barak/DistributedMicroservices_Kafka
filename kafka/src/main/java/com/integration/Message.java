package com.integration;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime timestamp) {
}

