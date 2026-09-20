package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ohu0 implements Parcelable {
    public static final Parcelable.Creator<ohu0> CREATOR = new v5u0(16);

    /* JADX INFO: renamed from: a */
    public final faa0 f165551a;

    /* JADX INFO: renamed from: b */
    public final String f165552b;

    /* JADX INFO: renamed from: c */
    public final String f165553c;

    /* JADX INFO: renamed from: d */
    public final int f165554d;

    public ohu0(faa0 faa0Var, String str, String str2, int i) {
        this.f165551a = faa0Var;
        this.f165552b = str;
        this.f165553c = str2;
        this.f165554d = i;
    }

    /* JADX INFO: renamed from: c */
    public static ohu0 m66979c(ohu0 ohu0Var, faa0 faa0Var, String str, String str2, int i, int i2) {
        if ((i2 & 1) != 0) {
            faa0Var = ohu0Var.f165551a;
        }
        if ((i2 & 2) != 0) {
            str = ohu0Var.f165552b;
        }
        if ((i2 & 4) != 0) {
            str2 = ohu0Var.f165553c;
        }
        if ((i2 & 8) != 0) {
            i = ohu0Var.f165554d;
        }
        ohu0Var.getClass();
        return new ohu0(faa0Var, str, str2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohu0)) {
            return false;
        }
        ohu0 ohu0Var = (ohu0) obj;
        return wj50.m88271j(this.f165551a, ohu0Var.f165551a) && wj50.m88271j(this.f165552b, ohu0Var.f165552b) && wj50.m88271j(this.f165553c, ohu0Var.f165553c) && this.f165554d == ohu0Var.f165554d;
    }

    public final int hashCode() {
        int iHashCode = this.f165551a.hashCode() * 31;
        String str = this.f165552b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f165553c;
        return Integer.hashCode(this.f165554d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f165551a, i);
        parcel.writeString(this.f165552b);
        parcel.writeString(this.f165553c);
        parcel.writeInt(this.f165554d);
    }

    public ohu0() {
        this(new u9a0(), null, null, 5);
    }
}
