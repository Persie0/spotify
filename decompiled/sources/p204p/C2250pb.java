package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.pb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2250pb extends AbstractC2332rb implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C2250pb f175656a = new C2250pb();
    public static final Parcelable.Creator<C2250pb> CREATOR = new ora(14);

    @Override // p204p.AbstractC2332rb
    /* JADX INFO: renamed from: c */
    public final boolean mo66584c() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
