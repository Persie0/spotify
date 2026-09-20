package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ko11 implements lo11 {
    public static final Parcelable.Creator<ko11> CREATOR = new u111(22);

    /* JADX INFO: renamed from: a */
    public final String f124500a;

    public ko11(String str) {
        this.f124500a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko11) && wj50.m88271j(this.f124500a, ((ko11) obj).f124500a);
    }

    public final int hashCode() {
        return this.f124500a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f124500a);
    }
}
