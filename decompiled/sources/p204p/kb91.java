package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kb91 extends nb91 {

    /* JADX INFO: renamed from: a */
    public static final kb91 f121155a = new kb91();
    public static final Parcelable.Creator<kb91> CREATOR = new f891(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
