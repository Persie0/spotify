package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class isx0 implements jsx0 {
    public static final Parcelable.Creator<isx0> CREATOR = new csx0(5);

    /* JADX INFO: renamed from: a */
    public final int f105327a;

    /* JADX INFO: renamed from: b */
    public final String f105328b;

    /* JADX INFO: renamed from: c */
    public final String f105329c;

    /* JADX INFO: renamed from: d */
    public final boolean f105330d;

    /* JADX INFO: renamed from: e */
    public final boolean f105331e;

    public isx0(int i, String str, String str2, boolean z, boolean z2) {
        this.f105327a = i;
        this.f105328b = str;
        this.f105329c = str2;
        this.f105330d = z;
        this.f105331e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isx0)) {
            return false;
        }
        isx0 isx0Var = (isx0) obj;
        return this.f105327a == isx0Var.f105327a && wj50.m88271j(this.f105328b, isx0Var.f105328b) && wj50.m88271j(this.f105329c, isx0Var.f105329c) && this.f105330d == isx0Var.f105330d && this.f105331e == isx0Var.f105331e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105331e) + s571.m77245d(s571.m77243b(s571.m77243b(Integer.hashCode(this.f105327a) * 31, 31, this.f105328b), 31, this.f105329c), 31, this.f105330d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f105327a);
        parcel.writeString(this.f105328b);
        parcel.writeString(this.f105329c);
        parcel.writeInt(this.f105330d ? 1 : 0);
        parcel.writeInt(this.f105331e ? 1 : 0);
    }
}
