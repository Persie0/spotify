package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class dub0 extends fub0 {

    /* JADX INFO: renamed from: a */
    public static final dub0 f53026a = new dub0();
    public static final Parcelable.Creator<dub0> CREATOR = new apb0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
