package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class mrc implements s511 {
    public static final Parcelable.Creator<mrc> CREATOR = new a5c(24);

    /* JADX INFO: renamed from: a */
    public final zrc f146468a;

    /* JADX INFO: renamed from: b */
    public final int f146469b;

    public mrc(zrc zrcVar, int i) {
        this.f146468a = zrcVar;
        this.f146469b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrc)) {
            return false;
        }
        mrc mrcVar = (mrc) obj;
        return wj50.m88271j(this.f146468a, mrcVar.f146468a) && this.f146469b == mrcVar.f146469b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146469b) + (this.f146468a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f146468a.writeToParcel(parcel, i);
        parcel.writeInt(this.f146469b);
    }
}
