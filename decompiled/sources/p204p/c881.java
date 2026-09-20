package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c881 implements b881 {
    public static final Parcelable.Creator<c881> CREATOR = new sr71(28);

    /* JADX INFO: renamed from: a */
    public final List f35142a;

    /* JADX INFO: renamed from: b */
    public final Integer f35143b;

    /* JADX INFO: renamed from: c */
    public final String f35144c;

    public c881(Integer num, String str, List list) {
        this.f35142a = list;
        this.f35143b = num;
        this.f35144c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c881)) {
            return false;
        }
        c881 c881Var = (c881) obj;
        return wj50.m88271j(this.f35142a, c881Var.f35142a) && wj50.m88271j(this.f35143b, c881Var.f35143b) && wj50.m88271j(this.f35144c, c881Var.f35144c);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f35144c;
    }

    @Override // p204p.b881
    public final List getItems() {
        return this.f35142a;
    }

    public final int hashCode() {
        int iHashCode = this.f35142a.hashCode() * 31;
        Integer num = this.f35143b;
        return this.f35144c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // p204p.b881
    /* JADX INFO: renamed from: r */
    public final Integer mo28420r() {
        return this.f35143b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f35142a);
        while (itM42468l.hasNext()) {
            ((e881) itM42468l.next()).writeToParcel(parcel, i);
        }
        Integer num = this.f35143b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f35144c);
    }
}
