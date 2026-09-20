package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ee2 extends he2 {

    /* JADX INFO: renamed from: a */
    public static final ee2 f58650a = new ee2();
    public static final Parcelable.Creator<ee2> CREATOR = new lb2(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
