package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cpr implements m8z0 {
    public static final Parcelable.Creator<cpr> CREATOR = new o5r(15);

    /* JADX INFO: renamed from: a */
    public final String f40599a;

    /* JADX INFO: renamed from: b */
    public final String f40600b;

    /* JADX INFO: renamed from: c */
    public final String f40601c;

    /* JADX INFO: renamed from: d */
    public final String f40602d;

    /* JADX INFO: renamed from: e */
    public final String f40603e;

    /* JADX INFO: renamed from: f */
    public final String f40604f;

    /* JADX INFO: renamed from: g */
    public final String f40605g;

    public cpr(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f40599a = str;
        this.f40600b = str2;
        this.f40601c = str3;
        this.f40602d = str4;
        this.f40603e = str5;
        this.f40604f = str6;
        this.f40605g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpr)) {
            return false;
        }
        cpr cprVar = (cpr) obj;
        return wj50.m88271j(this.f40599a, cprVar.f40599a) && wj50.m88271j(this.f40600b, cprVar.f40600b) && wj50.m88271j(this.f40601c, cprVar.f40601c) && wj50.m88271j(this.f40602d, cprVar.f40602d) && wj50.m88271j(this.f40603e, cprVar.f40603e) && wj50.m88271j(this.f40604f, cprVar.f40604f) && wj50.m88271j(this.f40605g, cprVar.f40605g);
    }

    public final int hashCode() {
        return this.f40605g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f40599a.hashCode() * 31, 31, this.f40600b), 31, this.f40601c), 31, this.f40602d), 31, this.f40603e), 31, this.f40604f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40599a);
        parcel.writeString(this.f40600b);
        parcel.writeString(this.f40601c);
        parcel.writeString(this.f40602d);
        parcel.writeString(this.f40603e);
        parcel.writeString(this.f40604f);
        parcel.writeString(this.f40605g);
    }
}
