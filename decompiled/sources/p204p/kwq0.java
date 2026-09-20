package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kwq0 implements Parcelable {
    public static final Parcelable.Creator<kwq0> CREATOR = new vnp0(25);

    /* JADX INFO: renamed from: a */
    public final String f127173a;

    public kwq0(String str) {
        this.f127173a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwq0) && wj50.m88271j(this.f127173a, ((kwq0) obj).f127173a);
    }

    public final int hashCode() {
        return this.f127173a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f127173a);
    }
}
