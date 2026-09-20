package com.spotify.login.signupapi.services.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.vf40;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010\u0014¨\u0006,"}, m24212d2 = {"Lcom/spotify/login/signupapi/services/model/TermsData;", "", "", "iAgree", "collectPersonalInformation", "thirdPartyDataProvision", "emailConsent", "pushConsent", "tailoredAdsConsent", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lp/vf40;", "", "paramBuilder", "Lp/w2a1;", "setFields", "(Lp/vf40;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/spotify/login/signupapi/services/model/TermsData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIAgree", "Ljava/lang/Boolean;", "getCollectPersonalInformation", "getThirdPartyDataProvision", "getEmailConsent", "getPushConsent", "getTailoredAdsConsent", "Builder", "src_main_java_com_spotify_login_signupapi-signupapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class TermsData {
    private final Boolean collectPersonalInformation;
    private final Boolean emailConsent;
    private final boolean iAgree;
    private final Boolean pushConsent;
    private final Boolean tailoredAdsConsent;
    private final Boolean thirdPartyDataProvision;

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/login/signupapi/services/model/TermsData$Builder;", "", "origin", "Lcom/spotify/login/signupapi/services/model/TermsData;", "<init>", "(Lcom/spotify/login/signupapi/services/model/TermsData;)V", "iAgree", "", "collectPersonalInformation", "Ljava/lang/Boolean;", "thirdPartyDataProvision", "emailConsent", "pushConsent", "tailoredAdsConsent", "value", "(Ljava/lang/Boolean;)Lcom/spotify/login/signupapi/services/model/TermsData$Builder;", "build", "src_main_java_com_spotify_login_signupapi-signupapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Builder {
        private Boolean collectPersonalInformation;
        private Boolean emailConsent;
        private boolean iAgree;
        private Boolean pushConsent;
        private Boolean tailoredAdsConsent;
        private Boolean thirdPartyDataProvision;

        public Builder(TermsData termsData) {
            this.iAgree = termsData.getIAgree();
            this.collectPersonalInformation = termsData.getCollectPersonalInformation();
            this.thirdPartyDataProvision = termsData.getThirdPartyDataProvision();
            this.emailConsent = termsData.getEmailConsent();
            this.pushConsent = termsData.getPushConsent();
            this.tailoredAdsConsent = termsData.getTailoredAdsConsent();
        }

        public final TermsData build() {
            return new TermsData(this.iAgree, this.collectPersonalInformation, this.thirdPartyDataProvision, this.emailConsent, this.pushConsent, this.tailoredAdsConsent);
        }

        public final Builder collectPersonalInformation(Boolean value) {
            this.collectPersonalInformation = value;
            return this;
        }

        public final Builder emailConsent(Boolean value) {
            this.emailConsent = value;
            return this;
        }

        public final Builder iAgree(boolean value) {
            this.iAgree = value;
            return this;
        }

        public final Builder pushConsent(Boolean value) {
            this.pushConsent = value;
            return this;
        }

        public final Builder tailoredAdsConsent(Boolean value) {
            this.tailoredAdsConsent = value;
            return this;
        }

        public final Builder thirdPartyDataProvision(Boolean value) {
            this.thirdPartyDataProvision = value;
            return this;
        }
    }

    public TermsData(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.iAgree = z;
        this.collectPersonalInformation = bool;
        this.thirdPartyDataProvision = bool2;
        this.emailConsent = bool3;
        this.pushConsent = bool4;
        this.tailoredAdsConsent = bool5;
    }

    public static /* synthetic */ TermsData copy$default(TermsData termsData, boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = termsData.iAgree;
        }
        if ((i & 2) != 0) {
            bool = termsData.collectPersonalInformation;
        }
        if ((i & 4) != 0) {
            bool2 = termsData.thirdPartyDataProvision;
        }
        if ((i & 8) != 0) {
            bool3 = termsData.emailConsent;
        }
        if ((i & 16) != 0) {
            bool4 = termsData.pushConsent;
        }
        if ((i & 32) != 0) {
            bool5 = termsData.tailoredAdsConsent;
        }
        Boolean bool6 = bool4;
        Boolean bool7 = bool5;
        return termsData.copy(z, bool, bool2, bool3, bool6, bool7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIAgree() {
        return this.iAgree;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCollectPersonalInformation() {
        return this.collectPersonalInformation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getThirdPartyDataProvision() {
        return this.thirdPartyDataProvision;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEmailConsent() {
        return this.emailConsent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getPushConsent() {
        return this.pushConsent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getTailoredAdsConsent() {
        return this.tailoredAdsConsent;
    }

    public final TermsData copy(boolean iAgree, Boolean collectPersonalInformation, Boolean thirdPartyDataProvision, Boolean emailConsent, Boolean pushConsent, Boolean tailoredAdsConsent) {
        return new TermsData(iAgree, collectPersonalInformation, thirdPartyDataProvision, emailConsent, pushConsent, tailoredAdsConsent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TermsData)) {
            return false;
        }
        TermsData termsData = (TermsData) other;
        return this.iAgree == termsData.iAgree && wj50.m88271j(this.collectPersonalInformation, termsData.collectPersonalInformation) && wj50.m88271j(this.thirdPartyDataProvision, termsData.thirdPartyDataProvision) && wj50.m88271j(this.emailConsent, termsData.emailConsent) && wj50.m88271j(this.pushConsent, termsData.pushConsent) && wj50.m88271j(this.tailoredAdsConsent, termsData.tailoredAdsConsent);
    }

    public final Boolean getCollectPersonalInformation() {
        return this.collectPersonalInformation;
    }

    public final Boolean getEmailConsent() {
        return this.emailConsent;
    }

    public final boolean getIAgree() {
        return this.iAgree;
    }

    public final Boolean getPushConsent() {
        return this.pushConsent;
    }

    public final Boolean getTailoredAdsConsent() {
        return this.tailoredAdsConsent;
    }

    public final Boolean getThirdPartyDataProvision() {
        return this.thirdPartyDataProvision;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.iAgree) * 31;
        Boolean bool = this.collectPersonalInformation;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.thirdPartyDataProvision;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.emailConsent;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.pushConsent;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.tailoredAdsConsent;
        return iHashCode5 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final void setFields(vf40 paramBuilder) {
        paramBuilder.mo85345e("iagree", Boolean.valueOf(this.iAgree));
        Boolean bool = this.collectPersonalInformation;
        if (bool != null) {
            paramBuilder.mo85345e("collect_personal_info", bool);
        }
        Boolean bool2 = this.thirdPartyDataProvision;
        if (bool2 != null) {
            paramBuilder.mo85345e("thirdpartyemail", bool2);
        }
        Boolean bool3 = this.emailConsent;
        if (bool3 != null) {
            paramBuilder.mo85345e("send-email", bool3);
        }
        Boolean bool4 = this.pushConsent;
        if (bool4 != null) {
            paramBuilder.mo85345e("push-notifications", bool4);
        }
        Boolean bool5 = this.tailoredAdsConsent;
        if (bool5 != null) {
            paramBuilder.mo85345e("tailored_ads", bool5);
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TermsData(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5);
    }
}
