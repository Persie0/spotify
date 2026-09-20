package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class xv50 extends dw50 {
    public static final Parcelable.Creator<xv50> CREATOR = new pq50(6);

    /* JADX INFO: renamed from: a */
    public final int f266285a;

    /* JADX INFO: renamed from: b */
    public final List f266286b;

    public xv50(int i, List list) {
        this.f266285a = i;
        this.f266286b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv50)) {
            return false;
        }
        xv50 xv50Var = (xv50) obj;
        return this.f266285a == xv50Var.f266285a && wj50.m88271j(this.f266286b, xv50Var.f266286b);
    }

    public final int hashCode() {
        return this.f266286b.hashCode() + (Integer.hashCode(this.f266285a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f266285a);
        Iterator itM42468l = fr0.m42468l(parcel, this.f266286b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }
}
