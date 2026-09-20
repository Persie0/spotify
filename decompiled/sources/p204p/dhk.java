package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class dhk implements fhk {
    public static final Parcelable.Creator<dhk> CREATOR = new kck(6);

    /* JADX INFO: renamed from: a */
    public final String f49121a;

    /* JADX INFO: renamed from: b */
    public final String f49122b;

    /* JADX INFO: renamed from: c */
    public final String f49123c;

    /* JADX INFO: renamed from: d */
    public final String f49124d;

    /* JADX INFO: renamed from: e */
    public final String f49125e;

    public dhk(String str, String str2, String str3, String str4, String str5) {
        this.f49121a = str;
        this.f49122b = str2;
        this.f49123c = str3;
        this.f49124d = str4;
        this.f49125e = str5;
    }

    @Override // p204p.fhk
    /* JADX INFO: renamed from: X */
    public final String mo36047X() {
        return this.f49125e;
    }

    /* JADX INFO: renamed from: c */
    public final String m36048c() {
        return this.f49124d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.fhk
    /* JADX INFO: renamed from: e */
    public final String mo36049e() {
        return this.f49121a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhk)) {
            return false;
        }
        dhk dhkVar = (dhk) obj;
        return wj50.m88271j(this.f49121a, dhkVar.f49121a) && wj50.m88271j(this.f49122b, dhkVar.f49122b) && wj50.m88271j(this.f49123c, dhkVar.f49123c) && wj50.m88271j(this.f49124d, dhkVar.f49124d) && wj50.m88271j(this.f49125e, dhkVar.f49125e);
    }

    public final String getContextUri() {
        return this.f49122b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f49121a.hashCode() * 31, 31, this.f49122b), 31, this.f49123c);
        String str = this.f49124d;
        return this.f49125e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // p204p.fhk
    /* JADX INFO: renamed from: o */
    public final String mo36050o() {
        return this.f49123c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49121a);
        parcel.writeString(this.f49122b);
        parcel.writeString(this.f49123c);
        parcel.writeString(this.f49124d);
        parcel.writeString(this.f49125e);
    }
}
