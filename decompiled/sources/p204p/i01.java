package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class i01 extends z01 {
    public static final Parcelable.Creator<i01> CREATOR = new zz0(8);

    /* JADX INFO: renamed from: a */
    public final rk7 f97088a;

    public i01(rk7 rk7Var) {
        this.f97088a = rk7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i01) && this.f97088a == ((i01) obj).f97088a;
    }

    public final int hashCode() {
        rk7 rk7Var = this.f97088a;
        if (rk7Var == null) {
            return 0;
        }
        return rk7Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rk7 rk7Var = this.f97088a;
        if (rk7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rk7Var.name());
        }
    }
}
