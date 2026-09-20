package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class tre0 implements vre0 {

    /* JADX INFO: renamed from: a */
    public static final tre0 f223055a = new tre0();
    public static final Parcelable.Creator<tre0> CREATOR = new ube0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tre0);
    }

    public final int hashCode() {
        return 1276674255;
    }

    public final String toString() {
        return "AppOperation";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
