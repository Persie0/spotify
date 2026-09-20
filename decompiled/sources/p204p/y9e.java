package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class y9e implements z9e {
    public static final Parcelable.Creator<y9e> CREATOR = new n6e(20);

    /* JADX INFO: renamed from: a */
    public final ok10 f270579a;

    public y9e(ok10 ok10Var) {
        this.f270579a = ok10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9e) && wj50.m88271j(this.f270579a, ((y9e) obj).f270579a);
    }

    public final int hashCode() {
        return this.f270579a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f270579a, i);
    }
}
