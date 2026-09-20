package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dq01 extends fq01 {

    /* JADX INFO: renamed from: d */
    public static final dq01 f51788d = new dq01(3, "whatsapp-status");
    public static final Parcelable.Creator<dq01> CREATOR = new sp01(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dq01);
    }

    public final int hashCode() {
        return -816244738;
    }

    public final String toString() {
        return "WhatsappStatus";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
