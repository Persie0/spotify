package com.spotify.connectivity.auth.clienttoken.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsClientToken$AcquireFailure extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final EsClientToken$AcquireFailure DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int code_;
    private String message_ = "";

    static {
        EsClientToken$AcquireFailure esClientToken$AcquireFailure = new EsClientToken$AcquireFailure();
        DEFAULT_INSTANCE = esClientToken$AcquireFailure;
        AbstractC0269h.registerDefaultInstance(EsClientToken$AcquireFailure.class, esClientToken$AcquireFailure);
    }

    private EsClientToken$AcquireFailure() {
    }

    /* JADX INFO: renamed from: p */
    public static EsClientToken$AcquireFailure m7463p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "message_"});
        }
        if (iOrdinal == 3) {
            return new EsClientToken$AcquireFailure();
        }
        if (iOrdinal == 4) {
            return new iiw(14);
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
        synchronized (EsClientToken$AcquireFailure.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m7464o() {
        return this.code_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
