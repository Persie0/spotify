package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ocl0 extends xcl0 {
    public static final Parcelable.Creator<ocl0> CREATOR = new hbl0(12);

    /* JADX INFO: renamed from: a */
    public final String f163951a;

    /* JADX INFO: renamed from: b */
    public final String f163952b;

    /* JADX INFO: renamed from: c */
    public final String f163953c;

    /* JADX INFO: renamed from: d */
    public final String f163954d;

    /* JADX INFO: renamed from: e */
    public final wcl0 f163955e;

    /* JADX INFO: renamed from: f */
    public final yea0 f163956f;

    /* JADX INFO: renamed from: g */
    public final ok01 f163957g;

    public ocl0(String str, String str2, String str3, String str4, wcl0 wcl0Var, yea0 yea0Var, ok01 ok01Var) {
        this.f163951a = str;
        this.f163952b = str2;
        this.f163953c = str3;
        this.f163954d = str4;
        this.f163955e = wcl0Var;
        this.f163956f = yea0Var;
        this.f163957g = ok01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocl0)) {
            return false;
        }
        ocl0 ocl0Var = (ocl0) obj;
        return wj50.m88271j(this.f163951a, ocl0Var.f163951a) && wj50.m88271j(this.f163952b, ocl0Var.f163952b) && wj50.m88271j(this.f163953c, ocl0Var.f163953c) && wj50.m88271j(this.f163954d, ocl0Var.f163954d) && wj50.m88271j(this.f163955e, ocl0Var.f163955e) && wj50.m88271j(this.f163956f, ocl0Var.f163956f) && wj50.m88271j(this.f163957g, ocl0Var.f163957g);
    }

    public final int hashCode() {
        int iHashCode = this.f163951a.hashCode() * 31;
        String str = this.f163952b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f163953c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f163954d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        wcl0 wcl0Var = this.f163955e;
        int iHashCode5 = (iHashCode4 + (wcl0Var == null ? 0 : wcl0Var.hashCode())) * 31;
        yea0 yea0Var = this.f163956f;
        int iHashCode6 = (iHashCode5 + (yea0Var == null ? 0 : yea0Var.hashCode())) * 31;
        ok01 ok01Var = this.f163957g;
        return iHashCode6 + (ok01Var != null ? ok01Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f163951a);
        parcel.writeString(this.f163952b);
        parcel.writeString(this.f163953c);
        parcel.writeString(this.f163954d);
        parcel.writeParcelable(this.f163955e, i);
        yea0 yea0Var = this.f163956f;
        if (yea0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yea0Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f163957g, i);
    }

    public /* synthetic */ ocl0(String str, String str2, String str3, String str4, wcl0 wcl0Var, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : wcl0Var, null, null);
    }
}
