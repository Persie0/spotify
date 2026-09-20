package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class cu01 extends AbstractC2206o9 {
    public static final Parcelable.Creator<cu01> CREATOR = new sp01(20);

    /* JADX INFO: renamed from: a */
    public final Uri f42011a;

    /* JADX INFO: renamed from: b */
    public final String f42012b;

    public cu01(Uri uri, String str) {
        this.f42011a = uri;
        this.f42012b = str;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu01)) {
            return false;
        }
        cu01 cu01Var = (cu01) obj;
        return wj50.m88271j(this.f42011a, cu01Var.f42011a) && wj50.m88271j(this.f42012b, cu01Var.f42012b);
    }

    public final int hashCode() {
        return this.f42012b.hashCode() + (this.f42011a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42011a, i);
        parcel.writeString(this.f42012b);
    }
}
