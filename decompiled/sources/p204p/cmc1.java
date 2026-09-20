package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class cmc1 implements Parcelable {
    public static final Parcelable.Creator<cmc1> CREATOR = new nlc1(11);

    /* JADX INFO: renamed from: a */
    public final String f39647a;

    /* JADX INFO: renamed from: b */
    public final String f39648b;

    /* JADX INFO: renamed from: c */
    public final bmc1 f39649c;

    /* JADX INFO: renamed from: d */
    public final String f39650d;

    public cmc1(String str, String str2, bmc1 bmc1Var, String str3) {
        this.f39647a = str;
        this.f39648b = str2;
        this.f39649c = bmc1Var;
        this.f39650d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmc1)) {
            return false;
        }
        cmc1 cmc1Var = (cmc1) obj;
        return wj50.m88271j(this.f39647a, cmc1Var.f39647a) && wj50.m88271j(this.f39648b, cmc1Var.f39648b) && wj50.m88271j(this.f39649c, cmc1Var.f39649c) && wj50.m88271j(this.f39650d, cmc1Var.f39650d);
    }

    public final int hashCode() {
        String str = this.f39647a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39648b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bmc1 bmc1Var = this.f39649c;
        int iHashCode3 = (iHashCode2 + (bmc1Var == null ? 0 : bmc1Var.hashCode())) * 31;
        String str3 = this.f39650d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39647a);
        parcel.writeString(this.f39648b);
        bmc1 bmc1Var = this.f39649c;
        if (bmc1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bmc1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f39650d);
    }
}
