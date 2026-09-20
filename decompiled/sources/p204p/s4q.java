package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class s4q {

    /* JADX INFO: renamed from: a */
    public final x93 f205628a;

    /* JADX INFO: renamed from: b */
    public final List f205629b;

    public s4q(x93 x93Var, List list) {
        this.f205628a = x93Var;
        this.f205629b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4q)) {
            return false;
        }
        s4q s4qVar = (s4q) obj;
        return this.f205628a == s4qVar.f205628a && wj50.m88271j(this.f205629b, s4qVar.f205629b);
    }

    public final int hashCode() {
        return this.f205629b.hashCode() + (this.f205628a.hashCode() * 31);
    }
}
