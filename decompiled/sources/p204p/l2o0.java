package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class l2o0 implements n2o0 {
    public static final Parcelable.Creator<l2o0> CREATOR = new ejn0(28);

    /* JADX INFO: renamed from: a */
    public final int f129058a;

    public l2o0(int i) {
        this.f129058a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2o0) && this.f129058a == ((l2o0) obj).f129058a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129058a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f129058a);
    }
}
