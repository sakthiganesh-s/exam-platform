package com.examination.events;
public record ExamSubmittedEvent(Long candidateId, Long examId, int score) {}
