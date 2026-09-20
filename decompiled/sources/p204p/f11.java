package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class f11 implements j11 {
    public static final Parcelable.Creator<f11> CREATOR = new zz0(29);

    /* JADX INFO: renamed from: a */
    public final b01 f64763a;

    public f11(b01 b01Var) {
        this.f64763a = b01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f11) && wj50.m88271j(this.f64763a, ((f11) obj).f64763a);
    }

    public final int hashCode() {
        b01 b01Var = this.f64763a;
        if (b01Var == null) {
            return 0;
        }
        return b01Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f64763a, i);
    }
}
