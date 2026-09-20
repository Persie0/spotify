package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class t051 implements a151 {

    /* JADX INFO: renamed from: a */
    public static final t051 f215765a = new t051();
    public static final Parcelable.Creator<t051> CREATOR = new q051(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
