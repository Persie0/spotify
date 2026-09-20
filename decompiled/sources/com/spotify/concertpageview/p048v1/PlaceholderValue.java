package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.google.type.DateTime;
import com.google.type.Money;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PlaceholderValue extends AbstractC0269h implements sre0 {
    public static final int COUNTDOWN_END_TIME_FIELD_NUMBER = 4;
    private static final PlaceholderValue DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int USER_LOCAL_TIME_FIELD_NUMBER = 5;
    public static final int VENUE_DATE_TIME_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        PlaceholderValue placeholderValue = new PlaceholderValue();
        DEFAULT_INSTANCE = placeholderValue;
        AbstractC0269h.registerDefaultInstance(PlaceholderValue.class, placeholderValue);
    }

    private PlaceholderValue() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", Money.class, DateTime.class, Timestamp.class, Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new PlaceholderValue();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 19);
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
        synchronized (PlaceholderValue.class) {
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
    public final Timestamp m7091n() {
        return this.valueCase_ == 4 ? (Timestamp) this.value_ : Timestamp.m1965q();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Money m7092o() {
        return this.valueCase_ == 2 ? (Money) this.value_ : Money.m2217o();
    }

    /* JADX INFO: renamed from: p */
    public final String m7093p() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m7094q() {
        return this.valueCase_ == 5 ? (Timestamp) this.value_ : Timestamp.m1965q();
    }

    /* JADX INFO: renamed from: r */
    public final int m7095r() {
        int i = this.valueCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final DateTime m7096s() {
        return this.valueCase_ == 3 ? (DateTime) this.value_ : DateTime.m2198o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
