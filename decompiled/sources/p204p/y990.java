package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class y990 implements Parcelable {
    public static final Parcelable.Creator<y990> CREATOR = new x390(19);

    /* JADX INFO: renamed from: a */
    public final Map f270537a;

    /* JADX INFO: renamed from: b */
    public final Map f270538b;

    /* JADX INFO: renamed from: c */
    public final r990 f270539c;

    public y990(Map map, Map map2, r990 r990Var) {
        this.f270537a = map;
        this.f270538b = map2;
        this.f270539c = r990Var;
    }

    /* JADX INFO: renamed from: c */
    public static y990 m93150c(y990 y990Var, LinkedHashMap linkedHashMap, Map map, r990 r990Var, int i) {
        Map map2 = linkedHashMap;
        if ((i & 1) != 0) {
            map2 = y990Var.f270537a;
        }
        if ((i & 2) != 0) {
            map = y990Var.f270538b;
        }
        if ((i & 4) != 0) {
            r990Var = y990Var.f270539c;
        }
        y990Var.getClass();
        return new y990(map2, map, r990Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y990)) {
            return false;
        }
        y990 y990Var = (y990) obj;
        return wj50.m88271j(this.f270537a, y990Var.f270537a) && wj50.m88271j(this.f270538b, y990Var.f270538b) && wj50.m88271j(this.f270539c, y990Var.f270539c);
    }

    public final int hashCode() {
        return this.f270539c.hashCode() + edb.m38557f(this.f270537a.hashCode() * 31, 31, this.f270538b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM91403l = xl81.m91403l(parcel, this.f270537a);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Iterator itM91403l2 = xl81.m91403l(parcel, this.f270538b);
        while (itM91403l2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itM91403l2.next();
            parcel.writeString((String) entry2.getKey());
            ((z990) entry2.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f270539c, i);
    }
}
