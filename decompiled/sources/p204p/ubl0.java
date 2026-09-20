package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ubl0 extends obl0 {
    public static final Parcelable.Creator<ubl0> CREATOR;

    /* JADX INFO: renamed from: a */
    public final pla1 f228817a;

    /* JADX INFO: renamed from: b */
    public final String f228818b;

    /* JADX INFO: renamed from: c */
    public final boolean f228819c;

    /* JADX INFO: renamed from: d */
    public final int f228820d;

    /* JADX INFO: renamed from: e */
    public final int f228821e;

    /* JADX INFO: renamed from: f */
    public final int f228822f;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
        CREATOR = new hbl0(9);
    }

    public ubl0(pla1 pla1Var, String str, boolean z, int i, int i2, int i3) {
        this.f228817a = pla1Var;
        this.f228818b = str;
        this.f228819c = z;
        this.f228820d = i;
        this.f228821e = i2;
        this.f228822f = i3;
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: c */
    public final String mo69528c() {
        return this.f228818b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubl0)) {
            return false;
        }
        ubl0 ubl0Var = (ubl0) obj;
        return wj50.m88271j(this.f228817a, ubl0Var.f228817a) && wj50.m88271j(this.f228818b, ubl0Var.f228818b) && this.f228819c == ubl0Var.f228819c && this.f228820d == ubl0Var.f228820d && this.f228821e == ubl0Var.f228821e && this.f228822f == ubl0Var.f228822f;
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: h */
    public final int mo72494h() {
        return this.f228822f;
    }

    public final int hashCode() {
        return edb.m38547C(this.f228822f) + f710.m40938f(this.f228821e, f710.m40938f(this.f228820d, s571.m77245d(s571.m77243b(this.f228817a.hashCode() * 31, 31, this.f228818b), 31, this.f228819c), 31), 31);
    }

    @Override // p204p.wbl0
    /* JADX INFO: renamed from: j */
    public final boolean mo69529j() {
        return this.f228819c;
    }

    @Override // p204p.obl0
    /* JADX INFO: renamed from: k */
    public final int mo66659k() {
        return this.f228821e;
    }

    @Override // p204p.obl0
    /* JADX INFO: renamed from: l */
    public final int mo66660l() {
        return this.f228820d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f228817a, i);
        parcel.writeString(this.f228818b);
        parcel.writeInt(this.f228819c ? 1 : 0);
        parcel.writeString(a831.m25024p(this.f228820d));
        parcel.writeString(o7t0.m66398l(this.f228821e));
        parcel.writeString(mrx0.m62667u(this.f228822f));
    }
}
