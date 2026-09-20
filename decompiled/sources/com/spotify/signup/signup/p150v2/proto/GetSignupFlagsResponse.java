package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetSignupFlagsResponse extends AbstractC0269h implements sre0 {
    public static final int ALLOWED_CALLING_CODES_FIELD_NUMBER = 15;
    public static final int CAN_ACCEPT_LICENSES_IN_ONE_STEP_FIELD_NUMBER = 2;
    public static final int COUNTRY_FIELD_NUMBER = 1;
    private static final GetSignupFlagsResponse DEFAULT_INSTANCE;
    public static final int MINIMUM_AGE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PRIVACY_POLICY_ACCEPTANCE_FIELD_NUMBER = 8;
    public static final int REQUIRES_MARKETING_OPT_IN_FIELD_NUMBER = 3;
    public static final int REQUIRES_MARKETING_OPT_IN_TEXT_FIELD_NUMBER = 4;
    public static final int REQUIRES_TAILORED_ADS_OPT_IN_FIELD_NUMBER = 5;
    public static final int SHOW_COLLECT_PERSONAL_INFO_FIELD_NUMBER = 10;
    public static final int SHOW_NON_REQUIRED_FIELDS_AS_OPTIONAL_FIELD_NUMBER = 14;
    public static final int SPOTIFY_MARKETING_MESSAGES_OPTION_FIELD_NUMBER = 9;
    public static final int TERMS_CONDITIONS_ACCEPTANCE_FIELD_NUMBER = 7;
    public static final int USE_ALL_GENDERS_FIELD_NUMBER = 11;
    public static final int USE_OTHER_GENDER_FIELD_NUMBER = 12;
    public static final int USE_PREFER_NOT_TO_SAY_GENDER_FIELD_NUMBER = 13;
    private boolean canAcceptLicensesInOneStep_;
    private int minimumAge_;
    private boolean requiresMarketingOptInText_;
    private boolean requiresMarketingOptIn_;
    private boolean requiresTailoredAdsOptIn_;
    private boolean showCollectPersonalInfo_;
    private boolean showNonRequiredFieldsAsOptional_;
    private boolean useAllGenders_;
    private boolean useOtherGender_;
    private boolean usePreferNotToSayGender_;
    private String country_ = "";
    private String termsConditionsAcceptance_ = "";
    private String privacyPolicyAcceptance_ = "";
    private String spotifyMarketingMessagesOption_ = "";
    private ae50 allowedCallingCodes_ = AbstractC0269h.emptyProtobufList();

    public static final class AllowedCallingCodes extends AbstractC0269h implements sre0 {
        public static final int CALLING_CODE_FIELD_NUMBER = 2;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
        private static final AllowedCallingCodes DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER;
        private int callingCode_;
        private String countryCode_ = "";

        static {
            AllowedCallingCodes allowedCallingCodes = new AllowedCallingCodes();
            DEFAULT_INSTANCE = allowedCallingCodes;
            AbstractC0269h.registerDefaultInstance(AllowedCallingCodes.class, allowedCallingCodes);
        }

        private AllowedCallingCodes() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"countryCode_", "callingCode_"});
            }
            if (iOrdinal == 3) {
                return new AllowedCallingCodes();
            }
            if (iOrdinal == 4) {
                return new C1302a(DEFAULT_INSTANCE);
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
            synchronized (AllowedCallingCodes.class) {
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
        public final int m21382n() {
            return this.callingCode_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final String m21383o() {
            return this.countryCode_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GetSignupFlagsResponse getSignupFlagsResponse = new GetSignupFlagsResponse();
        DEFAULT_INSTANCE = getSignupFlagsResponse;
        AbstractC0269h.registerDefaultInstance(GetSignupFlagsResponse.class, getSignupFlagsResponse);
    }

    private GetSignupFlagsResponse() {
    }

    /* JADX INFO: renamed from: C */
    public static C1303b m21366C() {
        return (C1303b) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m21367A() {
        return this.useOtherGender_;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m21368B() {
        return this.usePreferNotToSayGender_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u000b\u0007Ȉ\bȈ\tȈ\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u001b", new Object[]{"country_", "canAcceptLicensesInOneStep_", "requiresMarketingOptIn_", "requiresMarketingOptInText_", "requiresTailoredAdsOptIn_", "minimumAge_", "termsConditionsAcceptance_", "privacyPolicyAcceptance_", "spotifyMarketingMessagesOption_", "showCollectPersonalInfo_", "useAllGenders_", "useOtherGender_", "usePreferNotToSayGender_", "showNonRequiredFieldsAsOptional_", "allowedCallingCodes_", AllowedCallingCodes.class});
        }
        if (iOrdinal == 3) {
            return new GetSignupFlagsResponse();
        }
        if (iOrdinal == 4) {
            return new C1303b(DEFAULT_INSTANCE);
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
        synchronized (GetSignupFlagsResponse.class) {
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
    public final ae50 m21369n() {
        return this.allowedCallingCodes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m21370o() {
        return this.canAcceptLicensesInOneStep_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21371p() {
        return this.country_;
    }

    /* JADX INFO: renamed from: q */
    public final int m21372q() {
        return this.minimumAge_;
    }

    /* JADX INFO: renamed from: r */
    public final String m21373r() {
        return this.privacyPolicyAcceptance_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m21374s() {
        return this.requiresMarketingOptIn_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m21375t() {
        return this.requiresMarketingOptInText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m21376u() {
        return this.requiresTailoredAdsOptIn_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m21377v() {
        return this.showCollectPersonalInfo_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m21378w() {
        return this.showNonRequiredFieldsAsOptional_;
    }

    /* JADX INFO: renamed from: x */
    public final String m21379x() {
        return this.spotifyMarketingMessagesOption_;
    }

    /* JADX INFO: renamed from: y */
    public final String m21380y() {
        return this.termsConditionsAcceptance_;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m21381z() {
        return this.useAllGenders_;
    }
}
