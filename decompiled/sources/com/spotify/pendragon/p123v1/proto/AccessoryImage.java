package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.EnumC1706bi;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessoryImage extends AbstractC0269h implements sre0 {
    private static final AccessoryImage DEFAULT_INSTANCE;
    public static final int IMAGE_STYLE_FIELD_NUMBER = 2;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int imageStyle_;
    private String imageUrl_ = "";

    static {
        AccessoryImage accessoryImage = new AccessoryImage();
        DEFAULT_INSTANCE = accessoryImage;
        AbstractC0269h.registerDefaultInstance(AccessoryImage.class, accessoryImage);
    }

    private AccessoryImage() {
    }

    /* JADX INFO: renamed from: o */
    public static AccessoryImage m16985o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"imageUrl_", "imageStyle_"});
        }
        if (iOrdinal == 3) {
            return new AccessoryImage();
        }
        if (iOrdinal == 4) {
            return new C1997j(3);
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
        synchronized (AccessoryImage.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final EnumC1706bi m16986p() {
        EnumC1706bi enumC1706bi;
        int i = this.imageStyle_;
        if (i == 0) {
            enumC1706bi = EnumC1706bi.UNKNOWN_IMAGE_STYLE;
        } else if (i == 1) {
            enumC1706bi = EnumC1706bi.CIRCLE;
        } else if (i != 2) {
            enumC1706bi = i != 3 ? null : EnumC1706bi.FULL_WIDTH;
        } else {
            enumC1706bi = EnumC1706bi.SQUARE;
        }
        return enumC1706bi == null ? EnumC1706bi.UNRECOGNIZED : enumC1706bi;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
