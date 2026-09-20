package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class gpm0 implements Parcelable {
    public static final Parcelable.Creator<gpm0> CREATOR = new cpl0(14);

    /* JADX INFO: renamed from: a */
    public final int f83222a;

    /* JADX INFO: renamed from: b */
    public final int f83223b;

    public gpm0(int i, int i2) {
        this.f83222a = i;
        this.f83223b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpm0)) {
            return false;
        }
        gpm0 gpm0Var = (gpm0) obj;
        return this.f83222a == gpm0Var.f83222a && this.f83223b == gpm0Var.f83223b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83223b) + (Integer.hashCode(this.f83222a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f83222a);
        parcel.writeInt(this.f83223b);
    }
}
