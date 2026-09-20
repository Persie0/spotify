package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.tz */
/* JADX INFO: loaded from: classes3.dex */
public final class C2433tz extends e10 {

    /* JADX INFO: renamed from: a */
    public static final C2433tz f225078a = new C2433tz("");
    public static final Parcelable.Creator<C2433tz> CREATOR = new C2267ps(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
