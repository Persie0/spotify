package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class OnboardingStepsContents extends AbstractC0269h implements sre0 {
    private static final OnboardingStepsContents DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 4;
    public static final int GET_MANAGER_STEP_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SCAN_CODE_INSTRUCTIONS_STEP_FIELD_NUMBER = 3;
    private int bitField0_;
    private SupportLink footer_;
    private GetManagerStepContents getManagerStep_;
    private ScanCodeInstructionsStepContents scanCodeInstructionsStep_;

    static {
        OnboardingStepsContents onboardingStepsContents = new OnboardingStepsContents();
        DEFAULT_INSTANCE = onboardingStepsContents;
        AbstractC0269h.registerDefaultInstance(OnboardingStepsContents.class, onboardingStepsContents);
    }

    private OnboardingStepsContents() {
    }

    /* JADX INFO: renamed from: n */
    public static OnboardingStepsContents m10623n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "getManagerStep_", "scanCodeInstructionsStep_", "footer_"});
        }
        if (iOrdinal == 3) {
            return new OnboardingStepsContents();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 4);
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
        synchronized (OnboardingStepsContents.class) {
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

    /* JADX INFO: renamed from: o */
    public final SupportLink m10624o() {
        SupportLink supportLink = this.footer_;
        return supportLink == null ? SupportLink.m10644n() : supportLink;
    }

    /* JADX INFO: renamed from: p */
    public final GetManagerStepContents m10625p() {
        GetManagerStepContents getManagerStepContents = this.getManagerStep_;
        return getManagerStepContents == null ? GetManagerStepContents.m10608o() : getManagerStepContents;
    }

    /* JADX INFO: renamed from: q */
    public final ScanCodeInstructionsStepContents m10626q() {
        ScanCodeInstructionsStepContents scanCodeInstructionsStepContents = this.scanCodeInstructionsStep_;
        return scanCodeInstructionsStepContents == null ? ScanCodeInstructionsStepContents.m10632o() : scanCodeInstructionsStepContents;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
