package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class xn3 implements yn3 {
    public static final Parcelable.Creator<xn3> CREATOR = new bc3(13);

    /* JADX INFO: renamed from: a */
    public final String f263501a;

    /* JADX INFO: renamed from: b */
    public final String f263502b;

    /* JADX INFO: renamed from: c */
    public final boolean f263503c;

    public xn3(String str, String str2, boolean z) {
        this.f263501a = str;
        this.f263502b = str2;
        this.f263503c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn3)) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return wj50.m88271j(this.f263501a, xn3Var.f263501a) && wj50.m88271j(this.f263502b, xn3Var.f263502b) && this.f263503c == xn3Var.f263503c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263503c) + s571.m77243b(this.f263501a.hashCode() * 31, 31, this.f263502b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f263501a);
        parcel.writeString(this.f263502b);
        parcel.writeInt(this.f263503c ? 1 : 0);
    }
}
