package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class il10 implements ml10 {

    /* JADX INFO: renamed from: a */
    public static final il10 f103263a = new il10();
    public static final Parcelable.Creator<il10> CREATOR = new qz00(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
