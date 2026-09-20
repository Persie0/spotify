package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class bw50 extends dw50 implements h7a0 {
    public static final Parcelable.Creator<bw50> CREATOR = new pq50(10);

    /* JADX INFO: renamed from: a */
    public final int f31555a;

    /* JADX INFO: renamed from: b */
    public final int f31556b;

    /* JADX INFO: renamed from: c */
    public final b450 f31557c;

    /* JADX INFO: renamed from: d */
    public final List f31558d;

    /* JADX INFO: renamed from: e */
    public final boolean f31559e;

    public bw50(int i, int i2, b450 b450Var, List list, boolean z) {
        this.f31555a = i;
        this.f31556b = i2;
        this.f31557c = b450Var;
        this.f31558d = list;
        this.f31559e = z;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: c */
    public final boolean mo27289c() {
        return this.f31559e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw50)) {
            return false;
        }
        bw50 bw50Var = (bw50) obj;
        return this.f31555a == bw50Var.f31555a && this.f31556b == bw50Var.f31556b && wj50.m88271j(this.f31557c, bw50Var.f31557c) && wj50.m88271j(this.f31558d, bw50Var.f31558d) && this.f31559e == bw50Var.f31559e;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: g */
    public final b450 mo27290g() {
        return this.f31557c;
    }

    @Override // p204p.i6a0
    public final int getCount() {
        return this.f31556b;
    }

    @Override // p204p.i6a0
    public final List getFilters() {
        return lau.f131415a;
    }

    @Override // p204p.h7a0
    public final int getId() {
        return this.f31555a;
    }

    @Override // p204p.i6a0
    public final List getItems() {
        return this.f31558d;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: h */
    public final List mo27291h() {
        return lau.f131415a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31559e) + s571.m77244c(stz0.m79353g(mt60.m62800g(this.f31556b, Integer.hashCode(this.f31555a) * 31, 31), 31, this.f31557c), 31, this.f31558d);
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: j */
    public final int mo27292j() {
        return 0;
    }

    public final String toString() {
        return eem.m38667G(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31555a);
        parcel.writeInt(this.f31556b);
        b450 b450Var = this.f31557c;
        parcel.writeInt(b450Var.f278778a);
        parcel.writeInt(b450Var.f278779b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f31558d);
        while (itM42468l.hasNext()) {
            ((bpe1) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f31559e ? 1 : 0);
    }
}
