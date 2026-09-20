package p204p;

import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pj3 {

    /* JADX INFO: renamed from: a */
    public final EntryPoint f178130a;

    /* JADX INFO: renamed from: b */
    public final q151 f178131b;

    /* JADX INFO: renamed from: c */
    public final List f178132c;

    public pj3(EntryPoint entryPoint, q151 q151Var, List list) {
        this.f178130a = entryPoint;
        this.f178131b = q151Var;
        this.f178132c = list;
    }

    /* JADX INFO: renamed from: a */
    public final q151 m70122a() {
        return this.f178131b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj3)) {
            return false;
        }
        pj3 pj3Var = (pj3) obj;
        return this.f178130a == pj3Var.f178130a && wj50.m88271j(this.f178131b, pj3Var.f178131b) && wj50.m88271j(this.f178132c, pj3Var.f178132c);
    }

    public final int hashCode() {
        return this.f178132c.hashCode() + ((this.f178131b.hashCode() + (this.f178130a.hashCode() * 31)) * 31);
    }
}
