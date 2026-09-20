package com.spotify.unboxingfeatureflows.api.p170v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowStep extends AbstractC0269h implements sre0 {
    public static final int ANIMATION_FIELD_NUMBER = 6;
    private static final FlowStep DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ENCORE_ICON_FIELD_NUMBER = 10;
    public static final int FLOW_BUTTON_FIELD_NUMBER = 5;
    public static final int FOOTER_NOTE_FIELD_NUMBER = 11;
    public static final int GRADIENT_COLOR_FIELD_NUMBER = 7;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_TOP_GRADIENT_FIELD_NUMBER = 8;
    public static final int TAG_FIELD_NUMBER = 3;
    public static final int TINT_COLOR_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FlowButton flowButton_;
    private Object media_;
    private boolean showTopGradient_;
    private int mediaCase_ = 0;
    private String title_ = "";
    private String tag_ = "";
    private String description_ = "";
    private String gradientColor_ = "";
    private String tintColor_ = "";
    private String encoreIcon_ = "";
    private String footerNote_ = "";

    static {
        FlowStep flowStep = new FlowStep();
        DEFAULT_INSTANCE = flowStep;
        AbstractC0269h.registerDefaultInstance(FlowStep.class, flowStep);
    }

    private FlowStep() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ဉ\u0001\u0006<\u0000\u0007Ȉ\b\u0007\tȈ\nለ\u0002\u000bለ\u0003", new Object[]{"media_", "mediaCase_", "bitField0_", "title_", "tag_", "description_", "flowButton_", Animation.class, "gradientColor_", "showTopGradient_", "tintColor_", "encoreIcon_", "footerNote_"});
        }
        if (iOrdinal == 3) {
            return new FlowStep();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 15);
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
        synchronized (FlowStep.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.mediaCase_ == 1 ? (String) this.media_ : "";
    }

    public final String getTag() {
        return this.tag_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final boolean hasImageUrl() {
        return this.mediaCase_ == 1;
    }

    /* JADX INFO: renamed from: n */
    public final Animation m21938n() {
        return this.mediaCase_ == 6 ? (Animation) this.media_ : Animation.m21933n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21939o() {
        return this.encoreIcon_;
    }

    /* JADX INFO: renamed from: p */
    public final FlowButton m21940p() {
        FlowButton flowButton = this.flowButton_;
        return flowButton == null ? FlowButton.m21935p() : flowButton;
    }

    /* JADX INFO: renamed from: q */
    public final String m21941q() {
        return this.footerNote_;
    }

    /* JADX INFO: renamed from: r */
    public final String m21942r() {
        return this.gradientColor_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21943s() {
        return this.showTopGradient_;
    }

    /* JADX INFO: renamed from: t */
    public final String m21944t() {
        return this.tintColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m21945u() {
        return this.mediaCase_ == 6;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m21946v() {
        return (this.bitField0_ & 2) != 0;
    }
}
