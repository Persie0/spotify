package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class jtf0 implements mtf0 {

    /* JADX INFO: renamed from: a */
    public static final jtf0 f115858a = new jtf0();
    public static final Parcelable.Creator<jtf0> CREATOR = new r4f0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jtf0);
    }

    public final int hashCode() {
        return -1962994812;
    }

    public final String toString() {
        return "OnlyAvailableInFree";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p204p.mtf0
    /* JADX INFO: renamed from: y */
    public final /* bridge */ /* synthetic */ ptf0 mo54285y() {
        return ntf0.f158060a;
    }
}
