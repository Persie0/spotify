package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d0n0 implements Parcelable {
    public static final Parcelable.Creator<d0n0> CREATOR = new pum0(17);

    /* JADX INFO: renamed from: a */
    public final lzm0 f44012a;

    /* JADX INFO: renamed from: b */
    public final lzm0 f44013b;

    public d0n0(lzm0 lzm0Var, lzm0 lzm0Var2) {
        this.f44012a = lzm0Var;
        this.f44013b = lzm0Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0n0)) {
            return false;
        }
        d0n0 d0n0Var = (d0n0) obj;
        return wj50.m88271j(this.f44012a, d0n0Var.f44012a) && wj50.m88271j(this.f44013b, d0n0Var.f44013b);
    }

    public final int hashCode() {
        return this.f44013b.hashCode() + (this.f44012a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44012a, i);
        parcel.writeParcelable(this.f44013b, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d0n0() {
        kzm0 kzm0Var = kzm0.f128164a;
        this(kzm0Var, kzm0Var);
    }
}
