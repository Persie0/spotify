package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class elt0 implements flt0 {
    public static final Parcelable.Creator<elt0> CREATOR = new vit0(4);

    /* JADX INFO: renamed from: a */
    public final String f60752a;

    public elt0(String str) {
        this.f60752a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elt0) && wj50.m88271j(this.f60752a, ((elt0) obj).f60752a);
    }

    public final int hashCode() {
        return this.f60752a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60752a);
    }
}
