package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class c2n0 implements o2c0 {
    public static final Parcelable.Creator<c2n0> CREATOR = new pum0(20);

    /* JADX INFO: renamed from: a */
    public final String f33428a;

    /* JADX INFO: renamed from: b */
    public final String f33429b;

    /* JADX INFO: renamed from: c */
    public final ss8 f33430c;

    /* JADX INFO: renamed from: d */
    public final boolean f33431d;

    /* JADX INFO: renamed from: e */
    public final boolean f33432e;

    public c2n0(String str, String str2, ss8 ss8Var, boolean z, boolean z2) {
        this.f33428a = str;
        this.f33429b = str2;
        this.f33430c = ss8Var;
        this.f33431d = z;
        this.f33432e = z2;
    }

    /* JADX INFO: renamed from: c */
    public static c2n0 m31340c(c2n0 c2n0Var, boolean z, boolean z2, int i) {
        String str = c2n0Var.f33428a;
        String str2 = c2n0Var.f33429b;
        ss8 ss8Var = c2n0Var.f33430c;
        if ((i & 8) != 0) {
            z = c2n0Var.f33431d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = c2n0Var.f33432e;
        }
        return new c2n0(str, str2, ss8Var, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2n0)) {
            return false;
        }
        c2n0 c2n0Var = (c2n0) obj;
        return wj50.m88271j(this.f33428a, c2n0Var.f33428a) && wj50.m88271j(this.f33429b, c2n0Var.f33429b) && this.f33430c == c2n0Var.f33430c && this.f33431d == c2n0Var.f33431d && this.f33432e == c2n0Var.f33432e;
    }

    @Override // p204p.o2c0
    public final String getUri() {
        return this.f33429b;
    }

    @Override // p204p.o2c0
    public final String getUuid() {
        return this.f33428a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33432e) + s571.m77245d((this.f33430c.hashCode() + s571.m77243b(this.f33428a.hashCode() * 31, 31, this.f33429b)) * 31, 31, this.f33431d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33428a);
        parcel.writeString(this.f33429b);
        parcel.writeString(this.f33430c.name());
        parcel.writeInt(this.f33431d ? 1 : 0);
        parcel.writeInt(this.f33432e ? 1 : 0);
    }
}
