package com.spotify.allboarding.model.p020v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class OnboardingResponse extends AbstractC0269h implements sre0 {
    private static final OnboardingResponse DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PROPERTIES_FIELD_NUMBER = 5;
    public static final int NEXT_FIELD_NUMBER = 3;
    public static final int NEXT_SECONDARY_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SCREEN_FIELD_NUMBER = 2;
    public static final int STEP_FIELD_NUMBER = 1;
    private int bitField0_;
    private Step nextSecondary_;
    private Step next_;
    private Screen screen_;
    private String step_ = "";
    private ae50 experimentProperties_ = AbstractC0269h.emptyProtobufList();

    static {
        OnboardingResponse onboardingResponse = new OnboardingResponse();
        DEFAULT_INSTANCE = onboardingResponse;
        AbstractC0269h.registerDefaultInstance(OnboardingResponse.class, onboardingResponse);
    }

    private OnboardingResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b", new Object[]{"bitField0_", "step_", "screen_", "next_", "nextSecondary_", "experimentProperties_", ExperimentProperty.class});
        }
        if (iOrdinal == 3) {
            return new OnboardingResponse();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 3);
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
        synchronized (OnboardingResponse.class) {
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
    public final ae50 m3195n() {
        return this.experimentProperties_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Step m3196o() {
        Step step = this.next_;
        return step == null ? Step.m3215o() : step;
    }

    /* JADX INFO: renamed from: p */
    public final Step m3197p() {
        Step step = this.nextSecondary_;
        return step == null ? Step.m3215o() : step;
    }

    /* JADX INFO: renamed from: q */
    public final Screen m3198q() {
        Screen screen = this.screen_;
        return screen == null ? Screen.m3202q() : screen;
    }

    /* JADX INFO: renamed from: r */
    public final String m3199r() {
        return this.step_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3200s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3201t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
