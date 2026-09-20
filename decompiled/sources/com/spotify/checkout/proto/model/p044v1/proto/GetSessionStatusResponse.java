package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ib10;
import p204p.jb10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetSessionStatusResponse extends AbstractC0269h implements sre0 {
    private static final GetSessionStatusResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        GetSessionStatusResponse getSessionStatusResponse = new GetSessionStatusResponse();
        DEFAULT_INSTANCE = getSessionStatusResponse;
        AbstractC0269h.registerDefaultInstance(GetSessionStatusResponse.class, getSessionStatusResponse);
    }

    private GetSessionStatusResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6199n(GetSessionStatusResponse getSessionStatusResponse) {
        getSessionStatusResponse.getClass();
        getSessionStatusResponse.status_ = jb10.STATUS_COMPLETED.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static GetSessionStatusResponse m6200o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ib10 m6201q() {
        return (ib10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new GetSessionStatusResponse();
        }
        if (iOrdinal == 4) {
            return new ib10(DEFAULT_INSTANCE);
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
        synchronized (GetSessionStatusResponse.class) {
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

    /* JADX INFO: renamed from: p */
    public final jb10 m6202p() {
        jb10 jb10Var;
        int i = this.status_;
        if (i == 0) {
            jb10Var = jb10.STATUS_UNKNOWN;
        } else if (i == 1) {
            jb10Var = jb10.STATUS_OPEN;
        } else if (i == 2) {
            jb10Var = jb10.STATUS_LOCKED;
        } else if (i != 3) {
            jb10Var = i != 4 ? null : jb10.STATUS_COMPLETED;
        } else {
            jb10Var = jb10.STATUS_EXPIRED;
        }
        return jb10Var == null ? jb10.UNRECOGNIZED : jb10Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
