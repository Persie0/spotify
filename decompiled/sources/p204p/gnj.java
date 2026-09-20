package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class gnj extends onj {
    public static final Parcelable.Creator<gnj> CREATOR = new dnj(2);

    /* JADX INFO: renamed from: a */
    public final String f82724a;

    public gnj(String str) {
        this.f82724a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnj) && wj50.m88271j(this.f82724a, ((gnj) obj).f82724a);
    }

    public final int hashCode() {
        return this.f82724a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f82724a);
    }
}
