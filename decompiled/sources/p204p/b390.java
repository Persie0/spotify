package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class b390 {

    /* JADX INFO: renamed from: a */
    public final Class f22967a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f22968b;

    /* JADX INFO: renamed from: c */
    public final e390 f22969c;

    public b390(Class cls, Parcelable parcelable, e390 e390Var) {
        this.f22967a = cls;
        this.f22968b = parcelable;
        this.f22969c = e390Var;
    }

    /* JADX INFO: renamed from: a */
    public final Class m28002a() {
        return this.f22967a;
    }

    /* JADX INFO: renamed from: b */
    public final Parcelable m28003b() {
        return this.f22968b;
    }

    /* JADX INFO: renamed from: c */
    public final e390 m28004c() {
        return this.f22969c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b390)) {
            return false;
        }
        b390 b390Var = (b390) obj;
        return wj50.m88271j(this.f22967a, b390Var.f22967a) && wj50.m88271j(this.f22968b, b390Var.f22968b) && wj50.m88271j(this.f22969c, b390Var.f22969c);
    }

    public final int hashCode() {
        return this.f22969c.hashCode() + ((this.f22968b.hashCode() + (this.f22967a.hashCode() * 31)) * 31);
    }
}
