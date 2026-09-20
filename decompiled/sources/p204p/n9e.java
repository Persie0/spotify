package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class n9e implements dae {
    public static final Parcelable.Creator<n9e> CREATOR = new n6e(9);

    /* JADX INFO: renamed from: a */
    public final sae f151781a;

    public n9e(sae saeVar) {
        this.f151781a = saeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9e) && wj50.m88271j(this.f151781a, ((n9e) obj).f151781a);
    }

    public final int hashCode() {
        return this.f151781a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f151781a.writeToParcel(parcel, i);
    }
}
