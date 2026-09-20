package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g881 implements b881 {
    public static final Parcelable.Creator<g881> CREATOR = new f881(0);

    /* JADX INFO: renamed from: a */
    public final List f77436a;

    /* JADX INFO: renamed from: b */
    public final Integer f77437b;

    /* JADX INFO: renamed from: c */
    public final Timestamp f77438c;

    /* JADX INFO: renamed from: d */
    public final String f77439d;

    public g881(List list, Integer num, Timestamp timestamp, String str) {
        this.f77436a = list;
        this.f77437b = num;
        this.f77438c = timestamp;
        this.f77439d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g881)) {
            return false;
        }
        g881 g881Var = (g881) obj;
        return wj50.m88271j(this.f77436a, g881Var.f77436a) && wj50.m88271j(this.f77437b, g881Var.f77437b) && wj50.m88271j(this.f77438c, g881Var.f77438c) && wj50.m88271j(this.f77439d, g881Var.f77439d);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f77439d;
    }

    @Override // p204p.b881
    public final List getItems() {
        return this.f77436a;
    }

    public final int hashCode() {
        int iHashCode = this.f77436a.hashCode() * 31;
        Integer num = this.f77437b;
        return this.f77439d.hashCode() + ((this.f77438c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    @Override // p204p.b881
    /* JADX INFO: renamed from: r */
    public final Integer mo28420r() {
        return this.f77437b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f77436a);
        while (itM42468l.hasNext()) {
            ((e881) itM42468l.next()).writeToParcel(parcel, i);
        }
        Integer num = this.f77437b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        Timestamp timestamp = this.f77438c;
        parcel.writeLong(timestamp.m1969s());
        parcel.writeInt(timestamp.m1968r());
        parcel.writeString(this.f77439d);
    }

    public /* synthetic */ g881(ArrayList arrayList, Integer num, Timestamp timestamp, int i) {
        this((i & 1) != 0 ? lau.f131415a : arrayList, (i & 2) != 0 ? null : num, timestamp, "TopTracks");
    }
}
