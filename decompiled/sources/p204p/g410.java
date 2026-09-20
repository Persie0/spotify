package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class g410 extends zq50 {
    public static final Parcelable.Creator<g410> CREATOR = new qz00(8);

    /* JADX INFO: renamed from: a */
    public final int f76313a;

    /* JADX INFO: renamed from: b */
    public final boolean f76314b;

    public g410(int i, boolean z) {
        this.f76313a = i;
        this.f76314b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g410)) {
            return false;
        }
        g410 g410Var = (g410) obj;
        return this.f76313a == g410Var.f76313a && this.f76314b == g410Var.f76314b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76314b) + (edb.m38547C(this.f76313a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f76313a;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "DEFAULT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "CONTENT";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f76314b ? 1 : 0);
    }
}
