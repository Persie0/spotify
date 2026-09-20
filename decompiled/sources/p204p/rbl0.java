package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rbl0 extends sbl0 {
    public static final Parcelable.Creator<rbl0> CREATOR = new hbl0(7);

    /* JADX INFO: renamed from: a */
    public final int f197628a;

    /* JADX INFO: renamed from: b */
    public final int f197629b;

    /* JADX INFO: renamed from: c */
    public final String f197630c;

    /* JADX INFO: renamed from: d */
    public final boolean f197631d;

    /* JADX INFO: renamed from: e */
    public final int f197632e;

    public rbl0(int i, int i2, int i3, String str, boolean z) {
        this.f197628a = i;
        this.f197629b = i2;
        this.f197630c = str;
        this.f197631d = z;
        this.f197632e = i3;
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: c */
    public final String mo69528c() {
        return this.f197630c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbl0)) {
            return false;
        }
        rbl0 rbl0Var = (rbl0) obj;
        return this.f197628a == rbl0Var.f197628a && this.f197629b == rbl0Var.f197629b && wj50.m88271j(this.f197630c, rbl0Var.f197630c) && this.f197631d == rbl0Var.f197631d && this.f197632e == rbl0Var.f197632e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f197632e) + s571.m77245d(s571.m77243b(mt60.m62800g(this.f197629b, Integer.hashCode(this.f197628a) * 31, 31), 31, this.f197630c), 31, this.f197631d);
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: j */
    public final boolean mo69529j() {
        return this.f197631d;
    }

    @Override // p204p.sbl0
    /* JADX INFO: renamed from: k */
    public final int mo69530k() {
        return this.f197628a;
    }

    @Override // p204p.sbl0
    /* JADX INFO: renamed from: l */
    public final int mo69531l() {
        return this.f197629b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f197628a);
        parcel.writeInt(this.f197629b);
        parcel.writeString(this.f197630c);
        parcel.writeInt(this.f197631d ? 1 : 0);
        parcel.writeString(mrx0.m62667u(this.f197632e));
    }
}
