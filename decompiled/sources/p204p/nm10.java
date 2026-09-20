package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nm10 extends om10 {
    public static final Parcelable.Creator<nm10> CREATOR = new km10(1);

    /* JADX INFO: renamed from: a */
    public final String f155262a;

    /* JADX INFO: renamed from: b */
    public final rdt0 f155263b;

    public nm10(String str, rdt0 rdt0Var) {
        this.f155262a = str;
        this.f155263b = rdt0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm10)) {
            return false;
        }
        nm10 nm10Var = (nm10) obj;
        return wj50.m88271j(this.f155262a, nm10Var.f155262a) && wj50.m88271j(this.f155263b, nm10Var.f155263b);
    }

    public final int hashCode() {
        int iHashCode = this.f155262a.hashCode() * 31;
        rdt0 rdt0Var = this.f155263b;
        return iHashCode + (rdt0Var == null ? 0 : rdt0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f155262a);
        parcel.writeParcelable(this.f155263b, i);
    }
}
