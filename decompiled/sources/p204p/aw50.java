package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class aw50 extends dw50 implements h7a0 {
    public static final Parcelable.Creator<aw50> CREATOR = new pq50(9);

    /* JADX INFO: renamed from: a */
    public final int f20397a;

    /* JADX INFO: renamed from: b */
    public final int f20398b;

    /* JADX INFO: renamed from: c */
    public final b450 f20399c;

    /* JADX INFO: renamed from: d */
    public final List f20400d;

    /* JADX INFO: renamed from: e */
    public final boolean f20401e;

    public aw50(int i, int i2, b450 b450Var, List list, boolean z) {
        this.f20397a = i;
        this.f20398b = i2;
        this.f20399c = b450Var;
        this.f20400d = list;
        this.f20401e = z;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: c */
    public final boolean mo27289c() {
        return this.f20401e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw50)) {
            return false;
        }
        aw50 aw50Var = (aw50) obj;
        return this.f20397a == aw50Var.f20397a && this.f20398b == aw50Var.f20398b && wj50.m88271j(this.f20399c, aw50Var.f20399c) && wj50.m88271j(this.f20400d, aw50Var.f20400d) && this.f20401e == aw50Var.f20401e;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: g */
    public final b450 mo27290g() {
        return this.f20399c;
    }

    @Override // p204p.i6a0
    public final int getCount() {
        return this.f20398b;
    }

    @Override // p204p.i6a0
    public final List getFilters() {
        return lau.f131415a;
    }

    @Override // p204p.h7a0
    public final int getId() {
        return this.f20397a;
    }

    @Override // p204p.i6a0
    public final List getItems() {
        return this.f20400d;
    }

    @Override // p204p.i6a0
    /* JADX INFO: renamed from: h */
    public final List mo27291h() {
        return lau.f131415a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20401e) + s571.m77244c(stz0.m79353g(mt60.m62800g(this.f20398b, Integer.hashCode(this.f20397a) * 31, 31), 31, this.f20399c), 31, this.f20400d);
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
        parcel.writeInt(this.f20397a);
        parcel.writeInt(this.f20398b);
        b450 b450Var = this.f20399c;
        parcel.writeInt(b450Var.f278778a);
        parcel.writeInt(b450Var.f278779b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f20400d);
        while (itM42468l.hasNext()) {
            ((bpe1) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f20401e ? 1 : 0);
    }
}
