package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class nuc implements Parcelable {
    public static final Parcelable.Creator<nuc> CREATOR = new a5c(29);

    /* JADX INFO: renamed from: a */
    public final int f158586a;

    /* JADX INFO: renamed from: b */
    public final int f158587b;

    /* JADX INFO: renamed from: c */
    public final boolean f158588c;

    public nuc(int i, int i2, boolean z) {
        this.f158586a = i;
        this.f158587b = i2;
        this.f158588c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuc)) {
            return false;
        }
        nuc nucVar = (nuc) obj;
        return this.f158586a == nucVar.f158586a && this.f158587b == nucVar.f158587b && this.f158588c == nucVar.f158588c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158588c) + mt60.m62800g(this.f158587b, Integer.hashCode(this.f158586a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f158586a);
        parcel.writeInt(this.f158587b);
        parcel.writeInt(this.f158588c ? 1 : 0);
    }
}
