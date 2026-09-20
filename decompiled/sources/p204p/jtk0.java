package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jtk0 implements Parcelable {
    public static final Parcelable.Creator<jtk0> CREATOR = new fgj0(26);

    /* JADX INFO: renamed from: a */
    public final String f115918a;

    /* JADX INFO: renamed from: b */
    public final String f115919b;

    public jtk0(String str, String str2) {
        this.f115918a = str;
        this.f115919b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtk0)) {
            return false;
        }
        jtk0 jtk0Var = (jtk0) obj;
        return wj50.m88271j(this.f115918a, jtk0Var.f115918a) && wj50.m88271j(this.f115919b, jtk0Var.f115919b);
    }

    public final int hashCode() {
        int iHashCode = this.f115918a.hashCode() * 31;
        String str = this.f115919b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return edb.m38566o("basePlanId: ", this.f115918a, " - offerId: ", this.f115919b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115918a);
        parcel.writeString(this.f115919b);
    }
}
