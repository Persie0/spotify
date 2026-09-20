package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ch51 implements Parcelable {
    public static final Parcelable.Creator<ch51> CREATOR = new nc51(6);

    /* JADX INFO: renamed from: a */
    public final voc1 f37929a;

    /* JADX INFO: renamed from: b */
    public final String f37930b;

    /* JADX INFO: renamed from: c */
    public final String f37931c;

    /* JADX INFO: renamed from: d */
    public final String f37932d;

    /* JADX INFO: renamed from: e */
    public final String f37933e;

    /* JADX INFO: renamed from: f */
    public final String f37934f;

    public ch51(String str, String str2, String str3, String str4, String str5, voc1 voc1Var) {
        this.f37929a = voc1Var;
        this.f37930b = str;
        this.f37931c = str2;
        this.f37932d = str3;
        this.f37933e = str4;
        this.f37934f = str5;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m32747c() {
        return this.f37929a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch51)) {
            return false;
        }
        ch51 ch51Var = (ch51) obj;
        return wj50.m88271j(this.f37929a, ch51Var.f37929a) && wj50.m88271j(this.f37930b, ch51Var.f37930b) && wj50.m88271j(this.f37931c, ch51Var.f37931c) && wj50.m88271j(this.f37932d, ch51Var.f37932d) && wj50.m88271j(this.f37933e, ch51Var.f37933e) && wj50.m88271j(this.f37934f, ch51Var.f37934f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f37929a.f243453a.hashCode() * 31, 31, this.f37930b), 31, this.f37931c);
        String str = this.f37932d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37933e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37934f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37929a, i);
        parcel.writeString(this.f37930b);
        parcel.writeString(this.f37931c);
        parcel.writeString(this.f37932d);
        parcel.writeString(this.f37933e);
        parcel.writeString(this.f37934f);
    }
}
