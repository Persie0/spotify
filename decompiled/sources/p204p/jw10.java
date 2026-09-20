package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jw10 implements Parcelable {
    public static final Parcelable.Creator<jw10> CREATOR = new km10(23);

    /* JADX INFO: renamed from: a */
    public final List f116555a;

    /* JADX INFO: renamed from: b */
    public final List f116556b;

    public jw10(List list, List list2) {
        this.f116555a = list;
        this.f116556b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw10)) {
            return false;
        }
        jw10 jw10Var = (jw10) obj;
        return wj50.m88271j(this.f116555a, jw10Var.f116555a) && wj50.m88271j(this.f116556b, jw10Var.f116556b);
    }

    public final int hashCode() {
        return this.f116556b.hashCode() + (this.f116555a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f116555a);
        while (itM42468l.hasNext()) {
            parcel.writeString(((lnn0) itM42468l.next()).name());
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f116556b);
        while (itM42468l2.hasNext()) {
            parcel.writeString(((lnn0) itM42468l2.next()).name());
        }
    }
}
