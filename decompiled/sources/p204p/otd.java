package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class otd implements qtd {
    public static final Parcelable.Creator<otd> CREATOR;

    /* JADX INFO: renamed from: a */
    public final String f169036a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f169037b;

    /* JADX INFO: renamed from: c */
    public final List f169038c;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
        CREATOR = new fjd(12);
    }

    public otd(String str, xcl0 xcl0Var, List list) {
        this.f169036a = str;
        this.f169037b = xcl0Var;
        this.f169038c = list;
    }

    @Override // p204p.qtd
    /* JADX INFO: renamed from: a */
    public final String mo65613a() {
        return this.f169036a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otd)) {
            return false;
        }
        otd otdVar = (otd) obj;
        return wj50.m88271j(this.f169036a, otdVar.f169036a) && wj50.m88271j(this.f169037b, otdVar.f169037b) && wj50.m88271j(this.f169038c, otdVar.f169038c);
    }

    public final int hashCode() {
        int iHashCode = (this.f169037b.hashCode() + (this.f169036a.hashCode() * 31)) * 31;
        List list = this.f169038c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f169036a);
        parcel.writeParcelable(this.f169037b, i);
        List list = this.f169038c;
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
}
