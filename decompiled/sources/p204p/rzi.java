package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rzi extends vzi {

    /* JADX INFO: renamed from: a */
    public static final rzi f204155a = new rzi();
    public static final Parcelable.Creator<rzi> CREATOR = new f2i(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
