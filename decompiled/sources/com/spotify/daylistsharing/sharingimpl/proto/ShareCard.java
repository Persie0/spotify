package com.spotify.daylistsharing.sharingimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i3c;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShareCard extends AbstractC0269h implements sre0 {
    public static final int CARD_TYPE_FIELD_NUMBER = 3;
    private static final ShareCard DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LOG_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int cardType_;
    private String imageUrl_ = "";
    private String logId_ = "";

    static {
        ShareCard shareCard = new ShareCard();
        DEFAULT_INSTANCE = shareCard;
        AbstractC0269h.registerDefaultInstance(ShareCard.class, shareCard);
    }

    private ShareCard() {
    }

    /* JADX INFO: renamed from: o */
    public static ShareCard m9112o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"imageUrl_", "logId_", "cardType_"});
        }
        if (iOrdinal == 3) {
            return new ShareCard();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 4);
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
        synchronized (ShareCard.class) {
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

    /* JADX INFO: renamed from: n */
    public final i3c m9113n() {
        i3c i3cVar;
        int i = this.cardType_;
        if (i == 0) {
            i3cVar = i3c.UNKNOWN;
        } else if (i != 1) {
            i3cVar = i != 2 ? null : i3c.STICKER;
        } else {
            i3cVar = i3c.BACKGROUND;
        }
        return i3cVar == null ? i3c.UNRECOGNIZED : i3cVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m9114p() {
        return this.logId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
