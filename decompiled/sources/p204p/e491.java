package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class e491 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final e491 f56032a = new e491();
    public static final Parcelable.Creator<e491> CREATOR = new f881(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
