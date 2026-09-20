package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class tl70 implements Parcelable {
    public static final Parcelable.Creator<tl70> CREATOR = new w270(17);

    /* JADX INFO: renamed from: a */
    public final String f221350a;

    /* JADX INFO: renamed from: b */
    public final String f221351b;

    /* JADX INFO: renamed from: c */
    public final Double f221352c;

    /* JADX INFO: renamed from: d */
    public final String f221353d;

    public tl70(String str, String str2, Double d, String str3) {
        this.f221350a = str;
        this.f221351b = str2;
        this.f221352c = d;
        this.f221353d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl70)) {
            return false;
        }
        tl70 tl70Var = (tl70) obj;
        return wj50.m88271j(this.f221350a, tl70Var.f221350a) && wj50.m88271j(this.f221351b, tl70Var.f221351b) && wj50.m88271j(this.f221352c, tl70Var.f221352c) && wj50.m88271j(this.f221353d, tl70Var.f221353d);
    }

    public final int hashCode() {
        int iHashCode = this.f221350a.hashCode() * 31;
        String str = this.f221351b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f221352c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f221353d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221350a);
        parcel.writeString(this.f221351b);
        Double d = this.f221352c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f221353d);
    }
}
