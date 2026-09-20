package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tk8 implements Parcelable {
    public static final Parcelable.Creator<tk8> CREATOR = new yi8(2);

    /* JADX INFO: renamed from: a */
    public final int f221096a;

    /* JADX INFO: renamed from: b */
    public final int f221097b;

    public tk8(int i, int i2) {
        this.f221096a = i;
        this.f221097b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk8)) {
            return false;
        }
        tk8 tk8Var = (tk8) obj;
        return this.f221096a == tk8Var.f221096a && this.f221097b == tk8Var.f221097b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f221097b) + (Integer.hashCode(this.f221096a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f221096a);
        parcel.writeInt(this.f221097b);
    }
}
