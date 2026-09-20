package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class yl7 implements zl7 {

    /* JADX INFO: renamed from: a */
    public static final yl7 f273926a = new yl7();
    public static final Parcelable.Creator<yl7> CREATOR = new n6f1(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
