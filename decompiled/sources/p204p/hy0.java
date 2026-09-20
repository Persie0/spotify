package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class hy0 implements Parcelable {
    public static final Parcelable.Creator<hy0> CREATOR = new n6f1(2);

    /* JADX INFO: renamed from: a */
    public final rk7 f96422a;

    /* JADX INFO: renamed from: b */
    public final String f96423b;

    /* JADX INFO: renamed from: c */
    public final String f96424c;

    public hy0(String str, String str2, rk7 rk7Var) {
        this.f96422a = rk7Var;
        this.f96423b = str;
        this.f96424c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy0)) {
            return false;
        }
        hy0 hy0Var = (hy0) obj;
        return this.f96422a == hy0Var.f96422a && wj50.m88271j(this.f96423b, hy0Var.f96423b) && wj50.m88271j(this.f96424c, hy0Var.f96424c);
    }

    public final int hashCode() {
        int iHashCode = this.f96422a.hashCode() * 31;
        String str = this.f96423b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96424c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96422a.name());
        parcel.writeString(this.f96423b);
        parcel.writeString(this.f96424c);
    }
}
