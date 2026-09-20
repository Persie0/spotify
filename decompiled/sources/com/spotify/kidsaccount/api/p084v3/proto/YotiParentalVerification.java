package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.aje1;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class YotiParentalVerification extends AbstractC0269h implements sre0 {
    private static final YotiParentalVerification DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        YotiParentalVerification yotiParentalVerification = new YotiParentalVerification();
        DEFAULT_INSTANCE = yotiParentalVerification;
        AbstractC0269h.registerDefaultInstance(YotiParentalVerification.class, yotiParentalVerification);
    }

    private YotiParentalVerification() {
    }

    /* JADX INFO: renamed from: n */
    public static YotiParentalVerification m12166n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new YotiParentalVerification();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 5);
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
        synchronized (YotiParentalVerification.class) {
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
    public final aje1 m12167o() {
        aje1 aje1Var;
        int i = this.type_;
        if (i == 0) {
            aje1Var = aje1.YOTI_VERIFICATION_TYPE_UNKNOWN;
        } else if (i != 1) {
            aje1Var = i != 2 ? null : aje1.YOTI_VERIFICATION_TYPE_ID_ONLY;
        } else {
            aje1Var = aje1.YOTI_VERIFICATION_TYPE_ID_AND_SELFIE;
        }
        return aje1Var == null ? aje1.UNRECOGNIZED : aje1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
