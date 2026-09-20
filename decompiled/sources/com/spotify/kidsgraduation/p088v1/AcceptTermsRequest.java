package com.spotify.kidsgraduation.p088v1;

import com.google.protobuf.AbstractC0269h;
import p204p.C1661ab;
import p204p.bgr0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class AcceptTermsRequest extends AbstractC0269h implements sre0 {
    private static final AcceptTermsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRIVACY_POLICY_TYPE_FIELD_NUMBER = 2;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private int privacyPolicyType_;
    private String unused_ = "";

    static {
        AcceptTermsRequest acceptTermsRequest = new AcceptTermsRequest();
        DEFAULT_INSTANCE = acceptTermsRequest;
        AbstractC0269h.registerDefaultInstance(AcceptTermsRequest.class, acceptTermsRequest);
    }

    private AcceptTermsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12206n(AcceptTermsRequest acceptTermsRequest, bgr0 bgr0Var) {
        acceptTermsRequest.getClass();
        acceptTermsRequest.privacyPolicyType_ = bgr0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m12207o(AcceptTermsRequest acceptTermsRequest) {
        acceptTermsRequest.getClass();
        acceptTermsRequest.unused_ = "_";
    }

    /* JADX INFO: renamed from: p */
    public static C1661ab m12208p() {
        return (C1661ab) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"unused_", "privacyPolicyType_"});
        }
        if (iOrdinal == 3) {
            return new AcceptTermsRequest();
        }
        if (iOrdinal == 4) {
            return new C1661ab(DEFAULT_INSTANCE);
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
        synchronized (AcceptTermsRequest.class) {
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
