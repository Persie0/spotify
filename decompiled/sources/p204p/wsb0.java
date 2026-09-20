package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class wsb0 implements Parcelable {
    public static final Parcelable.Creator<wsb0> CREATOR = new apb0(13);

    /* JADX INFO: renamed from: a */
    public final String f254573a;

    public wsb0(String str) {
        this.f254573a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsb0) && wj50.m88271j(this.f254573a, ((wsb0) obj).f254573a);
    }

    public final int hashCode() {
        return this.f254573a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f254573a);
    }
}
