package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class db6 implements fb6 {
    public static final Parcelable.Creator<db6> CREATOR = new vp5(19);

    /* JADX INFO: renamed from: a */
    public final uc40 f47223a;

    public db6(uc40 uc40Var) {
        this.f47223a = uc40Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db6) && wj50.m88271j(this.f47223a, ((db6) obj).f47223a);
    }

    public final int hashCode() {
        return this.f47223a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47223a, i);
    }
}
