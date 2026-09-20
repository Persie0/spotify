package p204p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dya extends vya {

    /* JADX INFO: renamed from: a */
    public final Set f54253a;

    /* JADX INFO: renamed from: b */
    public final rza f54254b;

    /* JADX INFO: renamed from: c */
    public final List f54255c;

    /* JADX INFO: renamed from: d */
    public final Map f54256d;

    public dya(Set set, rza rzaVar, List list, Map map) {
        this.f54253a = set;
        this.f54254b = rzaVar;
        this.f54255c = list;
        this.f54256d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dya)) {
            return false;
        }
        dya dyaVar = (dya) obj;
        return wj50.m88271j(this.f54253a, dyaVar.f54253a) && wj50.m88271j(this.f54254b, dyaVar.f54254b) && wj50.m88271j(this.f54255c, dyaVar.f54255c) && wj50.m88271j(this.f54256d, dyaVar.f54256d);
    }

    public final int hashCode() {
        return this.f54256d.hashCode() + s571.m77244c((this.f54254b.hashCode() + (this.f54253a.hashCode() * 31)) * 31, 31, this.f54255c);
    }
}
