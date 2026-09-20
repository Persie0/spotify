package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pp71 implements Parcelable {
    public static final Parcelable.Creator<pp71> CREATOR = new c071(16);

    /* JADX INFO: renamed from: a */
    public final int f179939a;

    /* JADX INFO: renamed from: b */
    public final kp71 f179940b;

    /* JADX INFO: renamed from: c */
    public final qro0 f179941c;

    public pp71(int i, kp71 kp71Var, qro0 qro0Var) {
        this.f179939a = i;
        this.f179940b = kp71Var;
        this.f179941c = qro0Var;
    }

    /* JADX INFO: renamed from: c */
    public static pp71 m70516c(pp71 pp71Var, int i, kp71 kp71Var, qro0 qro0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = pp71Var.f179939a;
        }
        if ((i2 & 2) != 0) {
            kp71Var = pp71Var.f179940b;
        }
        if ((i2 & 4) != 0) {
            qro0Var = pp71Var.f179941c;
        }
        pp71Var.getClass();
        return new pp71(i, kp71Var, qro0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp71)) {
            return false;
        }
        pp71 pp71Var = (pp71) obj;
        return this.f179939a == pp71Var.f179939a && wj50.m88271j(this.f179940b, pp71Var.f179940b) && wj50.m88271j(this.f179941c, pp71Var.f179941c);
    }

    public final int hashCode() {
        return this.f179941c.hashCode() + ((this.f179940b.hashCode() + (Integer.hashCode(this.f179939a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f179939a);
        parcel.writeParcelable(this.f179940b, i);
        parcel.writeParcelable(this.f179941c, i);
    }
}
