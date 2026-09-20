package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class b7w0 implements h7w0 {
    public static final Parcelable.Creator<b7w0> CREATOR = new h1v0(23);

    /* JADX INFO: renamed from: a */
    public final fyy f24433a;

    public b7w0(fyy fyyVar) {
        this.f24433a = fyyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7w0) && wj50.m88271j(this.f24433a, ((b7w0) obj).f24433a);
    }

    public final int hashCode() {
        return this.f24433a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f24433a.writeToParcel(parcel, i);
    }
}
