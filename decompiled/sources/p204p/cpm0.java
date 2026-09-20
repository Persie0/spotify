package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cpm0 implements Parcelable {
    public static final Parcelable.Creator<cpm0> CREATOR = new cpl0(13);

    /* JADX INFO: renamed from: a */
    public final int f40578a;

    /* JADX INFO: renamed from: b */
    public final int f40579b;

    public cpm0(int i, int i2) {
        this.f40578a = i;
        this.f40579b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpm0)) {
            return false;
        }
        cpm0 cpm0Var = (cpm0) obj;
        return this.f40578a == cpm0Var.f40578a && this.f40579b == cpm0Var.f40579b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40579b) + (Integer.hashCode(this.f40578a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40578a);
        parcel.writeInt(this.f40579b);
    }
}
