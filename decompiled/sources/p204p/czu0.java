package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class czu0 implements Parcelable {
    public static final Parcelable.Creator<czu0> CREATOR = new v5u0(27);

    /* JADX INFO: renamed from: a */
    public final String f43632a;

    /* JADX INFO: renamed from: b */
    public final lzu0 f43633b;

    /* JADX INFO: renamed from: c */
    public final pla1 f43634c;

    public czu0(String str, lzu0 lzu0Var, pla1 pla1Var) {
        this.f43632a = str;
        this.f43633b = lzu0Var;
        this.f43634c = pla1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czu0)) {
            return false;
        }
        czu0 czu0Var = (czu0) obj;
        return wj50.m88271j(this.f43632a, czu0Var.f43632a) && this.f43633b == czu0Var.f43633b && wj50.m88271j(this.f43634c, czu0Var.f43634c);
    }

    public final int hashCode() {
        return this.f43634c.hashCode() + ((this.f43633b.hashCode() + (this.f43632a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43632a);
        parcel.writeString(this.f43633b.name());
        this.f43634c.writeToParcel(parcel, i);
    }
}
