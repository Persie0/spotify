package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class x4y0 implements iet0 {
    public static final Parcelable.Creator<x4y0> CREATOR = new csx0(13);

    /* JADX INFO: renamed from: a */
    public final int f258218a;

    /* JADX INFO: renamed from: b */
    public final String f258219b;

    /* JADX INFO: renamed from: c */
    public final String f258220c;

    /* JADX INFO: renamed from: d */
    public final String f258221d;

    /* JADX INFO: renamed from: e */
    public final String f258222e;

    public x4y0(int i, String str, String str2, String str3, String str4) {
        this.f258218a = i;
        this.f258219b = str;
        this.f258220c = str2;
        this.f258221d = str3;
        this.f258222e = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f258218a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4y0)) {
            return false;
        }
        x4y0 x4y0Var = (x4y0) obj;
        return this.f258218a == x4y0Var.f258218a && wj50.m88271j(this.f258219b, x4y0Var.f258219b) && wj50.m88271j(this.f258220c, x4y0Var.f258220c) && wj50.m88271j(this.f258221d, x4y0Var.f258221d) && wj50.m88271j(this.f258222e, x4y0Var.f258222e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f258218a) * 31, 31, this.f258219b), 31, this.f258220c), 31, this.f258221d);
        String str = this.f258222e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f258218a);
        parcel.writeString(this.f258219b);
        parcel.writeString(this.f258220c);
        parcel.writeString(this.f258221d);
        parcel.writeString(this.f258222e);
    }
}
