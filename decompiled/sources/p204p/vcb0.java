package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class vcb0 implements s511 {
    public static final Parcelable.Creator<vcb0> CREATOR = new l0b0(23);

    /* JADX INFO: renamed from: a */
    public final int f240099a;

    /* JADX INFO: renamed from: b */
    public final String f240100b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f240101c;

    /* JADX INFO: renamed from: d */
    public final sbb0 f240102d;

    /* JADX INFO: renamed from: e */
    public final String f240103e;

    public vcb0(int i, String str, ArrayList arrayList, sbb0 sbb0Var, String str2) {
        this.f240099a = i;
        this.f240100b = str;
        this.f240101c = arrayList;
        this.f240102d = sbb0Var;
        this.f240103e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcb0)) {
            return false;
        }
        vcb0 vcb0Var = (vcb0) obj;
        return this.f240099a == vcb0Var.f240099a && wj50.m88271j(this.f240100b, vcb0Var.f240100b) && this.f240101c.equals(vcb0Var.f240101c) && wj50.m88271j(this.f240102d, vcb0Var.f240102d) && wj50.m88271j(this.f240103e, vcb0Var.f240103e);
    }

    public final int hashCode() {
        int iHashCode = (this.f240102d.hashCode() + lq51.m59700f(this.f240101c, s571.m77243b(Integer.hashCode(this.f240099a) * 31, 31, this.f240100b), 31)) * 31;
        String str = this.f240103e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f240099a);
        parcel.writeString(this.f240100b);
        Iterator itM42469m = fr0.m42469m(this.f240101c, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeInt(((Number) itM42469m.next()).intValue());
        }
        parcel.writeParcelable(this.f240102d, i);
        parcel.writeString(this.f240103e);
    }
}
