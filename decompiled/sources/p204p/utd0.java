package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class utd0 implements wtd0 {
    public static final Parcelable.Creator<utd0> CREATOR = new jfd0(12);

    /* JADX INFO: renamed from: a */
    public final ztd0 f233895a;

    public utd0(ztd0 ztd0Var) {
        this.f233895a = ztd0Var;
    }

    @Override // p204p.wtd0
    /* JADX INFO: renamed from: T0 */
    public final ztd0 mo81501T0() {
        return this.f233895a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utd0) && wj50.m88271j(this.f233895a, ((utd0) obj).f233895a);
    }

    public final int hashCode() {
        return this.f233895a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f233895a, i);
    }
}
