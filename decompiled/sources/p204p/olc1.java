package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class olc1 implements knc1 {

    /* JADX INFO: renamed from: a */
    public static final olc1 f166821a = new olc1();
    public static final Parcelable.Creator<olc1> CREATOR = new c8b1(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
