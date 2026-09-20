package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lu0 implements i6z0 {
    public static final Parcelable.Creator<lu0> CREATOR = new C2267ps(26);

    /* JADX INFO: renamed from: a */
    public final int f136941a;

    /* JADX INFO: renamed from: b */
    public final int f136942b;

    public lu0(int i, int i2) {
        this.f136941a = i;
        this.f136942b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return this.f136941a == lu0Var.f136941a && this.f136942b == lu0Var.f136942b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136942b) + (Integer.hashCode(this.f136941a) * 31);
    }

    @Override // p204p.i6z0
    /* JADX INFO: renamed from: s */
    public final int mo27367s() {
        return this.f136941a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f136941a);
        parcel.writeInt(this.f136942b);
    }
}
