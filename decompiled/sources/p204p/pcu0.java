package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pcu0 implements Parcelable {
    public static final Parcelable.Creator<pcu0> CREATOR = new v5u0(10);

    /* JADX INFO: renamed from: a */
    public final String f176230a;

    /* JADX INFO: renamed from: b */
    public final String f176231b;

    /* JADX INFO: renamed from: c */
    public final pla1 f176232c;

    /* JADX INFO: renamed from: d */
    public final long f176233d;

    /* JADX INFO: renamed from: e */
    public final boolean f176234e;

    public pcu0(String str, String str2, pla1 pla1Var, long j, boolean z) {
        this.f176230a = str;
        this.f176231b = str2;
        this.f176232c = pla1Var;
        this.f176233d = j;
        this.f176234e = z;
    }

    /* JADX INFO: renamed from: c */
    public static pcu0 m69605c(pcu0 pcu0Var, pla1 pla1Var, int i) {
        String str = pcu0Var.f176230a;
        String str2 = pcu0Var.f176231b;
        if ((i & 4) != 0) {
            pla1Var = pcu0Var.f176232c;
        }
        pla1 pla1Var2 = pla1Var;
        long j = pcu0Var.f176233d;
        boolean z = (i & 16) != 0 ? pcu0Var.f176234e : true;
        pcu0Var.getClass();
        return new pcu0(str, str2, pla1Var2, j, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcu0)) {
            return false;
        }
        pcu0 pcu0Var = (pcu0) obj;
        return wj50.m88271j(this.f176230a, pcu0Var.f176230a) && wj50.m88271j(this.f176231b, pcu0Var.f176231b) && wj50.m88271j(this.f176232c, pcu0Var.f176232c) && this.f176233d == pcu0Var.f176233d && this.f176234e == pcu0Var.f176234e;
    }

    /* JADX INFO: renamed from: g */
    public final String m69606g() {
        return this.f176231b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m69607h() {
        return this.f176234e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176234e) + dq60.m36605e(ydj.m93448g(this.f176232c, s571.m77243b(this.f176230a.hashCode() * 31, 31, this.f176231b), 31), this.f176233d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f176230a);
        parcel.writeString(this.f176231b);
        this.f176232c.writeToParcel(parcel, i);
        parcel.writeLong(this.f176233d);
        parcel.writeInt(this.f176234e ? 1 : 0);
    }

    public /* synthetic */ pcu0(String str, String str2, pla1 pla1Var, long j, int i) {
        this(str, str2, pla1Var, (i & 8) != 0 ? 0L : j, false);
    }
}
