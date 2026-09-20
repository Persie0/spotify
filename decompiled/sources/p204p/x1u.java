package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class x1u extends b2u {
    public static final Parcelable.Creator<x1u> CREATOR = new qct(10);

    /* JADX INFO: renamed from: a */
    public final String f257277a;

    public x1u(String str) {
        this.f257277a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1u) && wj50.m88271j(this.f257277a, ((x1u) obj).f257277a);
    }

    public final int hashCode() {
        return this.f257277a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f257277a);
    }
}
