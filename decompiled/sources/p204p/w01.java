package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class w01 extends z01 implements c01 {
    public static final Parcelable.Creator<w01> CREATOR = new zz0(21);

    /* JADX INFO: renamed from: a */
    public final String f246614a;

    /* JADX INFO: renamed from: b */
    public final String f246615b;

    public w01(String str, String str2) {
        this.f246614a = str;
        this.f246615b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return wj50.m88271j(this.f246614a, w01Var.f246614a) && wj50.m88271j(this.f246615b, w01Var.f246615b);
    }

    @Override // p204p.c01
    /* JADX INFO: renamed from: g */
    public final String mo31065g() {
        return this.f246615b;
    }

    @Override // p204p.c01
    public final String getTitle() {
        return this.f246614a;
    }

    public final int hashCode() {
        return this.f246615b.hashCode() + (this.f246614a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246614a);
        parcel.writeString(this.f246615b);
    }
}
