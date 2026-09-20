package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hc71 implements Parcelable {
    public static final Parcelable.Creator<hc71> CREATOR = new c071(6);

    /* JADX INFO: renamed from: a */
    public final int f89712a;

    /* JADX INFO: renamed from: b */
    public final int f89713b;

    /* JADX INFO: renamed from: c */
    public final int f89714c;

    public hc71(int i, int i2, int i3) {
        this.f89712a = i;
        this.f89713b = i2;
        this.f89714c = i3;
    }

    /* JADX INFO: renamed from: c */
    public static hc71 m47098c(hc71 hc71Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = hc71Var.f89712a;
        }
        int i4 = hc71Var.f89713b;
        if ((i3 & 4) != 0) {
            i2 = hc71Var.f89714c;
        }
        hc71Var.getClass();
        return new hc71(i, i4, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc71)) {
            return false;
        }
        hc71 hc71Var = (hc71) obj;
        return this.f89712a == hc71Var.f89712a && this.f89713b == hc71Var.f89713b && this.f89714c == hc71Var.f89714c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89714c) + mt60.m62800g(this.f89713b, Integer.hashCode(this.f89712a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f89712a);
        parcel.writeInt(this.f89713b);
        parcel.writeInt(this.f89714c);
    }
}
