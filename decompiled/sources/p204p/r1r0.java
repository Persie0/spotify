package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class r1r0 implements Parcelable {
    public static final Parcelable.Creator<r1r0> CREATOR = new vzq0(5);

    /* JADX INFO: renamed from: a */
    public final String f194904a;

    public r1r0(String str) {
        this.f194904a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1r0) && wj50.m88271j(this.f194904a, ((r1r0) obj).f194904a);
    }

    public final int hashCode() {
        return this.f194904a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f194904a);
    }
}
