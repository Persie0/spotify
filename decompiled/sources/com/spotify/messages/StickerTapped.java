package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u351;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerTapped extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final StickerTapped DEFAULT_INSTANCE;
    public static final int MARKET_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STICKER_ID_FIELD_NUMBER = 1;
    public static final int STICKER_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String stickerId_ = "";
    private String stickerType_ = "";
    private String contextUri_ = "";
    private String market_ = "";

    static {
        StickerTapped stickerTapped = new StickerTapped();
        DEFAULT_INSTANCE = stickerTapped;
        AbstractC0269h.registerDefaultInstance(StickerTapped.class, stickerTapped);
    }

    private StickerTapped() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14429n(StickerTapped stickerTapped, String str) {
        stickerTapped.getClass();
        str.getClass();
        stickerTapped.bitField0_ |= 4;
        stickerTapped.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14430o(StickerTapped stickerTapped, String str) {
        stickerTapped.getClass();
        stickerTapped.bitField0_ |= 8;
        stickerTapped.market_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14431p(StickerTapped stickerTapped, String str) {
        stickerTapped.getClass();
        str.getClass();
        stickerTapped.bitField0_ |= 1;
        stickerTapped.stickerId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14432q(StickerTapped stickerTapped, String str) {
        stickerTapped.getClass();
        stickerTapped.bitField0_ |= 2;
        stickerTapped.stickerType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static u351 m14433r() {
        return (u351) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "stickerId_", "stickerType_", "contextUri_", "market_"});
        }
        if (iOrdinal == 3) {
            return new StickerTapped();
        }
        if (iOrdinal == 4) {
            return new u351(DEFAULT_INSTANCE);
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
        synchronized (StickerTapped.class) {
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
