package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class uta0 implements xta0 {

    /* JADX INFO: renamed from: a */
    public static final uta0 f233861a = new uta0();
    public static final Parcelable.Creator<uta0> CREATOR = new ama0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
