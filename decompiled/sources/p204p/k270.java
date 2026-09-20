package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class k270 implements Parcelable {
    public static final Parcelable.Creator<k270> CREATOR = new pq50(27);

    /* JADX INFO: renamed from: a */
    public final lzm0 f118534a;

    /* JADX INFO: renamed from: b */
    public final lzm0 f118535b;

    /* JADX INFO: renamed from: c */
    public final b370 f118536c;

    /* JADX INFO: renamed from: d */
    public final dlx f118537d;

    /* JADX INFO: renamed from: e */
    public final int f118538e;

    /* JADX INFO: renamed from: f */
    public final int f118539f;

    public k270(lzm0 lzm0Var, lzm0 lzm0Var2, b370 b370Var, dlx dlxVar, int i, int i2) {
        this.f118534a = lzm0Var;
        this.f118535b = lzm0Var2;
        this.f118536c = b370Var;
        this.f118537d = dlxVar;
        this.f118538e = i;
        this.f118539f = i2;
    }

    /* JADX INFO: renamed from: c */
    public static k270 m55152c(k270 k270Var, fzm0 fzm0Var, fzm0 fzm0Var2, int i) {
        lzm0 lzm0Var = fzm0Var;
        if ((i & 1) != 0) {
            lzm0Var = k270Var.f118534a;
        }
        lzm0 lzm0Var2 = lzm0Var;
        lzm0 lzm0Var3 = fzm0Var2;
        if ((i & 2) != 0) {
            lzm0Var3 = k270Var.f118535b;
        }
        b370 b370Var = k270Var.f118536c;
        dlx dlxVar = k270Var.f118537d;
        int i2 = k270Var.f118538e;
        int i3 = k270Var.f118539f;
        k270Var.getClass();
        return new k270(lzm0Var2, lzm0Var3, b370Var, dlxVar, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k270)) {
            return false;
        }
        k270 k270Var = (k270) obj;
        return wj50.m88271j(this.f118534a, k270Var.f118534a) && wj50.m88271j(this.f118535b, k270Var.f118535b) && wj50.m88271j(this.f118536c, k270Var.f118536c) && wj50.m88271j(this.f118537d, k270Var.f118537d) && this.f118538e == k270Var.f118538e && this.f118539f == k270Var.f118539f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118539f) + mt60.m62800g(this.f118538e, (this.f118537d.hashCode() + ((this.f118536c.hashCode() + ((this.f118535b.hashCode() + (this.f118534a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f118534a, i);
        parcel.writeParcelable(this.f118535b, i);
        parcel.writeParcelable(this.f118536c, i);
        parcel.writeParcelable(this.f118537d, i);
        parcel.writeInt(this.f118538e);
        parcel.writeInt(this.f118539f);
    }
}
