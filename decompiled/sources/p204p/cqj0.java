package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cqj0 implements Parcelable {
    public static final Parcelable.Creator<cqj0> CREATOR = new fgj0(4);

    /* JADX INFO: renamed from: a */
    public final boolean f40903a;

    /* JADX INFO: renamed from: b */
    public final String f40904b;

    /* JADX INFO: renamed from: c */
    public final String f40905c;

    /* JADX INFO: renamed from: d */
    public final dqj0 f40906d;

    /* JADX INFO: renamed from: e */
    public final String f40907e;

    /* JADX INFO: renamed from: f */
    public final boolean f40908f;

    /* JADX INFO: renamed from: g */
    public final boolean f40909g;

    /* JADX INFO: renamed from: h */
    public final String f40910h;

    public cqj0(boolean z, String str, String str2, dqj0 dqj0Var, String str3, boolean z2, boolean z3, String str4) {
        this.f40903a = z;
        this.f40904b = str;
        this.f40905c = str2;
        this.f40906d = dqj0Var;
        this.f40907e = str3;
        this.f40908f = z2;
        this.f40909g = z3;
        this.f40910h = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m33630c() {
        return this.f40907e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqj0)) {
            return false;
        }
        cqj0 cqj0Var = (cqj0) obj;
        return this.f40903a == cqj0Var.f40903a && wj50.m88271j(this.f40904b, cqj0Var.f40904b) && wj50.m88271j(this.f40905c, cqj0Var.f40905c) && wj50.m88271j(this.f40906d, cqj0Var.f40906d) && wj50.m88271j(this.f40907e, cqj0Var.f40907e) && this.f40908f == cqj0Var.f40908f && this.f40909g == cqj0Var.f40909g && wj50.m88271j(this.f40910h, cqj0Var.f40910h);
    }

    public final int hashCode() {
        int iHashCode = (this.f40906d.hashCode() + s571.m77243b(s571.m77243b(Boolean.hashCode(this.f40903a) * 31, 31, this.f40904b), 31, this.f40905c)) * 31;
        String str = this.f40907e;
        return this.f40910h.hashCode() + s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f40908f), 31, this.f40909g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40903a ? 1 : 0);
        parcel.writeString(this.f40904b);
        parcel.writeString(this.f40905c);
        this.f40906d.writeToParcel(parcel, i);
        parcel.writeString(this.f40907e);
        parcel.writeInt(this.f40908f ? 1 : 0);
        parcel.writeInt(this.f40909g ? 1 : 0);
        parcel.writeString(this.f40910h);
    }

    public /* synthetic */ cqj0(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, "", new dqj0("", -1, -1), (i & 16) != 0 ? null : str2, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "home-promotion" : str3);
    }
}
