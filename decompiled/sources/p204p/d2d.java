package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class d2d implements Parcelable {
    public static final Parcelable.Creator<d2d> CREATOR = new qvc(11);

    /* JADX INFO: renamed from: a */
    public final String f44537a;

    /* JADX INFO: renamed from: b */
    public final String f44538b;

    /* JADX INFO: renamed from: c */
    public final String f44539c;

    public d2d(String str, String str2, String str3) {
        this.f44537a = str;
        this.f44538b = str2;
        this.f44539c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m34690c() {
        return this.f44538b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2d)) {
            return false;
        }
        d2d d2dVar = (d2d) obj;
        return wj50.m88271j(this.f44537a, d2dVar.f44537a) && wj50.m88271j(this.f44538b, d2dVar.f44538b) && wj50.m88271j(this.f44539c, d2dVar.f44539c);
    }

    /* JADX INFO: renamed from: g */
    public final String m34691g() {
        return this.f44537a;
    }

    /* JADX INFO: renamed from: h */
    public final String m34692h() {
        return this.f44539c;
    }

    public final int hashCode() {
        return this.f44539c.hashCode() + s571.m77243b(this.f44537a.hashCode() * 31, 31, this.f44538b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44537a);
        parcel.writeString(this.f44538b);
        parcel.writeString(this.f44539c);
    }
}
