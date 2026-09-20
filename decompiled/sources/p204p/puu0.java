package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class puu0 {

    /* JADX INFO: renamed from: a */
    public final UUID f181531a;

    /* JADX INFO: renamed from: b */
    public final String f181532b;

    /* JADX INFO: renamed from: c */
    public final sfa1 f181533c;

    public puu0(UUID uuid, String str, sfa1 sfa1Var) {
        this.f181531a = uuid;
        this.f181532b = str;
        this.f181533c = sfa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puu0)) {
            return false;
        }
        puu0 puu0Var = (puu0) obj;
        return wj50.m88271j(this.f181531a, puu0Var.f181531a) && wj50.m88271j(this.f181532b, puu0Var.f181532b) && wj50.m88271j(this.f181533c, puu0Var.f181533c);
    }

    public final int hashCode() {
        return this.f181533c.hashCode() + s571.m77243b(this.f181531a.hashCode() * 31, 31, this.f181532b);
    }
}
