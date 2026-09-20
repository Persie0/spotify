package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class pxk0 implements Parcelable {
    public static final Parcelable.Creator<pxk0> CREATOR = new fgj0(29);

    /* JADX INFO: renamed from: a */
    public final String f182325a;

    /* JADX INFO: renamed from: b */
    public final String f182326b;

    /* JADX INFO: renamed from: c */
    public final String f182327c;

    /* JADX INFO: renamed from: d */
    public final boolean f182328d;

    /* JADX INFO: renamed from: e */
    public final boolean f182329e;

    public pxk0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f182325a = str;
        this.f182326b = str2;
        this.f182327c = str3;
        this.f182328d = z;
        this.f182329e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxk0)) {
            return false;
        }
        pxk0 pxk0Var = (pxk0) obj;
        return wj50.m88271j(this.f182325a, pxk0Var.f182325a) && wj50.m88271j(this.f182326b, pxk0Var.f182326b) && wj50.m88271j(this.f182327c, pxk0Var.f182327c) && this.f182328d == pxk0Var.f182328d && this.f182329e == pxk0Var.f182329e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f182325a.hashCode() * 31, 31, this.f182326b);
        String str = this.f182327c;
        return Boolean.hashCode(this.f182329e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f182328d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f182325a);
        parcel.writeString(this.f182326b);
        parcel.writeString(this.f182327c);
        parcel.writeInt(this.f182328d ? 1 : 0);
        parcel.writeInt(this.f182329e ? 1 : 0);
    }
}
