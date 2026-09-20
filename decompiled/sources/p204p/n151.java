package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n151 implements p151 {
    public static final Parcelable.Creator<n151> CREATOR;

    /* JADX INFO: renamed from: a */
    public final String f149301a;

    /* JADX INFO: renamed from: b */
    public final List f149302b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
        CREATOR = new q051(8);
    }

    public n151(String str, List list) {
        this.f149301a = str;
        this.f149302b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n151)) {
            return false;
        }
        n151 n151Var = (n151) obj;
        return wj50.m88271j(this.f149301a, n151Var.f149301a) && wj50.m88271j(this.f149302b, n151Var.f149302b);
    }

    public final int hashCode() {
        String str = this.f149301a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f149302b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149301a);
        List list = this.f149302b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    public /* synthetic */ n151(String str, int i, List list) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
