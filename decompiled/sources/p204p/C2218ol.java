package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ol */
/* JADX INFO: loaded from: classes8.dex */
public final class C2218ol extends AbstractC2500vl {
    public static final Parcelable.Creator<C2218ol> CREATOR = new C2047kc(20);

    /* JADX INFO: renamed from: a */
    public final String f166701a;

    /* JADX INFO: renamed from: b */
    public final String f166702b;

    /* JADX INFO: renamed from: c */
    public final String f166703c;

    public C2218ol(String str, String str2, String str3) {
        this.f166701a = str;
        this.f166702b = str2;
        this.f166703c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2218ol)) {
            return false;
        }
        C2218ol c2218ol = (C2218ol) obj;
        return wj50.m88271j(this.f166701a, c2218ol.f166701a) && wj50.m88271j(this.f166702b, c2218ol.f166702b) && wj50.m88271j(this.f166703c, c2218ol.f166703c);
    }

    public final int hashCode() {
        return this.f166703c.hashCode() + s571.m77243b(this.f166701a.hashCode() * 31, 31, this.f166702b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f166701a);
        parcel.writeString(this.f166702b);
        parcel.writeString(this.f166703c);
    }
}
