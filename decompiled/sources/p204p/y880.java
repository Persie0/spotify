package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class y880 extends k980 {
    public static final Parcelable.Creator<y880> CREATOR = new o580(20);

    /* JADX INFO: renamed from: b */
    public final List f270248b;

    public y880(List list) {
        super(true);
        this.f270248b = list;
    }

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return this.f270248b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y880) && wj50.m88271j(this.f270248b, ((y880) obj).f270248b);
    }

    public final int hashCode() {
        return this.f270248b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f270248b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }

    public /* synthetic */ y880() {
        this(lau.f131415a);
    }
}
