package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ytd0 implements ztd0 {
    public static final Parcelable.Creator<ytd0> CREATOR = new jfd0(15);

    /* JADX INFO: renamed from: a */
    public final pu71 f276098a;

    public ytd0(pu71 pu71Var) {
        this.f276098a = pu71Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytd0) && wj50.m88271j(this.f276098a, ((ytd0) obj).f276098a);
    }

    public final int hashCode() {
        return this.f276098a.hashCode();
    }

    @Override // p204p.ztd0
    /* JADX INFO: renamed from: n */
    public final pu71 mo92011n() {
        return this.f276098a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f276098a, i);
    }
}
