package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class a520 implements c520 {
    public static final Parcelable.Creator<a520> CREATOR = new t320(5);

    /* JADX INFO: renamed from: a */
    public final Long f12378a;

    public a520(Long l) {
        this.f12378a = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a520) && wj50.m88271j(this.f12378a, ((a520) obj).f12378a);
    }

    public final int hashCode() {
        Long l = this.f12378a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.f12378a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
