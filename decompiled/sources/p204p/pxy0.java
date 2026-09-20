package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class pxy0 {

    /* JADX INFO: renamed from: a */
    public final String f183274a;

    /* JADX INFO: renamed from: b */
    public final List f183275b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f183276c;

    public pxy0(String str, ArrayList arrayList, List list) {
        this.f183274a = str;
        this.f183275b = list;
        this.f183276c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxy0)) {
            return false;
        }
        pxy0 pxy0Var = (pxy0) obj;
        return wj50.m88271j(this.f183274a, pxy0Var.f183274a) && wj50.m88271j(this.f183275b, pxy0Var.f183275b) && this.f183276c.equals(pxy0Var.f183276c);
    }

    public final int hashCode() {
        return this.f183276c.hashCode() + s571.m77244c(this.f183274a.hashCode() * 31, 31, this.f183275b);
    }
}
