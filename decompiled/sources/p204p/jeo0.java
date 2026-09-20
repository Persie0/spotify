package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jeo0 implements Parcelable {
    public static final Parcelable.Creator<jeo0> CREATOR = new o2o0(18);

    /* JADX INFO: renamed from: a */
    public final boolean f111635a;

    /* JADX INFO: renamed from: b */
    public final mgo0 f111636b;

    /* JADX INFO: renamed from: c */
    public final String f111637c;

    public jeo0(boolean z, mgo0 mgo0Var, String str) {
        this.f111635a = z;
        this.f111636b = mgo0Var;
        this.f111637c = str;
    }

    /* JADX INFO: renamed from: c */
    public static jeo0 m53106c(jeo0 jeo0Var, mgo0 mgo0Var, String str, int i) {
        boolean z = jeo0Var.f111635a;
        if ((i & 2) != 0) {
            mgo0Var = jeo0Var.f111636b;
        }
        if ((i & 4) != 0) {
            str = jeo0Var.f111637c;
        }
        return new jeo0(z, mgo0Var, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeo0)) {
            return false;
        }
        jeo0 jeo0Var = (jeo0) obj;
        return this.f111635a == jeo0Var.f111635a && wj50.m88271j(this.f111636b, jeo0Var.f111636b) && wj50.m88271j(this.f111637c, jeo0Var.f111637c);
    }

    public final int hashCode() {
        int iHashCode = (this.f111636b.hashCode() + (Boolean.hashCode(this.f111635a) * 31)) * 31;
        String str = this.f111637c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f111635a ? 1 : 0);
        parcel.writeParcelable(this.f111636b, i);
        parcel.writeString(this.f111637c);
    }

    public /* synthetic */ jeo0(boolean z, mgo0 mgo0Var, String str, int i) {
        this((i & 1) != 0 ? false : z, mgo0Var, (i & 4) != 0 ? null : str);
    }
}
