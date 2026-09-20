package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ka90 implements Parcelable {
    public static final Parcelable.Creator<ka90> CREATOR = new x390(27);

    /* JADX INFO: renamed from: a */
    public final String f120835a;

    /* JADX INFO: renamed from: b */
    public final ia90 f120836b;

    public ka90(String str, ia90 ia90Var) {
        this.f120835a = str;
        this.f120836b = ia90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka90)) {
            return false;
        }
        ka90 ka90Var = (ka90) obj;
        return wj50.m88271j(this.f120835a, ka90Var.f120835a) && wj50.m88271j(this.f120836b, ka90Var.f120836b);
    }

    public final int hashCode() {
        int iHashCode = this.f120835a.hashCode() * 31;
        ia90 ia90Var = this.f120836b;
        return iHashCode + (ia90Var == null ? 0 : ia90Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120835a);
        ia90 ia90Var = this.f120836b;
        if (ia90Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ia90Var.writeToParcel(parcel, i);
        }
    }
}
