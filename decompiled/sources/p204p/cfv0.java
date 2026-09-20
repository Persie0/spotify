package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class cfv0 implements Parcelable {
    public static final Parcelable.Creator<cfv0> CREATOR = new h1v0(11);

    /* JADX INFO: renamed from: X */
    public final boolean f37457X;

    /* JADX INFO: renamed from: Y */
    public final boolean f37458Y;

    /* JADX INFO: renamed from: a */
    public final String f37459a;

    /* JADX INFO: renamed from: b */
    public final String f37460b;

    /* JADX INFO: renamed from: c */
    public final boolean f37461c;

    /* JADX INFO: renamed from: d */
    public final List f37462d;

    /* JADX INFO: renamed from: e */
    public final String f37463e;

    /* JADX INFO: renamed from: f */
    public final boolean f37464f;

    /* JADX INFO: renamed from: g */
    public final boolean f37465g;

    /* JADX INFO: renamed from: h */
    public final boolean f37466h;

    /* JADX INFO: renamed from: i */
    public final boolean f37467i;

    /* JADX INFO: renamed from: t */
    public final sro0 f37468t;

    public cfv0(String str, String str2, boolean z, List list, String str3, boolean z2, boolean z3, boolean z4, boolean z5, sro0 sro0Var, boolean z6, boolean z7) {
        this.f37459a = str;
        this.f37460b = str2;
        this.f37461c = z;
        this.f37462d = list;
        this.f37463e = str3;
        this.f37464f = z2;
        this.f37465g = z3;
        this.f37466h = z4;
        this.f37467i = z5;
        this.f37468t = sro0Var;
        this.f37457X = z6;
        this.f37458Y = z7;
    }

    /* JADX INFO: renamed from: c */
    public static cfv0 m32672c(cfv0 cfv0Var, boolean z, boolean z2, sro0 sro0Var, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? cfv0Var.f37461c : z;
        boolean z6 = cfv0Var.f37464f;
        boolean z7 = (i & 4) != 0 ? cfv0Var.f37465g : z2;
        sro0 sro0Var2 = (i & 8) != 0 ? cfv0Var.f37468t : sro0Var;
        boolean z8 = (i & 16) != 0 ? cfv0Var.f37466h : z3;
        boolean z9 = cfv0Var.f37467i;
        boolean z10 = cfv0Var.f37457X;
        boolean z11 = (i & 128) != 0 ? cfv0Var.f37458Y : z4;
        cfv0Var.getClass();
        if (cfv0Var instanceof cfv0) {
            return new cfv0(cfv0Var.f37459a, cfv0Var.f37460b, z5, cfv0Var.f37462d, cfv0Var.f37463e, z6, z7, z8, z9, sro0Var2, z10, z11);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfv0)) {
            return false;
        }
        cfv0 cfv0Var = (cfv0) obj;
        return wj50.m88271j(this.f37459a, cfv0Var.f37459a) && wj50.m88271j(this.f37460b, cfv0Var.f37460b) && this.f37461c == cfv0Var.f37461c && wj50.m88271j(this.f37462d, cfv0Var.f37462d) && wj50.m88271j(this.f37463e, cfv0Var.f37463e) && this.f37464f == cfv0Var.f37464f && this.f37465g == cfv0Var.f37465g && this.f37466h == cfv0Var.f37466h && this.f37467i == cfv0Var.f37467i && wj50.m88271j(this.f37468t, cfv0Var.f37468t) && this.f37457X == cfv0Var.f37457X && this.f37458Y == cfv0Var.f37458Y;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77245d(s571.m77243b(this.f37459a.hashCode() * 31, 31, this.f37460b), 31, this.f37461c), 31, this.f37462d);
        String str = this.f37463e;
        return Boolean.hashCode(this.f37458Y) + s571.m77245d((this.f37468t.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77244c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f37464f), 31, this.f37465g), 31, this.f37466h), 31, this.f37467i)) * 31, 31, this.f37457X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37459a);
        parcel.writeString(this.f37460b);
        parcel.writeInt(this.f37461c ? 1 : 0);
        parcel.writeStringList(this.f37462d);
        parcel.writeString(this.f37463e);
        parcel.writeInt(this.f37464f ? 1 : 0);
        parcel.writeInt(this.f37465g ? 1 : 0);
        parcel.writeInt(this.f37466h ? 1 : 0);
        parcel.writeInt(this.f37467i ? 1 : 0);
        parcel.writeParcelable(this.f37468t, i);
        parcel.writeInt(this.f37457X ? 1 : 0);
        parcel.writeInt(this.f37458Y ? 1 : 0);
    }
}
