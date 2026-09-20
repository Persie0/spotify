package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class m710 {

    /* JADX INFO: renamed from: a */
    public final n0c f140623a;

    /* JADX INFO: renamed from: b */
    public final udb0 f140624b;

    /* JADX INFO: renamed from: c */
    public final int f140625c;

    /* JADX INFO: renamed from: d */
    public final boolean f140626d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f140627e;

    public m710(n0c n0cVar, udb0 udb0Var, int i, boolean z, ArrayList arrayList) {
        this.f140623a = n0cVar;
        this.f140624b = udb0Var;
        this.f140625c = i;
        this.f140626d = z;
        this.f140627e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m710)) {
            return false;
        }
        m710 m710Var = (m710) obj;
        return this.f140623a.equals(m710Var.f140623a) && this.f140624b == m710Var.f140624b && this.f140625c == m710Var.f140625c && this.f140626d == m710Var.f140626d && this.f140627e.equals(m710Var.f140627e);
    }

    public final int hashCode() {
        return this.f140627e.hashCode() + s571.m77245d(f710.m40938f(this.f140625c, (this.f140624b.hashCode() + (this.f140623a.hashCode() * 31)) * 31, 31), 31, this.f140626d);
    }
}
