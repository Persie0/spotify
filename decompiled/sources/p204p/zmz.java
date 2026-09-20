package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zmz implements Parcelable {
    public static final Parcelable.Creator<zmz> CREATOR = new ygz(3);

    /* JADX INFO: renamed from: a */
    public final Map f284373a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f284374b;

    public zmz(Map map, ArrayList arrayList) {
        this.f284373a = map;
        this.f284374b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmz)) {
            return false;
        }
        zmz zmzVar = (zmz) obj;
        return wj50.m88271j(this.f284373a, zmzVar.f284373a) && this.f284374b.equals(zmzVar.f284374b);
    }

    public final int hashCode() {
        return this.f284374b.hashCode() + (this.f284373a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM91403l = xl81.m91403l(parcel, this.f284373a);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        Iterator itM42469m = fr0.m42469m(this.f284374b, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
    }
}
