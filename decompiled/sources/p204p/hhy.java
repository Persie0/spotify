package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hhy implements jhy {
    public static final Parcelable.Creator<hhy> CREATOR = new p7y(10);

    /* JADX INFO: renamed from: a */
    public final Long f91613a;

    public hhy(Long l) {
        this.f91613a = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhy) && wj50.m88271j(this.f91613a, ((hhy) obj).f91613a);
    }

    public final int hashCode() {
        Long l = this.f91613a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.f91613a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
