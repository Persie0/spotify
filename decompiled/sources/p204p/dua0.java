package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class dua0 implements fua0 {
    public static final Parcelable.Creator<dua0> CREATOR = new ama0(8);

    /* JADX INFO: renamed from: a */
    public final cua0 f53023a;

    public dua0(cua0 cua0Var) {
        this.f53023a = cua0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dua0) && wj50.m88271j(this.f53023a, ((dua0) obj).f53023a);
    }

    public final int hashCode() {
        return this.f53023a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f53023a, i);
    }
}
