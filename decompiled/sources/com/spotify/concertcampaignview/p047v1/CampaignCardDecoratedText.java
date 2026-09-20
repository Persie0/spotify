package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignCardDecoratedText extends AbstractC0269h implements sre0 {
    private static final CampaignCardDecoratedText DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PREFERRED_RGB_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private String text_ = "";
    private ae50 values_ = AbstractC0269h.emptyProtobufList();
    private String preferredRgb_ = "";

    static {
        CampaignCardDecoratedText campaignCardDecoratedText = new CampaignCardDecoratedText();
        DEFAULT_INSTANCE = campaignCardDecoratedText;
        AbstractC0269h.registerDefaultInstance(CampaignCardDecoratedText.class, campaignCardDecoratedText);
    }

    private CampaignCardDecoratedText() {
    }

    /* JADX INFO: renamed from: n */
    public static CampaignCardDecoratedText m6930n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ለ\u0000", new Object[]{"bitField0_", "text_", "values_", CampaignCardPlaceholderValue.class, "preferredRgb_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCardDecoratedText();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 12);
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
        synchronized (CampaignCardDecoratedText.class) {
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
    public final String m6931o() {
        return this.preferredRgb_;
    }

    /* JADX INFO: renamed from: p */
    public final String m6932p() {
        return this.text_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m6933q() {
        return this.values_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6934r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
