package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class v321 implements x321 {

    /* JADX INFO: renamed from: a */
    public static final v321 f236755a = new v321();
    public static final Parcelable.Creator<v321> CREATOR = new q321(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
