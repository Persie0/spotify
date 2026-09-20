package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.f300;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ForegroundServiceStartTwoStepSolutionResult extends AbstractC0269h implements sre0 {
    private static final ForegroundServiceStartTwoStepSolutionResult DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private String result_ = "";

    static {
        ForegroundServiceStartTwoStepSolutionResult foregroundServiceStartTwoStepSolutionResult = new ForegroundServiceStartTwoStepSolutionResult();
        DEFAULT_INSTANCE = foregroundServiceStartTwoStepSolutionResult;
        AbstractC0269h.registerDefaultInstance(ForegroundServiceStartTwoStepSolutionResult.class, foregroundServiceStartTwoStepSolutionResult);
    }

    private ForegroundServiceStartTwoStepSolutionResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13898n(ForegroundServiceStartTwoStepSolutionResult foregroundServiceStartTwoStepSolutionResult, String str) {
        foregroundServiceStartTwoStepSolutionResult.getClass();
        foregroundServiceStartTwoStepSolutionResult.bitField0_ |= 1;
        foregroundServiceStartTwoStepSolutionResult.name_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13899o(ForegroundServiceStartTwoStepSolutionResult foregroundServiceStartTwoStepSolutionResult, String str) {
        foregroundServiceStartTwoStepSolutionResult.getClass();
        str.getClass();
        foregroundServiceStartTwoStepSolutionResult.bitField0_ |= 2;
        foregroundServiceStartTwoStepSolutionResult.result_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static f300 m13900p() {
        return (f300) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "result_"});
        }
        if (iOrdinal == 3) {
            return new ForegroundServiceStartTwoStepSolutionResult();
        }
        if (iOrdinal == 4) {
            return new f300(DEFAULT_INSTANCE);
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
        synchronized (ForegroundServiceStartTwoStepSolutionResult.class) {
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
