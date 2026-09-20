package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudiobookPriceOuterClass$Price extends AbstractC0269h implements sre0 {
    public static final int AMOUNT_FIELD_NUMBER = 1;
    public static final int CURRENCY_FIELD_NUMBER = 2;
    private static final AudiobookPriceOuterClass$Price DEFAULT_INSTANCE;
    public static final int FORMATTED_PRICE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private double amount_;
    private String currency_ = "";
    private String formattedPrice_ = "";

    static {
        AudiobookPriceOuterClass$Price audiobookPriceOuterClass$Price = new AudiobookPriceOuterClass$Price();
        DEFAULT_INSTANCE = audiobookPriceOuterClass$Price;
        AbstractC0269h.registerDefaultInstance(AudiobookPriceOuterClass$Price.class, audiobookPriceOuterClass$Price);
    }

    private AudiobookPriceOuterClass$Price() {
    }

    /* JADX INFO: renamed from: p */
    public static AudiobookPriceOuterClass$Price m10382p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"amount_", "currency_", "formattedPrice_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookPriceOuterClass$Price();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 9);
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
        synchronized (AudiobookPriceOuterClass$Price.class) {
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
    public final double m10383n() {
        return this.amount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10384o() {
        return this.currency_;
    }

    /* JADX INFO: renamed from: q */
    public final String m10385q() {
        return this.formattedPrice_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
