package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: a */
    public final InvalidProtocolBufferException m1679a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
