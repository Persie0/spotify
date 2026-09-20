package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class p661 implements t661, fpp, yyu0 {

    /* JADX INFO: renamed from: a */
    public static final p661 f174303a = new p661();
    public static final Parcelable.Creator<p661> CREATOR = new e361(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
