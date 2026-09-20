package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class skl implements Parcelable {
    public static final Parcelable.Creator<skl> CREATOR = new pkl(1);

    /* JADX INFO: renamed from: a */
    public final j6y f210161a;

    public skl(j6y j6yVar) {
        this.f210161a = j6yVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skl) && wj50.m88271j(this.f210161a, ((skl) obj).f210161a);
    }

    public final int hashCode() {
        return this.f210161a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f210161a, i);
    }
}
