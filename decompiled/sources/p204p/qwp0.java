package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class qwp0 implements ea80 {

    /* JADX INFO: renamed from: a */
    public static final qwp0 f193396a = new qwp0();
    public static final Parcelable.Creator<qwp0> CREATOR = new vnp0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ea80
    public final /* bridge */ /* synthetic */ Object getDefault() {
        return gbu.f78413a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
