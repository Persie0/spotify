package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class f9o0 extends h9o0 {
    public static final Parcelable.Creator<f9o0> CREATOR = new o2o0(12);

    /* JADX INFO: renamed from: a */
    public final boolean f67309a;

    public f9o0(boolean z) {
        this.f67309a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9o0) && this.f67309a == ((f9o0) obj).f67309a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67309a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f67309a ? 1 : 0);
    }
}
