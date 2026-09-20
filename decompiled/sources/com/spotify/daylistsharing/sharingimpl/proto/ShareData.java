package com.spotify.daylistsharing.sharingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShareData extends AbstractC0269h implements sre0 {
    private static final ShareData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SCREENSHOT_SHARE_CARD_FIELD_NUMBER = 2;
    public static final int SHARE_CARDS_FIELD_NUMBER = 1;
    public static final int SHARE_ORIGIN_IDS_FIELD_NUMBER = 4;
    public static final int SNAPSHOT_SHARE_CARD_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShareCard screenshotShareCard_;
    private ae50 shareCards_ = AbstractC0269h.emptyProtobufList();
    private OriginIds shareOriginIds_;
    private ShareCard snapshotShareCard_;

    static {
        ShareData shareData = new ShareData();
        DEFAULT_INSTANCE = shareData;
        AbstractC0269h.registerDefaultInstance(ShareData.class, shareData);
    }

    private ShareData() {
    }

    /* JADX INFO: renamed from: n */
    public static ShareData m9115n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static ShareData m9116s(byte[] bArr) {
        return (ShareData) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "shareCards_", ShareCard.class, "screenshotShareCard_", "snapshotShareCard_", "shareOriginIds_"});
        }
        if (iOrdinal == 3) {
            return new ShareData();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 8);
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
        synchronized (ShareData.class) {
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
    public final ShareCard m9117o() {
        ShareCard shareCard = this.screenshotShareCard_;
        return shareCard == null ? ShareCard.m9112o() : shareCard;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m9118p() {
        return this.shareCards_;
    }

    /* JADX INFO: renamed from: q */
    public final OriginIds m9119q() {
        OriginIds originIds = this.shareOriginIds_;
        return originIds == null ? OriginIds.m9108o() : originIds;
    }

    /* JADX INFO: renamed from: r */
    public final ShareCard m9120r() {
        ShareCard shareCard = this.snapshotShareCard_;
        return shareCard == null ? ShareCard.m9112o() : shareCard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
