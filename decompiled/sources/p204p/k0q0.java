package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class k0q0 implements Parcelable {
    public static final Parcelable.Creator<k0q0> CREATOR = new vnp0(8);

    /* JADX INFO: renamed from: a */
    public final voc1 f118136a;

    /* JADX INFO: renamed from: b */
    public final boolean f118137b;

    public k0q0(voc1 voc1Var, boolean z) {
        this.f118136a = voc1Var;
        this.f118137b = z;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m55010c() {
        return this.f118136a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0q0)) {
            return false;
        }
        k0q0 k0q0Var = (k0q0) obj;
        return wj50.m88271j(this.f118136a, k0q0Var.f118136a) && this.f118137b == k0q0Var.f118137b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118137b) + (this.f118136a.f243453a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f118136a, i);
        parcel.writeInt(this.f118137b ? 1 : 0);
    }
}
