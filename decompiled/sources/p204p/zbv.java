package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zbv implements Parcelable {
    public static final Parcelable.Creator<zbv> CREATOR = new m8v(4);

    /* JADX INFO: renamed from: a */
    public final String f281396a;

    /* JADX INFO: renamed from: b */
    public final String f281397b;

    /* JADX INFO: renamed from: c */
    public final String f281398c;

    /* JADX INFO: renamed from: d */
    public final String f281399d;

    /* JADX INFO: renamed from: e */
    public final String f281400e;

    /* JADX INFO: renamed from: f */
    public final zq50 f281401f;

    /* JADX INFO: renamed from: g */
    public final tbv f281402g;

    /* JADX INFO: renamed from: h */
    public final lw00 f281403h;

    public zbv(String str, String str2, String str3, String str4, String str5, zq50 zq50Var, tbv tbvVar, lw00 lw00Var) {
        this.f281396a = str;
        this.f281397b = str2;
        this.f281398c = str3;
        this.f281399d = str4;
        this.f281400e = str5;
        this.f281401f = zq50Var;
        this.f281402g = tbvVar;
        this.f281403h = lw00Var;
    }

    /* JADX INFO: renamed from: c */
    public static zbv m95879c(zbv zbvVar, String str, mb81 mb81Var, int i) {
        String str2 = zbvVar.f281396a;
        String str3 = zbvVar.f281397b;
        String str4 = zbvVar.f281399d;
        String str5 = zbvVar.f281400e;
        zq50 zq50Var = mb81Var;
        if ((i & 32) != 0) {
            zq50Var = zbvVar.f281401f;
        }
        tbv tbvVar = zbvVar.f281402g;
        lw00 lw00Var = zbvVar.f281403h;
        zbvVar.getClass();
        return new zbv(str2, str3, str, str4, str5, zq50Var, tbvVar, lw00Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbv)) {
            return false;
        }
        zbv zbvVar = (zbv) obj;
        return wj50.m88271j(this.f281396a, zbvVar.f281396a) && wj50.m88271j(this.f281397b, zbvVar.f281397b) && wj50.m88271j(this.f281398c, zbvVar.f281398c) && wj50.m88271j(this.f281399d, zbvVar.f281399d) && wj50.m88271j(this.f281400e, zbvVar.f281400e) && wj50.m88271j(this.f281401f, zbvVar.f281401f) && wj50.m88271j(this.f281402g, zbvVar.f281402g) && wj50.m88271j(this.f281403h, zbvVar.f281403h);
    }

    public final int hashCode() {
        int iHashCode = (this.f281401f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f281396a.hashCode() * 31, 31, this.f281397b), 31, this.f281398c), 31, this.f281399d), 31, this.f281400e)) * 31;
        tbv tbvVar = this.f281402g;
        int iHashCode2 = (iHashCode + (tbvVar == null ? 0 : tbvVar.hashCode())) * 31;
        lw00 lw00Var = this.f281403h;
        return iHashCode2 + (lw00Var != null ? lw00Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f281396a);
        parcel.writeString(this.f281397b);
        parcel.writeString(this.f281398c);
        parcel.writeString(this.f281399d);
        parcel.writeString(this.f281400e);
        parcel.writeParcelable(this.f281401f, i);
        parcel.writeParcelable(this.f281402g, i);
        lw00 lw00Var = this.f281403h;
        if (lw00Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lw00Var.writeToParcel(parcel, i);
        }
    }
}
