package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ihv extends mhv {
    public static final Parcelable.Creator<ihv> CREATOR = new m8v(14);

    /* JADX INFO: renamed from: a */
    public final int f102368a;

    /* JADX INFO: renamed from: b */
    public final String f102369b;

    /* JADX INFO: renamed from: c */
    public final boolean f102370c;

    /* JADX INFO: renamed from: d */
    public final xi3 f102371d;

    public ihv(int i, String str, boolean z, xi3 xi3Var) {
        this.f102368a = i;
        this.f102369b = str;
        this.f102370c = z;
        this.f102371d = xi3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihv)) {
            return false;
        }
        ihv ihvVar = (ihv) obj;
        return this.f102368a == ihvVar.f102368a && wj50.m88271j(this.f102369b, ihvVar.f102369b) && this.f102370c == ihvVar.f102370c && this.f102371d == ihvVar.f102371d;
    }

    public final int hashCode() {
        return this.f102371d.hashCode() + s571.m77245d(s571.m77243b(edb.m38547C(this.f102368a) * 31, 31, this.f102369b), 31, this.f102370c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(p1v.m68856m(this.f102368a));
        parcel.writeString(this.f102369b);
        parcel.writeInt(this.f102370c ? 1 : 0);
        parcel.writeString(this.f102371d.name());
    }
}
