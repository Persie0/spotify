package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class wky implements aly {
    public static final Parcelable.Creator<wky> CREATOR = new p7y(24);

    /* JADX INFO: renamed from: a */
    public final boolean f252318a;

    /* JADX INFO: renamed from: b */
    public final boolean f252319b;

    /* JADX INFO: renamed from: c */
    public final boolean f252320c;

    public wky(boolean z, boolean z2, boolean z3) {
        this.f252318a = z;
        this.f252319b = z2;
        this.f252320c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wky)) {
            return false;
        }
        wky wkyVar = (wky) obj;
        return this.f252318a == wkyVar.f252318a && this.f252319b == wkyVar.f252319b && this.f252320c == wkyVar.f252320c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252320c) + s571.m77245d(Boolean.hashCode(this.f252318a) * 31, 31, this.f252319b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f252318a ? 1 : 0);
        parcel.writeInt(this.f252319b ? 1 : 0);
        parcel.writeInt(this.f252320c ? 1 : 0);
    }
}
