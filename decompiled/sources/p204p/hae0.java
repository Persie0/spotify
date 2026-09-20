package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hae0 implements Parcelable {
    public static final Parcelable.Creator<hae0> CREATOR = new jfd0(25);

    /* JADX INFO: renamed from: a */
    public final String f89201a;

    /* JADX INFO: renamed from: b */
    public final String f89202b;

    /* JADX INFO: renamed from: c */
    public final String f89203c;

    /* JADX INFO: renamed from: d */
    public final String f89204d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1683ax f89205e;

    /* JADX INFO: renamed from: f */
    public final int f89206f;

    /* JADX INFO: renamed from: g */
    public final int f89207g;

    /* JADX INFO: renamed from: h */
    public final boolean f89208h;

    public hae0(String str, String str2, String str3, String str4, AbstractC1683ax abstractC1683ax, int i, int i2, boolean z) {
        this.f89201a = str;
        this.f89202b = str2;
        this.f89203c = str3;
        this.f89204d = str4;
        this.f89205e = abstractC1683ax;
        this.f89206f = i;
        this.f89207g = i2;
        this.f89208h = z;
    }

    /* JADX INFO: renamed from: c */
    public static hae0 m46930c(hae0 hae0Var, AbstractC1683ax abstractC1683ax, int i, int i2) {
        String str = hae0Var.f89201a;
        String str2 = hae0Var.f89202b;
        String str3 = hae0Var.f89203c;
        String str4 = hae0Var.f89204d;
        if ((i2 & 16) != 0) {
            abstractC1683ax = hae0Var.f89205e;
        }
        AbstractC1683ax abstractC1683ax2 = abstractC1683ax;
        if ((i2 & 32) != 0) {
            i = hae0Var.f89206f;
        }
        int i3 = hae0Var.f89207g;
        boolean z = hae0Var.f89208h;
        hae0Var.getClass();
        return new hae0(str, str2, str3, str4, abstractC1683ax2, i, i3, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hae0)) {
            return false;
        }
        hae0 hae0Var = (hae0) obj;
        return wj50.m88271j(this.f89201a, hae0Var.f89201a) && wj50.m88271j(this.f89202b, hae0Var.f89202b) && wj50.m88271j(this.f89203c, hae0Var.f89203c) && wj50.m88271j(this.f89204d, hae0Var.f89204d) && wj50.m88271j(this.f89205e, hae0Var.f89205e) && this.f89206f == hae0Var.f89206f && this.f89207g == hae0Var.f89207g && this.f89208h == hae0Var.f89208h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89208h) + mt60.m62800g(this.f89207g, f710.m40938f(this.f89206f, (this.f89205e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f89201a.hashCode() * 31, 31, this.f89202b), 31, this.f89203c), 31, this.f89204d)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f89201a);
        parcel.writeString(this.f89202b);
        parcel.writeString(this.f89203c);
        parcel.writeString(this.f89204d);
        parcel.writeParcelable(this.f89205e, i);
        int i2 = this.f89206f;
        if (i2 == 1) {
            str = "LOADING";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "READY";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f89207g);
        parcel.writeInt(this.f89208h ? 1 : 0);
    }
}
