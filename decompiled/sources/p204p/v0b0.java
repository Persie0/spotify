package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v0b0 extends w0b0 {
    public static final Parcelable.Creator<v0b0> CREATOR = new l0b0(9);

    /* JADX INFO: renamed from: a */
    public final String f235955a;

    /* JADX INFO: renamed from: b */
    public final String f235956b;

    public v0b0(String str, String str2) {
        this.f235955a = str;
        this.f235956b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0b0)) {
            return false;
        }
        v0b0 v0b0Var = (v0b0) obj;
        return wj50.m88271j(this.f235955a, v0b0Var.f235955a) && wj50.m88271j(this.f235956b, v0b0Var.f235956b);
    }

    public final int hashCode() {
        return this.f235956b.hashCode() + (this.f235955a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f235955a);
        parcel.writeString(this.f235956b);
    }
}
