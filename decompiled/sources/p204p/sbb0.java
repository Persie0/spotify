package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sbb0 implements Parcelable {
    public static final Parcelable.Creator<sbb0> CREATOR = new l0b0(22);

    /* JADX INFO: renamed from: a */
    public final int f207408a;

    /* JADX INFO: renamed from: b */
    public final int f207409b;

    /* JADX INFO: renamed from: c */
    public final int f207410c;

    /* JADX INFO: renamed from: d */
    public final int f207411d;

    /* JADX INFO: renamed from: e */
    public final int f207412e;

    /* JADX INFO: renamed from: f */
    public final boolean f207413f;

    public sbb0(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.f207408a = i;
        this.f207409b = i2;
        this.f207410c = i3;
        this.f207411d = i4;
        this.f207412e = i5;
        this.f207413f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbb0)) {
            return false;
        }
        sbb0 sbb0Var = (sbb0) obj;
        return this.f207408a == sbb0Var.f207408a && this.f207409b == sbb0Var.f207409b && this.f207410c == sbb0Var.f207410c && this.f207411d == sbb0Var.f207411d && this.f207412e == sbb0Var.f207412e && this.f207413f == sbb0Var.f207413f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207413f) + mt60.m62800g(this.f207412e, mt60.m62800g(this.f207411d, mt60.m62800g(this.f207410c, mt60.m62800g(this.f207409b, Integer.hashCode(this.f207408a) * 31, 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f207408a);
        parcel.writeInt(this.f207409b);
        parcel.writeInt(this.f207410c);
        parcel.writeInt(this.f207411d);
        parcel.writeInt(this.f207412e);
        parcel.writeInt(this.f207413f ? 1 : 0);
    }
}
