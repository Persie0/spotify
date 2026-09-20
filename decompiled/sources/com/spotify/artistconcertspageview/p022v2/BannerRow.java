package com.spotify.artistconcertspageview.p022v2;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerRow extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_HEX_FIELD_NUMBER = 3;
    public static final int BANNER_MESSAGE_FIELD_NUMBER = 1;
    public static final int CTA_FIELD_NUMBER = 4;
    public static final int CTA_URI_FIELD_NUMBER = 5;
    private static final BannerRow DEFAULT_INSTANCE;
    public static final int IMAGEURL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String bannerMessage_ = "";
    private String imageUrl_ = "";
    private String backgroundColorHex_ = "";
    private String cta_ = "";
    private String ctaUri_ = "";

    static {
        BannerRow bannerRow = new BannerRow();
        DEFAULT_INSTANCE = bannerRow;
        AbstractC0269h.registerDefaultInstance(BannerRow.class, bannerRow);
    }

    private BannerRow() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static BannerRow m3281r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"bannerMessage_", "imageUrl_", "backgroundColorHex_", "cta_", "ctaUri_"});
        }
        if (iOrdinal == 3) {
            return new BannerRow();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 25);
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
        synchronized (BannerRow.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: n */
    public final String m3282n() {
        return this.backgroundColorHex_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3283o() {
        return this.bannerMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3284p() {
        return this.cta_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3285q() {
        return this.ctaUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
