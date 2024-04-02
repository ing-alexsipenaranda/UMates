package com.uniClassMates.socialNetwork.domain.models;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ChatMessage {
        private MessageType type;
        private String content;
        private String sender;
}
