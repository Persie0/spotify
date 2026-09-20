package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ttd0 implements wtd0 {
    public static final Parcelable.Creator<ttd0> CREATOR = new jfd0(11);

    /* JADX INFO: renamed from: a */
    public final ztd0 f223577a;

    public ttd0(ztd0 ztd0Var) {
        this.f223577a = ztd0Var;
    }

    @Override // p204p.wtd0
    /* JADX INFO: renamed from: T0 */
    public final ztd0 mo81501T0() {
        return this.f223577a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttd0) && wj50.m88271j(this.f223577a, ((ttd0) obj).f223577a);
    }

    public final int hashCode() {
        return this.f223577a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f223577a, i);
    }
}
