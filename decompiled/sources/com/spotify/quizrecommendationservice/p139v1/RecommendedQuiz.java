package com.spotify.quizrecommendationservice.p139v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vev0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecommendedQuiz extends AbstractC0269h implements sre0 {
    private static final RecommendedQuiz DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_ENTITY_URI_FIELD_NUMBER = 1;
    public static final int TITLE_TEMPLATE_FIELD_NUMBER = 3;
    public static final int VISUAL_ENTITY_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String targetEntityUri_ = "";
    private String visualEntityUri_ = "";
    private String titleTemplate_ = "";

    static {
        RecommendedQuiz recommendedQuiz = new RecommendedQuiz();
        DEFAULT_INSTANCE = recommendedQuiz;
        AbstractC0269h.registerDefaultInstance(RecommendedQuiz.class, recommendedQuiz);
    }

    private RecommendedQuiz() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "targetEntityUri_", "visualEntityUri_", "titleTemplate_"});
        }
        if (iOrdinal == 3) {
            return new RecommendedQuiz();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 4);
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
        synchronized (RecommendedQuiz.class) {
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
    public final String m20040n() {
        return this.targetEntityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20041o() {
        return this.titleTemplate_;
    }

    /* JADX INFO: renamed from: p */
    public final String m20042p() {
        return this.visualEntityUri_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20043q() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m20044r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
