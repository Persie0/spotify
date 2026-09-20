package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class e2o0 implements Parcelable {
    public static final Parcelable.Creator<e2o0> CREATOR = new ejn0(24);

    /* JADX INFO: renamed from: a */
    public final r2o0 f55496a;

    public e2o0(r2o0 r2o0Var) {
        this.f55496a = r2o0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2o0) && wj50.m88271j(this.f55496a, ((e2o0) obj).f55496a);
    }

    public final int hashCode() {
        return this.f55496a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f55496a, i);
    }
}
