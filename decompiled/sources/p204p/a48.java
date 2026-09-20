package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a48 implements Parcelable {
    public static final Parcelable.Creator<a48> CREATOR = new na7(24);

    /* JADX INFO: renamed from: a */
    public final List f12152a;

    /* JADX INFO: renamed from: b */
    public final xt8 f12153b;

    public a48(List list, xt8 xt8Var) {
        this.f12152a = list;
        this.f12153b = xt8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a48)) {
            return false;
        }
        a48 a48Var = (a48) obj;
        return wj50.m88271j(this.f12152a, a48Var.f12152a) && wj50.m88271j(this.f12153b, a48Var.f12153b);
    }

    public final int hashCode() {
        int iHashCode = this.f12152a.hashCode() * 31;
        xt8 xt8Var = this.f12153b;
        return iHashCode + (xt8Var == null ? 0 : xt8Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f12152a);
        while (itM42468l.hasNext()) {
            ((zbv) itM42468l.next()).writeToParcel(parcel, i);
        }
        xt8 xt8Var = this.f12153b;
        if (xt8Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xt8Var.writeToParcel(parcel, i);
        }
    }
}
