package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lb91 extends nb91 {

    /* JADX INFO: renamed from: a */
    public static final lb91 f131604a = new lb91();
    public static final Parcelable.Creator<lb91> CREATOR = new f891(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
