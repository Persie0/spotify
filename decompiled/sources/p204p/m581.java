package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class m581 implements l581 {
    public static final Parcelable.Creator<m581> CREATOR = new sr71(24);

    /* JADX INFO: renamed from: a */
    public final ArrayList f140165a;

    /* JADX INFO: renamed from: b */
    public final Integer f140166b;

    /* JADX INFO: renamed from: c */
    public final String f140167c;

    public m581(Integer num, String str, ArrayList arrayList) {
        this.f140165a = arrayList;
        this.f140166b = num;
        this.f140167c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m581)) {
            return false;
        }
        m581 m581Var = (m581) obj;
        return this.f140165a.equals(m581Var.f140165a) && wj50.m88271j(this.f140166b, m581Var.f140166b) && wj50.m88271j(this.f140167c, m581Var.f140167c);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f140167c;
    }

    @Override // p204p.l581
    public final List getItems() {
        return this.f140165a;
    }

    public final int hashCode() {
        int iHashCode = this.f140165a.hashCode() * 31;
        Integer num = this.f140166b;
        return this.f140167c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // p204p.l581
    /* JADX INFO: renamed from: r */
    public final Integer mo58212r() {
        return this.f140166b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f140165a, parcel);
        while (itM42469m.hasNext()) {
            ((o581) itM42469m.next()).writeToParcel(parcel, i);
        }
        Integer num = this.f140166b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f140167c);
    }
}
