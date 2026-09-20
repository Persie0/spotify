package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class u1j0 extends v1j0 {

    /* JADX INFO: renamed from: a */
    public final Class f225847a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f225848b;

    /* JADX INFO: renamed from: c */
    public final zzq0 f225849c;

    public u1j0(Class cls, Parcelable parcelable, zzq0 zzq0Var) {
        this.f225847a = cls;
        this.f225848b = parcelable;
        this.f225849c = zzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1j0)) {
            return false;
        }
        u1j0 u1j0Var = (u1j0) obj;
        return wj50.m88271j(this.f225847a, u1j0Var.f225847a) && wj50.m88271j(this.f225848b, u1j0Var.f225848b) && wj50.m88271j(this.f225849c, u1j0Var.f225849c);
    }

    public final int hashCode() {
        return this.f225849c.hashCode() + ((this.f225848b.hashCode() + (this.f225847a.hashCode() * 31)) * 31);
    }
}
