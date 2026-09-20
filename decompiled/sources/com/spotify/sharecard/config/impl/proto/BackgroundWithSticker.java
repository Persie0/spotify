package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class BackgroundWithSticker extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final BackgroundWithSticker DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STICKER_FIELD_NUMBER = 2;
    private Background background_;
    private int bitField0_;
    private Image sticker_;

    static {
        BackgroundWithSticker backgroundWithSticker = new BackgroundWithSticker();
        DEFAULT_INSTANCE = backgroundWithSticker;
        AbstractC0269h.registerDefaultInstance(BackgroundWithSticker.class, backgroundWithSticker);
    }

    private BackgroundWithSticker() {
    }

    /* JADX INFO: renamed from: o */
    public static BackgroundWithSticker m21132o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "background_", "sticker_"});
        }
        if (iOrdinal == 3) {
            return new BackgroundWithSticker();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 10);
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
        synchronized (BackgroundWithSticker.class) {
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

    public final boolean hasSticker() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final Background m21133n() {
        Background background = this.background_;
        return background == null ? Background.m21125p() : background;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Image m21134p() {
        Image image = this.sticker_;
        return image == null ? Image.m21147o() : image;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
