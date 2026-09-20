package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wob0 implements yob0 {

    /* JADX INFO: renamed from: a */
    public static final wob0 f253428a = new wob0();
    public static final Parcelable.Creator<wob0> CREATOR = new rib0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
