package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.mb9;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxTranscoderSessionItem extends AbstractC0269h implements sre0 {
    public static final int CLIP_END_MS_FIELD_NUMBER = 10;
    public static final int CLIP_START_MS_FIELD_NUMBER = 9;
    private static final BetamaxTranscoderSessionItem DEFAULT_INSTANCE;
    public static final int EFFECTS_FIELD_NUMBER = 8;
    public static final int IS_DRM_FIELD_NUMBER = 6;
    public static final int ITEM_INDEX_FIELD_NUMBER = 3;
    public static final int ITEM_TYPE_FIELD_NUMBER = 4;
    public static final int MEDIA_URL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_LOCALE_FIELD_NUMBER = 7;
    public static final int TRANSCODING_ID_FIELD_NUMBER = 1;
    public static final int TRANSCODING_ITEM_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clipEndMs_;
    private long clipStartMs_;
    private boolean isDrm_;
    private int itemIndex_;
    private String transcodingId_ = "";
    private String transcodingItemId_ = "";
    private String itemType_ = "";
    private String mediaUrl_ = "";
    private String subtitleLocale_ = "";
    private ae50 effects_ = AbstractC0269h.emptyProtobufList();

    static {
        BetamaxTranscoderSessionItem betamaxTranscoderSessionItem = new BetamaxTranscoderSessionItem();
        DEFAULT_INSTANCE = betamaxTranscoderSessionItem;
        AbstractC0269h.registerDefaultInstance(BetamaxTranscoderSessionItem.class, betamaxTranscoderSessionItem);
    }

    private BetamaxTranscoderSessionItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13702n(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, ArrayList arrayList) {
        ae50 ae50Var = betamaxTranscoderSessionItem.effects_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            betamaxTranscoderSessionItem.effects_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, betamaxTranscoderSessionItem.effects_);
    }

    /* JADX INFO: renamed from: o */
    public static void m13703o(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, long j) {
        betamaxTranscoderSessionItem.bitField0_ |= 256;
        betamaxTranscoderSessionItem.clipEndMs_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m13704p(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, long j) {
        betamaxTranscoderSessionItem.bitField0_ |= 128;
        betamaxTranscoderSessionItem.clipStartMs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13705q(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, boolean z) {
        betamaxTranscoderSessionItem.bitField0_ |= 32;
        betamaxTranscoderSessionItem.isDrm_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m13706r(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, int i) {
        betamaxTranscoderSessionItem.bitField0_ |= 4;
        betamaxTranscoderSessionItem.itemIndex_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m13707s(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem) {
        betamaxTranscoderSessionItem.getClass();
        betamaxTranscoderSessionItem.bitField0_ |= 8;
        betamaxTranscoderSessionItem.itemType_ = "video";
    }

    /* JADX INFO: renamed from: t */
    public static void m13708t(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, String str) {
        betamaxTranscoderSessionItem.getClass();
        str.getClass();
        betamaxTranscoderSessionItem.bitField0_ |= 16;
        betamaxTranscoderSessionItem.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13709u(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, String str) {
        betamaxTranscoderSessionItem.getClass();
        betamaxTranscoderSessionItem.bitField0_ |= 64;
        betamaxTranscoderSessionItem.subtitleLocale_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13710v(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, String str) {
        betamaxTranscoderSessionItem.getClass();
        str.getClass();
        betamaxTranscoderSessionItem.bitField0_ |= 1;
        betamaxTranscoderSessionItem.transcodingId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13711w(BetamaxTranscoderSessionItem betamaxTranscoderSessionItem, String str) {
        betamaxTranscoderSessionItem.getClass();
        str.getClass();
        betamaxTranscoderSessionItem.bitField0_ |= 2;
        betamaxTranscoderSessionItem.transcodingItemId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static mb9 m13712x() {
        return (mb9) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\b\u001a\tဂ\u0007\nဂ\b", new Object[]{"bitField0_", "transcodingId_", "transcodingItemId_", "itemIndex_", "itemType_", "mediaUrl_", "isDrm_", "subtitleLocale_", "effects_", "clipStartMs_", "clipEndMs_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxTranscoderSessionItem();
        }
        if (iOrdinal == 4) {
            return new mb9(DEFAULT_INSTANCE);
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
        synchronized (BetamaxTranscoderSessionItem.class) {
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
