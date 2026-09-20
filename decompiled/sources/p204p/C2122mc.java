package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.mc */
/* JADX INFO: loaded from: classes8.dex */
public final class C2122mc extends AbstractC2209oc implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C2122mc f141996a = new C2122mc();
    public static final Parcelable.Creator<C2122mc> CREATOR = new C2047kc(1);

    @Override // p204p.AbstractC2209oc
    /* JADX INFO: renamed from: c */
    public final boolean mo58677c() {
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
