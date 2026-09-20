package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class eby implements i6z0 {
    public static final Parcelable.Creator<eby> CREATOR = new p7y(2);

    /* JADX INFO: renamed from: a */
    public final int f58157a;

    public eby(int i) {
        this.f58157a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eby) && this.f58157a == ((eby) obj).f58157a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58157a);
    }

    @Override // p204p.i6z0
    /* JADX INFO: renamed from: s */
    public final int mo27367s() {
        return this.f58157a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f58157a);
    }
}
