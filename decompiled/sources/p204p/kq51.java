package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class kq51 implements Parcelable {
    public static final Parcelable.Creator<kq51> CREATOR = new nc51(22);

    /* JADX INFO: renamed from: a */
    public final int f125219a;

    /* JADX INFO: renamed from: b */
    public final float f125220b;

    /* JADX INFO: renamed from: c */
    public final float f125221c;

    /* JADX INFO: renamed from: d */
    public final float f125222d;

    public kq51(float f, float f2, float f3, int i) {
        this.f125219a = i;
        this.f125220b = f;
        this.f125221c = f2;
        this.f125222d = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq51)) {
            return false;
        }
        kq51 kq51Var = (kq51) obj;
        return this.f125219a == kq51Var.f125219a && Float.compare(this.f125220b, kq51Var.f125220b) == 0 && Float.compare(this.f125221c, kq51Var.f125221c) == 0 && Float.compare(this.f125222d, kq51Var.f125222d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f125222d) + AbstractC0000a.m8g(AbstractC0000a.m8g(edb.m38547C(this.f125219a) * 31, 31, this.f125220b), 31, this.f125221c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f125219a;
        if (i2 == 1) {
            str = "Loop";
        } else if (i2 == 2) {
            str = "Spinback";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "VinylStop";
        }
        parcel.writeString(str);
        parcel.writeFloat(this.f125220b);
        parcel.writeFloat(this.f125221c);
        parcel.writeFloat(this.f125222d);
    }
}
