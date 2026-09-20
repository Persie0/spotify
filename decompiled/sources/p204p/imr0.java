package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class imr0 implements ea80 {

    /* JADX INFO: renamed from: a */
    public static final imr0 f103771a = new imr0();

    /* JADX INFO: renamed from: b */
    public static final tqr0 f103772b = new tqr0("", "", "", true);
    public static final Parcelable.Creator<imr0> CREATOR = new uir0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.ea80
    public final /* bridge */ /* synthetic */ Object getDefault() {
        return f103772b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
