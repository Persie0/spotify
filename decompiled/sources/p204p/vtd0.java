package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vtd0 implements wtd0 {
    public static final Parcelable.Creator<vtd0> CREATOR = new jfd0(13);

    /* JADX INFO: renamed from: a */
    public final ztd0 f244611a;

    public vtd0(ztd0 ztd0Var) {
        this.f244611a = ztd0Var;
    }

    @Override // p204p.wtd0
    /* JADX INFO: renamed from: T0 */
    public final ztd0 mo81501T0() {
        return this.f244611a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtd0) && wj50.m88271j(this.f244611a, ((vtd0) obj).f244611a);
    }

    public final int hashCode() {
        return this.f244611a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f244611a, i);
    }
}
