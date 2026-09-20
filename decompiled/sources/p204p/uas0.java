package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class uas0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final uas0 f228544a = new uas0();
    public static final Parcelable.Creator<uas0> CREATOR = new uir0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uas0);
    }

    public final int hashCode() {
        return 1738367305;
    }

    public final String toString() {
        return "PromoDisclosurePageParameters";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
