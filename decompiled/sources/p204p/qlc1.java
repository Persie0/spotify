package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class qlc1 implements knc1 {

    /* JADX INFO: renamed from: a */
    public static final qlc1 f189827a = new qlc1();
    public static final Parcelable.Creator<qlc1> CREATOR = new nlc1(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
