package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class o661 implements t661, fpp {

    /* JADX INFO: renamed from: a */
    public static final o661 f162260a = new o661();
    public static final Parcelable.Creator<o661> CREATOR = new e361(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
