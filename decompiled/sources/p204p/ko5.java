package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ko5 implements Parcelable {
    public static final Parcelable.Creator<ko5> CREATOR = new bc3(29);

    /* JADX INFO: renamed from: a */
    public final String f124537a;

    /* JADX INFO: renamed from: b */
    public final String f124538b;

    /* JADX INFO: renamed from: c */
    public final mlm0 f124539c;

    /* JADX INFO: renamed from: d */
    public final ohi f124540d;

    /* JADX INFO: renamed from: e */
    public final String f124541e;

    /* JADX INFO: renamed from: f */
    public final String f124542f;

    /* JADX INFO: renamed from: g */
    public final String f124543g;

    /* JADX INFO: renamed from: h */
    public final String f124544h;

    public ko5(String str, String str2, mlm0 mlm0Var, ohi ohiVar, String str3, String str4, String str5, String str6) {
        this.f124537a = str;
        this.f124538b = str2;
        this.f124539c = mlm0Var;
        this.f124540d = ohiVar;
        this.f124541e = str3;
        this.f124542f = str4;
        this.f124543g = str5;
        this.f124544h = str6;
    }

    /* JADX INFO: renamed from: c */
    public final mlm0 m56982c() {
        return this.f124539c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko5)) {
            return false;
        }
        ko5 ko5Var = (ko5) obj;
        return wj50.m88271j(this.f124537a, ko5Var.f124537a) && wj50.m88271j(this.f124538b, ko5Var.f124538b) && this.f124539c == ko5Var.f124539c && this.f124540d == ko5Var.f124540d && wj50.m88271j(this.f124541e, ko5Var.f124541e) && wj50.m88271j(this.f124542f, ko5Var.f124542f) && wj50.m88271j(this.f124543g, ko5Var.f124543g) && wj50.m88271j(this.f124544h, ko5Var.f124544h);
    }

    public final int hashCode() {
        String str = this.f124537a;
        int iM77243b = s571.m77243b((this.f124540d.hashCode() + ((this.f124539c.hashCode() + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f124538b)) * 31)) * 31, 31, this.f124541e);
        String str2 = this.f124542f;
        int iHashCode = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124543g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f124544h;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f124537a);
        parcel.writeString(this.f124538b);
        parcel.writeString(this.f124539c.name());
        parcel.writeString(this.f124540d.name());
        parcel.writeString(this.f124541e);
        parcel.writeString(this.f124542f);
        parcel.writeString(this.f124543g);
        parcel.writeString(this.f124544h);
    }
}
