package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class eo01 implements Parcelable {
    public static final Parcelable.Creator<eo01> CREATOR = new vj01(14);

    /* JADX INFO: renamed from: a */
    public final lu01 f61264a;

    /* JADX INFO: renamed from: b */
    public final Bundle f61265b;

    /* JADX INFO: renamed from: c */
    public final l511 f61266c;

    /* JADX INFO: renamed from: d */
    public final List f61267d;

    public eo01(lu01 lu01Var, Bundle bundle, l511 l511Var, List list) {
        this.f61264a = lu01Var;
        this.f61265b = bundle;
        this.f61266c = l511Var;
        this.f61267d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo01)) {
            return false;
        }
        eo01 eo01Var = (eo01) obj;
        return wj50.m88271j(this.f61264a, eo01Var.f61264a) && wj50.m88271j(this.f61265b, eo01Var.f61265b) && wj50.m88271j(this.f61266c, eo01Var.f61266c) && wj50.m88271j(this.f61267d, eo01Var.f61267d);
    }

    public final int hashCode() {
        lu01 lu01Var = this.f61264a;
        return this.f61267d.hashCode() + ((this.f61266c.hashCode() + ((this.f61265b.hashCode() + ((lu01Var == null ? 0 : lu01Var.hashCode()) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lu01 lu01Var = this.f61264a;
        if (lu01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lu01Var.writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.f61265b);
        parcel.writeParcelable(this.f61266c, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f61267d);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }
}
