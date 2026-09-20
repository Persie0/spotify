package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zb61 extends hc61 {
    public static final Parcelable.Creator<zb61> CREATOR = new e361(19);

    /* JADX INFO: renamed from: a */
    public final List f281267a;

    /* JADX INFO: renamed from: b */
    public final String f281268b;

    public zb61(List list, String str) {
        this.f281267a = list;
        this.f281268b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb61)) {
            return false;
        }
        zb61 zb61Var = (zb61) obj;
        return wj50.m88271j(this.f281267a, zb61Var.f281267a) && wj50.m88271j(this.f281268b, zb61Var.f281268b);
    }

    public final int hashCode() {
        return this.f281268b.hashCode() + (this.f281267a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f281267a);
        while (itM42468l.hasNext()) {
            parcel.writeInt(((Number) itM42468l.next()).intValue());
        }
        parcel.writeString(this.f281268b);
    }
}
