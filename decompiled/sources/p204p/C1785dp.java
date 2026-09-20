package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p.dp */
/* JADX INFO: loaded from: classes7.dex */
public final class C1785dp implements Parcelable {
    public static final Parcelable.Creator<C1785dp> CREATOR = new C2047kc(29);

    /* JADX INFO: renamed from: a */
    public final List f51135a;

    /* JADX INFO: renamed from: b */
    public final Intent f51136b;

    /* JADX INFO: renamed from: c */
    public final f5j0 f51137c;

    /* JADX INFO: renamed from: d */
    public final qta0 f51138d;

    /* JADX INFO: renamed from: e */
    public final boolean f51139e;

    /* JADX INFO: renamed from: f */
    public final boolean f51140f;

    /* JADX INFO: renamed from: g */
    public final boolean f51141g;

    public C1785dp(List list, Intent intent, f5j0 f5j0Var, qta0 qta0Var, boolean z, boolean z2, boolean z3) {
        this.f51135a = list;
        this.f51136b = intent;
        this.f51137c = f5j0Var;
        this.f51138d = qta0Var;
        this.f51139e = z;
        this.f51140f = z2;
        this.f51141g = z3;
    }

    /* JADX INFO: renamed from: c */
    public static C1785dp m36554c(C1785dp c1785dp, f5j0 f5j0Var, qta0 qta0Var, boolean z, boolean z2, int i) {
        List list = c1785dp.f51135a;
        Intent intent = c1785dp.f51136b;
        if ((i & 4) != 0) {
            f5j0Var = c1785dp.f51137c;
        }
        f5j0 f5j0Var2 = f5j0Var;
        if ((i & 8) != 0) {
            qta0Var = c1785dp.f51138d;
        }
        qta0 qta0Var2 = qta0Var;
        if ((i & 16) != 0) {
            z = c1785dp.f51139e;
        }
        boolean z3 = z;
        boolean z4 = c1785dp.f51140f;
        if ((i & 64) != 0) {
            z2 = c1785dp.f51141g;
        }
        c1785dp.getClass();
        return new C1785dp(list, intent, f5j0Var2, qta0Var2, z3, z4, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785dp)) {
            return false;
        }
        C1785dp c1785dp = (C1785dp) obj;
        return wj50.m88271j(this.f51135a, c1785dp.f51135a) && wj50.m88271j(this.f51136b, c1785dp.f51136b) && wj50.m88271j(this.f51137c, c1785dp.f51137c) && wj50.m88271j(this.f51138d, c1785dp.f51138d) && this.f51139e == c1785dp.f51139e && this.f51140f == c1785dp.f51140f && this.f51141g == c1785dp.f51141g;
    }

    public final int hashCode() {
        int iHashCode = (this.f51137c.hashCode() + ((this.f51136b.hashCode() + (this.f51135a.hashCode() * 31)) * 31)) * 31;
        qta0 qta0Var = this.f51138d;
        return Boolean.hashCode(this.f51141g) + s571.m77245d(s571.m77245d((iHashCode + (qta0Var == null ? 0 : qta0Var.hashCode())) * 31, 31, this.f51139e), 31, this.f51140f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f51135a);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeParcelable(this.f51136b, i);
        parcel.writeParcelable(this.f51137c, i);
        parcel.writeParcelable(this.f51138d, i);
        parcel.writeInt(this.f51139e ? 1 : 0);
        parcel.writeInt(this.f51140f ? 1 : 0);
        parcel.writeInt(this.f51141g ? 1 : 0);
    }
}
