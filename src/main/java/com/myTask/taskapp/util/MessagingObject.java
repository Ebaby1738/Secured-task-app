package com.myTask.taskapp.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessagingObject {
    private static final long serialVersionUID = 1L;
    private String subject;
    private String title;

    private String senderName;

    private String message;

    private String destinationEmail;

    private MessagingPurpose purpose;
}
