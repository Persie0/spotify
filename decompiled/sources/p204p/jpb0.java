package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class jpb0 implements kpb0 {

    /* JADX INFO: renamed from: a */
    public static final jpb0 f114606a = new jpb0();
    public static final Parcelable.Creator<jpb0> CREATOR = new apb0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
