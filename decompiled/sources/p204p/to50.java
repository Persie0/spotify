package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class to50 implements ea80 {

    /* JADX INFO: renamed from: a */
    public static final to50 f222185a = new to50();
    public static final Parcelable.Creator<to50> CREATOR = new gd50(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ea80
    public final /* bridge */ /* synthetic */ Object getDefault() {
        return Boolean.FALSE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
