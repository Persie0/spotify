package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class jhv extends mhv {
    public static final Parcelable.Creator<jhv> CREATOR = new m8v(15);

    /* JADX INFO: renamed from: a */
    public final int f112571a;

    /* JADX INFO: renamed from: b */
    public final xi3 f112572b;

    public jhv(int i, xi3 xi3Var) {
        this.f112571a = i;
        this.f112572b = xi3Var;
    }

    /* JADX INFO: renamed from: c */
    public final int m53431c() {
        return this.f112571a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv)) {
            return false;
        }
        jhv jhvVar = (jhv) obj;
        return this.f112571a == jhvVar.f112571a && this.f112572b == jhvVar.f112572b;
    }

    public final int hashCode() {
        return this.f112572b.hashCode() + (Integer.hashCode(this.f112571a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f112571a);
        parcel.writeString(this.f112572b.name());
    }
}
