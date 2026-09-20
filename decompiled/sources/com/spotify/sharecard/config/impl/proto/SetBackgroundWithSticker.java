package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p401;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SetBackgroundWithSticker extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final SetBackgroundWithSticker DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STICKER_FIELD_NUMBER = 2;
    private SetBackground background_;
    private int bitField0_;
    private SetImage sticker_;

    static {
        SetBackgroundWithSticker setBackgroundWithSticker = new SetBackgroundWithSticker();
        DEFAULT_INSTANCE = setBackgroundWithSticker;
        AbstractC0269h.registerDefaultInstance(SetBackgroundWithSticker.class, setBackgroundWithSticker);
    }

    private SetBackgroundWithSticker() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21167n(SetBackgroundWithSticker setBackgroundWithSticker, SetBackground setBackground) {
        setBackgroundWithSticker.getClass();
        setBackground.getClass();
        setBackgroundWithSticker.background_ = setBackground;
        setBackgroundWithSticker.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21168o(SetBackgroundWithSticker setBackgroundWithSticker, SetImage setImage) {
        setBackgroundWithSticker.getClass();
        setImage.getClass();
        setBackgroundWithSticker.sticker_ = setImage;
        setBackgroundWithSticker.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static p401 m21169p() {
        return (p401) DEFAULT_INSTANCE.createBuilder();
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
            return new SetBackgroundWithSticker();
        }
        if (iOrdinal == 4) {
            return new p401(DEFAULT_INSTANCE);
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
        synchronized (SetBackgroundWithSticker.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
