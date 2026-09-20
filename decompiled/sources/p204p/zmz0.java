package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zmz0 implements Parcelable {
    public static final Parcelable.Creator<zmz0> CREATOR = new vcz0(5);

    /* JADX INFO: renamed from: a */
    public final ktx0 f284375a;

    /* JADX INFO: renamed from: b */
    public final List f284376b;

    public zmz0(ktx0 ktx0Var, List list) {
        this.f284375a = ktx0Var;
        this.f284376b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmz0)) {
            return false;
        }
        zmz0 zmz0Var = (zmz0) obj;
        return wj50.m88271j(this.f284375a, zmz0Var.f284375a) && wj50.m88271j(this.f284376b, zmz0Var.f284376b);
    }

    public final int hashCode() {
        return this.f284376b.hashCode() + (this.f284375a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f284375a, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f284376b);
        while (itM42468l.hasNext()) {
            parcel.writeInt(((Number) itM42468l.next()).intValue());
        }
    }
}
