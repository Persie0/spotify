package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xmc1 implements knc1 {

    /* JADX INFO: renamed from: a */
    public static final xmc1 f263340a = new xmc1();
    public static final Parcelable.Creator<xmc1> CREATOR = new nlc1(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
