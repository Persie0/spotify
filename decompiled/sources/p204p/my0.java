package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class my0 implements Parcelable {
    public static final Parcelable.Creator<my0> CREATOR = new C2267ps(27);

    /* JADX INFO: renamed from: a */
    public final Set f148242a;

    /* JADX INFO: renamed from: b */
    public final fpp f148243b;

    /* JADX INFO: renamed from: c */
    public final xyu0 f148244c;

    public my0(Set set, fpp fppVar, xyu0 xyu0Var) {
        this.f148242a = set;
        this.f148243b = fppVar;
        this.f148244c = xyu0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my0)) {
            return false;
        }
        my0 my0Var = (my0) obj;
        return wj50.m88271j(this.f148242a, my0Var.f148242a) && wj50.m88271j(this.f148243b, my0Var.f148243b) && wj50.m88271j(this.f148244c, my0Var.f148244c);
    }

    public final int hashCode() {
        return this.f148244c.hashCode() + ((this.f148243b.hashCode() + (this.f148242a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f148242a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeParcelable((Parcelable) itM64022o.next(), i);
        }
        parcel.writeParcelable(this.f148243b, i);
        parcel.writeParcelable(this.f148244c, i);
    }
}
