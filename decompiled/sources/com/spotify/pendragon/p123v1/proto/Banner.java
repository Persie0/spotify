package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ei6;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Banner extends AbstractC0269h implements sre0 {
    public static final int BASE_BANNER_FIELD_NUMBER = 6;
    public static final int BASIC_BANNER_FIELD_NUMBER = 1;
    public static final int BUTTONS_FIELD_NUMBER = 4;
    private static final Banner DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RICH_BANNER_FIELD_NUMBER = 2;
    public static final int SIGNIFIER_BANNER_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 5;
    private Object bannerTemplate_;
    private int bannerTemplateCase_ = 0;
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();
    private String type_ = "";

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        AbstractC0269h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static Banner m16997s() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u001b\u0005Ȉ\u0006<\u0000", new Object[]{"bannerTemplate_", "bannerTemplateCase_", BasicBanner.class, RichBanner.class, SignifierBanner.class, "buttons_", Button.class, "type_", BaseBanner.class});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new na8(21);
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
        synchronized (Banner.class) {
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
    public final int m16998o() {
        return ei6.m39065b(this.bannerTemplateCase_);
    }

    /* JADX INFO: renamed from: p */
    public final BaseBanner m16999p() {
        return this.bannerTemplateCase_ == 6 ? (BaseBanner) this.bannerTemplate_ : BaseBanner.m17004s();
    }

    /* JADX INFO: renamed from: q */
    public final BasicBanner m17000q() {
        return this.bannerTemplateCase_ == 1 ? (BasicBanner) this.bannerTemplate_ : BasicBanner.m17097q();
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m17001r() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: t */
    public final RichBanner m17002t() {
        return this.bannerTemplateCase_ == 2 ? (RichBanner) this.bannerTemplate_ : RichBanner.m17261r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final SignifierBanner m17003u() {
        return this.bannerTemplateCase_ == 3 ? (SignifierBanner) this.bannerTemplate_ : SignifierBanner.m17277q();
    }
}
