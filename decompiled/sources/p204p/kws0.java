package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kws0 implements lws0 {

    /* JADX INFO: renamed from: a */
    public static final kws0 f127180a = new kws0();
    public static final Parcelable.Creator<kws0> CREATOR = new wds0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kws0);
    }

    public final int hashCode() {
        return -100370639;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
