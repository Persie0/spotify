package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.BoolValue;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x4j;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ConsentFlags extends AbstractC0269h implements sre0 {
    public static final int COLLECT_PERSONAL_INFO_FIELD_NUMBER = 2;
    private static final ConsentFlags DEFAULT_INSTANCE;
    public static final int EULA_AGREED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PUSH_NOTIFICATIONS_FIELD_NUMBER = 5;
    public static final int SEND_EMAIL_FIELD_NUMBER = 3;
    public static final int TAILORED_ADS_FIELD_NUMBER = 6;
    public static final int THIRD_PARTY_EMAIL_FIELD_NUMBER = 4;
    private int bitField0_;
    private BoolValue collectPersonalInfo_;
    private BoolValue eulaAgreed_;
    private BoolValue pushNotifications_;
    private BoolValue sendEmail_;
    private BoolValue tailoredAds_;
    private BoolValue thirdPartyEmail_;

    static {
        ConsentFlags consentFlags = new ConsentFlags();
        DEFAULT_INSTANCE = consentFlags;
        AbstractC0269h.registerDefaultInstance(ConsentFlags.class, consentFlags);
    }

    private ConsentFlags() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21330n(ConsentFlags consentFlags, BoolValue boolValue) {
        consentFlags.getClass();
        boolValue.getClass();
        consentFlags.collectPersonalInfo_ = boolValue;
        consentFlags.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m21331o(ConsentFlags consentFlags, BoolValue boolValue) {
        consentFlags.getClass();
        boolValue.getClass();
        consentFlags.eulaAgreed_ = boolValue;
        consentFlags.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m21332p(ConsentFlags consentFlags, BoolValue boolValue) {
        consentFlags.getClass();
        boolValue.getClass();
        consentFlags.pushNotifications_ = boolValue;
        consentFlags.bitField0_ |= 16;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21333q(ConsentFlags consentFlags, BoolValue boolValue) {
        consentFlags.getClass();
        boolValue.getClass();
        consentFlags.sendEmail_ = boolValue;
        consentFlags.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m21334r(ConsentFlags consentFlags, BoolValue boolValue) {
        consentFlags.getClass();
        boolValue.getClass();
        consentFlags.tailoredAds_ = boolValue;
        consentFlags.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: s */
    public static void m21335s(ConsentFlags consentFlags, BoolValue boolValue) {
        consentFlags.getClass();
        boolValue.getClass();
        consentFlags.thirdPartyEmail_ = boolValue;
        consentFlags.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: t */
    public static x4j m21336t() {
        return (x4j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "eulaAgreed_", "collectPersonalInfo_", "sendEmail_", "thirdPartyEmail_", "pushNotifications_", "tailoredAds_"});
        }
        if (iOrdinal == 3) {
            return new ConsentFlags();
        }
        if (iOrdinal == 4) {
            return new x4j(DEFAULT_INSTANCE);
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
        synchronized (ConsentFlags.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
