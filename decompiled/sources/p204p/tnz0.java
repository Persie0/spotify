package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tnz0 implements Parcelable {
    public static final Parcelable.Creator<tnz0> CREATOR = new vcz0(7);

    /* JADX INFO: renamed from: a */
    public final int f222111a;

    /* JADX INFO: renamed from: b */
    public final int f222112b;

    public tnz0(int i, int i2) {
        this.f222111a = i;
        this.f222112b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnz0)) {
            return false;
        }
        tnz0 tnz0Var = (tnz0) obj;
        return this.f222111a == tnz0Var.f222111a && this.f222112b == tnz0Var.f222112b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222112b) + (Integer.hashCode(this.f222111a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f222111a);
        parcel.writeInt(this.f222112b);
    }
}
