package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class yc2 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final yc2 f271359a = new yc2();
    public static final Parcelable.Creator<yc2> CREATOR = new lb2(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
