package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class odw0 implements Parcelable {
    public static final Parcelable.Creator<odw0> CREATOR = new b8w0(12);

    /* JADX INFO: renamed from: a */
    public final String f164260a;

    public odw0(String str) {
        this.f164260a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odw0) && wj50.m88271j(this.f164260a, ((odw0) obj).f164260a);
    }

    public final int hashCode() {
        return this.f164260a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f164260a);
    }
}
