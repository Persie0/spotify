package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class mcp {

    /* JADX INFO: renamed from: a */
    public final wr31 f142220a;

    /* JADX INFO: renamed from: b */
    public final List f142221b;

    public mcp(wr31 wr31Var, List list) {
        this.f142220a = wr31Var;
        this.f142221b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcp)) {
            return false;
        }
        mcp mcpVar = (mcp) obj;
        return this.f142220a == mcpVar.f142220a && wj50.m88271j(this.f142221b, mcpVar.f142221b);
    }

    public final int hashCode() {
        return this.f142221b.hashCode() + (this.f142220a.hashCode() * 31);
    }
}
