package com.spotify.kidsgraduation.p088v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bgr0;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetPrivacyPolicyAcceptanceResponse extends AbstractC0269h implements sre0 {
    private static final GetPrivacyPolicyAcceptanceResponse DEFAULT_INSTANCE;
    public static final int GRADUATION_AGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRIVACY_POLICY_TYPE_FIELD_NUMBER = 1;
    private int graduationAge_;
    private int privacyPolicyType_;

    static {
        GetPrivacyPolicyAcceptanceResponse getPrivacyPolicyAcceptanceResponse = new GetPrivacyPolicyAcceptanceResponse();
        DEFAULT_INSTANCE = getPrivacyPolicyAcceptanceResponse;
        AbstractC0269h.registerDefaultInstance(GetPrivacyPolicyAcceptanceResponse.class, getPrivacyPolicyAcceptanceResponse);
    }

    private GetPrivacyPolicyAcceptanceResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"privacyPolicyType_", "graduationAge_"});
        }
        if (iOrdinal == 3) {
            return new GetPrivacyPolicyAcceptanceResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 5);
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
        synchronized (GetPrivacyPolicyAcceptanceResponse.class) {
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
    public final int m12216n() {
        return this.graduationAge_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final bgr0 m12217o() {
        bgr0 bgr0Var;
        int i = this.privacyPolicyType_;
        if (i == 0) {
            bgr0Var = bgr0.PRIVACY_POLICY_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            bgr0Var = bgr0.PRIVACY_POLICY_TYPE_NON;
        } else if (i != 2) {
            bgr0Var = i != 3 ? null : bgr0.PRIVACY_POLICY_TYPE_IMPLICIT;
        } else {
            bgr0Var = bgr0.PRIVACY_POLICY_TYPE_EXPLICIT;
        }
        return bgr0Var == null ? bgr0.UNRECOGNIZED : bgr0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
