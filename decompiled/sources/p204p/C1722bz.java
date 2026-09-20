package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.bz */
/* JADX INFO: loaded from: classes10.dex */
public final class C1722bz implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final C1722bz f32333a = new C1722bz();
    public static final Parcelable.Creator<C1722bz> CREATOR = new C2267ps(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1722bz);
    }

    public final int hashCode() {
        return -371711337;
    }

    public final String toString() {
        return "Dismiss";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
