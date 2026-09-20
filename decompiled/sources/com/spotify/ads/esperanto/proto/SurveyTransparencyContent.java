package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SurveyTransparencyContent extends AbstractC0269h implements sre0 {
    private static final SurveyTransparencyContent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSPARENCY_LABEL_FIELD_NUMBER = 1;
    public static final int TRANSPARENCY_URL_FIELD_NUMBER = 2;
    private String transparencyLabel_ = "";
    private String transparencyUrl_ = "";

    static {
        SurveyTransparencyContent surveyTransparencyContent = new SurveyTransparencyContent();
        DEFAULT_INSTANCE = surveyTransparencyContent;
        AbstractC0269h.registerDefaultInstance(SurveyTransparencyContent.class, surveyTransparencyContent);
    }

    private SurveyTransparencyContent() {
    }

    /* JADX INFO: renamed from: n */
    public static SurveyTransparencyContent m2725n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"transparencyLabel_", "transparencyUrl_"});
        }
        if (iOrdinal == 3) {
            return new SurveyTransparencyContent();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 24);
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
        synchronized (SurveyTransparencyContent.class) {
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
    public final String m2726o() {
        return this.transparencyLabel_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2727p() {
        return this.transparencyUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
