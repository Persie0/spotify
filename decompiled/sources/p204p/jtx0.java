package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jtx0 implements ktx0 {
    public static final Parcelable.Creator<jtx0> CREATOR = new csx0(12);

    /* JADX INFO: renamed from: a */
    public final int f115982a;

    public jtx0(int i) {
        this.f115982a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtx0) && this.f115982a == ((jtx0) obj).f115982a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115982a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f115982a);
    }
}
