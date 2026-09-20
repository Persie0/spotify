package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class qsj0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f192133a;

    /* JADX INFO: renamed from: b */
    public final gw71 f192134b;

    /* JADX INFO: renamed from: c */
    public final String f192135c;

    /* JADX INFO: renamed from: d */
    public final vsj0 f192136d;

    /* JADX INFO: renamed from: e */
    public final tvj0 f192137e;

    /* JADX INFO: renamed from: f */
    public final boolean f192138f;

    /* JADX INFO: renamed from: g */
    public final String f192139g;

    /* JADX INFO: renamed from: h */
    public final g0f0 f192140h;

    /* JADX INFO: renamed from: i */
    public final String f192141i;
    public static final lsj0 Companion = new lsj0();
    public static final Parcelable.Creator<qsj0> CREATOR = new luh0(3);

    /* JADX INFO: renamed from: t */
    public static final fr70[] f192132t = {null, q3d0.m72078I(2, ori0.f168571L0), null, null, q3d0.m72078I(2, ori0.f168572M0), null, null, null, null};

    public /* synthetic */ qsj0(int i, String str, gw71 gw71Var, String str2, vsj0 vsj0Var, tvj0 tvj0Var, boolean z, String str3, g0f0 g0f0Var, String str4) {
        if (511 != (i & 511)) {
            edo.m38617p(i, 511, jsj0.f115506a.getDescriptor());
            throw null;
        }
        this.f192133a = str;
        this.f192134b = gw71Var;
        this.f192135c = str2;
        this.f192136d = vsj0Var;
        this.f192137e = tvj0Var;
        this.f192138f = z;
        this.f192139g = str3;
        this.f192140h = g0f0Var;
        this.f192141i = str4;
    }

    /* JADX INFO: renamed from: c */
    public static qsj0 m73752c(qsj0 qsj0Var) {
        String str = qsj0Var.f192133a;
        gw71 gw71Var = qsj0Var.f192134b;
        String str2 = qsj0Var.f192135c;
        vsj0 vsj0Var = qsj0Var.f192136d;
        tvj0 tvj0Var = qsj0Var.f192137e;
        String str3 = qsj0Var.f192139g;
        g0f0 g0f0Var = qsj0Var.f192140h;
        String str4 = qsj0Var.f192141i;
        qsj0Var.getClass();
        return new qsj0(str, gw71Var, str2, vsj0Var, tvj0Var, false, str3, g0f0Var, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsj0)) {
            return false;
        }
        qsj0 qsj0Var = (qsj0) obj;
        return wj50.m88271j(this.f192133a, qsj0Var.f192133a) && wj50.m88271j(this.f192134b, qsj0Var.f192134b) && wj50.m88271j(this.f192135c, qsj0Var.f192135c) && wj50.m88271j(this.f192136d, qsj0Var.f192136d) && wj50.m88271j(this.f192137e, qsj0Var.f192137e) && this.f192138f == qsj0Var.f192138f && wj50.m88271j(this.f192139g, qsj0Var.f192139g) && wj50.m88271j(this.f192140h, qsj0Var.f192140h) && wj50.m88271j(this.f192141i, qsj0Var.f192141i);
    }

    public final int hashCode() {
        return this.f192141i.hashCode() + ((this.f192140h.hashCode() + s571.m77243b(s571.m77245d((this.f192137e.hashCode() + ((this.f192136d.hashCode() + s571.m77243b((this.f192134b.hashCode() + (this.f192133a.hashCode() * 31)) * 31, 31, this.f192135c)) * 31)) * 31, 31, this.f192138f), 31, this.f192139g)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f192133a);
        parcel.writeParcelable(this.f192134b, i);
        parcel.writeString(this.f192135c);
        this.f192136d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f192137e, i);
        parcel.writeInt(this.f192138f ? 1 : 0);
        parcel.writeString(this.f192139g);
        this.f192140h.writeToParcel(parcel, i);
        parcel.writeString(this.f192141i);
    }

    public qsj0(String str, gw71 gw71Var, String str2, vsj0 vsj0Var, tvj0 tvj0Var, boolean z, String str3, g0f0 g0f0Var, String str4) {
        this.f192133a = str;
        this.f192134b = gw71Var;
        this.f192135c = str2;
        this.f192136d = vsj0Var;
        this.f192137e = tvj0Var;
        this.f192138f = z;
        this.f192139g = str3;
        this.f192140h = g0f0Var;
        this.f192141i = str4;
    }
}
