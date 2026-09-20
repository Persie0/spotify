package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class lrz implements n4y {
    public static final Parcelable.Creator<lrz> CREATOR = new ygz(13);

    /* JADX INFO: renamed from: a */
    public final int f136391a;

    /* JADX INFO: renamed from: b */
    public final int f136392b;

    public lrz(int i, int i2) {
        this.f136391a = i;
        this.f136392b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrz)) {
            return false;
        }
        lrz lrzVar = (lrz) obj;
        return this.f136391a == lrzVar.f136391a && this.f136392b == lrzVar.f136392b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136392b) + (Integer.hashCode(this.f136391a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f136391a);
        parcel.writeInt(this.f136392b);
    }
}
