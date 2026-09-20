package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class t611 implements Parcelable {
    public static final Parcelable.Creator<t611> CREATOR = new u111(16);

    /* JADX INFO: renamed from: a */
    public final int f217417a;

    /* JADX INFO: renamed from: b */
    public final int f217418b;

    /* JADX INFO: renamed from: c */
    public final int f217419c;

    static {
        mif1.m61873g(-11316397);
    }

    public t611(int i, int i2, int i3) {
        this.f217417a = i;
        this.f217418b = i2;
        this.f217419c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t611)) {
            return false;
        }
        t611 t611Var = (t611) obj;
        return this.f217417a == t611Var.f217417a && this.f217418b == t611Var.f217418b && this.f217419c == t611Var.f217419c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217419c) + mt60.m62800g(this.f217418b, Integer.hashCode(this.f217417a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f217417a);
        parcel.writeInt(this.f217418b);
        parcel.writeInt(this.f217419c);
    }
}
