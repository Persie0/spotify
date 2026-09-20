package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zrx0 implements jsx0 {
    public static final Parcelable.Creator<zrx0> CREATOR = new xxw0(27);

    /* JADX INFO: renamed from: a */
    public final String f285773a;

    /* JADX INFO: renamed from: b */
    public final String f285774b;

    /* JADX INFO: renamed from: c */
    public final String f285775c;

    public zrx0(String str, String str2, String str3) {
        this.f285773a = str;
        this.f285774b = str2;
        this.f285775c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrx0)) {
            return false;
        }
        zrx0 zrx0Var = (zrx0) obj;
        return wj50.m88271j(this.f285773a, zrx0Var.f285773a) && wj50.m88271j(this.f285774b, zrx0Var.f285774b) && wj50.m88271j(this.f285775c, zrx0Var.f285775c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f285773a.hashCode() * 31, 31, this.f285774b);
        String str = this.f285775c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285773a);
        parcel.writeString(this.f285774b);
        parcel.writeString(this.f285775c);
    }
}
