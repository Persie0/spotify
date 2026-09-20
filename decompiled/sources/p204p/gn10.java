package p204p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class gn10 extends x9m {

    /* JADX INFO: renamed from: c */
    public final String f81519c;

    /* JADX INFO: renamed from: d */
    public final String f81520d;

    /* JADX WARN: Illegal instructions before constructor call */
    public gn10(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        Bundle bundleM93449h = ydj.m93449h("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundleM93449h.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundleM93449h.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundleM93449h.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundleM93449h.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundleM93449h.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundleM93449h);
        this.f81519c = str2;
        this.f81520d = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}
