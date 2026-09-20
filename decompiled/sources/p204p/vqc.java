package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vqc implements xqc {

    /* JADX INFO: renamed from: a */
    public final String f243921a;

    /* JADX INFO: renamed from: b */
    public final String f243922b;

    /* JADX INFO: renamed from: c */
    public final List f243923c;

    public vqc(String str, List list, String str2) {
        this.f243921a = str;
        this.f243922b = str2;
        this.f243923c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqc)) {
            return false;
        }
        vqc vqcVar = (vqc) obj;
        return wj50.m88271j(this.f243921a, vqcVar.f243921a) && wj50.m88271j(this.f243922b, vqcVar.f243922b) && wj50.m88271j(this.f243923c, vqcVar.f243923c);
    }

    public final int hashCode() {
        return this.f243923c.hashCode() + s571.m77243b(this.f243921a.hashCode() * 31, 31, this.f243922b);
    }
}
