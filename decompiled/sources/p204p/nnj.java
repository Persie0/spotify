package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nnj extends onj {
    public static final Parcelable.Creator<nnj> CREATOR = new dnj(9);

    /* JADX INFO: renamed from: a */
    public final String f156436a;

    public nnj(String str) {
        this.f156436a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnj) && wj50.m88271j(this.f156436a, ((nnj) obj).f156436a);
    }

    public final int hashCode() {
        return this.f156436a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f156436a);
    }
}
