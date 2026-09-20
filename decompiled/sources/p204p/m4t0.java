package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class m4t0 extends p4t0 {
    public static final Parcelable.Creator<m4t0> CREATOR = new wds0(22);

    /* JADX INFO: renamed from: a */
    public final ok10 f140022a;

    public m4t0(ok10 ok10Var) {
        this.f140022a = ok10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4t0) && wj50.m88271j(this.f140022a, ((m4t0) obj).f140022a);
    }

    public final int hashCode() {
        return this.f140022a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f140022a, i);
    }
}
