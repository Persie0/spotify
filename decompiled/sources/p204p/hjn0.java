package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class hjn0 implements Parcelable {
    public static final Parcelable.Creator<hjn0> CREATOR = new ejn0(2);

    /* JADX INFO: renamed from: a */
    public final String f92205a;

    /* JADX INFO: renamed from: b */
    public final String f92206b;

    /* JADX INFO: renamed from: c */
    public final int f92207c;

    public hjn0(String str, String str2, int i) {
        this.f92205a = str;
        this.f92206b = str2;
        this.f92207c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjn0)) {
            return false;
        }
        hjn0 hjn0Var = (hjn0) obj;
        return wj50.m88271j(this.f92205a, hjn0Var.f92205a) && wj50.m88271j(this.f92206b, hjn0Var.f92206b) && this.f92207c == hjn0Var.f92207c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f92207c) + s571.m77243b(this.f92205a.hashCode() * 31, 31, this.f92206b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f92205a);
        parcel.writeString(this.f92206b);
        int i2 = this.f92207c;
        if (i2 == 1) {
            str = "CHECK_ALT";
        } else if (i2 == 2) {
            str = "UNDO";
        } else if (i2 == 3) {
            str = "EXTERNAL_LINK";
        } else if (i2 == 4) {
            str = "CAMERA";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "MESSAGES";
        }
        parcel.writeString(str);
    }
}
