package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cc10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTransitionChildConfigRequest extends AbstractC0269h implements sre0 {
    private static final GetTransitionChildConfigRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private int transitionSourceCase_ = 0;
    private Object transitionSource_;

    static {
        GetTransitionChildConfigRequest getTransitionChildConfigRequest = new GetTransitionChildConfigRequest();
        DEFAULT_INSTANCE = getTransitionChildConfigRequest;
        AbstractC0269h.registerDefaultInstance(GetTransitionChildConfigRequest.class, getTransitionChildConfigRequest);
    }

    private GetTransitionChildConfigRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12146n(GetTransitionChildConfigRequest getTransitionChildConfigRequest, String str) {
        getTransitionChildConfigRequest.getClass();
        str.getClass();
        getTransitionChildConfigRequest.transitionSourceCase_ = 1;
        getTransitionChildConfigRequest.transitionSource_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12147o(GetTransitionChildConfigRequest getTransitionChildConfigRequest, String str) {
        getTransitionChildConfigRequest.getClass();
        str.getClass();
        getTransitionChildConfigRequest.transitionSourceCase_ = 2;
        getTransitionChildConfigRequest.transitionSource_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static cc10 m12148p() {
        return (cc10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"transitionSource_", "transitionSourceCase_"});
        }
        if (iOrdinal == 3) {
            return new GetTransitionChildConfigRequest();
        }
        if (iOrdinal == 4) {
            return new cc10(DEFAULT_INSTANCE);
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
        synchronized (GetTransitionChildConfigRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
