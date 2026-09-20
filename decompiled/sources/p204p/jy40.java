package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jy40 implements zz41 {
    public static final Parcelable.Creator<jy40> CREATOR = new y240(25);

    /* JADX INFO: renamed from: a */
    public final ky40 f117288a;

    /* JADX INFO: renamed from: b */
    public final gy40 f117289b;

    /* JADX INFO: renamed from: c */
    public final iy40 f117290c;

    /* JADX INFO: renamed from: d */
    public final String f117291d;

    public jy40(ky40 ky40Var, gy40 gy40Var, iy40 iy40Var, String str) {
        this.f117288a = ky40Var;
        this.f117289b = gy40Var;
        this.f117290c = iy40Var;
        this.f117291d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy40)) {
            return false;
        }
        jy40 jy40Var = (jy40) obj;
        return this.f117288a == jy40Var.f117288a && wj50.m88271j(this.f117289b, jy40Var.f117289b) && wj50.m88271j(this.f117290c, jy40Var.f117290c) && wj50.m88271j(this.f117291d, jy40Var.f117291d);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f117291d;
    }

    public final int hashCode() {
        return this.f117291d.hashCode() + ((this.f117290c.hashCode() + ((this.f117289b.hashCode() + (this.f117288a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117288a.name());
        this.f117289b.writeToParcel(parcel, i);
        this.f117290c.writeToParcel(parcel, i);
        parcel.writeString(this.f117291d);
    }
}
