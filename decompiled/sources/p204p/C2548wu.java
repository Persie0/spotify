package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.wu */
/* JADX INFO: loaded from: classes4.dex */
public final class C2548wu implements InterfaceC2626yu {
    public static final Parcelable.Creator<C2548wu> CREATOR = new C2267ps(4);

    /* JADX INFO: renamed from: a */
    public final String f255041a;

    /* JADX INFO: renamed from: b */
    public final String f255042b;

    /* JADX INFO: renamed from: c */
    public final String f255043c;

    public C2548wu(String str, String str2, String str3) {
        this.f255041a = str;
        this.f255042b = str2;
        this.f255043c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2548wu)) {
            return false;
        }
        C2548wu c2548wu = (C2548wu) obj;
        return wj50.m88271j(this.f255041a, c2548wu.f255041a) && wj50.m88271j(this.f255042b, c2548wu.f255042b) && wj50.m88271j(this.f255043c, c2548wu.f255043c);
    }

    public final int hashCode() {
        int iHashCode = this.f255041a.hashCode() * 31;
        String str = this.f255042b;
        return this.f255043c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f255041a);
        parcel.writeString(this.f255042b);
        parcel.writeString(this.f255043c);
    }
}
