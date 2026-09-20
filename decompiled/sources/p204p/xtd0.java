package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xtd0 implements ztd0 {
    public static final Parcelable.Creator<xtd0> CREATOR = new jfd0(14);

    /* JADX INFO: renamed from: a */
    public final pu71 f265844a;

    /* JADX INFO: renamed from: b */
    public final pu71 f265845b;

    public xtd0(pu71 pu71Var, pu71 pu71Var2) {
        this.f265844a = pu71Var;
        this.f265845b = pu71Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtd0)) {
            return false;
        }
        xtd0 xtd0Var = (xtd0) obj;
        return wj50.m88271j(this.f265844a, xtd0Var.f265844a) && wj50.m88271j(this.f265845b, xtd0Var.f265845b);
    }

    public final int hashCode() {
        int iHashCode = this.f265844a.hashCode() * 31;
        pu71 pu71Var = this.f265845b;
        return iHashCode + (pu71Var == null ? 0 : pu71Var.hashCode());
    }

    @Override // p204p.ztd0
    /* JADX INFO: renamed from: n */
    public final pu71 mo92011n() {
        return this.f265844a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f265844a, i);
        parcel.writeParcelable(this.f265845b, i);
    }
}
