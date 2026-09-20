package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rss implements Parcelable {
    public static final Parcelable.Creator<rss> CREATOR = new f9s(11);

    /* JADX INFO: renamed from: a */
    public final String f202399a;

    public rss(String str) {
        this.f202399a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rss) && wj50.m88271j(this.f202399a, ((rss) obj).f202399a);
    }

    public final int hashCode() {
        return this.f202399a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f202399a);
    }
}
