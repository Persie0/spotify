package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class q3l0 implements Parcelable {
    public static final Parcelable.Creator<q3l0> CREATOR = new oxk0(24);

    /* JADX INFO: renamed from: a */
    public final String f184897a;

    public q3l0(String str) {
        this.f184897a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3l0) && wj50.m88271j(this.f184897a, ((q3l0) obj).f184897a);
    }

    public final int hashCode() {
        return this.f184897a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f184897a);
    }
}
