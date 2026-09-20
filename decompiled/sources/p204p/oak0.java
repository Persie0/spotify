package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class oak0 {

    /* JADX INFO: renamed from: a */
    public final String f163348a;

    /* JADX INFO: renamed from: b */
    public final eyj f163349b;

    /* JADX INFO: renamed from: c */
    public final dwi f163350c;

    /* JADX INFO: renamed from: d */
    public final Map f163351d;

    public oak0(String str, eyj eyjVar, dwi dwiVar, Map map) {
        this.f163348a = str;
        this.f163349b = eyjVar;
        this.f163350c = dwiVar;
        this.f163351d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oak0)) {
            return false;
        }
        oak0 oak0Var = (oak0) obj;
        return wj50.m88271j(this.f163348a, oak0Var.f163348a) && wj50.m88271j(this.f163349b, oak0Var.f163349b) && wj50.m88271j(this.f163350c, oak0Var.f163350c) && wj50.m88271j(this.f163351d, oak0Var.f163351d);
    }

    public final int hashCode() {
        return this.f163351d.hashCode() + ((this.f163350c.hashCode() + ((this.f163349b.hashCode() + (this.f163348a.hashCode() * 31)) * 31)) * 31);
    }
}
