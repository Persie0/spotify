package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i880 extends k980 {
    public static final Parcelable.Creator<i880> CREATOR = new o580(4);

    /* JADX INFO: renamed from: b */
    public final List f99733b;

    /* JADX INFO: renamed from: c */
    public final boolean f99734c;

    public i880(List list, boolean z) {
        super(true);
        this.f99733b = list;
        this.f99734c = z;
    }

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return this.f99733b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i880)) {
            return false;
        }
        i880 i880Var = (i880) obj;
        return wj50.m88271j(this.f99733b, i880Var.f99733b) && this.f99734c == i880Var.f99734c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99734c) + (this.f99733b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f99733b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeInt(this.f99734c ? 1 : 0);
    }

    public /* synthetic */ i880(int i, List list) {
        this((i & 1) != 0 ? lau.f131415a : list, (i & 2) == 0);
    }
}
