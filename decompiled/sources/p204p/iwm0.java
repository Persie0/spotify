package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class iwm0 implements Parcelable {
    public static final Parcelable.Creator<iwm0> CREATOR = new pum0(11);

    /* JADX INFO: renamed from: a */
    public final boolean f106482a;

    /* JADX INFO: renamed from: b */
    public final agr0 f106483b;

    /* JADX INFO: renamed from: c */
    public final boolean f106484c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f106485d;

    public iwm0(boolean z, agr0 agr0Var, boolean z2, ArrayList arrayList) {
        this.f106482a = z;
        this.f106483b = agr0Var;
        this.f106484c = z2;
        this.f106485d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwm0)) {
            return false;
        }
        iwm0 iwm0Var = (iwm0) obj;
        return this.f106482a == iwm0Var.f106482a && this.f106483b == iwm0Var.f106483b && this.f106484c == iwm0Var.f106484c && this.f106485d.equals(iwm0Var.f106485d);
    }

    public final int hashCode() {
        return this.f106485d.hashCode() + s571.m77245d((this.f106483b.hashCode() + (Boolean.hashCode(this.f106482a) * 31)) * 31, 31, this.f106484c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106482a ? 1 : 0);
        this.f106483b.writeToParcel(parcel, i);
        parcel.writeInt(this.f106484c ? 1 : 0);
        Iterator itM42469m = fr0.m42469m(this.f106485d, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
    }
}
