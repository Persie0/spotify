package com.spotify.extendedmetadata.extensions.promov3trait.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c8s0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PromoV3Trait extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_GRADIENT_FIELD_NUMBER = 9;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    private static final PromoV3Trait DEFAULT_INSTANCE;
    public static final int DISMISS_URI_FIELD_NUMBER = 11;
    public static final int LABEL_FIELD_NUMBER = 3;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_URI_FIELD_NUMBER = 8;
    public static final int STROKE_GRADIENT_FIELD_NUMBER = 10;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_COLOR_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Gradient backgroundGradient_;
    private int bitField0_;
    private Gradient strokeGradient_;
    private String title_ = "";
    private String subtitle_ = "";
    private String label_ = "";
    private String navigateUri_ = "";
    private String backgroundImageUrl_ = "";
    private String logoImageUrl_ = "";
    private String titleColor_ = "";
    private String playbackUri_ = "";
    private String dismissUri_ = "";

    static {
        PromoV3Trait promoV3Trait = new PromoV3Trait();
        DEFAULT_INSTANCE = promoV3Trait;
        AbstractC0269h.registerDefaultInstance(PromoV3Trait.class, promoV3Trait);
    }

    private PromoV3Trait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static PromoV3Trait m10336w(byte[] bArr) {
        return (PromoV3Trait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nဉ\u0001\u000bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "label_", "navigateUri_", "backgroundImageUrl_", "logoImageUrl_", "titleColor_", "playbackUri_", "backgroundGradient_", "strokeGradient_", "dismissUri_"});
        }
        if (iOrdinal == 3) {
            return new PromoV3Trait();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 2);
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
        synchronized (PromoV3Trait.class) {
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
    public final Gradient m10337n() {
        Gradient gradient = this.backgroundGradient_;
        return gradient == null ? Gradient.m10333n() : gradient;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10338o() {
        return this.backgroundImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10339p() {
        return this.dismissUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m10340q() {
        return this.label_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10341r() {
        return this.logoImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10342s() {
        return this.navigateUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10343t() {
        return this.playbackUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Gradient m10344u() {
        Gradient gradient = this.strokeGradient_;
        return gradient == null ? Gradient.m10333n() : gradient;
    }

    /* JADX INFO: renamed from: v */
    public final String m10345v() {
        return this.titleColor_;
    }
}
