package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class mz4 extends nz4 {
    public static final Parcelable.Creator<mz4> CREATOR = new bc3(22);

    /* JADX INFO: renamed from: c */
    public final int f148604c;

    /* JADX INFO: renamed from: d */
    public final int f148605d;

    public mz4(int i, int i2) {
        super(i, i2);
        this.f148604c = i;
        this.f148605d = i2;
    }

    @Override // p204p.nz4
    /* JADX INFO: renamed from: c */
    public final int mo63230c() {
        return this.f148604c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz4)) {
            return false;
        }
        mz4 mz4Var = (mz4) obj;
        return this.f148604c == mz4Var.f148604c && this.f148605d == mz4Var.f148605d;
    }

    @Override // p204p.nz4
    /* JADX INFO: renamed from: g */
    public final int mo63231g() {
        return this.f148605d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148605d) + (Integer.hashCode(this.f148604c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f148604c);
        parcel.writeInt(this.f148605d);
    }
}
