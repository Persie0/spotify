package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class vne1 implements wne1 {
    public static final Parcelable.Creator<vne1> CREATOR = new tne1(1);

    /* JADX INFO: renamed from: a */
    public final ArrayList f243108a;

    /* JADX INFO: renamed from: b */
    public final ur31 f243109b;

    public vne1(ArrayList arrayList, ur31 ur31Var) {
        this.f243108a = arrayList;
        this.f243109b = ur31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vne1)) {
            return false;
        }
        vne1 vne1Var = (vne1) obj;
        return this.f243108a.equals(vne1Var.f243108a) && this.f243109b == vne1Var.f243109b;
    }

    public final int hashCode() {
        int iHashCode = this.f243108a.hashCode() * 31;
        ur31 ur31Var = this.f243109b;
        return iHashCode + (ur31Var == null ? 0 : ur31Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f243108a, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeString(((ur31) itM42469m.next()).name());
        }
        ur31 ur31Var = this.f243109b;
        if (ur31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ur31Var.name());
        }
    }
}
