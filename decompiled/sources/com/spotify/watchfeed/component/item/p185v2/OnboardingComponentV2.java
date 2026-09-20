package com.spotify.watchfeed.component.item.p185v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class OnboardingComponentV2 extends AbstractC0269h implements sre0 {
    public static final int ASSOCIATED_FEEDS_ONBOARDING_FIELD_NUMBER = 2;
    public static final int AUDIO_SHOCK_ONBOARDING_FIELD_NUMBER = 3;
    private static final OnboardingComponentV2 DEFAULT_INSTANCE;
    public static final int MAIN_ONBOARDING_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private Any associatedFeedsOnboarding_;
    private Any audioShockOnboarding_;
    private int bitField0_;
    private Any mainOnboarding_;

    static {
        OnboardingComponentV2 onboardingComponentV2 = new OnboardingComponentV2();
        DEFAULT_INSTANCE = onboardingComponentV2;
        AbstractC0269h.registerDefaultInstance(OnboardingComponentV2.class, onboardingComponentV2);
    }

    private OnboardingComponentV2() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static OnboardingComponentV2 m22799r(gva gvaVar) {
        return (OnboardingComponentV2) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "mainOnboarding_", "associatedFeedsOnboarding_", "audioShockOnboarding_"});
        }
        if (iOrdinal == 3) {
            return new OnboardingComponentV2();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 2);
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
        synchronized (OnboardingComponentV2.class) {
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
    public final Any m22800n() {
        Any any = this.associatedFeedsOnboarding_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Any m22801o() {
        Any any = this.mainOnboarding_;
        return any == null ? Any.m1909p() : any;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22802p() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22803q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
