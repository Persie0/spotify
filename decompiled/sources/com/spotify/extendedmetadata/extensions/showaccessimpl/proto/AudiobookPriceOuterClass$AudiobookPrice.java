package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AudiobookPriceOuterClass$AudiobookPrice extends AbstractC0269h implements sre0 {
    private static final AudiobookPriceOuterClass$AudiobookPrice DEFAULT_INSTANCE;
    public static final int FINAL_LIST_PRICE_FIELD_NUMBER = 2;
    public static final int FINAL_PRICE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private AudiobookPriceOuterClass$Price finalListPrice_;
    private AudiobookPriceOuterClass$Price finalPrice_;

    static {
        AudiobookPriceOuterClass$AudiobookPrice audiobookPriceOuterClass$AudiobookPrice = new AudiobookPriceOuterClass$AudiobookPrice();
        DEFAULT_INSTANCE = audiobookPriceOuterClass$AudiobookPrice;
        AbstractC0269h.registerDefaultInstance(AudiobookPriceOuterClass$AudiobookPrice.class, audiobookPriceOuterClass$AudiobookPrice);
    }

    private AudiobookPriceOuterClass$AudiobookPrice() {
    }

    /* JADX INFO: renamed from: o */
    public static AudiobookPriceOuterClass$AudiobookPrice m10379o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "finalPrice_", "finalListPrice_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookPriceOuterClass$AudiobookPrice();
        }
        if (iOrdinal == 4) {
            return new q67(8);
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
        synchronized (AudiobookPriceOuterClass$AudiobookPrice.class) {
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

    /* JADX INFO: renamed from: p */
    public final AudiobookPriceOuterClass$Price m10380p() {
        AudiobookPriceOuterClass$Price audiobookPriceOuterClass$Price = this.finalListPrice_;
        return audiobookPriceOuterClass$Price == null ? AudiobookPriceOuterClass$Price.m10382p() : audiobookPriceOuterClass$Price;
    }

    /* JADX INFO: renamed from: q */
    public final AudiobookPriceOuterClass$Price m10381q() {
        AudiobookPriceOuterClass$Price audiobookPriceOuterClass$Price = this.finalPrice_;
        return audiobookPriceOuterClass$Price == null ? AudiobookPriceOuterClass$Price.m10382p() : audiobookPriceOuterClass$Price;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
