package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class pjn0 implements Parcelable {
    public static final Parcelable.Creator<pjn0> CREATOR = new ejn0(3);

    /* JADX INFO: renamed from: a */
    public final String f178288a;

    /* JADX INFO: renamed from: b */
    public final String f178289b;

    /* JADX INFO: renamed from: c */
    public final Double f178290c;

    /* JADX INFO: renamed from: d */
    public final String f178291d;

    public pjn0(String str, String str2, Double d, String str3) {
        this.f178288a = str;
        this.f178289b = str2;
        this.f178290c = d;
        this.f178291d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjn0)) {
            return false;
        }
        pjn0 pjn0Var = (pjn0) obj;
        return wj50.m88271j(this.f178288a, pjn0Var.f178288a) && wj50.m88271j(this.f178289b, pjn0Var.f178289b) && wj50.m88271j(this.f178290c, pjn0Var.f178290c) && wj50.m88271j(this.f178291d, pjn0Var.f178291d);
    }

    public final int hashCode() {
        int iHashCode = this.f178288a.hashCode() * 31;
        String str = this.f178289b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f178290c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f178291d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f178288a);
        parcel.writeString(this.f178289b);
        Double d = this.f178290c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f178291d);
    }
}
