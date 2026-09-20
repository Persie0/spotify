package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ww30 extends fx30 {
    public static final Parcelable.Creator<ww30> CREATOR = new bw30(18);

    /* JADX INFO: renamed from: c */
    public final boolean f255686c;

    /* JADX INFO: renamed from: d */
    public final boolean f255687d;

    public ww30(boolean z, boolean z2) {
        super(15, 2);
        this.f255686c = z;
        this.f255687d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww30)) {
            return false;
        }
        ww30 ww30Var = (ww30) obj;
        return this.f255686c == ww30Var.f255686c && this.f255687d == ww30Var.f255687d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255687d) + (Boolean.hashCode(this.f255686c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f255686c ? 1 : 0);
        parcel.writeInt(this.f255687d ? 1 : 0);
    }
}
