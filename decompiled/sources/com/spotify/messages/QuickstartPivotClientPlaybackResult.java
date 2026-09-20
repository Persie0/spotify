package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vvt0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class QuickstartPivotClientPlaybackResult extends AbstractC0269h implements sre0 {
    private static final QuickstartPivotClientPlaybackResult DEFAULT_INSTANCE;
    public static final int DETAILED_RESULT_FIELD_NUMBER = 4;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 3;
    private int bitField0_;
    private String interactionId_ = "";
    private String featureIdentifier_ = "";
    private String result_ = "";
    private String detailedResult_ = "";

    static {
        QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResult = new QuickstartPivotClientPlaybackResult();
        DEFAULT_INSTANCE = quickstartPivotClientPlaybackResult;
        AbstractC0269h.registerDefaultInstance(QuickstartPivotClientPlaybackResult.class, quickstartPivotClientPlaybackResult);
    }

    private QuickstartPivotClientPlaybackResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14407n(QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResult, String str) {
        quickstartPivotClientPlaybackResult.getClass();
        str.getClass();
        quickstartPivotClientPlaybackResult.bitField0_ |= 8;
        quickstartPivotClientPlaybackResult.detailedResult_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14408o(QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResult, String str) {
        quickstartPivotClientPlaybackResult.getClass();
        str.getClass();
        quickstartPivotClientPlaybackResult.bitField0_ |= 2;
        quickstartPivotClientPlaybackResult.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14409p(QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResult, String str) {
        quickstartPivotClientPlaybackResult.getClass();
        str.getClass();
        quickstartPivotClientPlaybackResult.bitField0_ |= 1;
        quickstartPivotClientPlaybackResult.interactionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14410q(QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResult, String str) {
        quickstartPivotClientPlaybackResult.getClass();
        str.getClass();
        quickstartPivotClientPlaybackResult.bitField0_ |= 4;
        quickstartPivotClientPlaybackResult.result_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static vvt0 m14411r() {
        return (vvt0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "interactionId_", "featureIdentifier_", "result_", "detailedResult_"});
        }
        if (iOrdinal == 3) {
            return new QuickstartPivotClientPlaybackResult();
        }
        if (iOrdinal == 4) {
            return new vvt0(DEFAULT_INSTANCE);
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
        synchronized (QuickstartPivotClientPlaybackResult.class) {
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
