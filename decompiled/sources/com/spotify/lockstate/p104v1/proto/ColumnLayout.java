package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes8.dex */
public final class ColumnLayout extends AbstractC0269h implements sre0 {
    public static final int BANNER_TITLE_FIELD_NUMBER = 1;
    private static final ColumnLayout DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 8;
    public static final int ICON_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TERTIARY_BUTTON_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ActionableButton footer_;
    private ActionableButton primaryButton_;
    private ActionableButton secondaryButton_;
    private ActionableButton tertiaryButton_;
    private String bannerTitle_ = "";
    private String iconUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        ColumnLayout columnLayout = new ColumnLayout();
        DEFAULT_INSTANCE = columnLayout;
        AbstractC0269h.registerDefaultInstance(ColumnLayout.class, columnLayout);
    }

    private ColumnLayout() {
    }

    /* JADX INFO: renamed from: o */
    public static ColumnLayout m13222o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004Ȉ\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005", new Object[]{"bitField0_", "bannerTitle_", "iconUri_", "title_", "subtitle_", "primaryButton_", "secondaryButton_", "tertiaryButton_", "footer_"});
        }
        if (iOrdinal == 3) {
            return new ColumnLayout();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 26);
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
        synchronized (ColumnLayout.class) {
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
    public final String m13223n() {
        return this.bannerTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ActionableButton m13224p() {
        ActionableButton actionableButton = this.footer_;
        return actionableButton == null ? ActionableButton.m13208o() : actionableButton;
    }

    /* JADX INFO: renamed from: q */
    public final String m13225q() {
        return this.iconUri_;
    }

    /* JADX INFO: renamed from: r */
    public final ActionableButton m13226r() {
        ActionableButton actionableButton = this.primaryButton_;
        return actionableButton == null ? ActionableButton.m13208o() : actionableButton;
    }

    /* JADX INFO: renamed from: s */
    public final ActionableButton m13227s() {
        ActionableButton actionableButton = this.secondaryButton_;
        return actionableButton == null ? ActionableButton.m13208o() : actionableButton;
    }

    /* JADX INFO: renamed from: t */
    public final ActionableButton m13228t() {
        ActionableButton actionableButton = this.tertiaryButton_;
        return actionableButton == null ? ActionableButton.m13208o() : actionableButton;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13229u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13230v() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m13231w() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m13232x() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m13233y() {
        return (this.bitField0_ & 16) != 0;
    }
}
