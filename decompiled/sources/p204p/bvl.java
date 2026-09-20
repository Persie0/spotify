package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bvl implements Parcelable {
    public static final Parcelable.Creator<bvl> CREATOR = new pkl(5);

    /* JADX INFO: renamed from: a */
    public final int f31391a;

    /* JADX INFO: renamed from: b */
    public final tdu f31392b;

    public bvl(int i, tdu tduVar) {
        this.f31391a = i;
        this.f31392b = tduVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvl)) {
            return false;
        }
        bvl bvlVar = (bvl) obj;
        return this.f31391a == bvlVar.f31391a && wj50.m88271j(this.f31392b, bvlVar.f31392b);
    }

    public final int hashCode() {
        return this.f31392b.hashCode() + (Integer.hashCode(this.f31391a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31391a);
        parcel.writeParcelable(this.f31392b, i);
    }
}
