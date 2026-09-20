package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ocu0 implements Parcelable {
    public static final Parcelable.Creator<ocu0> CREATOR = new v5u0(9);

    /* JADX INFO: renamed from: a */
    public final int f163991a;

    /* JADX INFO: renamed from: b */
    public final pua1 f163992b;

    public ocu0(int i, pua1 pua1Var) {
        this.f163991a = i;
        this.f163992b = pua1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocu0)) {
            return false;
        }
        ocu0 ocu0Var = (ocu0) obj;
        return this.f163991a == ocu0Var.f163991a && wj50.m88271j(this.f163992b, ocu0Var.f163992b);
    }

    public final int hashCode() {
        return this.f163992b.hashCode() + (Integer.hashCode(this.f163991a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f163991a);
        parcel.writeParcelable(this.f163992b, i);
    }
}
