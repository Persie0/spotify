package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class EmbeddedAd extends AbstractC0269h implements sre0 {
    public static final int ADVERTISER_FIELD_NUMBER = 1;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 2;
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 3;
    private static final EmbeddedAd DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TAGLINE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String advertiser_ = "";
    private String callToAction_ = "";
    private String clickthroughUrl_ = "";
    private ae50 images_ = AbstractC0269h.emptyProtobufList();
    private String tagline_ = "";

    static {
        EmbeddedAd embeddedAd = new EmbeddedAd();
        DEFAULT_INSTANCE = embeddedAd;
        AbstractC0269h.registerDefaultInstance(EmbeddedAd.class, embeddedAd);
    }

    private EmbeddedAd() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EmbeddedAd m20485q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004\u001b\u0005ለ\u0002", new Object[]{"bitField0_", "advertiser_", "callToAction_", "clickthroughUrl_", "images_", ImageAsset.class, "tagline_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAd();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 20);
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
        synchronized (EmbeddedAd.class) {
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
    public final String m20486n() {
        return this.advertiser_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20487o() {
        return this.callToAction_;
    }

    /* JADX INFO: renamed from: p */
    public final String m20488p() {
        return this.clickthroughUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m20489r() {
        return this.images_;
    }

    /* JADX INFO: renamed from: s */
    public final String m20490s() {
        return this.tagline_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
