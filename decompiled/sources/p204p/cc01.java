package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cc01 implements Parcelable {
    public static final Parcelable.Creator<cc01> CREATOR = new vcz0(17);

    /* JADX INFO: renamed from: a */
    public final int f36278a;

    /* JADX INFO: renamed from: b */
    public final int f36279b;

    public cc01(int i, int i2) {
        this.f36278a = i;
        this.f36279b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc01)) {
            return false;
        }
        cc01 cc01Var = (cc01) obj;
        return this.f36278a == cc01Var.f36278a && this.f36279b == cc01Var.f36279b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36279b) + (Integer.hashCode(this.f36278a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36278a);
        parcel.writeInt(this.f36279b);
    }
}
