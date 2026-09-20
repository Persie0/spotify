package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class RichBanner extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 6;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
    public static final int BODY_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_TEXT_FIELD_NUMBER = 4;
    private static final RichBanner DEFAULT_INSTANCE;
    public static final int HEADLINE_COLOR_FIELD_NUMBER = 3;
    public static final int HEADLINE_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private AccessoryContent accessoryContent_;
    private int bitField0_;
    private String backgroundColor_ = "";
    private String headlineText_ = "";
    private String headlineColor_ = "";
    private String bodyText_ = "";
    private String bodyColor_ = "";

    static {
        RichBanner richBanner = new RichBanner();
        DEFAULT_INSTANCE = richBanner;
        AbstractC0269h.registerDefaultInstance(RichBanner.class, richBanner);
    }

    private RichBanner() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static RichBanner m17261r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000", new Object[]{"bitField0_", "backgroundColor_", "headlineText_", "headlineColor_", "bodyText_", "bodyColor_", "accessoryContent_"});
        }
        if (iOrdinal == 3) {
            return new RichBanner();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 21);
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
        synchronized (RichBanner.class) {
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
    public final AccessoryContent m17262n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17263o() {
        return this.backgroundColor_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17264p() {
        return this.bodyColor_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17265q() {
        return this.bodyText_;
    }

    /* JADX INFO: renamed from: s */
    public final String m17266s() {
        return this.headlineColor_;
    }

    /* JADX INFO: renamed from: t */
    public final String m17267t() {
        return this.headlineText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
