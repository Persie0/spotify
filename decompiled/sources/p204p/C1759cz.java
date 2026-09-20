package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.cz */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759cz extends e10 {

    /* JADX INFO: renamed from: a */
    public static final C1759cz f43410a = new C1759cz("");
    public static final Parcelable.Creator<C1759cz> CREATOR = new C2267ps(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
