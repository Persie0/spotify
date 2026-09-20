package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dq40;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes7.dex */
public final class InitChildAccountConfigResponse extends AbstractC0269h implements sre0 {
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 3;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 2;
    private static final InitChildAccountConfigResponse DEFAULT_INSTANCE;
    public static final int ENFORCED_DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 6;
    public static final int ENFORCED_DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 5;
    public static final int FAMILY_PLAN_MANAGER_HAS_PIN_FIELD_NUMBER = 1;
    public static final int HAS_CHILDREN_ALLOWED_IN_MUSIC_APP_FIELD_NUMBER = 7;
    public static final int PARENTAL_CONTROL_CONNECT_FIELD_NUMBER = 8;
    public static final int PARENTAL_CONTROL_EXPLICIT_CONTENT_FIELD_NUMBER = 9;
    public static final int PARENTAL_CONTROL_VIDEO_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PRIVACY_POLICY_CONSENT_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean familyPlanManagerHasPin_;
    private boolean hasChildrenAllowedInMusicApp_;
    private ParentalControl parentalControlConnect_;
    private ParentalControl parentalControlExplicitContent_;
    private ParentalControl parentalControlVideo_;
    private int privacyPolicyConsentType_;
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";
    private String enforcedDateOfBirthMinDate_ = "";
    private String enforcedDateOfBirthMaxDate_ = "";

    static {
        InitChildAccountConfigResponse initChildAccountConfigResponse = new InitChildAccountConfigResponse();
        DEFAULT_INSTANCE = initChildAccountConfigResponse;
        AbstractC0269h.registerDefaultInstance(InitChildAccountConfigResponse.class, initChildAccountConfigResponse);
    }

    private InitChildAccountConfigResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\u0007\u0007\bဉ\u0000\tဉ\u0001\nဉ\u0002", new Object[]{"bitField0_", "familyPlanManagerHasPin_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_", "privacyPolicyConsentType_", "enforcedDateOfBirthMinDate_", "enforcedDateOfBirthMaxDate_", "hasChildrenAllowedInMusicApp_", "parentalControlConnect_", "parentalControlExplicitContent_", "parentalControlVideo_"});
        }
        if (iOrdinal == 3) {
            return new InitChildAccountConfigResponse();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 7);
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
        synchronized (InitChildAccountConfigResponse.class) {
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

    public final String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    public final String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12088n() {
        return this.familyPlanManagerHasPin_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12089o() {
        return this.hasChildrenAllowedInMusicApp_;
    }

    /* JADX INFO: renamed from: p */
    public final ParentalControl m12090p() {
        ParentalControl parentalControl = this.parentalControlExplicitContent_;
        return parentalControl == null ? ParentalControl.m12096n() : parentalControl;
    }

    /* JADX INFO: renamed from: q */
    public final ParentalControl m12091q() {
        ParentalControl parentalControl = this.parentalControlVideo_;
        return parentalControl == null ? ParentalControl.m12096n() : parentalControl;
    }

    /* JADX INFO: renamed from: r */
    public final dq40 m12092r() {
        dq40 dq40Var;
        int i = this.privacyPolicyConsentType_;
        if (i == 0) {
            dq40Var = dq40.UNKNOWN;
        } else if (i == 1) {
            dq40Var = dq40.COPPA;
        } else if (i == 2) {
            dq40Var = dq40.NON;
        } else if (i != 3) {
            dq40Var = i != 4 ? null : dq40.EXPLICIT;
        } else {
            dq40Var = dq40.IMPLICIT;
        }
        return dq40Var == null ? dq40.UNRECOGNIZED : dq40Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
