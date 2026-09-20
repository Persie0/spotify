package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class x880 extends k980 {
    public static final Parcelable.Creator<x880> CREATOR = new o580(19);

    /* JADX INFO: renamed from: b */
    public final List f259082b;

    public x880(List list) {
        super(false);
        this.f259082b = list;
    }

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return this.f259082b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x880) && wj50.m88271j(this.f259082b, ((x880) obj).f259082b);
    }

    public final int hashCode() {
        return this.f259082b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f259082b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }

    public /* synthetic */ x880() {
        this(lau.f131415a);
    }
}
