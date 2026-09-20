package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class u0e1 implements Parcelable {
    public static final Parcelable.Creator<u0e1> CREATOR = new xed1(8);

    /* JADX INFO: renamed from: a */
    public final String f225473a;

    public u0e1(String str) {
        this.f225473a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0e1) && wj50.m88271j(this.f225473a, ((u0e1) obj).f225473a);
    }

    public final String getUri() {
        return this.f225473a;
    }

    public final int hashCode() {
        return this.f225473a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f225473a);
    }
}
