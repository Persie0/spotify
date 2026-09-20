package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class nvr implements Parcelable {
    public static final Parcelable.Creator<nvr> CREATOR = new o5r(24);

    /* JADX INFO: renamed from: a */
    public final String f158946a;

    /* JADX INFO: renamed from: b */
    public final String f158947b;

    /* JADX INFO: renamed from: c */
    public final String f158948c;

    /* JADX INFO: renamed from: d */
    public final String f158949d;

    /* JADX INFO: renamed from: e */
    public final C2125mf f158950e;

    /* JADX INFO: renamed from: f */
    public final u17 f158951f;

    /* JADX INFO: renamed from: g */
    public final w17 f158952g;

    public nvr(String str, String str2, String str3, String str4, C2125mf c2125mf, u17 u17Var, w17 w17Var) {
        this.f158946a = str;
        this.f158947b = str2;
        this.f158948c = str3;
        this.f158949d = str4;
        this.f158950e = c2125mf;
        this.f158951f = u17Var;
        this.f158952g = w17Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvr)) {
            return false;
        }
        nvr nvrVar = (nvr) obj;
        return wj50.m88271j(this.f158946a, nvrVar.f158946a) && wj50.m88271j(this.f158947b, nvrVar.f158947b) && wj50.m88271j(this.f158948c, nvrVar.f158948c) && wj50.m88271j(this.f158949d, nvrVar.f158949d) && wj50.m88271j(this.f158950e, nvrVar.f158950e) && wj50.m88271j(this.f158951f, nvrVar.f158951f) && wj50.m88271j(this.f158952g, nvrVar.f158952g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f158946a.hashCode() * 31, 31, this.f158947b);
        String str = this.f158948c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158949d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C2125mf c2125mf = this.f158950e;
        int iHashCode3 = (iHashCode2 + (c2125mf == null ? 0 : c2125mf.hashCode())) * 31;
        u17 u17Var = this.f158951f;
        int iHashCode4 = (iHashCode3 + (u17Var == null ? 0 : u17Var.hashCode())) * 31;
        w17 w17Var = this.f158952g;
        return iHashCode4 + (w17Var != null ? w17Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158946a);
        parcel.writeString(this.f158947b);
        parcel.writeString(this.f158948c);
        parcel.writeString(this.f158949d);
        C2125mf c2125mf = this.f158950e;
        if (c2125mf == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c2125mf.writeToParcel(parcel, i);
        }
        u17 u17Var = this.f158951f;
        if (u17Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u17Var.writeToParcel(parcel, i);
        }
        w17 w17Var = this.f158952g;
        if (w17Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w17Var.writeToParcel(parcel, i);
        }
    }
}
