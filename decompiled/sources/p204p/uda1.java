package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class uda1 extends vda1 {
    public static final Parcelable.Creator<uda1> CREATOR = new u2a1(8);

    /* JADX INFO: renamed from: a */
    public final int f229216a;

    public uda1(int i) {
        this.f229216a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uda1) && this.f229216a == ((uda1) obj).f229216a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229216a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f229216a);
    }
}
