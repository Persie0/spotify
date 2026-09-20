package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zz10 implements Parcelable {
    public static final Parcelable.Creator<zz10> CREATOR = new km10(25);

    /* JADX INFO: renamed from: a */
    public final int f287768a;

    /* JADX INFO: renamed from: b */
    public final int f287769b;

    public zz10(int i, int i2) {
        this.f287768a = i;
        this.f287769b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz10)) {
            return false;
        }
        zz10 zz10Var = (zz10) obj;
        return this.f287768a == zz10Var.f287768a && this.f287769b == zz10Var.f287769b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f287769b) + (Integer.hashCode(this.f287768a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f287768a);
        parcel.writeInt(this.f287769b);
    }
}
