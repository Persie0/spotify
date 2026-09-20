package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zrm0 extends ksm0 {
    public static final Parcelable.Creator<zrm0> CREATOR = new cpl0(19);

    /* JADX INFO: renamed from: a */
    public final String f285707a;

    /* JADX INFO: renamed from: b */
    public final String f285708b;

    public zrm0(String str, String str2) {
        this.f285707a = str;
        this.f285708b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrm0)) {
            return false;
        }
        zrm0 zrm0Var = (zrm0) obj;
        return wj50.m88271j(this.f285707a, zrm0Var.f285707a) && wj50.m88271j(this.f285708b, zrm0Var.f285708b);
    }

    public final int hashCode() {
        return this.f285708b.hashCode() + (this.f285707a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f285707a);
        parcel.writeString(this.f285708b);
    }
}
