package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class bpb0 implements dpb0 {

    /* JADX INFO: renamed from: a */
    public static final bpb0 f29397a = new bpb0();
    public static final Parcelable.Creator<bpb0> CREATOR = new apb0(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
