package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nd6 implements Parcelable {
    public static final Parcelable.Creator<nd6> CREATOR = new vp5(22);

    /* JADX INFO: renamed from: a */
    public final int f152684a;

    /* JADX INFO: renamed from: b */
    public final int f152685b;

    /* JADX INFO: renamed from: c */
    public final int f152686c;

    /* JADX INFO: renamed from: d */
    public final int f152687d;

    /* JADX INFO: renamed from: e */
    public final int f152688e;

    public nd6(int i, int i2, int i3, int i4, int i5) {
        this.f152684a = i;
        this.f152685b = i2;
        this.f152686c = i3;
        this.f152687d = i4;
        this.f152688e = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd6)) {
            return false;
        }
        nd6 nd6Var = (nd6) obj;
        return this.f152684a == nd6Var.f152684a && this.f152685b == nd6Var.f152685b && this.f152686c == nd6Var.f152686c && this.f152687d == nd6Var.f152687d && this.f152688e == nd6Var.f152688e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152688e) + mt60.m62800g(this.f152687d, mt60.m62800g(this.f152686c, mt60.m62800g(this.f152685b, Integer.hashCode(this.f152684a) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f152684a);
        parcel.writeInt(this.f152685b);
        parcel.writeInt(this.f152686c);
        parcel.writeInt(this.f152687d);
        parcel.writeInt(this.f152688e);
    }

    public /* synthetic */ nd6(int i) {
        this(10, 100, 20, (i & 8) != 0 ? 3 : 2, 40);
    }
}
