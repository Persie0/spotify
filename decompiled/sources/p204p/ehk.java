package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ehk implements fhk {
    public static final Parcelable.Creator<ehk> CREATOR = new kck(7);

    /* JADX INFO: renamed from: a */
    public final String f59607a;

    /* JADX INFO: renamed from: b */
    public final String f59608b;

    /* JADX INFO: renamed from: c */
    public final String f59609c;

    /* JADX INFO: renamed from: d */
    public final String f59610d;

    /* JADX INFO: renamed from: e */
    public final String f59611e;

    public ehk(String str, String str2, String str3, String str4, String str5) {
        this.f59607a = str;
        this.f59608b = str2;
        this.f59609c = str3;
        this.f59610d = str4;
        this.f59611e = str5;
    }

    @Override // p204p.fhk
    /* JADX INFO: renamed from: X */
    public final String mo36047X() {
        return this.f59611e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.fhk
    /* JADX INFO: renamed from: e */
    public final String mo36049e() {
        return this.f59607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehk)) {
            return false;
        }
        ehk ehkVar = (ehk) obj;
        return wj50.m88271j(this.f59607a, ehkVar.f59607a) && wj50.m88271j(this.f59608b, ehkVar.f59608b) && wj50.m88271j(this.f59609c, ehkVar.f59609c) && wj50.m88271j(this.f59610d, ehkVar.f59610d) && wj50.m88271j(this.f59611e, ehkVar.f59611e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f59607a.hashCode() * 31, 31, this.f59608b), 31, this.f59609c);
        String str = this.f59610d;
        return this.f59611e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // p204p.fhk
    /* JADX INFO: renamed from: o */
    public final String mo36050o() {
        return this.f59609c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59607a);
        parcel.writeString(this.f59608b);
        parcel.writeString(this.f59609c);
        parcel.writeString(this.f59610d);
        parcel.writeString(this.f59611e);
    }
}
