package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class do8 extends go8 {

    /* JADX INFO: renamed from: a */
    public static final do8 f50966a = new do8();
    public static final Parcelable.Creator<do8> CREATOR = new yi8(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
