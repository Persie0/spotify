package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class o68 implements Parcelable {
    public static final Parcelable.Creator<o68> CREATOR = new na7(26);

    /* JADX INFO: renamed from: a */
    public final List f162269a;

    /* JADX INFO: renamed from: b */
    public final double f162270b;

    /* JADX INFO: renamed from: c */
    public final double f162271c;

    public o68(AbstractList abstractList, double d, double d2) {
        this.f162269a = abstractList;
        this.f162270b = d;
        this.f162271c = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o68)) {
            return false;
        }
        o68 o68Var = (o68) obj;
        return wj50.m88271j(this.f162269a, o68Var.f162269a) && Double.compare(this.f162270b, o68Var.f162270b) == 0 && Double.compare(this.f162271c, o68Var.f162271c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f162271c) + xl81.m91399h(this.f162270b, this.f162269a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f162269a);
        while (itM42468l.hasNext()) {
            ((b6q0) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.f162270b);
        parcel.writeDouble(this.f162271c);
    }
}
