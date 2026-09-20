package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tbj implements Parcelable {
    public static final Parcelable.Creator<tbj> CREATOR = new f2i(29);

    /* JADX INFO: renamed from: a */
    public final String f218873a;

    public tbj(String str) {
        this.f218873a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbj) && wj50.m88271j(this.f218873a, ((tbj) obj).f218873a);
    }

    public final String getUri() {
        return this.f218873a;
    }

    public final int hashCode() {
        return this.f218873a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f218873a);
    }
}
