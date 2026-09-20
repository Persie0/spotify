package com.comscore.util;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface TcfDataLoader {
    Map<Integer, Boolean> getConsents();

    String getPublisherCountryCode();

    boolean isCmpPresent();

    boolean isCmpReady();

    boolean isGdprApplicable();

    boolean isLegitimateInterestConsent();

    boolean isPurposeOneTreatmentEnabled();

    boolean isServiceSpecificEnabled();

    boolean isVendorConsentEnabled();

    void setEnabled(boolean z);
}
