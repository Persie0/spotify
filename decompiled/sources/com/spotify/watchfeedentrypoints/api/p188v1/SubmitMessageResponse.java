package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SubmitMessageResponse extends AbstractC0269h implements sre0 {
    private static final SubmitMessageResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 5;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;
    private String sessionId_ = "";
    private String messageId_ = "";

    static {
        SubmitMessageResponse submitMessageResponse = new SubmitMessageResponse();
        DEFAULT_INSTANCE = submitMessageResponse;
        AbstractC0269h.registerDefaultInstance(SubmitMessageResponse.class, submitMessageResponse);
    }

    private SubmitMessageResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0004", new Object[]{"bitField0_", "status_", "sessionId_", "messageId_", "submitTimestampMs_", "retryAfterMs_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMessageResponse();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 9);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (SubmitMessageResponse.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getMessageId() {
        return this.messageId_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    /* JADX INFO: renamed from: n */
    public final Status m22978n() {
        Status status = this.status_;
        return status == null ? Status.m22973o() : status;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
