package com.spotify.watchfeed.component.layout.p186v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.HeaderOverrides;
import p204p.ebe1;
import p204p.fbe1;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Wrapped2025IntroOutroLayoutComponent extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_AUDIO_URL_FIELD_NUMBER = 5;
    private static final Wrapped2025IntroOutroLayoutComponent DEFAULT_INSTANCE;
    public static final int FEATURE_UUID_FIELD_NUMBER = 8;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 3;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RIVE_ANIMATION_URL_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 6;
    public static final int TEXT_STYLE_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private HeaderOverrides headerOverrides_;
    private int textStyle_;
    private String itemId_ = "";
    private String uri_ = "";
    private String riveAnimationUrl_ = "";
    private String backgroundAudioUrl_ = "";
    private String text_ = "";
    private String featureUuid_ = "";

    static {
        Wrapped2025IntroOutroLayoutComponent wrapped2025IntroOutroLayoutComponent = new Wrapped2025IntroOutroLayoutComponent();
        DEFAULT_INSTANCE = wrapped2025IntroOutroLayoutComponent;
        AbstractC0269h.registerDefaultInstance(Wrapped2025IntroOutroLayoutComponent.class, wrapped2025IntroOutroLayoutComponent);
    }

    private Wrapped2025IntroOutroLayoutComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: v */
    public static Wrapped2025IntroOutroLayoutComponent m22856v(gva gvaVar) {
        return (Wrapped2025IntroOutroLayoutComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\bȈ", new Object[]{"bitField0_", "itemId_", "uri_", "headerOverrides_", "riveAnimationUrl_", "backgroundAudioUrl_", "text_", "textStyle_", "featureUuid_"});
        }
        if (iOrdinal == 3) {
            return new Wrapped2025IntroOutroLayoutComponent();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 0);
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
        synchronized (Wrapped2025IntroOutroLayoutComponent.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22857n() {
        return this.backgroundAudioUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22858o() {
        return this.featureUuid_;
    }

    /* JADX INFO: renamed from: p */
    public final HeaderOverrides m22859p() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.m22893o() : headerOverrides;
    }

    /* JADX INFO: renamed from: q */
    public final String m22860q() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22861r() {
        return this.riveAnimationUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m22862s() {
        return this.text_;
    }

    /* JADX INFO: renamed from: t */
    public final fbe1 m22863t() {
        fbe1 fbe1Var;
        int i = this.textStyle_;
        if (i != 0) {
            fbe1Var = i != 1 ? null : fbe1.WHITE_TEXT_ON_BLACK_BACKGROUND;
        } else {
            fbe1Var = fbe1.BLACK_TEXT_ON_WHITE_BACKGROUND;
        }
        return fbe1Var == null ? fbe1.UNRECOGNIZED : fbe1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22864u() {
        return (this.bitField0_ & 1) != 0;
    }
}
