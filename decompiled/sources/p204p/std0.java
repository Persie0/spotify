package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class std0 implements s511 {
    public static final Parcelable.Creator<std0> CREATOR = new jfd0(9);

    /* JADX INFO: renamed from: a */
    public final aud0 f213888a;

    /* JADX INFO: renamed from: b */
    public final int f213889b;

    public std0(aud0 aud0Var, int i) {
        this.f213888a = aud0Var;
        this.f213889b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof std0)) {
            return false;
        }
        std0 std0Var = (std0) obj;
        return wj50.m88271j(this.f213888a, std0Var.f213888a) && this.f213889b == std0Var.f213889b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213889b) + (this.f213888a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f213888a, i);
        parcel.writeInt(this.f213889b);
    }
}
