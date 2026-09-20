package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class en51 implements hn51 {
    public static final Parcelable.Creator<en51> CREATOR = new nc51(19);

    /* JADX INFO: renamed from: a */
    public final int f61071a;

    /* JADX INFO: renamed from: b */
    public final int f61072b;

    /* JADX INFO: renamed from: c */
    public final int f61073c;

    public en51(int i, int i2, int i3) {
        this.f61071a = i;
        this.f61072b = i2;
        this.f61073c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en51)) {
            return false;
        }
        en51 en51Var = (en51) obj;
        return this.f61071a == en51Var.f61071a && this.f61072b == en51Var.f61072b && this.f61073c == en51Var.f61073c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61073c) + f710.m40938f(this.f61072b, edb.m38547C(this.f61071a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.f61071a;
        if (i2 == 1) {
            str = "Loading";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Empty";
        }
        parcel.writeString(str);
        int i3 = this.f61072b;
        if (i3 == 1) {
            str2 = "Popular";
        } else {
            if (i3 != 2) {
                throw null;
            }
            str2 = "Collaboration";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f61073c);
    }
}
