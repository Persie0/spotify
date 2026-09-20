package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lbl0 extends nbl0 {
    public static final Parcelable.Creator<lbl0> CREATOR = new hbl0(3);

    /* JADX INFO: renamed from: a */
    public final ycl0 f131682a;

    /* JADX INFO: renamed from: b */
    public final j3r f131683b;

    /* JADX INFO: renamed from: c */
    public final w9j0 f131684c;

    /* JADX INFO: renamed from: d */
    public final int f131685d;

    /* JADX INFO: renamed from: e */
    public final boolean f131686e;

    public lbl0(ycl0 ycl0Var, j3r j3rVar, w9j0 w9j0Var, int i) {
        this.f131682a = ycl0Var;
        this.f131683b = j3rVar;
        this.f131684c = w9j0Var;
        this.f131685d = i;
        this.f131686e = i == 3;
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: c */
    public final j3r mo50186c() {
        return this.f131683b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbl0)) {
            return false;
        }
        lbl0 lbl0Var = (lbl0) obj;
        return wj50.m88271j(this.f131682a, lbl0Var.f131682a) && wj50.m88271j(this.f131683b, lbl0Var.f131683b) && wj50.m88271j(this.f131684c, lbl0Var.f131684c) && this.f131685d == lbl0Var.f131685d;
    }

    @Override // p204p.nbl0
    /* JADX INFO: renamed from: g */
    public final w9j0 mo50187g() {
        return this.f131684c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f131685d) + ((this.f131684c.f249183a.hashCode() + ((this.f131683b.hashCode() + (this.f131682a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        this.f131682a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f131683b, i);
        this.f131684c.writeToParcel(parcel, i);
        int i2 = this.f131685d;
        if (i2 == 1) {
            str = "USER_STATUS_ACTIVE";
        } else if (i2 == 2) {
            str = "USER_STATUS_DISABLED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "USER_STATUS_NOT_ACCEPTED";
        }
        parcel.writeString(str);
    }
}
