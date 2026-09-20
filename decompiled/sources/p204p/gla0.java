package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gla0 implements Parcelable {
    public static final Parcelable.Creator<gla0> CREATOR = new z8a0(25);

    /* JADX INFO: renamed from: a */
    public final String f81033a;

    /* JADX INFO: renamed from: b */
    public final int f81034b;

    public gla0(String str, int i) {
        this.f81033a = str;
        this.f81034b = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m45106c() {
        return this.f81034b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gla0)) {
            return false;
        }
        gla0 gla0Var = (gla0) obj;
        return wj50.m88271j(this.f81033a, gla0Var.f81033a) && this.f81034b == gla0Var.f81034b;
    }

    public final String getUri() {
        return this.f81033a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f81034b) + (this.f81033a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f81033a);
        int i2 = this.f81034b;
        if (i2 == 1) {
            str = "DEFAULT";
        } else if (i2 == 2) {
            str = "SET_PREFERRED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SET_BROWSE";
        }
        parcel.writeString(str);
    }
}
