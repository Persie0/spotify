package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class b281 implements Parcelable {
    public static final Parcelable.Creator<b281> CREATOR = new sr71(22);

    /* JADX INFO: renamed from: a */
    public final n1s0 f22525a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f22526b;

    public b281(n1s0 n1s0Var, ArrayList arrayList) {
        this.f22525a = n1s0Var;
        this.f22526b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b281)) {
            return false;
        }
        b281 b281Var = (b281) obj;
        return wj50.m88271j(this.f22525a, b281Var.f22525a) && this.f22526b.equals(b281Var.f22526b);
    }

    public final int hashCode() {
        return this.f22526b.hashCode() + (this.f22525a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f22525a.writeToParcel(parcel, i);
        Iterator itM42469m = fr0.m42469m(this.f22526b, parcel);
        while (itM42469m.hasNext()) {
            ((hyy) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
