package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SourceReference extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_URI_FIELD_NUMBER = 1;
    public static final int CONCERT_URI_FIELD_NUMBER = 2;
    private static final SourceReference DEFAULT_INSTANCE;
    public static final int OFFER_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_NAME_FIELD_NUMBER = 4;
    private int bitField0_;
    private String campaignUri_ = "";
    private String concertUri_ = "";
    private String offerId_ = "";
    private String providerName_ = "";

    static {
        SourceReference sourceReference = new SourceReference();
        DEFAULT_INSTANCE = sourceReference;
        AbstractC0269h.registerDefaultInstance(SourceReference.class, sourceReference);
    }

    private SourceReference() {
    }

    /* JADX INFO: renamed from: p */
    public static SourceReference m7124p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "campaignUri_", "concertUri_", "offerId_", "providerName_"});
        }
        if (iOrdinal == 3) {
            return new SourceReference();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 6);
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
        synchronized (SourceReference.class) {
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
    public final String m7125n() {
        return this.campaignUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7126o() {
        return this.concertUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7127q() {
        return this.offerId_;
    }

    /* JADX INFO: renamed from: r */
    public final String m7128r() {
        return this.providerName_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7129s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7130t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7131u() {
        return (this.bitField0_ & 4) != 0;
    }
}
