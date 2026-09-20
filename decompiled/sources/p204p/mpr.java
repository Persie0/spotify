package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class mpr extends ppr implements bs50 {
    public static final Parcelable.Creator<mpr> CREATOR = new o5r(20);

    /* JADX INFO: renamed from: X */
    public final String f146067X;

    /* JADX INFO: renamed from: a */
    public final String f146068a;

    /* JADX INFO: renamed from: b */
    public final String f146069b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f146070c;

    /* JADX INFO: renamed from: d */
    public final boolean f146071d;

    /* JADX INFO: renamed from: e */
    public final Boolean f146072e;

    /* JADX INFO: renamed from: f */
    public final String f146073f;

    /* JADX INFO: renamed from: g */
    public final String f146074g;

    /* JADX INFO: renamed from: h */
    public final String f146075h;

    /* JADX INFO: renamed from: i */
    public final String f146076i;

    /* JADX INFO: renamed from: t */
    public boolean f146077t;

    public mpr(String str, String str2, LinkedHashMap linkedHashMap, boolean z, Boolean bool, String str3, String str4, String str5, String str6, boolean z2, String str7) {
        this.f146068a = str;
        this.f146069b = str2;
        this.f146070c = linkedHashMap;
        this.f146071d = z;
        this.f146072e = bool;
        this.f146073f = str3;
        this.f146074g = str4;
        this.f146075h = str5;
        this.f146076i = str6;
        this.f146077t = z2;
        this.f146067X = str7;
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: c */
    public final String mo53972c() {
        return this.f146067X;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpr)) {
            return false;
        }
        mpr mprVar = (mpr) obj;
        return wj50.m88271j(this.f146068a, mprVar.f146068a) && wj50.m88271j(this.f146069b, mprVar.f146069b) && this.f146070c.equals(mprVar.f146070c) && this.f146071d == mprVar.f146071d && wj50.m88271j(this.f146072e, mprVar.f146072e) && wj50.m88271j(this.f146073f, mprVar.f146073f) && wj50.m88271j(this.f146074g, mprVar.f146074g) && wj50.m88271j(this.f146075h, mprVar.f146075h) && wj50.m88271j(this.f146076i, mprVar.f146076i) && this.f146077t == mprVar.f146077t && wj50.m88271j(this.f146067X, mprVar.f146067X);
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: g */
    public final boolean mo53973g() {
        return this.f146077t;
    }

    @Override // p204p.ppr
    public final String getContextUri() {
        return this.f146076i;
    }

    @Override // p204p.bs50
    public final String getItemId() {
        return this.f146075h;
    }

    @Override // p204p.ppr
    /* JADX INFO: renamed from: h */
    public final void mo53974h() {
        this.f146077t = false;
    }

    public final int hashCode() {
        int iHashCode = this.f146068a.hashCode() * 31;
        String str = this.f146069b;
        int iM77245d = s571.m77245d((this.f146070c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f146071d);
        Boolean bool = this.f146072e;
        int iM77243b = s571.m77243b(s571.m77243b((iM77245d + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f146073f), 31, this.f146074g);
        String str2 = this.f146075h;
        return this.f146067X.hashCode() + s571.m77245d(s571.m77243b((iM77243b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f146076i), 31, this.f146077t);
    }

    /* JADX INFO: renamed from: j */
    public final String m62499j() {
        return this.f146068a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f146068a);
        parcel.writeString(this.f146069b);
        LinkedHashMap linkedHashMap = this.f146070c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeInt(this.f146071d ? 1 : 0);
        Boolean bool = this.f146072e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        parcel.writeString(this.f146073f);
        parcel.writeString(this.f146074g);
        parcel.writeString(this.f146075h);
        parcel.writeString(this.f146076i);
        parcel.writeInt(this.f146077t ? 1 : 0);
        parcel.writeString(this.f146067X);
    }
}
