package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zsk0 implements atk0 {
    public static final Parcelable.Creator<zsk0> CREATOR = new fgj0(25);

    /* JADX INFO: renamed from: a */
    public final boolean f285960a;

    /* JADX INFO: renamed from: b */
    public final String f285961b;

    /* JADX INFO: renamed from: c */
    public final String f285962c;

    /* JADX INFO: renamed from: d */
    public final boolean f285963d;

    public zsk0(String str, boolean z, String str2, boolean z2) {
        this.f285960a = z;
        this.f285961b = str;
        this.f285962c = str2;
        this.f285963d = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsk0)) {
            return false;
        }
        zsk0 zsk0Var = (zsk0) obj;
        return this.f285960a == zsk0Var.f285960a && wj50.m88271j(this.f285961b, zsk0Var.f285961b) && wj50.m88271j(this.f285962c, zsk0Var.f285962c) && this.f285963d == zsk0Var.f285963d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285963d) + s571.m77243b(s571.m77243b(Boolean.hashCode(this.f285960a) * 31, 31, this.f285961b), 31, this.f285962c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f285960a ? 1 : 0);
        parcel.writeString(this.f285961b);
        parcel.writeString(this.f285962c);
        parcel.writeInt(this.f285963d ? 1 : 0);
    }
}
