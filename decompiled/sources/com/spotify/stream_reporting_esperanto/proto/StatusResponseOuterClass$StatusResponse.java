package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c151;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StatusResponseOuterClass$StatusResponse extends AbstractC0269h implements sre0 {
    private static final StatusResponseOuterClass$StatusResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private int statusCode_;

    static {
        StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse = new StatusResponseOuterClass$StatusResponse();
        DEFAULT_INSTANCE = statusResponseOuterClass$StatusResponse;
        AbstractC0269h.registerDefaultInstance(StatusResponseOuterClass$StatusResponse.class, statusResponseOuterClass$StatusResponse);
    }

    private StatusResponseOuterClass$StatusResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static StatusResponseOuterClass$StatusResponse m21629n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static StatusResponseOuterClass$StatusResponse m21630p(byte[] bArr) {
        return (StatusResponseOuterClass$StatusResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"statusCode_"});
        }
        if (iOrdinal == 3) {
            return new StatusResponseOuterClass$StatusResponse();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 16);
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
        synchronized (StatusResponseOuterClass$StatusResponse.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final c151 m21631o() {
        c151 c151Var;
        int i = this.statusCode_;
        if (i == 0) {
            c151Var = c151.INVALID_STATUS_CODE;
        } else if (i == 1) {
            c151Var = c151.SUCCESS;
        } else if (i == 2) {
            c151Var = c151.EVENT_SENDER_ERROR;
        } else if (i == 3) {
            c151Var = c151.INVALID_STREAM_HANDLE;
        } else if (i != 4) {
            c151Var = i != 5 ? null : c151.IGNORED;
        } else {
            c151Var = c151.PENDING_EVENTS_ERROR;
        }
        return c151Var == null ? c151.UNRECOGNIZED : c151Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
