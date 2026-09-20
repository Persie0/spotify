package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zdc0 implements Parcelable {
    public static final Parcelable.Creator<zdc0> CREATOR = new f4c0(5);

    /* JADX INFO: renamed from: a */
    public final boolean f281675a;

    /* JADX INFO: renamed from: b */
    public final boolean f281676b;

    /* JADX INFO: renamed from: c */
    public final String f281677c;

    /* JADX INFO: renamed from: d */
    public final boolean f281678d;

    /* JADX INFO: renamed from: e */
    public final jgq0 f281679e;

    /* JADX INFO: renamed from: f */
    public final boolean f281680f;

    /* JADX INFO: renamed from: g */
    public final boolean f281681g;

    public zdc0(boolean z, boolean z2, String str, boolean z3, jgq0 jgq0Var, boolean z4, boolean z5) {
        this.f281675a = z;
        this.f281676b = z2;
        this.f281677c = str;
        this.f281678d = z3;
        this.f281679e = jgq0Var;
        this.f281680f = z4;
        this.f281681g = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdc0)) {
            return false;
        }
        zdc0 zdc0Var = (zdc0) obj;
        return this.f281675a == zdc0Var.f281675a && this.f281676b == zdc0Var.f281676b && wj50.m88271j(this.f281677c, zdc0Var.f281677c) && this.f281678d == zdc0Var.f281678d && wj50.m88271j(this.f281679e, zdc0Var.f281679e) && this.f281680f == zdc0Var.f281680f && this.f281681g == zdc0Var.f281681g;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f281675a) * 31, 31, this.f281676b);
        String str = this.f281677c;
        int iM77245d2 = s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f281678d);
        jgq0 jgq0Var = this.f281679e;
        return Boolean.hashCode(this.f281681g) + s571.m77245d((iM77245d2 + (jgq0Var != null ? jgq0Var.hashCode() : 0)) * 31, 31, this.f281680f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f281675a ? 1 : 0);
        parcel.writeInt(this.f281676b ? 1 : 0);
        parcel.writeString(this.f281677c);
        parcel.writeInt(this.f281678d ? 1 : 0);
        parcel.writeParcelable(this.f281679e, i);
        parcel.writeInt(this.f281680f ? 1 : 0);
        parcel.writeInt(this.f281681g ? 1 : 0);
    }
}
