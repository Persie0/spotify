package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class pxe1 implements m6k {
    public static final Parcelable.Creator<pxe1> CREATOR = new tne1(13);

    /* JADX INFO: renamed from: a */
    public final boolean f182295a;

    /* JADX INFO: renamed from: b */
    public final String f182296b;

    public pxe1(boolean z, String str) {
        this.f182295a = z;
        this.f182296b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe1)) {
            return false;
        }
        pxe1 pxe1Var = (pxe1) obj;
        return this.f182295a == pxe1Var.f182295a && wj50.m88271j(this.f182296b, pxe1Var.f182296b);
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f182295a) * 31;
        String str = this.f182296b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f182295a ? 1 : 0);
        parcel.writeString(this.f182296b);
    }
}
