package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.tb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2407tb extends AbstractC2566xb implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C2407tb f218722a = new C2407tb();
    public static final Parcelable.Creator<C2407tb> CREATOR = new ora(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
