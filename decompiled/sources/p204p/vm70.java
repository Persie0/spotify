package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class vm70 implements xm70 {

    /* JADX INFO: renamed from: a */
    public static final vm70 f242715a = new vm70();
    public static final Parcelable.Creator<vm70> CREATOR = new w270(22);

    @Override // p204p.xm70
    /* JADX INFO: renamed from: K */
    public final qm70 mo78518K() {
        return km70.f124076a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vm70);
    }

    public final int hashCode() {
        return 1994985549;
    }

    public final String toString() {
        return "ShowKeyboard";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
