package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class iuv0 implements Parcelable {
    public static final Parcelable.Creator<iuv0> CREATOR = new h1v0(19);

    /* JADX INFO: renamed from: a */
    public final String f106045a;

    public iuv0(String str) {
        this.f106045a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m51700c() {
        return this.f106045a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuv0) && wj50.m88271j(this.f106045a, ((iuv0) obj).f106045a);
    }

    public final int hashCode() {
        return this.f106045a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106045a);
    }
}
