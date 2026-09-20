package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gzq implements jzq {
    public static final Parcelable.Creator<gzq> CREATOR = new lso(15);

    /* JADX INFO: renamed from: a */
    public final fua0 f86007a;

    public gzq(fua0 fua0Var) {
        this.f86007a = fua0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzq) && wj50.m88271j(this.f86007a, ((gzq) obj).f86007a);
    }

    public final int hashCode() {
        return this.f86007a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f86007a, i);
    }
}
