package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zvd0 implements awd0 {
    public static final Parcelable.Creator<zvd0> CREATOR = new jfd0(22);

    /* JADX INFO: renamed from: a */
    public final t2b0 f286688a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f286689b;

    public zvd0(t2b0 t2b0Var, ArrayList arrayList) {
        this.f286688a = t2b0Var;
        this.f286689b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvd0)) {
            return false;
        }
        zvd0 zvd0Var = (zvd0) obj;
        return this.f286688a.equals(zvd0Var.f286688a) && this.f286689b.equals(zvd0Var.f286689b);
    }

    public final int hashCode() {
        return this.f286689b.hashCode() + (this.f286688a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        t2b0 t2b0Var = this.f286688a;
        parcel.writeLong(t2b0Var.f195112a);
        parcel.writeLong(t2b0Var.f195113b);
        Iterator itM42469m = fr0.m42469m(this.f286689b, parcel);
        while (itM42469m.hasNext()) {
            ((jd71) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
