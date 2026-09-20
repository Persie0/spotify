package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v8t0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class PuffinErrorOuterClass$PuffinError extends AbstractC0269h implements sre0 {
    private static final PuffinErrorOuterClass$PuffinError DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private String reason_ = "";
    private int statusCode_;

    static {
        PuffinErrorOuterClass$PuffinError puffinErrorOuterClass$PuffinError = new PuffinErrorOuterClass$PuffinError();
        DEFAULT_INSTANCE = puffinErrorOuterClass$PuffinError;
        AbstractC0269h.registerDefaultInstance(PuffinErrorOuterClass$PuffinError.class, puffinErrorOuterClass$PuffinError);
    }

    private PuffinErrorOuterClass$PuffinError() {
    }

    /* JADX INFO: renamed from: o */
    public static PuffinErrorOuterClass$PuffinError m20005o(byte[] bArr) {
        return (PuffinErrorOuterClass$PuffinError) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"statusCode_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PuffinErrorOuterClass$PuffinError();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 3);
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
        synchronized (PuffinErrorOuterClass$PuffinError.class) {
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
    public final v8t0 m20006n() {
        v8t0 v8t0Var;
        int i = this.statusCode_;
        if (i == 0) {
            v8t0Var = v8t0.UNKNOWN_FAILURE;
        } else if (i == 2) {
            v8t0Var = v8t0.GENERAL_ERROR;
        } else if (i != 3) {
            v8t0Var = i != 4 ? null : v8t0.NOT_COMPATIBLE_WITH_RUNTIME;
        } else {
            v8t0Var = v8t0.INVALID_FILE;
        }
        return v8t0Var == null ? v8t0.UNRECOGNIZED : v8t0Var;
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
