package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class j580 implements Parcelable {
    public static final Parcelable.Creator<j580> CREATOR = new w270(26);

    /* JADX INFO: renamed from: a */
    public final int f108908a;

    /* JADX INFO: renamed from: b */
    public final int f108909b;

    /* JADX INFO: renamed from: c */
    public final agr0 f108910c;

    /* JADX INFO: renamed from: d */
    public final b370 f108911d;

    /* JADX INFO: renamed from: e */
    public final dlx f108912e;

    /* JADX INFO: renamed from: f */
    public final boolean f108913f;

    /* JADX INFO: renamed from: g */
    public final boolean f108914g;

    /* JADX INFO: renamed from: h */
    public final boolean f108915h;

    public j580(int i, int i2, agr0 agr0Var, b370 b370Var, dlx dlxVar, boolean z, boolean z2, boolean z3) {
        this.f108908a = i;
        this.f108909b = i2;
        this.f108910c = agr0Var;
        this.f108911d = b370Var;
        this.f108912e = dlxVar;
        this.f108913f = z;
        this.f108914g = z2;
        this.f108915h = z3;
    }

    /* JADX INFO: renamed from: c */
    public static j580 m52445c(j580 j580Var, boolean z, boolean z2, int i) {
        int i2 = j580Var.f108908a;
        int i3 = j580Var.f108909b;
        agr0 agr0Var = j580Var.f108910c;
        b370 b370Var = j580Var.f108911d;
        dlx dlxVar = j580Var.f108912e;
        boolean z3 = (i & 32) != 0 ? j580Var.f108913f : true;
        if ((i & 64) != 0) {
            z = j580Var.f108914g;
        }
        boolean z4 = z;
        if ((i & 128) != 0) {
            z2 = j580Var.f108915h;
        }
        j580Var.getClass();
        return new j580(i2, i3, agr0Var, b370Var, dlxVar, z3, z4, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j580)) {
            return false;
        }
        j580 j580Var = (j580) obj;
        return this.f108908a == j580Var.f108908a && this.f108909b == j580Var.f108909b && this.f108910c == j580Var.f108910c && wj50.m88271j(this.f108911d, j580Var.f108911d) && wj50.m88271j(this.f108912e, j580Var.f108912e) && this.f108913f == j580Var.f108913f && this.f108914g == j580Var.f108914g && this.f108915h == j580Var.f108915h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108915h) + s571.m77245d(s571.m77245d((this.f108912e.hashCode() + ((this.f108911d.hashCode() + ((this.f108910c.hashCode() + mt60.m62800g(this.f108909b, Integer.hashCode(this.f108908a) * 31, 31)) * 31)) * 31)) * 31, 31, this.f108913f), 31, this.f108914g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f108908a);
        parcel.writeInt(this.f108909b);
        parcel.writeParcelable(this.f108910c, i);
        parcel.writeParcelable(this.f108911d, i);
        parcel.writeParcelable(this.f108912e, i);
        parcel.writeInt(this.f108913f ? 1 : 0);
        parcel.writeInt(this.f108914g ? 1 : 0);
        parcel.writeInt(this.f108915h ? 1 : 0);
    }
}
