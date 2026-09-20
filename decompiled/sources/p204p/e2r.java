package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e2r implements Parcelable {
    public static final Parcelable.Creator<e2r> CREATOR = new lso(24);

    /* JADX INFO: renamed from: a */
    public final List f55503a;

    /* JADX INFO: renamed from: b */
    public final int f55504b;

    public e2r(int i, List list) {
        this.f55503a = list;
        this.f55504b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2r)) {
            return false;
        }
        e2r e2rVar = (e2r) obj;
        return wj50.m88271j(this.f55503a, e2rVar.f55503a) && this.f55504b == e2rVar.f55504b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f55504b) + (this.f55503a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM42468l = fr0.m42468l(parcel, this.f55503a);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        int i2 = this.f55504b;
        if (i2 == 1) {
            str = "PLATFORM";
        } else if (i2 == 2) {
            str = "KEEP";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SMART";
        }
        parcel.writeString(str);
    }
}
