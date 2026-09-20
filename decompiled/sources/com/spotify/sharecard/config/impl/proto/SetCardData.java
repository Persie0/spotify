package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z401;

/* JADX INFO: loaded from: classes10.dex */
public final class SetCardData extends AbstractC0269h implements sre0 {
    private static final SetCardData DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int QUOTE_FIELD_NUMBER = 2;
    public static final int SET_BACKGROUND_WITH_STICKER_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        SetCardData setCardData = new SetCardData();
        DEFAULT_INSTANCE = setCardData;
        AbstractC0269h.registerDefaultInstance(SetCardData.class, setCardData);
    }

    private SetCardData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21175n(SetCardData setCardData, Quote quote) {
        setCardData.getClass();
        setCardData.kind_ = quote;
        setCardData.kindCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m21176o(SetCardData setCardData, SetBackgroundWithSticker setBackgroundWithSticker) {
        setCardData.getClass();
        setBackgroundWithSticker.getClass();
        setCardData.kind_ = setBackgroundWithSticker;
        setCardData.kindCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m21177p(SetCardData setCardData, Timestamp timestamp) {
        setCardData.getClass();
        setCardData.kind_ = timestamp;
        setCardData.kindCase_ = 3;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static z401 m21178q() {
        return (z401) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"kind_", "kindCase_", SetBackgroundWithSticker.class, Quote.class, Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new SetCardData();
        }
        if (iOrdinal == 4) {
            return new z401(DEFAULT_INSTANCE);
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
        synchronized (SetCardData.class) {
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
