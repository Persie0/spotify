package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class hbj implements ibj {
    public static final Parcelable.Creator<hbj> CREATOR = new f2i(27);

    /* JADX INFO: renamed from: a */
    public final String f89551a;

    /* JADX INFO: renamed from: b */
    public final String f89552b;

    public hbj(String str, String str2) {
        this.f89551a = str;
        this.f89552b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbj)) {
            return false;
        }
        hbj hbjVar = (hbj) obj;
        return wj50.m88271j(this.f89551a, hbjVar.f89551a) && wj50.m88271j(this.f89552b, hbjVar.f89552b);
    }

    public final int hashCode() {
        return this.f89552b.hashCode() + (this.f89551a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f89551a);
        parcel.writeString(this.f89552b);
    }
}
