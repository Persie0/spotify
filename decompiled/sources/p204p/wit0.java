package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wit0 implements Parcelable {
    public static final Parcelable.Creator<wit0> CREATOR = new vit0(0);

    /* JADX INFO: renamed from: a */
    public final String f251745a;

    /* JADX INFO: renamed from: b */
    public final String f251746b;

    /* JADX INFO: renamed from: c */
    public final flt0 f251747c;

    /* JADX INFO: renamed from: d */
    public final i35 f251748d;

    /* JADX INFO: renamed from: e */
    public final long f251749e;

    /* JADX INFO: renamed from: f */
    public final String f251750f;

    /* JADX INFO: renamed from: g */
    public final f35 f251751g;

    /* JADX INFO: renamed from: h */
    public final String f251752h;

    public wit0(String str, String str2, flt0 flt0Var, i35 i35Var, long j, String str3, f35 f35Var, String str4) {
        this.f251745a = str;
        this.f251746b = str2;
        this.f251747c = flt0Var;
        this.f251748d = i35Var;
        this.f251749e = j;
        this.f251750f = str3;
        this.f251751g = f35Var;
        this.f251752h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wit0)) {
            return false;
        }
        wit0 wit0Var = (wit0) obj;
        return wj50.m88271j(this.f251745a, wit0Var.f251745a) && wj50.m88271j(this.f251746b, wit0Var.f251746b) && wj50.m88271j(this.f251747c, wit0Var.f251747c) && wj50.m88271j(this.f251748d, wit0Var.f251748d) && this.f251749e == wit0Var.f251749e && wj50.m88271j(this.f251750f, wit0Var.f251750f) && wj50.m88271j(this.f251751g, wit0Var.f251751g) && wj50.m88271j(this.f251752h, wit0Var.f251752h);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e((this.f251748d.hashCode() + ((this.f251747c.hashCode() + s571.m77243b(this.f251745a.hashCode() * 31, 31, this.f251746b)) * 31)) * 31, this.f251749e, 31);
        String str = this.f251750f;
        int iHashCode = (this.f251751g.hashCode() + ((iM36605e + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f251752h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f251745a);
        parcel.writeString(this.f251746b);
        parcel.writeParcelable(this.f251747c, i);
        parcel.writeParcelable(this.f251748d, i);
        parcel.writeLong(this.f251749e);
        parcel.writeString(this.f251750f);
        this.f251751g.writeToParcel(parcel, i);
        parcel.writeString(this.f251752h);
    }
}
