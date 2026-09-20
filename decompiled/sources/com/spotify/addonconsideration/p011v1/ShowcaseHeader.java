package com.spotify.addonconsideration.p011v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowcaseHeader extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 1;
    public static final int CTA_FIELD_NUMBER = 7;
    private static final ShowcaseHeader DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int HEADER_DISCLAIMER_FIELD_NUMBER = 9;
    public static final int ICON_URI_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int SUPERSCRIPT_COLOR_FIELD_NUMBER = 5;
    public static final int SUPERSCRIPT_FIELD_NUMBER = 4;
    public static final int TITLE_COLOR_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Cta cta_;
    private String backgroundImage_ = "";
    private String title_ = "";
    private String titleColor_ = "";
    private String superscript_ = "";
    private String superscriptColor_ = "";
    private String description_ = "";
    private String iconUri_ = "";
    private String headerDisclaimer_ = "";

    static {
        ShowcaseHeader showcaseHeader = new ShowcaseHeader();
        DEFAULT_INSTANCE = showcaseHeader;
        AbstractC0269h.registerDefaultInstance(ShowcaseHeader.class, showcaseHeader);
    }

    private ShowcaseHeader() {
    }

    /* JADX INFO: renamed from: p */
    public static ShowcaseHeader m2327p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004Ȉ\u0005ለ\u0001\u0006Ȉ\u0007ဉ\u0002\bለ\u0003\tለ\u0004", new Object[]{"bitField0_", "backgroundImage_", "title_", "titleColor_", "superscript_", "superscriptColor_", "description_", "cta_", "iconUri_", "headerDisclaimer_"});
        }
        if (iOrdinal == 3) {
            return new ShowcaseHeader();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 14);
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
        synchronized (ShowcaseHeader.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m2328n() {
        return this.backgroundImage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Cta m2329o() {
        Cta cta = this.cta_;
        return cta == null ? Cta.m2311o() : cta;
    }

    /* JADX INFO: renamed from: q */
    public final String m2330q() {
        return this.headerDisclaimer_;
    }

    /* JADX INFO: renamed from: r */
    public final String m2331r() {
        return this.iconUri_;
    }

    /* JADX INFO: renamed from: s */
    public final String m2332s() {
        return this.superscript_;
    }

    /* JADX INFO: renamed from: t */
    public final String m2333t() {
        return this.superscriptColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m2334u() {
        return this.titleColor_;
    }
}
