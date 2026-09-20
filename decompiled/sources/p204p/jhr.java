package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jhr implements Parcelable {
    public static final ihr CREATOR = new ihr();

    /* JADX INFO: renamed from: a */
    public final String f112555a;

    public jhr(String str) {
        this.f112555a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhr) && wj50.m88271j(this.f112555a, ((jhr) obj).f112555a);
    }

    public final int hashCode() {
        String str = this.f112555a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112555a);
    }
}
