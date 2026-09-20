package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class gtr0 implements Parcelable {
    public static final Parcelable.Creator<gtr0> CREATOR = new uir0(11);

    /* JADX INFO: renamed from: a */
    public final boolean f84260a;

    /* JADX INFO: renamed from: b */
    public final boolean f84261b;

    /* JADX INFO: renamed from: c */
    public final boolean f84262c;

    /* JADX INFO: renamed from: d */
    public final boolean f84263d;

    public gtr0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f84260a = z;
        this.f84261b = z2;
        this.f84262c = z3;
        this.f84263d = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtr0)) {
            return false;
        }
        gtr0 gtr0Var = (gtr0) obj;
        return this.f84260a == gtr0Var.f84260a && this.f84261b == gtr0Var.f84261b && this.f84262c == gtr0Var.f84262c && this.f84263d == gtr0Var.f84263d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84263d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f84260a) * 31, 31, this.f84261b), 31, this.f84262c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f84260a ? 1 : 0);
        parcel.writeInt(this.f84261b ? 1 : 0);
        parcel.writeInt(this.f84262c ? 1 : 0);
        parcel.writeInt(this.f84263d ? 1 : 0);
    }
}
