package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pt51 implements Parcelable {
    public static final Parcelable.Creator<pt51> CREATOR = new nc51(25);

    /* JADX INFO: renamed from: a */
    public final String f181048a;

    /* JADX INFO: renamed from: b */
    public final jtk0 f181049b;

    /* JADX INFO: renamed from: c */
    public final hjr0 f181050c;

    public pt51(String str, jtk0 jtk0Var, hjr0 hjr0Var) {
        this.f181048a = str;
        this.f181049b = jtk0Var;
        this.f181050c = hjr0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt51)) {
            return false;
        }
        pt51 pt51Var = (pt51) obj;
        return wj50.m88271j(this.f181048a, pt51Var.f181048a) && wj50.m88271j(this.f181049b, pt51Var.f181049b) && wj50.m88271j(this.f181050c, pt51Var.f181050c);
    }

    public final int hashCode() {
        int iHashCode = this.f181048a.hashCode() * 31;
        jtk0 jtk0Var = this.f181049b;
        int iHashCode2 = (iHashCode + (jtk0Var == null ? 0 : jtk0Var.hashCode())) * 31;
        hjr0 hjr0Var = this.f181050c;
        return iHashCode2 + (hjr0Var != null ? hjr0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f181048a);
        jtk0 jtk0Var = this.f181049b;
        if (jtk0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jtk0Var.writeToParcel(parcel, i);
        }
        hjr0 hjr0Var = this.f181050c;
        if (hjr0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hjr0Var.writeToParcel(parcel, i);
        }
    }
}
