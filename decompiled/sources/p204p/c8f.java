package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class c8f implements Parcelable {
    public static final Parcelable.Creator<c8f> CREATOR = new rae(14);

    /* JADX INFO: renamed from: a */
    public final int f35195a;

    /* JADX INFO: renamed from: b */
    public final int f35196b;

    /* JADX INFO: renamed from: c */
    public final int f35197c;

    /* JADX INFO: renamed from: d */
    public final int f35198d;

    /* JADX INFO: renamed from: e */
    public final int f35199e;

    /* JADX INFO: renamed from: f */
    public final int f35200f;

    public c8f(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f35195a = i;
        this.f35196b = i2;
        this.f35197c = i3;
        this.f35198d = i4;
        this.f35199e = i5;
        this.f35200f = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8f)) {
            return false;
        }
        c8f c8fVar = (c8f) obj;
        return this.f35195a == c8fVar.f35195a && this.f35196b == c8fVar.f35196b && this.f35197c == c8fVar.f35197c && this.f35198d == c8fVar.f35198d && this.f35199e == c8fVar.f35199e && this.f35200f == c8fVar.f35200f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35200f) + mt60.m62800g(this.f35199e, mt60.m62800g(this.f35198d, mt60.m62800g(this.f35197c, mt60.m62800g(this.f35196b, Integer.hashCode(this.f35195a) * 31, 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35195a);
        parcel.writeInt(this.f35196b);
        parcel.writeInt(this.f35197c);
        parcel.writeInt(this.f35198d);
        parcel.writeInt(this.f35199e);
        parcel.writeInt(this.f35200f);
    }
}
