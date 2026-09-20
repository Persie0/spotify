package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ho90 extends ko90 {

    /* JADX INFO: renamed from: a */
    public static final ho90 f93484a = new ho90();
    public static final Parcelable.Creator<ho90> CREATOR = new n6f1(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
