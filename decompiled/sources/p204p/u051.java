package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class u051 implements a151 {

    /* JADX INFO: renamed from: a */
    public static final u051 f225390a = new u051();
    public static final Parcelable.Creator<u051> CREATOR = new q051(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
