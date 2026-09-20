package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class cd8 {

    /* JADX INFO: renamed from: a */
    public final String f36826a;

    /* JADX INFO: renamed from: b */
    public final bd8 f36827b;

    /* JADX INFO: renamed from: c */
    public final hg8 f36828c;

    /* JADX INFO: renamed from: d */
    public final Set f36829d;

    public cd8(String str, bd8 bd8Var, hg8 hg8Var, Set set) {
        this.f36826a = str;
        this.f36827b = bd8Var;
        this.f36828c = hg8Var;
        this.f36829d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd8)) {
            return false;
        }
        cd8 cd8Var = (cd8) obj;
        return wj50.m88271j(this.f36826a, cd8Var.f36826a) && wj50.m88271j(this.f36827b, cd8Var.f36827b) && this.f36828c == cd8Var.f36828c && wj50.m88271j(this.f36829d, cd8Var.f36829d);
    }

    public final int hashCode() {
        return this.f36829d.hashCode() + ((this.f36828c.hashCode() + ((this.f36827b.hashCode() + (this.f36826a.hashCode() * 31)) * 31)) * 31);
    }
}
