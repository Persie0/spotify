package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class nro0 implements tro0 {
    public static final Parcelable.Creator<nro0> CREATOR = new igo0(13);

    /* JADX INFO: renamed from: a */
    public final xkx0 f157592a;

    public nro0(xkx0 xkx0Var) {
        this.f157592a = xkx0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nro0) && wj50.m88271j(this.f157592a, ((nro0) obj).f157592a);
    }

    public final int hashCode() {
        return this.f157592a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f157592a, i);
    }
}
