package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p11 implements x11 {
    public static final Parcelable.Creator<p11> CREATOR = new g11(5);

    /* JADX INFO: renamed from: a */
    public final b01 f172910a;

    public p11(b01 b01Var) {
        this.f172910a = b01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p11) && wj50.m88271j(this.f172910a, ((p11) obj).f172910a);
    }

    public final int hashCode() {
        return this.f172910a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f172910a, i);
    }
}
