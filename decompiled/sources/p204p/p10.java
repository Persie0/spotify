package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class p10 implements r10 {
    public static final Parcelable.Creator<p10> CREATOR = new C2267ps(15);

    /* JADX INFO: renamed from: a */
    public final boolean f172906a;

    public p10(boolean z) {
        this.f172906a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p10) && this.f172906a == ((p10) obj).f172906a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172906a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f172906a ? 1 : 0);
    }
}
