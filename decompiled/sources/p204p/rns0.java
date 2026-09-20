package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class rns0 extends uns0 {
    public static final Parcelable.Creator<rns0> CREATOR = new wds0(3);

    /* JADX INFO: renamed from: b */
    public final String f201007b;

    /* JADX INFO: renamed from: c */
    public final cos0 f201008c;

    /* JADX INFO: renamed from: d */
    public final boolean f201009d;

    /* JADX INFO: renamed from: e */
    public final String f201010e;

    /* JADX INFO: renamed from: f */
    public final String f201011f;

    public rns0(String str, cos0 cos0Var, boolean z, String str2, String str3) {
        super(null);
        this.f201007b = str;
        this.f201008c = cos0Var;
        this.f201009d = z;
        this.f201010e = str2;
        this.f201011f = str3;
    }

    /* JADX INFO: renamed from: g */
    public static rns0 m76010g(rns0 rns0Var, boolean z) {
        String str = rns0Var.f201007b;
        cos0 cos0Var = rns0Var.f201008c;
        String str2 = rns0Var.f201010e;
        String str3 = rns0Var.f201011f;
        rns0Var.getClass();
        return new rns0(str, cos0Var, z, str2, str3);
    }

    @Override // p204p.uns0
    /* JADX INFO: renamed from: c */
    public final String mo73361c() {
        return this.f201007b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rns0)) {
            return false;
        }
        rns0 rns0Var = (rns0) obj;
        return wj50.m88271j(this.f201007b, rns0Var.f201007b) && wj50.m88271j(this.f201008c, rns0Var.f201008c) && this.f201009d == rns0Var.f201009d && wj50.m88271j(this.f201010e, rns0Var.f201010e) && wj50.m88271j(this.f201011f, rns0Var.f201011f);
    }

    /* JADX INFO: renamed from: h */
    public final cos0 m76011h() {
        return this.f201008c;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f201008c.hashCode() + (this.f201007b.hashCode() * 31)) * 31, 31, this.f201009d);
        String str = this.f201010e;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f201011f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f201007b);
        parcel.writeParcelable(this.f201008c, i);
        parcel.writeInt(this.f201009d ? 1 : 0);
        parcel.writeString(this.f201010e);
        parcel.writeString(this.f201011f);
    }
}
