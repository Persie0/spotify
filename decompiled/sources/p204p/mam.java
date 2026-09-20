package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class mam implements Parcelable {
    public static final Parcelable.Creator<mam> CREATOR = new pkl(13);

    /* JADX INFO: renamed from: a */
    public final yth0 f141611a;

    public mam(yth0 yth0Var) {
        this.f141611a = yth0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mam) && wj50.m88271j(this.f141611a, ((mam) obj).f141611a);
    }

    public final int hashCode() {
        return this.f141611a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f141611a, i);
    }
}
