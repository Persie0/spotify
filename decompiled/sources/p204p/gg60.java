package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class gg60 implements Parcelable {
    public static final Parcelable.Creator<gg60> CREATOR = new pq50(19);

    /* JADX INFO: renamed from: a */
    public final fg60 f79554a;

    /* JADX INFO: renamed from: b */
    public final zq9 f79555b;

    /* JADX INFO: renamed from: c */
    public final zq9 f79556c;

    public gg60(fg60 fg60Var, zq9 zq9Var, zq9 zq9Var2) {
        this.f79554a = fg60Var;
        this.f79555b = zq9Var;
        this.f79556c = zq9Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg60)) {
            return false;
        }
        gg60 gg60Var = (gg60) obj;
        return wj50.m88271j(this.f79554a, gg60Var.f79554a) && wj50.m88271j(this.f79555b, gg60Var.f79555b) && wj50.m88271j(this.f79556c, gg60Var.f79556c);
    }

    public final int hashCode() {
        int iHashCode = this.f79554a.f69234a.hashCode() * 31;
        zq9 zq9Var = this.f79555b;
        int iHashCode2 = (iHashCode + (zq9Var == null ? 0 : zq9Var.f285333a.hashCode())) * 31;
        zq9 zq9Var2 = this.f79556c;
        return iHashCode2 + (zq9Var2 != null ? zq9Var2.f285333a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f79554a.writeToParcel(parcel, i);
        zq9 zq9Var = this.f79555b;
        if (zq9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zq9Var.writeToParcel(parcel, i);
        }
        zq9 zq9Var2 = this.f79556c;
        if (zq9Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zq9Var2.writeToParcel(parcel, i);
        }
    }
}
