package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class rdj implements vdj {
    public static final Parcelable.Creator<rdj> CREATOR = new wcj(16);

    /* JADX INFO: renamed from: a */
    public final String f198154a;

    public rdj(String str) {
        this.f198154a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdj) && wj50.m88271j(this.f198154a, ((rdj) obj).f198154a);
    }

    public final int hashCode() {
        return this.f198154a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f198154a);
    }
}
