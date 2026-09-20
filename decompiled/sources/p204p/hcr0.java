package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hcr0 extends icr0 {
    public static final Parcelable.Creator<hcr0> CREATOR = new vzq0(22);

    /* JADX INFO: renamed from: a */
    public final String f89893a;

    /* JADX INFO: renamed from: b */
    public final long f89894b;

    /* JADX INFO: renamed from: c */
    public final long f89895c;

    /* JADX INFO: renamed from: d */
    public final boolean f89896d;

    /* JADX INFO: renamed from: e */
    public final boolean f89897e;

    /* JADX INFO: renamed from: f */
    public final int f89898f;

    /* JADX INFO: renamed from: g */
    public final String f89899g;

    public hcr0(String str, long j, long j2, boolean z, boolean z2, int i, String str2) {
        this.f89893a = str;
        this.f89894b = j;
        this.f89895c = j2;
        this.f89896d = z;
        this.f89897e = z2;
        this.f89898f = i;
        this.f89899g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcr0)) {
            return false;
        }
        hcr0 hcr0Var = (hcr0) obj;
        return wj50.m88271j(this.f89893a, hcr0Var.f89893a) && this.f89894b == hcr0Var.f89894b && this.f89895c == hcr0Var.f89895c && this.f89896d == hcr0Var.f89896d && this.f89897e == hcr0Var.f89897e && this.f89898f == hcr0Var.f89898f && wj50.m88271j(this.f89899g, hcr0Var.f89899g);
    }

    public final int hashCode() {
        return this.f89899g.hashCode() + f710.m40938f(this.f89898f, s571.m77245d(s571.m77245d(dq60.m36605e(dq60.m36605e(this.f89893a.hashCode() * 31, this.f89894b, 31), this.f89895c, 31), 31, this.f89896d), 31, this.f89897e), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f89893a);
        parcel.writeLong(this.f89894b);
        parcel.writeLong(this.f89895c);
        parcel.writeInt(this.f89896d ? 1 : 0);
        parcel.writeInt(this.f89897e ? 1 : 0);
        int i2 = this.f89898f;
        if (i2 == 1) {
            str = "LANDSCAPE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "PORTRAIT";
        }
        parcel.writeString(str);
        parcel.writeString(this.f89899g);
    }

    public hcr0(Uri uri, String str) {
        this(uri.toString(), 0L, 0L, true, true, 2, str);
    }
}
