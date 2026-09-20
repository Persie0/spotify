package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class v01 extends z01 implements c01 {
    public static final Parcelable.Creator<v01> CREATOR = new zz0(20);

    /* JADX INFO: renamed from: a */
    public final String f235873a;

    /* JADX INFO: renamed from: b */
    public final String f235874b;

    public v01(String str, String str2) {
        this.f235873a = str;
        this.f235874b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return wj50.m88271j(this.f235873a, v01Var.f235873a) && wj50.m88271j(this.f235874b, v01Var.f235874b);
    }

    @Override // p204p.c01
    /* JADX INFO: renamed from: g */
    public final String mo31065g() {
        return this.f235874b;
    }

    @Override // p204p.c01
    public final String getTitle() {
        return this.f235873a;
    }

    public final int hashCode() {
        return this.f235874b.hashCode() + (this.f235873a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f235873a);
        parcel.writeString(this.f235874b);
    }
}
