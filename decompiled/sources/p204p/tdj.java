package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class tdj implements vdj {
    public static final Parcelable.Creator<tdj> CREATOR = new wcj(18);

    /* JADX INFO: renamed from: a */
    public final String f219312a;

    public tdj(String str) {
        this.f219312a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdj) && wj50.m88271j(this.f219312a, ((tdj) obj).f219312a);
    }

    public final int hashCode() {
        return this.f219312a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f219312a);
    }
}
