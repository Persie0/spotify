package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class aa10 {

    /* JADX INFO: renamed from: a */
    public final String f13703a;

    /* JADX INFO: renamed from: b */
    public final Bundle f13704b;

    /* JADX INFO: renamed from: c */
    public final Bundle f13705c;

    /* JADX INFO: renamed from: d */
    public final boolean f13706d;

    /* JADX INFO: renamed from: e */
    public final Set f13707e;

    public aa10(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i) {
        this.f13703a = str;
        this.f13704b = bundle;
        this.f13705c = bundle2;
        this.f13706d = z;
        this.f13707e = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i);
    }

    public aa10() {
        Bundle bundle = new Bundle();
        gbu gbuVar = gbu.f78413a;
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(gbuVar));
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(gbuVar));
        this("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, false, gbuVar, 1000);
    }

    public aa10(String str) {
        Bundle bundleM93449h = ydj.m93449h("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundleM93449h.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        this("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundleM93449h, bundle, false, true, gbu.f78413a, 100);
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
