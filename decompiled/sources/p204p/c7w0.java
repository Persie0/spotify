package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class c7w0 implements h7w0 {
    public static final Parcelable.Creator<c7w0> CREATOR = new h1v0(24);

    /* JADX INFO: renamed from: a */
    public final fyy f35039a;

    public c7w0(fyy fyyVar) {
        this.f35039a = fyyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7w0) && wj50.m88271j(this.f35039a, ((c7w0) obj).f35039a);
    }

    public final int hashCode() {
        return this.f35039a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f35039a.writeToParcel(parcel, i);
    }
}
