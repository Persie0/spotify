package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class akq {

    /* JADX INFO: renamed from: a */
    public final r6j0 f16622a;

    /* JADX INFO: renamed from: b */
    public final a9j0 f16623b;

    /* JADX INFO: renamed from: c */
    public final List f16624c;

    public akq(r6j0 r6j0Var, a9j0 a9j0Var, List list) {
        this.f16622a = r6j0Var;
        this.f16623b = a9j0Var;
        this.f16624c = list;
    }

    /* JADX INFO: renamed from: a */
    public final a9j0 m26255a() {
        return this.f16623b;
    }

    /* JADX INFO: renamed from: b */
    public final r6j0 m26256b() {
        return this.f16622a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akq)) {
            return false;
        }
        akq akqVar = (akq) obj;
        return wj50.m88271j(this.f16622a, akqVar.f16622a) && wj50.m88271j(this.f16623b, akqVar.f16623b) && wj50.m88271j(this.f16624c, akqVar.f16624c);
    }

    public final int hashCode() {
        return this.f16624c.hashCode() + ((this.f16623b.hashCode() + (this.f16622a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ akq(r6j0 r6j0Var, a9j0 a9j0Var) {
        this(r6j0Var, a9j0Var, new ArrayList());
    }
}
