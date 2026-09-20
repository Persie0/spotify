package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yry0 extends asy0 {
    public static final Parcelable.Creator<yry0> CREATOR = new lpy0(1);

    /* JADX INFO: renamed from: a */
    public final String f275616a;

    /* JADX INFO: renamed from: b */
    public final String f275617b;

    /* JADX INFO: renamed from: c */
    public final String f275618c;

    /* JADX INFO: renamed from: d */
    public final String f275619d;

    /* JADX INFO: renamed from: e */
    public final boolean f275620e;

    public yry0(String str, String str2, String str3, String str4, boolean z) {
        this.f275616a = str;
        this.f275617b = str2;
        this.f275618c = str3;
        this.f275619d = str4;
        this.f275620e = z;
    }

    /* JADX INFO: renamed from: c */
    public static yry0 m94422c(yry0 yry0Var, boolean z) {
        return new yry0(yry0Var.f275616a, yry0Var.f275617b, yry0Var.f275618c, yry0Var.f275619d, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yry0)) {
            return false;
        }
        yry0 yry0Var = (yry0) obj;
        return wj50.m88271j(this.f275616a, yry0Var.f275616a) && wj50.m88271j(this.f275617b, yry0Var.f275617b) && wj50.m88271j(this.f275618c, yry0Var.f275618c) && wj50.m88271j(this.f275619d, yry0Var.f275619d) && this.f275620e == yry0Var.f275620e;
    }

    @Override // p204p.asy0
    public final String getUri() {
        return this.f275617b;
    }

    @Override // p204p.asy0
    public final String getUuid() {
        return this.f275616a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f275616a.hashCode() * 31, 31, this.f275617b), 31, this.f275618c);
        String str = this.f275619d;
        return Boolean.hashCode(this.f275620e) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f275616a);
        parcel.writeString(this.f275617b);
        parcel.writeString(this.f275618c);
        parcel.writeString(this.f275619d);
        parcel.writeInt(this.f275620e ? 1 : 0);
    }
}
