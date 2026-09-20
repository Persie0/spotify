package com.comscore.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.comscore.util.TcfDataLoader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AndroidTcfDataLoader implements TcfDataLoader, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final int COMSCORE_VENDOR_INDEX = 77;
    public static final String IABTCF_CMP_SDK_ID = "IABTCF_CmpSdkID";
    public static final String IABTCF_GDPR_APPLIES = "IABTCF_gdprApplies";
    public static final String IABTCF_PUBLISHER_CC = "IABTCF_PublisherCC";
    public static final String IABTCF_PURPOSE_CONSENTS = "IABTCF_PurposeConsents";
    public static final String IABTCF_PURPOSE_ONE_TREATMENT = "IABTCF_PurposeOneTreatment";
    public static final String IABTCF_VENDOR_CONSENTS = "IABTCF_VendorConsents";
    public static final String IABTCF_VENDOR_LEGITIMATE_INTERESTS = "IABTCF_VendorLegitimateInterests";
    protected boolean _enabled;
    protected boolean _registered;

    /* JADX INFO: renamed from: a */
    private Map<Integer, Boolean> f1564a;

    /* JADX INFO: renamed from: b */
    private boolean f1565b;

    /* JADX INFO: renamed from: c */
    private boolean f1566c;

    /* JADX INFO: renamed from: d */
    private boolean f1567d;

    /* JADX INFO: renamed from: e */
    private boolean f1568e;

    /* JADX INFO: renamed from: f */
    private boolean f1569f;

    /* JADX INFO: renamed from: g */
    private String f1570g;

    /* JADX INFO: renamed from: h */
    private SharedPreferences f1571h;

    public AndroidTcfDataLoader() {
        HashMap map = new HashMap();
        this.f1564a = map;
        Boolean bool = Boolean.FALSE;
        map.put(1, bool);
        this.f1564a.put(7, bool);
        this.f1564a.put(8, bool);
        this.f1564a.put(9, bool);
        this.f1564a.put(10, bool);
        this._enabled = false;
    }

    /* JADX INFO: renamed from: a */
    private void m1238a() {
        SharedPreferences sharedPreferences;
        if (this._registered || (sharedPreferences = this.f1571h) == null) {
            return;
        }
        m1246g(sharedPreferences);
        this.f1571h.registerOnSharedPreferenceChangeListener(this);
        this._registered = true;
    }

    /* JADX INFO: renamed from: b */
    private void m1240b() {
        SharedPreferences sharedPreferences;
        if (!this._registered || (sharedPreferences = this.f1571h) == null) {
            return;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        this._registered = false;
    }

    /* JADX INFO: renamed from: c */
    private void m1242c(SharedPreferences sharedPreferences) {
        this.f1566c = sharedPreferences.getInt(IABTCF_GDPR_APPLIES, 0) == 1;
    }

    /* JADX INFO: renamed from: d */
    private void m1243d(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(IABTCF_VENDOR_LEGITIMATE_INTERESTS, "");
        if (string.length() >= 76) {
            this.f1568e = string.charAt(76) == '1';
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1244e(SharedPreferences sharedPreferences) {
        this.f1570g = sharedPreferences.getString(IABTCF_PUBLISHER_CC, "AA");
    }

    /* JADX INFO: renamed from: f */
    private void m1245f(SharedPreferences sharedPreferences) {
        this.f1569f = sharedPreferences.getInt(IABTCF_PURPOSE_ONE_TREATMENT, 0) == 1;
    }

    /* JADX INFO: renamed from: g */
    private void m1246g(SharedPreferences sharedPreferences) {
        m1239a(sharedPreferences);
        m1242c(sharedPreferences);
        m1247h(sharedPreferences);
        m1243d(sharedPreferences);
        m1241b(sharedPreferences);
        m1244e(sharedPreferences);
        m1245f(sharedPreferences);
    }

    /* JADX INFO: renamed from: h */
    private void m1247h(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(IABTCF_VENDOR_CONSENTS, "");
        if (string.length() >= 77) {
            this.f1567d = string.charAt(76) == '1';
        }
    }

    @Override // com.comscore.util.TcfDataLoader
    public Map<Integer, Boolean> getConsents() {
        return this.f1564a;
    }

    @Override // com.comscore.util.TcfDataLoader
    public String getPublisherCountryCode() {
        return this.f1570g;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isCmpPresent() {
        return this.f1565b;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isCmpReady() {
        return true;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isGdprApplicable() {
        return this.f1566c;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isLegitimateInterestConsent() {
        return this.f1568e;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isPurposeOneTreatmentEnabled() {
        return this.f1569f;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isServiceSpecificEnabled() {
        return true;
    }

    @Override // com.comscore.util.TcfDataLoader
    public boolean isVendorConsentEnabled() {
        return this.f1567d;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (IABTCF_CMP_SDK_ID.equals(str)) {
            m1239a(sharedPreferences);
            return;
        }
        if (IABTCF_GDPR_APPLIES.equals(str)) {
            m1242c(sharedPreferences);
            return;
        }
        if (IABTCF_VENDOR_CONSENTS.equals(str)) {
            m1247h(sharedPreferences);
            return;
        }
        if (IABTCF_VENDOR_LEGITIMATE_INTERESTS.equals(str)) {
            m1243d(sharedPreferences);
            return;
        }
        if (IABTCF_PURPOSE_CONSENTS.equals(str)) {
            m1241b(sharedPreferences);
        } else if (IABTCF_PUBLISHER_CC.equals(str)) {
            m1244e(sharedPreferences);
        } else if (IABTCF_PURPOSE_ONE_TREATMENT.equals(str)) {
            m1245f(sharedPreferences);
        }
    }

    public void setContext(Context context) {
        if (this.f1571h != null) {
            return;
        }
        this.f1571h = PreferenceManager.getDefaultSharedPreferences(context);
        if (this._enabled) {
            m1238a();
        }
    }

    @Override // com.comscore.util.TcfDataLoader
    public void setEnabled(boolean z) {
        if (this._enabled == z) {
            return;
        }
        this._enabled = z;
        if (z) {
            m1238a();
        } else {
            m1240b();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1241b(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(IABTCF_PURPOSE_CONSENTS, null);
        if (string == null || string.length() < 10) {
            return;
        }
        this.f1564a.put(1, Boolean.valueOf(string.charAt(0) == '1'));
        this.f1564a.put(7, Boolean.valueOf(string.charAt(6) == '1'));
        this.f1564a.put(8, Boolean.valueOf(string.charAt(7) == '1'));
        this.f1564a.put(9, Boolean.valueOf(string.charAt(8) == '1'));
        this.f1564a.put(10, Boolean.valueOf(string.charAt(9) == '1'));
    }

    /* JADX INFO: renamed from: a */
    private void m1239a(SharedPreferences sharedPreferences) {
        this.f1565b = sharedPreferences.contains(IABTCF_CMP_SDK_ID);
    }
}
