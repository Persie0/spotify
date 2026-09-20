package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vxv0 {

    /* JADX INFO: renamed from: a */
    public final String f245843a;

    /* JADX INFO: renamed from: b */
    public final List f245844b;

    /* JADX INFO: renamed from: c */
    public final uxv0 f245845c;

    public vxv0(String str, List list, uxv0 uxv0Var) {
        this.f245843a = str;
        this.f245844b = list;
        this.f245845c = uxv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxv0)) {
            return false;
        }
        vxv0 vxv0Var = (vxv0) obj;
        return wj50.m88271j(this.f245843a, vxv0Var.f245843a) && wj50.m88271j(this.f245844b, vxv0Var.f245844b) && wj50.m88271j(this.f245845c, vxv0Var.f245845c);
    }

    public final int hashCode() {
        return this.f245845c.hashCode() + s571.m77244c(this.f245843a.hashCode() * 31, 31, this.f245844b);
    }
}
