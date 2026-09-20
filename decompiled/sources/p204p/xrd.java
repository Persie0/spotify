package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xrd implements Parcelable {
    public static final Parcelable.Creator<xrd> CREATOR = new fjd(10);

    /* JADX INFO: renamed from: a */
    public final String f265327a;

    /* JADX INFO: renamed from: b */
    public final String f265328b;

    /* JADX INFO: renamed from: c */
    public final String f265329c;

    public xrd(String str, String str2, String str3) {
        this.f265327a = str;
        this.f265328b = str2;
        this.f265329c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m91930c() {
        return this.f265327a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrd)) {
            return false;
        }
        xrd xrdVar = (xrd) obj;
        return wj50.m88271j(this.f265327a, xrdVar.f265327a) && wj50.m88271j(this.f265328b, xrdVar.f265328b) && wj50.m88271j(this.f265329c, xrdVar.f265329c);
    }

    /* JADX INFO: renamed from: g */
    public final String m91931g() {
        return this.f265329c;
    }

    /* JADX INFO: renamed from: h */
    public final String m91932h() {
        return this.f265328b;
    }

    public final int hashCode() {
        return this.f265329c.hashCode() + s571.m77243b(this.f265327a.hashCode() * 31, 31, this.f265328b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f265327a);
        parcel.writeString(this.f265328b);
        parcel.writeString(this.f265329c);
    }
}
