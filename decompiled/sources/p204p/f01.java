package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class f01 extends z01 {
    public static final Parcelable.Creator<f01> CREATOR = new zz0(5);

    /* JADX INFO: renamed from: a */
    public final boolean f64523a;

    public f01(boolean z) {
        this.f64523a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f01) && this.f64523a == ((f01) obj).f64523a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64523a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f64523a ? 1 : 0);
    }
}
