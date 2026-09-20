package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class oo50 implements ea80 {

    /* JADX INFO: renamed from: a */
    public static final oo50 f167466a = new oo50();
    public static final Parcelable.Creator<oo50> CREATOR = new gd50(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ea80
    public final /* bridge */ /* synthetic */ Object getDefault() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
