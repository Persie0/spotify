package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kgb0 implements Parcelable {
    public static final Parcelable.Creator<kgb0> CREATOR = new l0b0(26);

    /* JADX INFO: renamed from: a */
    public final boolean f122353a;

    /* JADX INFO: renamed from: b */
    public final zth0 f122354b;

    /* JADX INFO: renamed from: c */
    public final int f122355c;

    public kgb0(boolean z, zth0 zth0Var, int i) {
        this.f122353a = z;
        this.f122354b = zth0Var;
        this.f122355c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgb0)) {
            return false;
        }
        kgb0 kgb0Var = (kgb0) obj;
        return this.f122353a == kgb0Var.f122353a && this.f122354b == kgb0Var.f122354b && this.f122355c == kgb0Var.f122355c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122355c) + ((this.f122354b.hashCode() + (Boolean.hashCode(this.f122353a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f122353a ? 1 : 0);
        parcel.writeParcelable(this.f122354b, i);
        parcel.writeInt(this.f122355c);
    }

    public /* synthetic */ kgb0() {
        this(false, zth0.f286167a, 0);
    }
}
