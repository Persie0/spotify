package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kpy0 implements Parcelable {
    public static final Parcelable.Creator<kpy0> CREATOR = new csx0(29);

    /* JADX INFO: renamed from: h */
    public static final kpy0 f125157h = new kpy0(20, false, false, false, false, false, false);

    /* JADX INFO: renamed from: a */
    public final boolean f125158a;

    /* JADX INFO: renamed from: b */
    public final boolean f125159b;

    /* JADX INFO: renamed from: c */
    public final boolean f125160c;

    /* JADX INFO: renamed from: d */
    public final int f125161d;

    /* JADX INFO: renamed from: e */
    public final boolean f125162e;

    /* JADX INFO: renamed from: f */
    public final boolean f125163f;

    /* JADX INFO: renamed from: g */
    public final boolean f125164g;

    public kpy0(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f125158a = z;
        this.f125159b = z2;
        this.f125160c = z3;
        this.f125161d = i;
        this.f125162e = z4;
        this.f125163f = z5;
        this.f125164g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpy0)) {
            return false;
        }
        kpy0 kpy0Var = (kpy0) obj;
        return this.f125158a == kpy0Var.f125158a && this.f125159b == kpy0Var.f125159b && this.f125160c == kpy0Var.f125160c && this.f125161d == kpy0Var.f125161d && this.f125162e == kpy0Var.f125162e && this.f125163f == kpy0Var.f125163f && this.f125164g == kpy0Var.f125164g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125164g) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f125161d, s571.m77245d(s571.m77245d(Boolean.hashCode(this.f125158a) * 31, 31, this.f125159b), 31, this.f125160c), 31), 31, this.f125162e), 31, this.f125163f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f125158a ? 1 : 0);
        parcel.writeInt(this.f125159b ? 1 : 0);
        parcel.writeInt(this.f125160c ? 1 : 0);
        parcel.writeInt(this.f125161d);
        parcel.writeInt(this.f125162e ? 1 : 0);
        parcel.writeInt(this.f125163f ? 1 : 0);
        parcel.writeInt(this.f125164g ? 1 : 0);
    }
}
