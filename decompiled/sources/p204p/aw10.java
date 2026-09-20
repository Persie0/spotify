package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class aw10 implements Parcelable {
    public static final Parcelable.Creator<aw10> CREATOR = new km10(20);

    /* JADX INFO: renamed from: X */
    public final boolean f20337X;

    /* JADX INFO: renamed from: Y */
    public final String f20338Y;

    /* JADX INFO: renamed from: a */
    public final String f20339a;

    /* JADX INFO: renamed from: b */
    public final String f20340b;

    /* JADX INFO: renamed from: c */
    public final String f20341c;

    /* JADX INFO: renamed from: d */
    public final qco0 f20342d;

    /* JADX INFO: renamed from: e */
    public final int f20343e;

    /* JADX INFO: renamed from: f */
    public final int f20344f;

    /* JADX INFO: renamed from: g */
    public final ss10 f20345g;

    /* JADX INFO: renamed from: h */
    public final boolean f20346h;

    /* JADX INFO: renamed from: i */
    public final boolean f20347i;

    /* JADX INFO: renamed from: t */
    public final boolean f20348t;

    public aw10(String str, String str2, String str3, qco0 qco0Var, int i, int i2, ss10 ss10Var, boolean z, boolean z2, boolean z3, boolean z4, String str4) {
        this.f20339a = str;
        this.f20340b = str2;
        this.f20341c = str3;
        this.f20342d = qco0Var;
        this.f20343e = i;
        this.f20344f = i2;
        this.f20345g = ss10Var;
        this.f20346h = z;
        this.f20347i = z2;
        this.f20348t = z3;
        this.f20337X = z4;
        this.f20338Y = str4;
    }

    /* JADX INFO: renamed from: c */
    public static aw10 m27274c(aw10 aw10Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str = aw10Var.f20339a;
        String str2 = aw10Var.f20340b;
        String str3 = aw10Var.f20341c;
        qco0 qco0Var = aw10Var.f20342d;
        int i2 = aw10Var.f20343e;
        int i3 = aw10Var.f20344f;
        ss10 ss10Var = aw10Var.f20345g;
        if ((i & 128) != 0) {
            z = aw10Var.f20346h;
        }
        boolean z5 = z;
        boolean z6 = (i & 256) != 0 ? aw10Var.f20347i : z2;
        boolean z7 = (i & 512) != 0 ? aw10Var.f20348t : z3;
        boolean z8 = (i & 1024) != 0 ? aw10Var.f20337X : z4;
        String str4 = aw10Var.f20338Y;
        aw10Var.getClass();
        return new aw10(str, str2, str3, qco0Var, i2, i3, ss10Var, z5, z6, z7, z8, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw10)) {
            return false;
        }
        aw10 aw10Var = (aw10) obj;
        return wj50.m88271j(this.f20339a, aw10Var.f20339a) && wj50.m88271j(this.f20340b, aw10Var.f20340b) && wj50.m88271j(this.f20341c, aw10Var.f20341c) && wj50.m88271j(this.f20342d, aw10Var.f20342d) && this.f20343e == aw10Var.f20343e && this.f20344f == aw10Var.f20344f && this.f20345g == aw10Var.f20345g && this.f20346h == aw10Var.f20346h && this.f20347i == aw10Var.f20347i && this.f20348t == aw10Var.f20348t && this.f20337X == aw10Var.f20337X && wj50.m88271j(this.f20338Y, aw10Var.f20338Y);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f20339a.hashCode() * 31, 31, this.f20340b);
        String str = this.f20341c;
        return this.f20338Y.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f20345g.hashCode() + mt60.m62800g(this.f20344f, mt60.m62800g(this.f20343e, (this.f20342d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31)) * 31, 31, this.f20346h), 31, this.f20347i), 31, this.f20348t), 31, this.f20337X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20339a);
        parcel.writeString(this.f20340b);
        parcel.writeString(this.f20341c);
        parcel.writeParcelable(this.f20342d, i);
        parcel.writeInt(this.f20343e);
        parcel.writeInt(this.f20344f);
        parcel.writeString(this.f20345g.name());
        parcel.writeInt(this.f20346h ? 1 : 0);
        parcel.writeInt(this.f20347i ? 1 : 0);
        parcel.writeInt(this.f20348t ? 1 : 0);
        parcel.writeInt(this.f20337X ? 1 : 0);
        parcel.writeString(this.f20338Y);
    }
}
