package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class qoe0 implements ea80 {

    /* JADX INFO: renamed from: a */
    public static final qoe0 f190928a = new qoe0();
    public static final Parcelable.Creator<qoe0> CREATOR = new ube0(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ea80
    public final /* bridge */ /* synthetic */ Object getDefault() {
        return soe0.f211178a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
