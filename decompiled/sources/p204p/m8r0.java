package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class m8r0 implements r8r0 {

    /* JADX INFO: renamed from: a */
    public final int f141117a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f141118b;

    public m8r0(int i, Parcelable parcelable) {
        this.f141117a = i;
        this.f141118b = parcelable;
    }

    @Override // p204p.s8r0
    /* JADX INFO: renamed from: a */
    public final int mo55753a() {
        return this.f141117a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8r0)) {
            return false;
        }
        m8r0 m8r0Var = (m8r0) obj;
        return this.f141117a == m8r0Var.f141117a && wj50.m88271j(this.f141118b, m8r0Var.f141118b);
    }

    public final int hashCode() {
        return this.f141118b.hashCode() + (Integer.hashCode(this.f141117a) * 31);
    }
}
