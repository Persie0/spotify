package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ucb1 implements vcb1 {
    public static final Parcelable.Creator<ucb1> CREATOR = new c8b1(5);

    /* JADX INFO: renamed from: a */
    public final int f228999a;

    /* JADX INFO: renamed from: b */
    public final String f229000b;

    public ucb1(int i, String str) {
        this.f228999a = i;
        this.f229000b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucb1)) {
            return false;
        }
        ucb1 ucb1Var = (ucb1) obj;
        return this.f228999a == ucb1Var.f228999a && wj50.m88271j(this.f229000b, ucb1Var.f229000b);
    }

    public final int hashCode() {
        return this.f229000b.hashCode() + (edb.m38547C(this.f228999a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f228999a;
        if (i2 == 1) {
            str = "ID_AND_SELFIE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "ID_ONLY";
        }
        parcel.writeString(str);
        parcel.writeString(this.f229000b);
    }
}
