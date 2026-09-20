package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ce01 {

    /* JADX INFO: renamed from: a */
    public final p1x0 f36985a;

    /* JADX INFO: renamed from: b */
    public final List f36986b;

    public ce01(p1x0 p1x0Var, List list) {
        this.f36985a = p1x0Var;
        this.f36986b = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m32469a() {
        return this.f36986b;
    }

    /* JADX INFO: renamed from: b */
    public final njg1 m32470b() {
        return this.f36985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce01)) {
            return false;
        }
        ce01 ce01Var = (ce01) obj;
        return this.f36985a.equals(ce01Var.f36985a) && wj50.m88271j(this.f36986b, ce01Var.f36986b);
    }

    public final int hashCode() {
        return this.f36986b.hashCode() + (Integer.hashCode(this.f36985a.f173185c) * 31);
    }
}
