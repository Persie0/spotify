package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class c5w {

    /* JADX INFO: renamed from: a */
    public final d0w f34298a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f34299b;

    public c5w(d0w d0wVar, LinkedHashMap linkedHashMap) {
        this.f34298a = d0wVar;
        this.f34299b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5w)) {
            return false;
        }
        c5w c5wVar = (c5w) obj;
        return wj50.m88271j(this.f34298a, c5wVar.f34298a) && this.f34299b.equals(c5wVar.f34299b);
    }

    public final int hashCode() {
        return this.f34299b.hashCode() + (this.f34298a.hashCode() * 31);
    }
}
