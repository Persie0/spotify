package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qu01 implements Parcelable {
    public static final Parcelable.Creator<qu01> CREATOR = new sp01(26);

    /* JADX INFO: renamed from: a */
    public final sr01 f192533a;

    /* JADX INFO: renamed from: b */
    public final int f192534b;

    /* JADX INFO: renamed from: c */
    public final int f192535c;

    public qu01(sr01 sr01Var, int i, int i2) {
        this.f192533a = sr01Var;
        this.f192534b = i;
        this.f192535c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu01)) {
            return false;
        }
        qu01 qu01Var = (qu01) obj;
        return wj50.m88271j(this.f192533a, qu01Var.f192533a) && this.f192534b == qu01Var.f192534b && this.f192535c == qu01Var.f192535c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f192535c) + mt60.m62800g(this.f192534b, this.f192533a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f192533a.writeToParcel(parcel, i);
        parcel.writeInt(this.f192534b);
        parcel.writeString(stz0.m79362p(this.f192535c));
    }
}
