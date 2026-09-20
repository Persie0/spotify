package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class kzr implements Parcelable {
    public static final Parcelable.Creator<kzr> CREATOR = new o5r(26);

    /* JADX INFO: renamed from: a */
    public final int f128183a;

    public kzr(int i) {
        this.f128183a = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m57764c() {
        return this.f128183a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzr) && this.f128183a == ((kzr) obj).f128183a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f128183a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f128183a;
        if (i2 == 1) {
            str = "VOICE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "TEXT";
        }
        parcel.writeString(str);
    }
}
