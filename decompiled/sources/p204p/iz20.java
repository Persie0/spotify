package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class iz20 extends vz20 {
    public static final Parcelable.Creator<iz20> CREATOR = new t320(26);

    /* JADX INFO: renamed from: a */
    public final String f107115a;

    /* JADX INFO: renamed from: b */
    public final String f107116b;

    /* JADX INFO: renamed from: c */
    public final String f107117c;

    /* JADX INFO: renamed from: d */
    public final String f107118d;

    /* JADX INFO: renamed from: e */
    public final List f107119e;

    public iz20(String str, String str2, String str3, String str4, List list) {
        this.f107115a = str;
        this.f107116b = str2;
        this.f107117c = str3;
        this.f107118d = str4;
        this.f107119e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz20)) {
            return false;
        }
        iz20 iz20Var = (iz20) obj;
        return wj50.m88271j(this.f107115a, iz20Var.f107115a) && wj50.m88271j(this.f107116b, iz20Var.f107116b) && wj50.m88271j(this.f107117c, iz20Var.f107117c) && wj50.m88271j(this.f107118d, iz20Var.f107118d) && wj50.m88271j(this.f107119e, iz20Var.f107119e);
    }

    @Override // p204p.vz20
    public final String getUri() {
        return this.f107115a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f107115a.hashCode() * 31, 31, this.f107116b);
        String str = this.f107117c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f107118d;
        return this.f107119e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f107115a);
        parcel.writeString(this.f107116b);
        parcel.writeString(this.f107117c);
        parcel.writeString(this.f107118d);
        parcel.writeStringList(this.f107119e);
    }
}
