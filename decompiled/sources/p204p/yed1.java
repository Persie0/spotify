package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class yed1 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final yed1 f271976a = new yed1();
    public static final Parcelable.Creator<yed1> CREATOR = new xed1(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
