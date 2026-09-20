package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wgd implements Parcelable {
    public static final Parcelable.Creator<wgd> CREATOR = new qvc(19);

    /* JADX INFO: renamed from: a */
    public final String f251036a;

    public wgd(String str) {
        this.f251036a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgd) && wj50.m88271j(this.f251036a, ((wgd) obj).f251036a);
    }

    public final int hashCode() {
        return this.f251036a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f251036a);
    }
}
