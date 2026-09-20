package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class dhv extends mhv {
    public static final Parcelable.Creator<dhv> CREATOR = new m8v(10);

    /* JADX INFO: renamed from: a */
    public final int f49172a;

    /* JADX INFO: renamed from: b */
    public final bpe1 f49173b;

    /* JADX INFO: renamed from: c */
    public final boolean f49174c;

    /* JADX INFO: renamed from: d */
    public final xi3 f49175d;

    /* JADX INFO: renamed from: e */
    public final int f49176e;

    /* JADX INFO: renamed from: f */
    public final boolean f49177f;

    /* JADX INFO: renamed from: g */
    public final boolean f49178g;

    /* JADX INFO: renamed from: h */
    public final boolean f49179h;

    /* JADX INFO: renamed from: i */
    public final boolean f49180i;

    public dhv(int i, bpe1 bpe1Var, boolean z, xi3 xi3Var, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f49172a = i;
        this.f49173b = bpe1Var;
        this.f49174c = z;
        this.f49175d = xi3Var;
        this.f49176e = i2;
        this.f49177f = z2;
        this.f49178g = z3;
        this.f49179h = z4;
        this.f49180i = z5;
    }

    /* JADX INFO: renamed from: c */
    public final int m36058c() {
        return this.f49172a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhv)) {
            return false;
        }
        dhv dhvVar = (dhv) obj;
        return this.f49172a == dhvVar.f49172a && wj50.m88271j(this.f49173b, dhvVar.f49173b) && this.f49174c == dhvVar.f49174c && this.f49175d == dhvVar.f49175d && this.f49176e == dhvVar.f49176e && this.f49177f == dhvVar.f49177f && this.f49178g == dhvVar.f49178g && this.f49179h == dhvVar.f49179h && this.f49180i == dhvVar.f49180i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49180i) + s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f49176e, (this.f49175d.hashCode() + s571.m77245d((this.f49173b.hashCode() + (Integer.hashCode(this.f49172a) * 31)) * 31, 31, this.f49174c)) * 31, 31), 31, this.f49177f), 31, this.f49178g), 31, this.f49179h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f49172a);
        this.f49173b.writeToParcel(parcel, i);
        parcel.writeInt(this.f49174c ? 1 : 0);
        parcel.writeString(this.f49175d.name());
        parcel.writeInt(this.f49176e);
        parcel.writeInt(this.f49177f ? 1 : 0);
        parcel.writeInt(this.f49178g ? 1 : 0);
        parcel.writeInt(this.f49179h ? 1 : 0);
        parcel.writeInt(this.f49180i ? 1 : 0);
    }

    public /* synthetic */ dhv(int i, bpe1 bpe1Var, boolean z, xi3 xi3Var, int i2, boolean z2, boolean z3, boolean z4, int i3) {
        this(i, bpe1Var, z, xi3Var, i2, z2, false, z3, (i3 & 256) != 0 ? false : z4);
    }
}
