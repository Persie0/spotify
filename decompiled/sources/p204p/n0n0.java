package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n0n0 implements o2c0 {
    public static final Parcelable.Creator<n0n0> CREATOR = new pum0(18);

    /* JADX INFO: renamed from: a */
    public final String f149117a;

    /* JADX INFO: renamed from: b */
    public final String f149118b;

    /* JADX INFO: renamed from: c */
    public final ss8 f149119c;

    /* JADX INFO: renamed from: d */
    public final boolean f149120d;

    /* JADX INFO: renamed from: e */
    public final boolean f149121e;

    public n0n0(String str, String str2, ss8 ss8Var, boolean z, boolean z2) {
        this.f149117a = str;
        this.f149118b = str2;
        this.f149119c = ss8Var;
        this.f149120d = z;
        this.f149121e = z2;
    }

    /* JADX INFO: renamed from: c */
    public static n0n0 m63459c(n0n0 n0n0Var, boolean z, boolean z2, int i) {
        String str = n0n0Var.f149117a;
        String str2 = n0n0Var.f149118b;
        ss8 ss8Var = n0n0Var.f149119c;
        if ((i & 8) != 0) {
            z = n0n0Var.f149120d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = n0n0Var.f149121e;
        }
        return new n0n0(str, str2, ss8Var, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0n0)) {
            return false;
        }
        n0n0 n0n0Var = (n0n0) obj;
        return wj50.m88271j(this.f149117a, n0n0Var.f149117a) && wj50.m88271j(this.f149118b, n0n0Var.f149118b) && this.f149119c == n0n0Var.f149119c && this.f149120d == n0n0Var.f149120d && this.f149121e == n0n0Var.f149121e;
    }

    @Override // p204p.o2c0
    public final String getUri() {
        return this.f149118b;
    }

    @Override // p204p.o2c0
    public final String getUuid() {
        return this.f149117a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149121e) + s571.m77245d((this.f149119c.hashCode() + s571.m77243b(this.f149117a.hashCode() * 31, 31, this.f149118b)) * 31, 31, this.f149120d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149117a);
        parcel.writeString(this.f149118b);
        parcel.writeString(this.f149119c.name());
        parcel.writeInt(this.f149120d ? 1 : 0);
        parcel.writeInt(this.f149121e ? 1 : 0);
    }
}
