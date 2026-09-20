package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xz00 implements Parcelable {
    public static final Parcelable.Creator<xz00> CREATOR = new k700(28);

    /* JADX INFO: renamed from: a */
    public final wz00 f267497a;

    /* JADX INFO: renamed from: b */
    public final boolean f267498b;

    /* JADX INFO: renamed from: c */
    public final boolean f267499c;

    /* JADX INFO: renamed from: d */
    public final boolean f267500d;

    /* JADX INFO: renamed from: e */
    public final boolean f267501e;

    public xz00(wz00 wz00Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f267497a = wz00Var;
        this.f267498b = z;
        this.f267499c = z2;
        this.f267500d = z3;
        this.f267501e = z4;
    }

    /* JADX INFO: renamed from: c */
    public static xz00 m92439c(xz00 xz00Var, wz00 wz00Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            wz00Var = xz00Var.f267497a;
        }
        wz00 wz00Var2 = wz00Var;
        if ((i & 2) != 0) {
            z = xz00Var.f267498b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = xz00Var.f267499c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = xz00Var.f267500d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = xz00Var.f267501e;
        }
        xz00Var.getClass();
        return new xz00(wz00Var2, z5, z6, z7, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz00)) {
            return false;
        }
        xz00 xz00Var = (xz00) obj;
        return wj50.m88271j(this.f267497a, xz00Var.f267497a) && this.f267498b == xz00Var.f267498b && this.f267499c == xz00Var.f267499c && this.f267500d == xz00Var.f267500d && this.f267501e == xz00Var.f267501e;
    }

    /* JADX INFO: renamed from: g */
    public final wz00 m92440g() {
        return this.f267497a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267501e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f267497a.hashCode() * 31, 31, this.f267498b), 31, this.f267499c), 31, this.f267500d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f267497a, i);
        parcel.writeInt(this.f267498b ? 1 : 0);
        parcel.writeInt(this.f267499c ? 1 : 0);
        parcel.writeInt(this.f267500d ? 1 : 0);
        parcel.writeInt(this.f267501e ? 1 : 0);
    }
}
