package com.spotify.xrprojected.onboarding.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hge1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class XrGlassesOnboardingEligibility extends AbstractC0269h implements sre0 {
    public static final int DECISION_FIELD_NUMBER = 2;
    private static final XrGlassesOnboardingEligibility DEFAULT_INSTANCE;
    public static final int FLOW_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    private int bitField0_;
    private String flow_ = "";
    private String decision_ = "";
    private String reason_ = "";

    static {
        XrGlassesOnboardingEligibility xrGlassesOnboardingEligibility = new XrGlassesOnboardingEligibility();
        DEFAULT_INSTANCE = xrGlassesOnboardingEligibility;
        AbstractC0269h.registerDefaultInstance(XrGlassesOnboardingEligibility.class, xrGlassesOnboardingEligibility);
    }

    private XrGlassesOnboardingEligibility() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23235n(XrGlassesOnboardingEligibility xrGlassesOnboardingEligibility, String str) {
        xrGlassesOnboardingEligibility.getClass();
        str.getClass();
        xrGlassesOnboardingEligibility.bitField0_ |= 2;
        xrGlassesOnboardingEligibility.decision_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m23236o(XrGlassesOnboardingEligibility xrGlassesOnboardingEligibility, String str) {
        xrGlassesOnboardingEligibility.getClass();
        str.getClass();
        xrGlassesOnboardingEligibility.bitField0_ |= 1;
        xrGlassesOnboardingEligibility.flow_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m23237p(XrGlassesOnboardingEligibility xrGlassesOnboardingEligibility, String str) {
        xrGlassesOnboardingEligibility.getClass();
        str.getClass();
        xrGlassesOnboardingEligibility.bitField0_ |= 4;
        xrGlassesOnboardingEligibility.reason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static hge1 m23238q() {
        return (hge1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "flow_", "decision_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new XrGlassesOnboardingEligibility();
        }
        if (iOrdinal == 4) {
            return new hge1(DEFAULT_INSTANCE);
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
        synchronized (XrGlassesOnboardingEligibility.class) {
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
