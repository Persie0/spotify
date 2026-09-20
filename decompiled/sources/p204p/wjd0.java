package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wjd0 implements Parcelable {
    public static final Parcelable.Creator<wjd0> CREATOR = new jfd0(3);

    /* JADX INFO: renamed from: a */
    public final int f251943a;

    /* JADX INFO: renamed from: b */
    public final int f251944b;

    public wjd0(int i, int i2) {
        this.f251943a = i;
        this.f251944b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjd0)) {
            return false;
        }
        wjd0 wjd0Var = (wjd0) obj;
        return this.f251943a == wjd0Var.f251943a && this.f251944b == wjd0Var.f251944b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251944b) + (Integer.hashCode(this.f251943a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f251943a);
        parcel.writeInt(this.f251944b);
    }

    public /* synthetic */ wjd0(int i, int i2, int i3) {
        this(10, (i2 & 2) != 0 ? 0 : i);
    }
}
