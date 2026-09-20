package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ynz extends goz {

    /* JADX INFO: renamed from: d */
    public static final ynz f274530d = new ynz(gn80.FMA_UPSELL_AUDIO_QUALITY);
    public static final Parcelable.Creator<ynz> CREATOR = new ygz(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ynz);
    }

    public final int hashCode() {
        return 325166544;
    }

    public final String toString() {
        return "AudioQuality";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
