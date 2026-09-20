package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class f361 implements Parcelable {
    public static final Parcelable.Creator<f361> CREATOR = new e361(0);

    /* JADX INFO: renamed from: a */
    public final int f65401a;

    /* JADX INFO: renamed from: b */
    public final int f65402b;

    /* JADX INFO: renamed from: c */
    public final int f65403c;

    /* JADX INFO: renamed from: d */
    public final int f65404d;

    public f361(int i, int i2, int i3, int i4) {
        this.f65401a = i;
        this.f65402b = i2;
        this.f65403c = i3;
        this.f65404d = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f361)) {
            return false;
        }
        f361 f361Var = (f361) obj;
        return this.f65401a == f361Var.f65401a && this.f65402b == f361Var.f65402b && this.f65403c == f361Var.f65403c && this.f65404d == f361Var.f65404d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65404d) + mt60.m62800g(this.f65403c, mt60.m62800g(this.f65402b, Integer.hashCode(this.f65401a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f65401a);
        parcel.writeInt(this.f65402b);
        parcel.writeInt(this.f65403c);
        parcel.writeInt(this.f65404d);
    }
}
