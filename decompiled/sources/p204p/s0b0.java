package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class s0b0 extends w0b0 {
    public static final Parcelable.Creator<s0b0> CREATOR = new l0b0(6);

    /* JADX INFO: renamed from: a */
    public final i7n0 f204337a;

    public s0b0(i7n0 i7n0Var) {
        this.f204337a = i7n0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0b0) && wj50.m88271j(this.f204337a, ((s0b0) obj).f204337a);
    }

    public final int hashCode() {
        return this.f204337a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f204337a.writeToParcel(parcel, i);
    }
}
