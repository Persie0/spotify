package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mr20 implements Parcelable {
    public static final Parcelable.Creator<mr20> CREATOR = new t320(17);

    /* JADX INFO: renamed from: a */
    public final String f146406a;

    /* JADX INFO: renamed from: b */
    public final int f146407b;

    public mr20(String str, int i) {
        this.f146406a = str;
        this.f146407b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr20)) {
            return false;
        }
        mr20 mr20Var = (mr20) obj;
        return wj50.m88271j(this.f146406a, mr20Var.f146406a) && this.f146407b == mr20Var.f146407b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f146407b) + (this.f146406a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f146406a);
        int i2 = this.f146407b;
        if (i2 == 1) {
            str = "RECENTS";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "SHORTCUTS";
        }
        parcel.writeString(str);
    }
}
