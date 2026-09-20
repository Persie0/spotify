package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lyy implements Parcelable {
    public static final Parcelable.Creator<lyy> CREATOR = new eqy(21);

    /* JADX INFO: renamed from: a */
    public final int f138131a;

    /* JADX INFO: renamed from: b */
    public final List f138132b;

    /* JADX INFO: renamed from: c */
    public final List f138133c;

    public lyy(int i, List list, List list2) {
        this.f138131a = i;
        this.f138132b = list;
        this.f138133c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyy)) {
            return false;
        }
        lyy lyyVar = (lyy) obj;
        return this.f138131a == lyyVar.f138131a && wj50.m88271j(this.f138132b, lyyVar.f138132b) && wj50.m88271j(this.f138133c, lyyVar.f138133c);
    }

    public final int hashCode() {
        return this.f138133c.hashCode() + s571.m77244c(edb.m38547C(this.f138131a) * 31, 31, this.f138132b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f138131a;
        if (i2 == 1) {
            str = "SINGLE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "MULTIPLE";
        }
        parcel.writeString(str);
        Iterator itM42468l = fr0.m42468l(parcel, this.f138132b);
        while (itM42468l.hasNext()) {
            ((n2z) itM42468l.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f138133c);
        while (itM42468l2.hasNext()) {
            ((nr31) itM42468l2.next()).writeToParcel(parcel, i);
        }
    }
}
