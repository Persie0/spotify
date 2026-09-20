package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class uxe {

    /* JADX INFO: renamed from: a */
    public final v140 f234904a;

    /* JADX INFO: renamed from: b */
    public final dl31 f234905b;

    /* JADX INFO: renamed from: c */
    public final List f234906c;

    public uxe(v140 v140Var, dl31 dl31Var, List list) {
        this.f234904a = v140Var;
        this.f234905b = dl31Var;
        this.f234906c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxe)) {
            return false;
        }
        uxe uxeVar = (uxe) obj;
        return wj50.m88271j(this.f234904a, uxeVar.f234904a) && wj50.m88271j(this.f234905b, uxeVar.f234905b) && wj50.m88271j(this.f234906c, uxeVar.f234906c);
    }

    public final int hashCode() {
        return this.f234906c.hashCode() + ((this.f234905b.hashCode() + (this.f234904a.hashCode() * 31)) * 31);
    }
}
