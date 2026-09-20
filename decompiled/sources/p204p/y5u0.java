package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class y5u0 implements Parcelable {
    public static final Parcelable.Creator<y5u0> CREATOR = new v5u0(2);

    /* JADX INFO: renamed from: a */
    public final gp8 f269551a;

    public y5u0(gp8 gp8Var) {
        this.f269551a = gp8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5u0) && wj50.m88271j(this.f269551a, ((y5u0) obj).f269551a);
    }

    public final int hashCode() {
        return this.f269551a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f269551a, i);
    }
}
