package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class fwd0 implements Parcelable {
    public static final Parcelable.Creator<fwd0> CREATOR = new jfd0(23);

    /* JADX INFO: renamed from: a */
    public final aud0 f74050a;

    public fwd0(aud0 aud0Var) {
        this.f74050a = aud0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwd0) && wj50.m88271j(this.f74050a, ((fwd0) obj).f74050a);
    }

    public final int hashCode() {
        return this.f74050a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f74050a, i);
    }
}
