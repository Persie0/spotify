package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zxw0 extends byw0 {
    public static final Parcelable.Creator<zxw0> CREATOR = new xxw0(1);

    /* JADX INFO: renamed from: a */
    public final int f287419a;

    public zxw0(int i) {
        this.f287419a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxw0) && this.f287419a == ((zxw0) obj).f287419a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f287419a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f287419a);
    }
}
