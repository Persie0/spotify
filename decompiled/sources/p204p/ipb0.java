package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ipb0 implements kpb0 {

    /* JADX INFO: renamed from: a */
    public static final ipb0 f104465a = new ipb0();
    public static final Parcelable.Creator<ipb0> CREATOR = new apb0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
