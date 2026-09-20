package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class j8v implements Parcelable {
    public static final Parcelable.Creator<j8v> CREATOR = new rvu(29);

    /* JADX INFO: renamed from: a */
    public final String f110019a;

    /* JADX INFO: renamed from: b */
    public final String f110020b;

    /* JADX INFO: renamed from: c */
    public final String f110021c;

    /* JADX INFO: renamed from: d */
    public final String f110022d;

    /* JADX INFO: renamed from: e */
    public final String f110023e;

    /* JADX INFO: renamed from: f */
    public final String f110024f;

    /* JADX INFO: renamed from: g */
    public final String f110025g;

    public j8v(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f110019a = str;
        this.f110020b = str2;
        this.f110021c = str3;
        this.f110022d = str4;
        this.f110023e = str5;
        this.f110024f = str6;
        this.f110025g = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8v)) {
            return false;
        }
        j8v j8vVar = (j8v) obj;
        return wj50.m88271j(this.f110019a, j8vVar.f110019a) && wj50.m88271j(this.f110020b, j8vVar.f110020b) && wj50.m88271j(this.f110021c, j8vVar.f110021c) && wj50.m88271j(this.f110022d, j8vVar.f110022d) && wj50.m88271j(this.f110023e, j8vVar.f110023e) && wj50.m88271j(this.f110024f, j8vVar.f110024f) && wj50.m88271j(this.f110025g, j8vVar.f110025g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f110019a.hashCode() * 31, 31, this.f110020b), 31, this.f110021c), 31, this.f110022d), 31, this.f110023e);
        String str = this.f110024f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110025g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110019a);
        parcel.writeString(this.f110020b);
        parcel.writeString(this.f110021c);
        parcel.writeString(this.f110022d);
        parcel.writeString(this.f110023e);
        parcel.writeString(this.f110024f);
        parcel.writeString(this.f110025g);
    }
}
