package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.yw */
/* JADX INFO: loaded from: classes9.dex */
public final class C2628yw extends AbstractC1683ax {
    public static final Parcelable.Creator<C2628yw> CREATOR = new C2267ps(8);

    /* JADX INFO: renamed from: a */
    public final String f276800a;

    /* JADX INFO: renamed from: b */
    public final String f276801b;

    /* JADX INFO: renamed from: c */
    public final boolean f276802c;

    /* JADX INFO: renamed from: d */
    public final boolean f276803d;

    /* JADX INFO: renamed from: e */
    public final boolean f276804e;

    /* JADX INFO: renamed from: f */
    public final boolean f276805f;

    /* JADX INFO: renamed from: g */
    public final bs10 f276806g;

    public C2628yw(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, bs10 bs10Var) {
        this.f276800a = str;
        this.f276801b = str2;
        this.f276802c = z;
        this.f276803d = z2;
        this.f276804e = z3;
        this.f276805f = z4;
        this.f276806g = bs10Var;
    }

    /* JADX INFO: renamed from: c */
    public static C2628yw m94771c(C2628yw c2628yw, boolean z, boolean z2, boolean z3, int i) {
        String str = c2628yw.f276800a;
        String str2 = c2628yw.f276801b;
        if ((i & 4) != 0) {
            z = c2628yw.f276802c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = c2628yw.f276803d;
        }
        boolean z5 = z2;
        boolean z6 = c2628yw.f276804e;
        if ((i & 32) != 0) {
            z3 = c2628yw.f276805f;
        }
        bs10 bs10Var = c2628yw.f276806g;
        c2628yw.getClass();
        return new C2628yw(str, str2, z4, z5, z6, z3, bs10Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2628yw)) {
            return false;
        }
        C2628yw c2628yw = (C2628yw) obj;
        return wj50.m88271j(this.f276800a, c2628yw.f276800a) && wj50.m88271j(this.f276801b, c2628yw.f276801b) && this.f276802c == c2628yw.f276802c && this.f276803d == c2628yw.f276803d && this.f276804e == c2628yw.f276804e && this.f276805f == c2628yw.f276805f && wj50.m88271j(this.f276806g, c2628yw.f276806g);
    }

    public final int hashCode() {
        return this.f276806g.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f276800a.hashCode() * 31, 31, this.f276801b), 31, this.f276802c), 31, this.f276803d), 31, this.f276804e), 31, this.f276805f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f276800a);
        parcel.writeString(this.f276801b);
        parcel.writeInt(this.f276802c ? 1 : 0);
        parcel.writeInt(this.f276803d ? 1 : 0);
        parcel.writeInt(this.f276804e ? 1 : 0);
        parcel.writeInt(this.f276805f ? 1 : 0);
        parcel.writeParcelable(this.f276806g, i);
    }
}
