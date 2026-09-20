package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kq71 implements mq71 {

    /* JADX INFO: renamed from: a */
    public static final kq71 f125230a = new kq71();
    public static final Parcelable.Creator<kq71> CREATOR = new c071(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kq71);
    }

    public final int hashCode() {
        return -1337174305;
    }

    public final String toString() {
        return "HttpError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
