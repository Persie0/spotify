package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class s051 implements x051 {

    /* JADX INFO: renamed from: a */
    public static final s051 f204308a = new s051();
    public static final Parcelable.Creator<s051> CREATOR = new q051(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
