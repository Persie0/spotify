package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lq71 implements mq71 {

    /* JADX INFO: renamed from: a */
    public static final lq71 f135969a = new lq71();
    public static final Parcelable.Creator<lq71> CREATOR = new c071(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lq71);
    }

    public final int hashCode() {
        return -517764574;
    }

    public final String toString() {
        return "Offline";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
