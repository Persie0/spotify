package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class g5a1 implements Parcelable {
    public static final Parcelable.Creator<g5a1> CREATOR = new u2a1(1);

    /* JADX INFO: renamed from: a */
    public final int f76631a;

    /* JADX INFO: renamed from: b */
    public final int f76632b;

    /* JADX INFO: renamed from: c */
    public final int f76633c;

    public g5a1(int i, int i2, int i3) {
        this.f76631a = i;
        this.f76632b = i2;
        this.f76633c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5a1)) {
            return false;
        }
        g5a1 g5a1Var = (g5a1) obj;
        return this.f76631a == g5a1Var.f76631a && this.f76632b == g5a1Var.f76632b && this.f76633c == g5a1Var.f76633c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76633c) + mt60.m62800g(this.f76632b, Integer.hashCode(this.f76631a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f76631a);
        parcel.writeInt(this.f76632b);
        parcel.writeInt(this.f76633c);
    }
}
