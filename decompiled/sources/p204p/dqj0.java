package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class dqj0 implements Parcelable {
    public static final Parcelable.Creator<dqj0> CREATOR = new fgj0(5);

    /* JADX INFO: renamed from: a */
    public final String f52024a;

    /* JADX INFO: renamed from: b */
    public final int f52025b;

    /* JADX INFO: renamed from: c */
    public final int f52026c;

    public dqj0(String str, int i, int i2) {
        this.f52024a = str;
        this.f52025b = i;
        this.f52026c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqj0)) {
            return false;
        }
        dqj0 dqj0Var = (dqj0) obj;
        return wj50.m88271j(this.f52024a, dqj0Var.f52024a) && this.f52025b == dqj0Var.f52025b && this.f52026c == dqj0Var.f52026c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52026c) + mt60.m62800g(this.f52025b, this.f52024a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f52024a);
        parcel.writeInt(this.f52025b);
        parcel.writeInt(this.f52026c);
    }
}
