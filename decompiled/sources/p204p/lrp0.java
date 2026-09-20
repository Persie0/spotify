package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lrp0 extends mrp0 {
    public static final Parcelable.Creator<lrp0> CREATOR = new vnp0(5);

    /* JADX INFO: renamed from: a */
    public final String f136347a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f136348b;

    /* JADX INFO: renamed from: c */
    public final String f136349c;

    public lrp0(String str, lnn0 lnn0Var, String str2) {
        this.f136347a = str;
        this.f136348b = lnn0Var;
        this.f136349c = str2;
    }

    @Override // p204p.mrp0
    /* JADX INFO: renamed from: c */
    public final lnn0 mo57169c() {
        return this.f136348b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrp0)) {
            return false;
        }
        lrp0 lrp0Var = (lrp0) obj;
        return wj50.m88271j(this.f136347a, lrp0Var.f136347a) && this.f136348b == lrp0Var.f136348b && wj50.m88271j(this.f136349c, lrp0Var.f136349c);
    }

    @Override // p204p.mrp0
    /* JADX INFO: renamed from: g */
    public final String mo57170g() {
        return this.f136347a;
    }

    @Override // p204p.mrp0
    /* JADX INFO: renamed from: h */
    public final String mo57171h() {
        return this.f136349c;
    }

    public final int hashCode() {
        String str = this.f136347a;
        return this.f136349c.hashCode() + ((this.f136348b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f136347a);
        parcel.writeString(this.f136348b.name());
        parcel.writeString(this.f136349c);
    }
}
