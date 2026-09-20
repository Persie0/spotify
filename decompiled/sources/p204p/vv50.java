package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class vv50 extends dw50 implements h7a0 {
    public static final Parcelable.Creator<vv50> CREATOR = new pq50(4);

    /* JADX INFO: renamed from: a */
    public final int f245146a;

    /* JADX INFO: renamed from: b */
    public final int f245147b;

    /* JADX INFO: renamed from: c */
    public final b450 f245148c;

    /* JADX INFO: renamed from: d */
    public final List f245149d;

    /* JADX INFO: renamed from: e */
    public final List f245150e;

    /* JADX INFO: renamed from: f */
    public final List f245151f;

    /* JADX INFO: renamed from: g */
    public final boolean f245152g;

    /* JADX INFO: renamed from: h */
    public final int f245153h;

    public vv50(int i, int i2, b450 b450Var, List list, List list2, List list3, boolean z, int i3) {
        this.f245146a = i;
        this.f245147b = i2;
        this.f245148c = b450Var;
        this.f245149d = list;
        this.f245150e = list2;
        this.f245151f = list3;
        this.f245152g = z;
        this.f245153h = i3;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: c */
    public final boolean mo27289c() {
        return this.f245152g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv50)) {
            return false;
        }
        vv50 vv50Var = (vv50) obj;
        return this.f245146a == vv50Var.f245146a && this.f245147b == vv50Var.f245147b && wj50.m88271j(this.f245148c, vv50Var.f245148c) && wj50.m88271j(this.f245149d, vv50Var.f245149d) && wj50.m88271j(this.f245150e, vv50Var.f245150e) && wj50.m88271j(this.f245151f, vv50Var.f245151f) && this.f245152g == vv50Var.f245152g && this.f245153h == vv50Var.f245153h;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: g */
    public final b450 mo27290g() {
        return this.f245148c;
    }

    @Override // p204p.i6a0
    public final int getCount() {
        return this.f245147b;
    }

    @Override // p204p.i6a0
    public final List getFilters() {
        return this.f245151f;
    }

    @Override // p204p.h7a0
    public final int getId() {
        return this.f245146a;
    }

    @Override // p204p.i6a0
    public final List getItems() {
        return this.f245149d;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: h */
    public final List mo27291h() {
        return this.f245150e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245153h) + s571.m77245d(s571.m77244c(s571.m77244c(s571.m77244c(stz0.m79353g(mt60.m62800g(this.f245147b, Integer.hashCode(this.f245146a) * 31, 31), 31, this.f245148c), 31, this.f245149d), 31, this.f245150e), 31, this.f245151f), 31, this.f245152g);
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: j */
    public final int mo27292j() {
        return this.f245153h;
    }

    public final String toString() {
        return eem.m38667G(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f245146a);
        parcel.writeInt(this.f245147b);
        b450 b450Var = this.f245148c;
        parcel.writeInt(b450Var.f278778a);
        parcel.writeInt(b450Var.f278779b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f245149d);
        while (itM42468l.hasNext()) {
            ((bpe1) itM42468l.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f245150e);
        while (itM42468l2.hasNext()) {
            ((bpe1) itM42468l2.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l3 = fr0.m42468l(parcel, this.f245151f);
        while (itM42468l3.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l3.next(), i);
        }
        parcel.writeInt(this.f245152g ? 1 : 0);
        parcel.writeInt(this.f245153h);
    }
}
