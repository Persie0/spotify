package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class aoz extends goz {

    /* JADX INFO: renamed from: d */
    public static final aoz f17792d = new aoz(gn80.FMA_UPSELL_MUSIC_VIDEO);
    public static final Parcelable.Creator<aoz> CREATOR = new ygz(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aoz);
    }

    public final int hashCode() {
        return 776913053;
    }

    public final String toString() {
        return "MusicVideo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
