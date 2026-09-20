package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class de2 extends he2 {
    public static final Parcelable.Creator<de2> CREATOR = new lb2(6);

    /* JADX INFO: renamed from: a */
    public final ql50 f47933a;

    public de2(ql50 ql50Var) {
        this.f47933a = ql50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de2) && wj50.m88271j(this.f47933a, ((de2) obj).f47933a);
    }

    public final int hashCode() {
        return this.f47933a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47933a, i);
    }
}
