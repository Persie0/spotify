package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class klf0 implements Parcelable {
    public static final Parcelable.Creator<klf0> CREATOR = new r4f0(11);

    /* JADX INFO: renamed from: a */
    public final String f123888a;

    /* JADX INFO: renamed from: b */
    public final String f123889b;

    /* JADX INFO: renamed from: c */
    public final aox0 f123890c;

    /* JADX INFO: renamed from: d */
    public final aox0 f123891d;

    /* JADX INFO: renamed from: e */
    public final String f123892e;

    /* JADX INFO: renamed from: f */
    public final String f123893f;

    public klf0(String str, String str2, aox0 aox0Var, aox0 aox0Var2, String str3, String str4) {
        this.f123888a = str;
        this.f123889b = str2;
        this.f123890c = aox0Var;
        this.f123891d = aox0Var2;
        this.f123892e = str3;
        this.f123893f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klf0)) {
            return false;
        }
        klf0 klf0Var = (klf0) obj;
        return wj50.m88271j(this.f123888a, klf0Var.f123888a) && wj50.m88271j(this.f123889b, klf0Var.f123889b) && wj50.m88271j(this.f123890c, klf0Var.f123890c) && wj50.m88271j(this.f123891d, klf0Var.f123891d) && wj50.m88271j(this.f123892e, klf0Var.f123892e) && wj50.m88271j(this.f123893f, klf0Var.f123893f);
    }

    public final int hashCode() {
        int iHashCode = (this.f123891d.hashCode() + ((this.f123890c.hashCode() + s571.m77243b(this.f123888a.hashCode() * 31, 31, this.f123889b)) * 31)) * 31;
        String str = this.f123892e;
        return this.f123893f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f123888a);
        parcel.writeString(this.f123889b);
        parcel.writeParcelable(this.f123890c, i);
        parcel.writeParcelable(this.f123891d, i);
        parcel.writeString(this.f123892e);
        parcel.writeString(this.f123893f);
    }

    public /* synthetic */ klf0(String str, String str2, aox0 aox0Var, aox0 aox0Var2, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new aox0("", "") : aox0Var, (i & 8) != 0 ? new aox0("", "") : aox0Var2, (i & 16) != 0 ? null : str3, str4);
    }
}
