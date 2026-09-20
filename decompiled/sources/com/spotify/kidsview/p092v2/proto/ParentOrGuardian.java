package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ParentOrGuardian extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 3;
    private static final ParentOrGuardian DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int color_;
    private String displayName_ = "";
    private String imageUrl_ = "";

    static {
        ParentOrGuardian parentOrGuardian = new ParentOrGuardian();
        DEFAULT_INSTANCE = parentOrGuardian;
        AbstractC0269h.registerDefaultInstance(ParentOrGuardian.class, parentOrGuardian);
    }

    private ParentOrGuardian() {
    }

    /* JADX INFO: renamed from: n */
    public static ParentOrGuardian m12511n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003င\u0001", new Object[]{"bitField0_", "displayName_", "imageUrl_", "color_"});
        }
        if (iOrdinal == 3) {
            return new ParentOrGuardian();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 26);
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
        synchronized (ParentOrGuardian.class) {
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

    public final int getColor() {
        return this.color_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final boolean hasColor() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
