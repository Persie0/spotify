package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class dq41 implements Parcelable {
    public static final Parcelable.Creator<dq41> CREATOR = new tj41(7);

    /* JADX INFO: renamed from: a */
    public final s7y f51814a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f51815b;

    public dq41(s7y s7yVar, ArrayList arrayList) {
        this.f51814a = s7yVar;
        this.f51815b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq41)) {
            return false;
        }
        dq41 dq41Var = (dq41) obj;
        return wj50.m88271j(this.f51814a, dq41Var.f51814a) && this.f51815b.equals(dq41Var.f51815b);
    }

    public final int hashCode() {
        return this.f51815b.hashCode() + (this.f51814a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f51814a.writeToParcel(parcel, i);
        Iterator itM42469m = fr0.m42469m(this.f51815b, parcel);
        while (itM42469m.hasNext()) {
            ((s7y) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
