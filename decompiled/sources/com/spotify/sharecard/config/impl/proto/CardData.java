package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CardData extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_WITH_STICKER_FIELD_NUMBER = 1;
    private static final CardData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUOTE_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        CardData cardData = new CardData();
        DEFAULT_INSTANCE = cardData;
        AbstractC0269h.registerDefaultInstance(CardData.class, cardData);
    }

    private CardData() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CardData m21135r(byte[] bArr) {
        return (CardData) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"kind_", "kindCase_", BackgroundWithSticker.class, Quote.class, Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new CardData();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 12);
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
        synchronized (CardData.class) {
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
    public final BackgroundWithSticker m21136n() {
        return this.kindCase_ == 1 ? (BackgroundWithSticker) this.kind_ : BackgroundWithSticker.m21132o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m21137o() {
        int i = this.kindCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final Quote m21138p() {
        return this.kindCase_ == 2 ? (Quote) this.kind_ : Quote.m21159p();
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m21139q() {
        return this.kindCase_ == 3 ? (Timestamp) this.kind_ : Timestamp.m21183o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
