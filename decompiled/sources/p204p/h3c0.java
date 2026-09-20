package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class h3c0 implements o2c0 {
    public static final Parcelable.Creator<h3c0> CREATOR = new apb0(27);

    /* JADX INFO: renamed from: X */
    public final boolean f87201X;

    /* JADX INFO: renamed from: Y */
    public final boolean f87202Y;

    /* JADX INFO: renamed from: a */
    public final String f87203a;

    /* JADX INFO: renamed from: b */
    public final String f87204b;

    /* JADX INFO: renamed from: c */
    public final String f87205c;

    /* JADX INFO: renamed from: d */
    public final String f87206d;

    /* JADX INFO: renamed from: e */
    public final String f87207e;

    /* JADX INFO: renamed from: f */
    public final String f87208f;

    /* JADX INFO: renamed from: g */
    public final boolean f87209g;

    /* JADX INFO: renamed from: h */
    public final boolean f87210h;

    /* JADX INFO: renamed from: i */
    public final boolean f87211i;

    /* JADX INFO: renamed from: t */
    public final boolean f87212t;

    public h3c0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f87203a = str;
        this.f87204b = str2;
        this.f87205c = str3;
        this.f87206d = str4;
        this.f87207e = str5;
        this.f87208f = str6;
        this.f87209g = z;
        this.f87210h = z2;
        this.f87211i = z3;
        this.f87212t = z4;
        this.f87201X = z5;
        this.f87202Y = z6;
    }

    /* JADX INFO: renamed from: c */
    public static h3c0 m46518c(h3c0 h3c0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str = h3c0Var.f87203a;
        String str2 = h3c0Var.f87204b;
        String str3 = h3c0Var.f87205c;
        String str4 = h3c0Var.f87206d;
        String str5 = h3c0Var.f87207e;
        String str6 = h3c0Var.f87208f;
        boolean z5 = h3c0Var.f87209g;
        boolean z6 = h3c0Var.f87210h;
        if ((i & 256) != 0) {
            z = h3c0Var.f87211i;
        }
        return new h3c0(str, str2, str3, str4, str5, str6, z5, z6, z, (i & 512) != 0 ? h3c0Var.f87212t : z2, (i & 1024) != 0 ? h3c0Var.f87201X : z3, (i & 2048) != 0 ? h3c0Var.f87202Y : z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3c0)) {
            return false;
        }
        h3c0 h3c0Var = (h3c0) obj;
        return wj50.m88271j(this.f87203a, h3c0Var.f87203a) && wj50.m88271j(this.f87204b, h3c0Var.f87204b) && wj50.m88271j(this.f87205c, h3c0Var.f87205c) && wj50.m88271j(this.f87206d, h3c0Var.f87206d) && wj50.m88271j(this.f87207e, h3c0Var.f87207e) && wj50.m88271j(this.f87208f, h3c0Var.f87208f) && this.f87209g == h3c0Var.f87209g && this.f87210h == h3c0Var.f87210h && this.f87211i == h3c0Var.f87211i && this.f87212t == h3c0Var.f87212t && this.f87201X == h3c0Var.f87201X && this.f87202Y == h3c0Var.f87202Y;
    }

    @Override // p204p.o2c0
    public final String getUri() {
        return this.f87204b;
    }

    @Override // p204p.o2c0
    public final String getUuid() {
        return this.f87203a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f87203a.hashCode() * 31, 31, this.f87204b), 31, this.f87205c);
        String str = this.f87206d;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f87207e);
        String str2 = this.f87208f;
        return Boolean.hashCode(this.f87202Y) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77243b2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f87209g), 31, this.f87210h), 31, this.f87211i), 31, this.f87212t), 31, this.f87201X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87203a);
        parcel.writeString(this.f87204b);
        parcel.writeString(this.f87205c);
        parcel.writeString(this.f87206d);
        parcel.writeString(this.f87207e);
        parcel.writeString(this.f87208f);
        parcel.writeInt(this.f87209g ? 1 : 0);
        parcel.writeInt(this.f87210h ? 1 : 0);
        parcel.writeInt(this.f87211i ? 1 : 0);
        parcel.writeInt(this.f87212t ? 1 : 0);
        parcel.writeInt(this.f87201X ? 1 : 0);
        parcel.writeInt(this.f87202Y ? 1 : 0);
    }
}
