package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x4c extends AbstractC2206o9 {
    public static final Parcelable.Creator<x4c> CREATOR = new jja(27);

    /* JADX INFO: renamed from: a */
    public final String f258058a;

    public x4c(String str) {
        this.f258058a = str;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4c) && wj50.m88271j(this.f258058a, ((x4c) obj).f258058a);
    }

    public final int hashCode() {
        return this.f258058a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f258058a);
    }
}
