package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p204p.AbstractC2206o9;
import p204p.alf1;
import p204p.ig31;
import p204p.tne1;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC2206o9 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new tne1(19);

    /* JADX INFO: renamed from: X */
    public final String f1721X;

    /* JADX INFO: renamed from: Y */
    public final HashSet f1722Y = new HashSet();

    /* JADX INFO: renamed from: a */
    public final String f1723a;

    /* JADX INFO: renamed from: b */
    public final String f1724b;

    /* JADX INFO: renamed from: c */
    public final String f1725c;

    /* JADX INFO: renamed from: d */
    public final String f1726d;

    /* JADX INFO: renamed from: e */
    public final Uri f1727e;

    /* JADX INFO: renamed from: f */
    public String f1728f;

    /* JADX INFO: renamed from: g */
    public final long f1729g;

    /* JADX INFO: renamed from: h */
    public final String f1730h;

    /* JADX INFO: renamed from: i */
    public final List f1731i;

    /* JADX INFO: renamed from: t */
    public final String f1732t;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f1723a = str;
        this.f1724b = str2;
        this.f1725c = str3;
        this.f1726d = str4;
        this.f1727e = uri;
        this.f1728f = str5;
        this.f1729g = j;
        this.f1730h = str6;
        this.f1731i = arrayList;
        this.f1732t = str7;
        this.f1721X = str8;
    }

    /* JADX INFO: renamed from: k */
    public static GoogleSignInAccount m1476k(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        ig31.m50502t(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f1728f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f1730h.equals(this.f1730h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f1731i);
        hashSet.addAll(googleSignInAccount.f1722Y);
        HashSet hashSet2 = new HashSet(this.f1731i);
        hashSet2.addAll(this.f1722Y);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f1730h.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f1731i);
        hashSet.addAll(this.f1722Y);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f1723a);
        alf1.m26308N(parcel, 3, this.f1724b);
        alf1.m26308N(parcel, 4, this.f1725c);
        alf1.m26308N(parcel, 5, this.f1726d);
        alf1.m26307M(parcel, 6, this.f1727e, i);
        alf1.m26308N(parcel, 7, this.f1728f);
        alf1.m26313S(parcel, 8, 8);
        parcel.writeLong(this.f1729g);
        alf1.m26308N(parcel, 9, this.f1730h);
        alf1.m26312R(parcel, 10, this.f1731i);
        alf1.m26308N(parcel, 11, this.f1732t);
        alf1.m26308N(parcel, 12, this.f1721X);
        alf1.m26316V(iM26314T, parcel);
    }
}
