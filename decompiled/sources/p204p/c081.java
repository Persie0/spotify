package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class c081 extends e081 {
    public static final Parcelable.Creator<c081> CREATOR = new sr71(17);

    /* JADX INFO: renamed from: a */
    public final s511 f32713a;

    public c081(s511 s511Var) {
        this.f32713a = s511Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c081) && wj50.m88271j(this.f32713a, ((c081) obj).f32713a);
    }

    public final int hashCode() {
        return this.f32713a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f32713a, i);
    }
}
