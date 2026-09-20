package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class f880 extends k980 {
    public static final Parcelable.Creator<f880> CREATOR = new o580(1);

    /* JADX INFO: renamed from: b */
    public final List f66883b;

    public f880(List list) {
        super(true);
        this.f66883b = list;
    }

    @Override // p204p.k980
    /* JADX INFO: renamed from: c */
    public final List mo25080c() {
        return this.f66883b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f880) && wj50.m88271j(this.f66883b, ((f880) obj).f66883b);
    }

    public final int hashCode() {
        return this.f66883b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f66883b);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }

    public /* synthetic */ f880() {
        this(lau.f131415a);
    }
}
