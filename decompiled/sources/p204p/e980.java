package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class e980 extends k980 {
    public static final Parcelable.Creator<e980> CREATOR = new o580(26);

    /* JADX INFO: renamed from: b */
    public final List f57390b;

    public e980(List list) {
        super(true);
        this.f57390b = list;
    }

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return this.f57390b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e980) && wj50.m88271j(this.f57390b, ((e980) obj).f57390b);
    }

    public final int hashCode() {
        return this.f57390b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f57390b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }

    public /* synthetic */ e980() {
        this(lau.f131415a);
    }
}
