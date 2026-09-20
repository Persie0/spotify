package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignCardTagText extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int DECORATED_TEXT_FIELD_NUMBER = 1;
    private static final CampaignCardTagText DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String backgroundColor_ = "";
    private int bitField0_;
    private CampaignCardDecoratedText decoratedText_;

    static {
        CampaignCardTagText campaignCardTagText = new CampaignCardTagText();
        DEFAULT_INSTANCE = campaignCardTagText;
        AbstractC0269h.registerDefaultInstance(CampaignCardTagText.class, campaignCardTagText);
    }

    private CampaignCardTagText() {
    }

    /* JADX INFO: renamed from: p */
    public static CampaignCardTagText m6949p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "decoratedText_", "backgroundColor_"});
        }
        if (iOrdinal == 3) {
            return new CampaignCardTagText();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 14);
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
        synchronized (CampaignCardTagText.class) {
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
    public final String m6950n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CampaignCardDecoratedText m6951o() {
        CampaignCardDecoratedText campaignCardDecoratedText = this.decoratedText_;
        return campaignCardDecoratedText == null ? CampaignCardDecoratedText.m6930n() : campaignCardDecoratedText;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
