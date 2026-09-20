package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ss51 implements Parcelable {
    public static final Parcelable.Creator<ss51> CREATOR = new nc51(24);

    /* JADX INFO: renamed from: a */
    public final String f213492a;

    /* JADX INFO: renamed from: b */
    public final String f213493b;

    /* JADX INFO: renamed from: c */
    public final String f213494c;

    /* JADX INFO: renamed from: d */
    public final d0n0 f213495d;

    /* JADX INFO: renamed from: e */
    public final b370 f213496e;

    /* JADX INFO: renamed from: f */
    public final String f213497f;

    /* JADX INFO: renamed from: g */
    public final dlx f213498g;

    public ss51(String str, String str2, String str3, d0n0 d0n0Var, b370 b370Var, String str4, dlx dlxVar) {
        this.f213492a = str;
        this.f213493b = str2;
        this.f213494c = str3;
        this.f213495d = d0n0Var;
        this.f213496e = b370Var;
        this.f213497f = str4;
        this.f213498g = dlxVar;
    }

    /* JADX INFO: renamed from: c */
    public final b370 m79187c() {
        return this.f213496e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss51)) {
            return false;
        }
        ss51 ss51Var = (ss51) obj;
        return wj50.m88271j(this.f213492a, ss51Var.f213492a) && wj50.m88271j(this.f213493b, ss51Var.f213493b) && wj50.m88271j(this.f213494c, ss51Var.f213494c) && wj50.m88271j(this.f213495d, ss51Var.f213495d) && wj50.m88271j(this.f213496e, ss51Var.f213496e) && wj50.m88271j(this.f213497f, ss51Var.f213497f) && wj50.m88271j(this.f213498g, ss51Var.f213498g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f213492a.hashCode() * 31, 31, this.f213493b);
        String str = this.f213494c;
        int iHashCode = (this.f213496e.hashCode() + ((this.f213495d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f213497f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dlx dlxVar = this.f213498g;
        return iHashCode2 + (dlxVar != null ? dlxVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f213492a);
        parcel.writeString(this.f213493b);
        parcel.writeString(this.f213494c);
        parcel.writeParcelable(this.f213495d, i);
        parcel.writeParcelable(this.f213496e, i);
        parcel.writeString(this.f213497f);
        parcel.writeParcelable(this.f213498g, i);
    }
}
