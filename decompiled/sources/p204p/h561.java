package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class h561 implements Parcelable {
    public static final Parcelable.Creator<h561> CREATOR = new e361(6);

    /* JADX INFO: renamed from: a */
    public final String f87753a;

    /* JADX INFO: renamed from: b */
    public final int f87754b;

    /* JADX INFO: renamed from: c */
    public final String f87755c;

    /* JADX INFO: renamed from: d */
    public final boolean f87756d;

    /* JADX INFO: renamed from: e */
    public final boolean f87757e;

    public h561(int i, String str, String str2, boolean z, boolean z2) {
        this.f87753a = str;
        this.f87754b = i;
        this.f87755c = str2;
        this.f87756d = z;
        this.f87757e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h561)) {
            return false;
        }
        h561 h561Var = (h561) obj;
        return wj50.m88271j(this.f87753a, h561Var.f87753a) && this.f87754b == h561Var.f87754b && wj50.m88271j(this.f87755c, h561Var.f87755c) && this.f87756d == h561Var.f87756d && this.f87757e == h561Var.f87757e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87757e) + s571.m77245d(s571.m77243b(mt60.m62800g(this.f87754b, this.f87753a.hashCode() * 31, 31), 31, this.f87755c), 31, this.f87756d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87753a);
        parcel.writeInt(this.f87754b);
        parcel.writeString(this.f87755c);
        parcel.writeInt(this.f87756d ? 1 : 0);
        parcel.writeInt(this.f87757e ? 1 : 0);
    }
}
