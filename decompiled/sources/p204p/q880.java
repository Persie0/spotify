package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class q880 extends k980 {
    public static final Parcelable.Creator<q880> CREATOR = new o580(12);

    /* JADX INFO: renamed from: b */
    public final List f186261b;

    public q880(List list) {
        super(true);
        this.f186261b = list;
    }

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return this.f186261b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q880) && wj50.m88271j(this.f186261b, ((q880) obj).f186261b);
    }

    public final int hashCode() {
        return this.f186261b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f186261b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }
}
