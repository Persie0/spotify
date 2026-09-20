package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class x2l0 extends z2l0 {
    public static final Parcelable.Creator<x2l0> CREATOR = new oxk0(19);

    /* JADX INFO: renamed from: a */
    public final int f257519a;

    /* JADX INFO: renamed from: b */
    public final int f257520b;

    public x2l0(int i, int i2) {
        this.f257519a = i;
        this.f257520b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2l0)) {
            return false;
        }
        x2l0 x2l0Var = (x2l0) obj;
        return this.f257519a == x2l0Var.f257519a && this.f257520b == x2l0Var.f257520b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257520b) + (edb.m38547C(this.f257519a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f257519a;
        if (i2 == 1) {
            str = "IN_QUEUE";
        } else if (i2 == 2) {
            str = "OFFLINE_MODE";
        } else if (i2 == 3) {
            str = "NO_CONNECTION";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "SYNC_NOT_ALLOWED";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f257520b);
    }
}
