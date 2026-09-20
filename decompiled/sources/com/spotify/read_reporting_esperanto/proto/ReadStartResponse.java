package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.b151;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadStartResponse extends AbstractC0269h implements sre0 {
    private static final ReadStartResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private gva sessionId_ = gva.f84678b;
    private int statusCode_;

    static {
        ReadStartResponse readStartResponse = new ReadStartResponse();
        DEFAULT_INSTANCE = readStartResponse;
        AbstractC0269h.registerDefaultInstance(ReadStartResponse.class, readStartResponse);
    }

    private ReadStartResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static ReadStartResponse m20195p(byte[] bArr) {
        return (ReadStartResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"statusCode_", "sessionId_"});
        }
        if (iOrdinal == 3) {
            return new ReadStartResponse();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 13);
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
        synchronized (ReadStartResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final gva m20196n() {
        return this.sessionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final b151 m20197o() {
        b151 b151Var;
        int i = this.statusCode_;
        if (i == 0) {
            b151Var = b151.INVALID_STATUS_CODE;
        } else if (i != 1) {
            b151Var = i != 2 ? null : b151.ERROR;
        } else {
            b151Var = b151.SUCCESS;
        }
        return b151Var == null ? b151.UNRECOGNIZED : b151Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
