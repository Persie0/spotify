package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class hqy implements kqy {
    public static final Parcelable.Creator<hqy> CREATOR = new eqy(2);

    /* JADX INFO: renamed from: a */
    public final String f94268a;

    /* JADX INFO: renamed from: b */
    public final String f94269b;

    public hqy(String str, String str2) {
        this.f94268a = str;
        this.f94269b = str2;
    }

    @Override // p204p.kqy
    /* JADX INFO: renamed from: V */
    public final String mo36688V() {
        return this.f94269b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqy)) {
            return false;
        }
        hqy hqyVar = (hqy) obj;
        return wj50.m88271j(this.f94268a, hqyVar.f94268a) && wj50.m88271j(this.f94269b, hqyVar.f94269b);
    }

    @Override // p204p.kqy
    public final String getEventId() {
        return this.f94268a;
    }

    public final int hashCode() {
        return this.f94269b.hashCode() + (this.f94268a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f94268a);
        parcel.writeString(this.f94269b);
    }
}
