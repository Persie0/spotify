package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.google.type.DateTime;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CampaignCardPlaceholderValue extends AbstractC0269h implements sre0 {
    public static final int CONCERT_START_FIELD_NUMBER = 5;
    public static final int COUNTDOWN_END_TIME_FIELD_NUMBER = 4;
    public static final int DATE_TIME_FIELD_NUMBER = 3;
    private static final CampaignCardPlaceholderValue DEFAULT_INSTANCE;
    public static final int EMPHASIZED_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    static {
        CampaignCardPlaceholderValue campaignCardPlaceholderValue = new CampaignCardPlaceholderValue();
        DEFAULT_INSTANCE = campaignCardPlaceholderValue;
        AbstractC0269h.registerDefaultInstance(CampaignCardPlaceholderValue.class, campaignCardPlaceholderValue);
    }

    private CampaignCardPlaceholderValue() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", Timestamp.class, Timestamp.class, DateTime.class});
        }
        if (iOrdinal == 3) {
            return new CampaignCardPlaceholderValue();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 13);
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
        synchronized (CampaignCardPlaceholderValue.class) {
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
    public final DateTime m6935n() {
        return this.valueCase_ == 5 ? (DateTime) this.value_ : DateTime.m2198o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Timestamp m6936o() {
        return this.valueCase_ == 4 ? (Timestamp) this.value_ : Timestamp.m1965q();
    }

    /* JADX INFO: renamed from: p */
    public final Timestamp m6937p() {
        return this.valueCase_ == 3 ? (Timestamp) this.value_ : Timestamp.m1965q();
    }

    /* JADX INFO: renamed from: q */
    public final String m6938q() {
        return this.valueCase_ == 2 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: r */
    public final String m6939r() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6940s() {
        return this.valueCase_ == 5;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6941t() {
        return this.valueCase_ == 4;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6942u() {
        return this.valueCase_ == 3;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6943v() {
        return this.valueCase_ == 2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m6944w() {
        return this.valueCase_ == 1;
    }
}
