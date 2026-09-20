package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class mhk0 implements Parcelable {
    public static final Parcelable.Creator<mhk0> CREATOR = new fgj0(20);

    /* JADX INFO: renamed from: L0 */
    public final boolean f143808L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f143809M0;

    /* JADX INFO: renamed from: X */
    public final double f143810X;

    /* JADX INFO: renamed from: Y */
    public final boolean f143811Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f143812Z;

    /* JADX INFO: renamed from: a */
    public final String f143813a;

    /* JADX INFO: renamed from: b */
    public final String f143814b;

    /* JADX INFO: renamed from: c */
    public final String f143815c;

    /* JADX INFO: renamed from: d */
    public final boolean f143816d;

    /* JADX INFO: renamed from: e */
    public final boolean f143817e;

    /* JADX INFO: renamed from: f */
    public final int f143818f;

    /* JADX INFO: renamed from: g */
    public final String f143819g;

    /* JADX INFO: renamed from: h */
    public final long f143820h;

    /* JADX INFO: renamed from: i */
    public final long f143821i;

    /* JADX INFO: renamed from: t */
    public final long f143822t;

    public mhk0(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, long j, long j2, long j3, double d, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f143813a = str;
        this.f143814b = str2;
        this.f143815c = str3;
        this.f143816d = z;
        this.f143817e = z2;
        this.f143818f = i;
        this.f143819g = str4;
        this.f143820h = j;
        this.f143821i = j2;
        this.f143822t = j3;
        this.f143810X = d;
        this.f143811Y = z3;
        this.f143812Z = z4;
        this.f143808L0 = z5;
        this.f143809M0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhk0)) {
            return false;
        }
        mhk0 mhk0Var = (mhk0) obj;
        return wj50.m88271j(this.f143813a, mhk0Var.f143813a) && wj50.m88271j(this.f143814b, mhk0Var.f143814b) && wj50.m88271j(this.f143815c, mhk0Var.f143815c) && this.f143816d == mhk0Var.f143816d && this.f143817e == mhk0Var.f143817e && this.f143818f == mhk0Var.f143818f && wj50.m88271j(this.f143819g, mhk0Var.f143819g) && this.f143820h == mhk0Var.f143820h && this.f143821i == mhk0Var.f143821i && this.f143822t == mhk0Var.f143822t && Double.compare(this.f143810X, mhk0Var.f143810X) == 0 && this.f143811Y == mhk0Var.f143811Y && this.f143812Z == mhk0Var.f143812Z && this.f143808L0 == mhk0Var.f143808L0 && this.f143809M0 == mhk0Var.f143809M0;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f143818f, s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f143813a.hashCode() * 31, 31, this.f143814b), 31, this.f143815c), 31, this.f143816d), 31, this.f143817e), 31);
        String str = this.f143819g;
        return Boolean.hashCode(this.f143809M0) + s571.m77245d(s571.m77245d(s571.m77245d(xl81.m91399h(this.f143810X, dq60.m36605e(dq60.m36605e(dq60.m36605e((iM40938f + (str == null ? 0 : str.hashCode())) * 31, this.f143820h, 31), this.f143821i, 31), this.f143822t, 31), 31), 31, this.f143811Y), 31, this.f143812Z), 31, this.f143808L0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f143813a);
        parcel.writeString(this.f143814b);
        parcel.writeString(this.f143815c);
        parcel.writeInt(this.f143816d ? 1 : 0);
        parcel.writeInt(this.f143817e ? 1 : 0);
        int i2 = this.f143818f;
        if (i2 == 1) {
            str = "Track";
        } else if (i2 == 2) {
            str = "Episode";
        } else if (i2 == 3) {
            str = "Ad";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "Unknown";
        }
        parcel.writeString(str);
        parcel.writeString(this.f143819g);
        parcel.writeLong(this.f143820h);
        parcel.writeLong(this.f143821i);
        parcel.writeLong(this.f143822t);
        parcel.writeDouble(this.f143810X);
        parcel.writeInt(this.f143811Y ? 1 : 0);
        parcel.writeInt(this.f143812Z ? 1 : 0);
        parcel.writeInt(this.f143808L0 ? 1 : 0);
        parcel.writeInt(this.f143809M0 ? 1 : 0);
    }

    public /* synthetic */ mhk0() {
        this("", "", "", false, false, 4, null, 0L, 0L, 0L, 1.0d, true, true, true, false);
    }
}
