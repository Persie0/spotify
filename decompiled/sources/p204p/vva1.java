package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vva1 {

    /* JADX INFO: renamed from: a */
    public final List f245180a;

    /* JADX INFO: renamed from: b */
    public final String f245181b;

    /* JADX INFO: renamed from: c */
    public final nva1 f245182c;

    /* JADX INFO: renamed from: d */
    public final rva1 f245183d;

    /* JADX INFO: renamed from: e */
    public final wju f245184e;

    public vva1(List list, String str, nva1 nva1Var, rva1 rva1Var, wju wjuVar) {
        this.f245180a = list;
        this.f245181b = str;
        this.f245182c = nva1Var;
        this.f245183d = rva1Var;
        this.f245184e = wjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vva1)) {
            return false;
        }
        vva1 vva1Var = (vva1) obj;
        return wj50.m88271j(this.f245180a, vva1Var.f245180a) && wj50.m88271j(this.f245181b, vva1Var.f245181b) && wj50.m88271j(this.f245182c, vva1Var.f245182c) && wj50.m88271j(this.f245183d, vva1Var.f245183d) && wj50.m88271j(this.f245184e, vva1Var.f245184e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f245180a.hashCode() * 31, 31, this.f245181b);
        nva1 nva1Var = this.f245182c;
        return this.f245184e.hashCode() + ((this.f245183d.hashCode() + ((iM77243b + (nva1Var == null ? 0 : nva1Var.hashCode())) * 31)) * 31);
    }

    public /* synthetic */ vva1(List list, String str, qva1 qva1Var) {
        this(list, str, null, qva1Var, sju.f209931e);
    }

    public vva1(List list, String str, String str2, rva1 rva1Var) {
        this(list, str, str2 != null ? new mva1(str2) : null, rva1Var, sju.f209931e);
    }
}
