package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class soq implements Parcelable {
    public static final Parcelable.Creator<soq> CREATOR = new lso(7);

    /* JADX INFO: renamed from: a */
    public final String f212632a;

    public soq(String str) {
        this.f212632a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m78835c() {
        return this.f212632a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof soq) && wj50.m88271j(this.f212632a, ((soq) obj).f212632a);
    }

    public final int hashCode() {
        return this.f212632a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f212632a);
    }
}
