package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class vhy implements xhy {
    public static final Parcelable.Creator<vhy> CREATOR = new p7y(15);

    /* JADX INFO: renamed from: a */
    public final Long f241567a;

    public vhy(Long l) {
        this.f241567a = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhy) && wj50.m88271j(this.f241567a, ((vhy) obj).f241567a);
    }

    public final int hashCode() {
        Long l = this.f241567a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.f241567a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
