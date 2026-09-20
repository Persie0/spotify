package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ndt implements Parcelable {
    public static final Parcelable.Creator<ndt> CREATOR = new qct(5);

    /* JADX INFO: renamed from: a */
    public final int f152841a;

    /* JADX INFO: renamed from: b */
    public final b370 f152842b;

    public ndt(int i, b370 b370Var) {
        this.f152841a = i;
        this.f152842b = b370Var;
    }

    /* JADX INFO: renamed from: c */
    public final b370 m64225c() {
        return this.f152842b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndt)) {
            return false;
        }
        ndt ndtVar = (ndt) obj;
        return this.f152841a == ndtVar.f152841a && wj50.m88271j(this.f152842b, ndtVar.f152842b);
    }

    public final int hashCode() {
        return this.f152842b.hashCode() + (Integer.hashCode(this.f152841a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f152841a);
        parcel.writeParcelable(this.f152842b, i);
    }
}
