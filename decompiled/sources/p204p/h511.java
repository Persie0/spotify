package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class h511 extends l511 {

    /* JADX INFO: renamed from: b */
    public static final h511 f87702b = new h511("context_menu");
    public static final Parcelable.Creator<h511> CREATOR = new u111(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h511);
    }

    public final int hashCode() {
        return -121073978;
    }

    public final String toString() {
        return "ContextMenu";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
