package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.m351;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerSelected extends AbstractC0269h implements sre0 {
    private static final StickerSelected DEFAULT_INSTANCE;
    public static final int MARKET_FIELD_NUMBER = 5;
    public static final int PACK_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STICKER_ID_FIELD_NUMBER = 1;
    public static final int STICKER_TYPE_FIELD_NUMBER = 3;
    public static final int SURFACE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String stickerId_ = "";
    private String packId_ = "";
    private String stickerType_ = "";
    private String market_ = "";
    private String surface_ = "";

    static {
        StickerSelected stickerSelected = new StickerSelected();
        DEFAULT_INSTANCE = stickerSelected;
        AbstractC0269h.registerDefaultInstance(StickerSelected.class, stickerSelected);
    }

    private StickerSelected() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14423n(StickerSelected stickerSelected, String str) {
        stickerSelected.getClass();
        stickerSelected.bitField0_ |= 8;
        stickerSelected.market_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14424o(StickerSelected stickerSelected, String str) {
        stickerSelected.getClass();
        stickerSelected.bitField0_ |= 2;
        stickerSelected.packId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14425p(StickerSelected stickerSelected, String str) {
        stickerSelected.getClass();
        str.getClass();
        stickerSelected.bitField0_ |= 1;
        stickerSelected.stickerId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14426q(StickerSelected stickerSelected, String str) {
        stickerSelected.getClass();
        stickerSelected.bitField0_ |= 4;
        stickerSelected.stickerType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14427r(StickerSelected stickerSelected, String str) {
        stickerSelected.getClass();
        str.getClass();
        stickerSelected.bitField0_ |= 16;
        stickerSelected.surface_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static m351 m14428s() {
        return (m351) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003", new Object[]{"bitField0_", "stickerId_", "packId_", "stickerType_", "surface_", "market_"});
        }
        if (iOrdinal == 3) {
            return new StickerSelected();
        }
        if (iOrdinal == 4) {
            return new m351(DEFAULT_INSTANCE);
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
        synchronized (StickerSelected.class) {
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
