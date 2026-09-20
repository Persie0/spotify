package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class m661 implements t661 {

    /* JADX INFO: renamed from: a */
    public static final m661 f140398a = new m661();
    public static final Parcelable.Creator<m661> CREATOR = new e361(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
