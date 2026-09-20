package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class mnp implements Parcelable {
    public static final Parcelable.Creator<mnp> CREATOR = new n6f1(13);

    /* JADX INFO: renamed from: a */
    public final int f145466a;

    public mnp(int i) {
        this.f145466a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnp) && this.f145466a == ((mnp) obj).f145466a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145466a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("DefaultLazyKey(index="), this.f145466a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f145466a);
    }
}
