package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ysm0 implements Parcelable {
    public static final Parcelable.Creator<ysm0> CREATOR = new cpl0(23);

    /* JADX INFO: renamed from: a */
    public final atm0 f275841a;

    /* JADX INFO: renamed from: b */
    public final Object f275842b;

    public ysm0(atm0 atm0Var, List list) {
        this.f275841a = atm0Var;
        this.f275842b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysm0)) {
            return false;
        }
        ysm0 ysm0Var = (ysm0) obj;
        return wj50.m88271j(this.f275841a, ysm0Var.f275841a) && this.f275842b.equals(ysm0Var.f275842b);
    }

    public final int hashCode() {
        return this.f275842b.hashCode() + (this.f275841a.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f275841a.writeToParcel(parcel, i);
        ?? r0 = this.f275842b;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((atm0) it.next()).writeToParcel(parcel, i);
        }
    }
}
