package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class crb1 implements erb1 {
    public static final Parcelable.Creator<crb1> CREATOR = new c8b1(13);

    /* JADX INFO: renamed from: a */
    public final String f41259a;

    /* JADX INFO: renamed from: b */
    public final om01 f41260b;

    /* JADX INFO: renamed from: c */
    public final String f41261c;

    public crb1(String str, String str2, om01 om01Var) {
        this.f41259a = str;
        this.f41260b = om01Var;
        this.f41261c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crb1)) {
            return false;
        }
        crb1 crb1Var = (crb1) obj;
        return wj50.m88271j(this.f41259a, crb1Var.f41259a) && wj50.m88271j(this.f41260b, crb1Var.f41260b) && wj50.m88271j(this.f41261c, crb1Var.f41261c);
    }

    public final int hashCode() {
        int iHashCode = (this.f41260b.hashCode() + (this.f41259a.hashCode() * 31)) * 31;
        String str = this.f41261c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41259a);
        parcel.writeParcelable(this.f41260b, i);
        parcel.writeString(this.f41261c);
    }
}
