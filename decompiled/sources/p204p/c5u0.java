package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c5u0 implements f5u0 {

    /* JADX INFO: renamed from: a */
    public static final c5u0 f34291a = new c5u0();
    public static final Parcelable.Creator<c5u0> CREATOR = new vit0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c5u0);
    }

    public final int hashCode() {
        return -384313698;
    }

    public final String toString() {
        return "NoItems";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
