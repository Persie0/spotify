package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fa90 implements ha90 {
    public static final Parcelable.Creator<fa90> CREATOR = new x390(24);

    /* JADX INFO: renamed from: a */
    public final Long f67492a;

    public fa90(Long l) {
        this.f67492a = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa90) && wj50.m88271j(this.f67492a, ((fa90) obj).f67492a);
    }

    public final int hashCode() {
        Long l = this.f67492a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.f67492a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
