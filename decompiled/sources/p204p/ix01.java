package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ix01 extends kx01 {
    public static final Parcelable.Creator<ix01> CREATOR = new bv01(11);

    /* JADX INFO: renamed from: a */
    public final String f106556a;

    /* JADX INFO: renamed from: b */
    public final String f106557b;

    /* JADX INFO: renamed from: c */
    public final String f106558c;

    public ix01(String str, String str2, String str3) {
        this.f106556a = str;
        this.f106557b = str2;
        this.f106558c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix01)) {
            return false;
        }
        ix01 ix01Var = (ix01) obj;
        return wj50.m88271j(this.f106556a, ix01Var.f106556a) && wj50.m88271j(this.f106557b, ix01Var.f106557b) && wj50.m88271j(this.f106558c, ix01Var.f106558c);
    }

    public final int hashCode() {
        return this.f106558c.hashCode() + s571.m77243b(this.f106556a.hashCode() * 31, 31, this.f106557b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106556a);
        parcel.writeString(this.f106557b);
        parcel.writeString(this.f106558c);
    }
}
