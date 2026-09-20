package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vbl0 extends sbl0 {
    public static final Parcelable.Creator<vbl0> CREATOR = new hbl0(10);

    /* JADX INFO: renamed from: a */
    public final int f239524a;

    /* JADX INFO: renamed from: b */
    public final int f239525b;

    /* JADX INFO: renamed from: c */
    public final String f239526c;

    /* JADX INFO: renamed from: d */
    public final boolean f239527d;

    /* JADX INFO: renamed from: e */
    public final int f239528e;

    public vbl0(int i, int i2, int i3, String str, boolean z) {
        this.f239524a = i;
        this.f239525b = i2;
        this.f239526c = str;
        this.f239527d = z;
        this.f239528e = i3;
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: c */
    public final String mo69528c() {
        return this.f239526c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbl0)) {
            return false;
        }
        vbl0 vbl0Var = (vbl0) obj;
        return this.f239524a == vbl0Var.f239524a && this.f239525b == vbl0Var.f239525b && wj50.m88271j(this.f239526c, vbl0Var.f239526c) && this.f239527d == vbl0Var.f239527d && this.f239528e == vbl0Var.f239528e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f239528e) + s571.m77245d(s571.m77243b(mt60.m62800g(this.f239525b, Integer.hashCode(this.f239524a) * 31, 31), 31, this.f239526c), 31, this.f239527d);
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: j */
    public final boolean mo69529j() {
        return this.f239527d;
    }

    @Override // p204p.sbl0
    /* JADX INFO: renamed from: k */
    public final int mo69530k() {
        return this.f239524a;
    }

    @Override // p204p.sbl0
    /* JADX INFO: renamed from: l */
    public final int mo69531l() {
        return this.f239525b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239524a);
        parcel.writeInt(this.f239525b);
        parcel.writeString(this.f239526c);
        parcel.writeInt(this.f239527d ? 1 : 0);
        parcel.writeString(mrx0.m62667u(this.f239528e));
    }
}
