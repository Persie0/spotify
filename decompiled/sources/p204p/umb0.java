package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class umb0 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final umb0 f231792a = new umb0();
    public static final Parcelable.Creator<umb0> CREATOR = new rib0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
