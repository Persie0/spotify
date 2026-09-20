package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class as20 implements Parcelable {
    public static final Parcelable.Creator<as20> CREATOR = new t320(18);

    /* JADX INFO: renamed from: a */
    public final long f19283a;

    /* JADX INFO: renamed from: b */
    public final int f19284b;

    /* JADX INFO: renamed from: c */
    public final int f19285c;

    public as20(int i, long j, int i2) {
        this.f19283a = j;
        this.f19284b = i;
        this.f19285c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as20)) {
            return false;
        }
        as20 as20Var = (as20) obj;
        return this.f19283a == as20Var.f19283a && this.f19284b == as20Var.f19284b && this.f19285c == as20Var.f19285c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19285c) + mt60.m62800g(this.f19284b, Long.hashCode(this.f19283a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f19283a);
        parcel.writeInt(this.f19284b);
        parcel.writeInt(this.f19285c);
    }
}
