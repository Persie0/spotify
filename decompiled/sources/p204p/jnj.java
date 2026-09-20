package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jnj extends onj {
    public static final Parcelable.Creator<jnj> CREATOR = new dnj(5);

    /* JADX INFO: renamed from: a */
    public final String f114120a;

    public jnj(String str) {
        this.f114120a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnj) && wj50.m88271j(this.f114120a, ((jnj) obj).f114120a);
    }

    public final int hashCode() {
        return this.f114120a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114120a);
    }
}
