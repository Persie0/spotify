package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class bnj extends onj {
    public static final Parcelable.Creator<bnj> CREATOR = new wcj(28);

    /* JADX INFO: renamed from: a */
    public final int f28843a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f28844b;

    public bnj(int i, ArrayList arrayList) {
        this.f28843a = i;
        this.f28844b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnj)) {
            return false;
        }
        bnj bnjVar = (bnj) obj;
        return this.f28843a == bnjVar.f28843a && this.f28844b.equals(bnjVar.f28844b);
    }

    public final int hashCode() {
        return this.f28844b.hashCode() + (edb.m38547C(this.f28843a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AbstractC0000a.m25x(this.f28843a));
        Iterator itM42469m = fr0.m42469m(this.f28844b, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
    }
}
