package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lpm0 extends mpm0 {
    public static final Parcelable.Creator<lpm0> CREATOR = new cpl0(17);

    /* JADX INFO: renamed from: a */
    public final String f135797a;

    /* JADX INFO: renamed from: b */
    public final boolean f135798b;

    public lpm0(String str, boolean z) {
        this.f135797a = str;
        this.f135798b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpm0)) {
            return false;
        }
        lpm0 lpm0Var = (lpm0) obj;
        return wj50.m88271j(this.f135797a, lpm0Var.f135797a) && this.f135798b == lpm0Var.f135798b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135798b) + (this.f135797a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f135797a);
        parcel.writeInt(this.f135798b ? 1 : 0);
    }
}
