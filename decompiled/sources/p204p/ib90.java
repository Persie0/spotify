package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ib90 implements Parcelable {
    public static final Parcelable.Creator<ib90> CREATOR = new ra90(6);

    /* JADX INFO: renamed from: a */
    public final boolean f100491a;

    public ib90(boolean z) {
        this.f100491a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib90) && this.f100491a == ((ib90) obj).f100491a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100491a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f100491a ? 1 : 0);
    }
}
