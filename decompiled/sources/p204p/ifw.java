package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ifw implements Parcelable {
    public static final Parcelable.Creator<ifw> CREATOR = new bwv(23);

    /* JADX INFO: renamed from: a */
    public final String f101832a;

    /* JADX INFO: renamed from: b */
    public final String f101833b;

    /* JADX INFO: renamed from: c */
    public final String f101834c;

    /* JADX INFO: renamed from: d */
    public final String f101835d;

    /* JADX INFO: renamed from: e */
    public final boolean f101836e;

    public ifw(String str, String str2, String str3, String str4, boolean z) {
        this.f101832a = str;
        this.f101833b = str2;
        this.f101834c = str3;
        this.f101835d = str4;
        this.f101836e = z;
    }

    /* JADX INFO: renamed from: c */
    public static ifw m50455c(ifw ifwVar, boolean z) {
        String str = ifwVar.f101832a;
        String str2 = ifwVar.f101833b;
        String str3 = ifwVar.f101834c;
        String str4 = ifwVar.f101835d;
        ifwVar.getClass();
        return new ifw(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifw)) {
            return false;
        }
        ifw ifwVar = (ifw) obj;
        return wj50.m88271j(this.f101832a, ifwVar.f101832a) && wj50.m88271j(this.f101833b, ifwVar.f101833b) && wj50.m88271j(this.f101834c, ifwVar.f101834c) && wj50.m88271j(this.f101835d, ifwVar.f101835d) && this.f101836e == ifwVar.f101836e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101836e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f101832a.hashCode() * 31, 31, this.f101833b), 31, this.f101834c), 31, this.f101835d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f101832a);
        parcel.writeString(this.f101833b);
        parcel.writeString(this.f101834c);
        parcel.writeString(this.f101835d);
        parcel.writeInt(this.f101836e ? 1 : 0);
    }
}
