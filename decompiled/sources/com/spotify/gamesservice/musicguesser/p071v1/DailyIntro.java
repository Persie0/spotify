package com.spotify.gamesservice.musicguesser.p071v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class DailyIntro extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_AUDIO_FIELD_NUMBER = 9;
    public static final int CTA_TEXT_FIELD_NUMBER = 5;
    public static final int CTA_URI_FIELD_NUMBER = 4;
    private static final DailyIntro DEFAULT_INSTANCE;
    public static final int ERROR_SUBTITLE_FIELD_NUMBER = 8;
    public static final int ERROR_TITLE_FIELD_NUMBER = 7;
    public static final int FOOTER_FIELD_NUMBER = 3;
    public static final int LOGO_URL_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";
    private String footer_ = "";
    private String ctaUri_ = "";
    private String ctaText_ = "";
    private String logoUrl_ = "";
    private String errorTitle_ = "";
    private String errorSubtitle_ = "";
    private String backgroundAudio_ = "";

    static {
        DailyIntro dailyIntro = new DailyIntro();
        DEFAULT_INSTANCE = dailyIntro;
        AbstractC0269h.registerDefaultInstance(DailyIntro.class, dailyIntro);
    }

    private DailyIntro() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static DailyIntro m10989q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ", new Object[]{"title_", "subtitle_", "footer_", "ctaUri_", "ctaText_", "logoUrl_", "errorTitle_", "errorSubtitle_", "backgroundAudio_"});
        }
        if (iOrdinal == 3) {
            return new DailyIntro();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 7);
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
        synchronized (DailyIntro.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m10990n() {
        return this.backgroundAudio_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10991o() {
        return this.ctaText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10992p() {
        return this.ctaUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10993r() {
        return this.errorSubtitle_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10994s() {
        return this.errorTitle_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10995t() {
        return this.footer_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m10996u() {
        return this.logoUrl_;
    }
}
