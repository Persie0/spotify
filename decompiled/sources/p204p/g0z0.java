package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class g0z0 extends j0z0 {
    public static final Parcelable.Creator<g0z0> CREATOR = new lpy0(17);

    /* JADX INFO: renamed from: a */
    public final aol0 f75495a;

    /* JADX INFO: renamed from: b */
    public final boolean f75496b;

    public g0z0(aol0 aol0Var, boolean z) {
        this.f75495a = aol0Var;
        this.f75496b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0z0)) {
            return false;
        }
        g0z0 g0z0Var = (g0z0) obj;
        return wj50.m88271j(this.f75495a, g0z0Var.f75495a) && this.f75496b == g0z0Var.f75496b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75496b) + (this.f75495a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f75495a, i);
        parcel.writeInt(this.f75496b ? 1 : 0);
    }
}
