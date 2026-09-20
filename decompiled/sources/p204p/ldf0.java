package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ldf0 implements Parcelable {
    public static final Parcelable.Creator<ldf0> CREATOR = new r4f0(7);

    /* JADX INFO: renamed from: a */
    public final boolean f132157a;

    public ldf0(boolean z) {
        this.f132157a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldf0) && this.f132157a == ((ldf0) obj).f132157a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132157a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f132157a ? 1 : 0);
    }
}
