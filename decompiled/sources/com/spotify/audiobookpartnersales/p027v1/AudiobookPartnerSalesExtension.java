package com.spotify.audiobookpartnersales.p027v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudiobookPartnerSalesExtension extends AbstractC0269h implements sre0 {
    private static final AudiobookPartnerSalesExtension DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRODUCT_OPTIONS_FIELD_NUMBER = 1;
    private ae50 productOptions_ = AbstractC0269h.emptyProtobufList();

    static {
        AudiobookPartnerSalesExtension audiobookPartnerSalesExtension = new AudiobookPartnerSalesExtension();
        DEFAULT_INSTANCE = audiobookPartnerSalesExtension;
        AbstractC0269h.registerDefaultInstance(AudiobookPartnerSalesExtension.class, audiobookPartnerSalesExtension);
    }

    private AudiobookPartnerSalesExtension() {
    }

    /* JADX INFO: renamed from: o */
    public static AudiobookPartnerSalesExtension m3422o(byte[] bArr) {
        return (AudiobookPartnerSalesExtension) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"productOptions_", ProductOption.class});
        }
        if (iOrdinal == 3) {
            return new AudiobookPartnerSalesExtension();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 7);
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
        synchronized (AudiobookPartnerSalesExtension.class) {
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
    public final ae50 m3423n() {
        return this.productOptions_;
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
