package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class clu0 implements Parcelable {
    public static final Parcelable.Creator<clu0> CREATOR = new v5u0(21);

    /* JADX INFO: renamed from: a */
    public final String f39401a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f39402b;

    public clu0(String str, ArrayList arrayList) {
        this.f39401a = str;
        this.f39402b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clu0)) {
            return false;
        }
        clu0 clu0Var = (clu0) obj;
        return wj50.m88271j(this.f39401a, clu0Var.f39401a) && this.f39402b.equals(clu0Var.f39402b);
    }

    public final int hashCode() {
        return this.f39402b.hashCode() + (this.f39401a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39401a);
        ArrayList arrayList = this.f39402b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
