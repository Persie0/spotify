package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vir0 extends wir0 {
    public static final Parcelable.Creator<vir0> CREATOR = new uir0(0);

    /* JADX INFO: renamed from: c */
    public final List f241778c;

    /* JADX INFO: renamed from: d */
    public final String f241779d;

    /* JADX INFO: renamed from: e */
    public final tmw0 f241780e;

    public vir0(List list, String str, tmw0 tmw0Var) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pt51) it.next()).f181048a);
        }
        super(2, arrayList);
        this.f241778c = list;
        this.f241779d = str;
        this.f241780e = tmw0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vir0)) {
            return false;
        }
        vir0 vir0Var = (vir0) obj;
        return wj50.m88271j(this.f241778c, vir0Var.f241778c) && wj50.m88271j(this.f241779d, vir0Var.f241779d) && this.f241780e == vir0Var.f241780e;
    }

    public final int hashCode() {
        int iHashCode = this.f241778c.hashCode() * 31;
        String str = this.f241779d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tmw0 tmw0Var = this.f241780e;
        return iHashCode2 + (tmw0Var != null ? tmw0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f241778c);
        while (itM42468l.hasNext()) {
            ((pt51) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f241779d);
        tmw0 tmw0Var = this.f241780e;
        if (tmw0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tmw0Var.name());
        }
    }
}
