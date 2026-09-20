package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class aej implements pdj {
    public static final Parcelable.Creator<aej> CREATOR = new wcj(21);

    /* JADX INFO: renamed from: a */
    public final String f14888a;

    /* JADX INFO: renamed from: b */
    public final List f14889b;

    /* JADX INFO: renamed from: c */
    public final boolean f14890c;

    public aej(String str, List list, boolean z) {
        this.f14888a = str;
        this.f14889b = list;
        this.f14890c = z;
    }

    /* JADX INFO: renamed from: c */
    public static aej m25733c(aej aejVar, ArrayList arrayList, int i) {
        String str = aejVar.f14888a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = aejVar.f14889b;
        }
        boolean z = (i & 4) != 0 ? aejVar.f14890c : true;
        aejVar.getClass();
        return new aej(str, list, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aej)) {
            return false;
        }
        aej aejVar = (aej) obj;
        return wj50.m88271j(this.f14888a, aejVar.f14888a) && wj50.m88271j(this.f14889b, aejVar.f14889b) && this.f14890c == aejVar.f14890c;
    }

    @Override // p204p.pdj
    public final String getId() {
        return this.f14888a;
    }

    public final List getItems() {
        return this.f14889b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14890c) + s571.m77244c(this.f14888a.hashCode() * 31, 31, this.f14889b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14888a);
        Iterator itM42468l = fr0.m42468l(parcel, this.f14889b);
        while (itM42468l.hasNext()) {
            ((zdj) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f14890c ? 1 : 0);
    }

    public /* synthetic */ aej(String str, ArrayList arrayList) {
        this(str, arrayList, false);
    }
}
