package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class omc1 implements pmc1 {
    public static final Parcelable.Creator<omc1> CREATOR = new nlc1(24);

    /* JADX INFO: renamed from: a */
    public final String f167013a;

    public omc1(String str) {
        this.f167013a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omc1) && wj50.m88271j(this.f167013a, ((omc1) obj).f167013a);
    }

    @Override // p204p.pmc1
    public final String getTitle() {
        return this.f167013a;
    }

    public final int hashCode() {
        return this.f167013a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167013a);
    }
}
