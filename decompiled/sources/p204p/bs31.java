package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bs31 implements Parcelable {
    public static final Parcelable.Creator<bs31> CREATOR = new ln31(8);

    /* JADX INFO: renamed from: a */
    public final wr31 f30227a;

    /* JADX INFO: renamed from: b */
    public final List f30228b;

    /* JADX INFO: renamed from: c */
    public final List f30229c;

    public bs31(wr31 wr31Var, List list, List list2) {
        this.f30227a = wr31Var;
        this.f30228b = list;
        this.f30229c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs31)) {
            return false;
        }
        bs31 bs31Var = (bs31) obj;
        return this.f30227a == bs31Var.f30227a && wj50.m88271j(this.f30228b, bs31Var.f30228b) && wj50.m88271j(this.f30229c, bs31Var.f30229c);
    }

    public final int hashCode() {
        return this.f30229c.hashCode() + s571.m77244c(this.f30227a.hashCode() * 31, 31, this.f30228b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30227a.name());
        Iterator itM42468l = fr0.m42468l(parcel, this.f30228b);
        while (itM42468l.hasNext()) {
            parcel.writeString(((wr31) itM42468l.next()).name());
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f30229c);
        while (itM42468l2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l2.next(), i);
        }
    }
}
