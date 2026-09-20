package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class o670 implements Parcelable {
    public static final Parcelable.Creator<o670> CREATOR = new w270(4);

    /* JADX INFO: renamed from: a */
    public final String f162265a;

    /* JADX INFO: renamed from: b */
    public final String f162266b;

    /* JADX INFO: renamed from: c */
    public final String f162267c;

    /* JADX INFO: renamed from: d */
    public final Integer f162268d;

    public o670(String str, String str2, Integer num, String str3) {
        this.f162265a = str;
        this.f162266b = str2;
        this.f162267c = str3;
        this.f162268d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o670)) {
            return false;
        }
        o670 o670Var = (o670) obj;
        return wj50.m88271j(this.f162265a, o670Var.f162265a) && wj50.m88271j(this.f162266b, o670Var.f162266b) && wj50.m88271j(this.f162267c, o670Var.f162267c) && wj50.m88271j(this.f162268d, o670Var.f162268d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f162265a.hashCode() * 31, 31, this.f162266b);
        String str = this.f162267c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f162268d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162265a);
        parcel.writeString(this.f162266b);
        parcel.writeString(this.f162267c);
        Integer num = this.f162268d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
