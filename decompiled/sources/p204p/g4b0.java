package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class g4b0 implements Parcelable {
    public static final Parcelable.Creator<g4b0> CREATOR = new l0b0(11);

    /* JADX INFO: renamed from: a */
    public final f4b0 f76382a;

    /* JADX INFO: renamed from: b */
    public final zq9 f76383b;

    /* JADX INFO: renamed from: c */
    public final zq9 f76384c;

    public g4b0(f4b0 f4b0Var, zq9 zq9Var, zq9 zq9Var2) {
        this.f76382a = f4b0Var;
        this.f76383b = zq9Var;
        this.f76384c = zq9Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4b0)) {
            return false;
        }
        g4b0 g4b0Var = (g4b0) obj;
        return wj50.m88271j(this.f76382a, g4b0Var.f76382a) && wj50.m88271j(this.f76383b, g4b0Var.f76383b) && wj50.m88271j(this.f76384c, g4b0Var.f76384c);
    }

    public final int hashCode() {
        int iHashCode = this.f76382a.f65723a.hashCode() * 31;
        zq9 zq9Var = this.f76383b;
        int iHashCode2 = (iHashCode + (zq9Var == null ? 0 : zq9Var.f285333a.hashCode())) * 31;
        zq9 zq9Var2 = this.f76384c;
        return iHashCode2 + (zq9Var2 != null ? zq9Var2.f285333a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f76382a.writeToParcel(parcel, i);
        zq9 zq9Var = this.f76383b;
        if (zq9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zq9Var.writeToParcel(parcel, i);
        }
        zq9 zq9Var2 = this.f76384c;
        if (zq9Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zq9Var2.writeToParcel(parcel, i);
        }
    }
}
