package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ejd extends jjd {
    public static final Parcelable.Creator<ejd> CREATOR = new qvc(29);

    /* JADX INFO: renamed from: a */
    public final gcl f60196a;

    public ejd(gcl gclVar) {
        this.f60196a = gclVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejd) && wj50.m88271j(this.f60196a, ((ejd) obj).f60196a);
    }

    public final int hashCode() {
        return this.f60196a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f60196a, i);
    }
}
