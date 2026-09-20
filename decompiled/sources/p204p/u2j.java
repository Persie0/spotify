package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class u2j implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final u2j f226107a = new u2j();
    public static final Parcelable.Creator<u2j> CREATOR = new f2i(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u2j);
    }

    public final int hashCode() {
        return -2125335168;
    }

    public final String toString() {
        return "ConnectorAppsAuthenticationResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
