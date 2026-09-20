package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class x3u0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Integer f257881a;

    /* JADX INFO: renamed from: b */
    public final List f257882b;
    public static final w3u0 Companion = new w3u0();
    public static final Parcelable.Creator<x3u0> CREATOR = new vit0(25);

    /* JADX INFO: renamed from: c */
    public static final fr70[] f257880c = {null, q3d0.m72078I(2, o5t0.f162067P0)};

    public /* synthetic */ x3u0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f257881a = null;
        } else {
            this.f257881a = num;
        }
        if ((i & 2) == 0) {
            this.f257882b = null;
        } else {
            this.f257882b = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3u0)) {
            return false;
        }
        x3u0 x3u0Var = (x3u0) obj;
        return wj50.m88271j(this.f257881a, x3u0Var.f257881a) && wj50.m88271j(this.f257882b, x3u0Var.f257882b);
    }

    public final int hashCode() {
        Integer num = this.f257881a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f257882b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.f257881a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        List list = this.f257882b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator itM91403l = xl81.m91403l(parcel, (Map) it.next());
            while (itM91403l.hasNext()) {
                Map.Entry entry = (Map.Entry) itM91403l.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    public x3u0(Integer num, ArrayList arrayList) {
        this.f257881a = num;
        this.f257882b = arrayList;
    }
}
