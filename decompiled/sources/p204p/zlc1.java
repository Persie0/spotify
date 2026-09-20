package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zlc1 implements hnc1 {
    public static final Parcelable.Creator<zlc1> CREATOR = new nlc1(9);

    /* JADX INFO: renamed from: a */
    public final String f283976a;

    /* JADX INFO: renamed from: b */
    public final String f283977b;

    /* JADX INFO: renamed from: c */
    public final ylc1 f283978c;

    /* JADX INFO: renamed from: d */
    public final ylc1 f283979d;

    public zlc1(String str, String str2, ylc1 ylc1Var, ylc1 ylc1Var2) {
        this.f283976a = str;
        this.f283977b = str2;
        this.f283978c = ylc1Var;
        this.f283979d = ylc1Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlc1)) {
            return false;
        }
        zlc1 zlc1Var = (zlc1) obj;
        return wj50.m88271j(this.f283976a, zlc1Var.f283976a) && wj50.m88271j(this.f283977b, zlc1Var.f283977b) && wj50.m88271j(this.f283978c, zlc1Var.f283978c) && wj50.m88271j(this.f283979d, zlc1Var.f283979d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f283976a.hashCode() * 31, 31, this.f283977b);
        ylc1 ylc1Var = this.f283978c;
        int iHashCode = (iM77243b + (ylc1Var == null ? 0 : ylc1Var.hashCode())) * 31;
        ylc1 ylc1Var2 = this.f283979d;
        return iHashCode + (ylc1Var2 != null ? ylc1Var2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283976a);
        parcel.writeString(this.f283977b);
        ylc1 ylc1Var = this.f283978c;
        if (ylc1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ylc1Var.writeToParcel(parcel, i);
        }
        ylc1 ylc1Var2 = this.f283979d;
        if (ylc1Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ylc1Var2.writeToParcel(parcel, i);
        }
    }
}
