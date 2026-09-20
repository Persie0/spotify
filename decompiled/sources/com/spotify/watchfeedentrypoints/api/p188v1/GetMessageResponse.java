package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class GetMessageResponse extends AbstractC0269h implements sre0 {
    private static final GetMessageResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;

    static {
        GetMessageResponse getMessageResponse = new GetMessageResponse();
        DEFAULT_INSTANCE = getMessageResponse;
        AbstractC0269h.registerDefaultInstance(GetMessageResponse.class, getMessageResponse);
    }

    private GetMessageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0002", new Object[]{"bitField0_", "status_", "retryAfterMs_", "submitTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new GetMessageResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 23);
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
        synchronized (GetMessageResponse.class) {
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

    public final int getRetryAfterMs() {
        return this.retryAfterMs_;
    }

    /* JADX INFO: renamed from: n */
    public final Status m22953n() {
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
