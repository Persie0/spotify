package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bm7 extends dm7 {

    /* JADX INFO: renamed from: a */
    public final Map f28389a;

    /* JADX INFO: renamed from: b */
    public final String f28390b;

    public bm7(String str, Map map) {
        this.f28389a = map;
        this.f28390b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm7)) {
            return false;
        }
        bm7 bm7Var = (bm7) obj;
        return wj50.m88271j(this.f28389a, bm7Var.f28389a) && wj50.m88271j(this.f28390b, bm7Var.f28390b);
    }

    public final int hashCode() {
        return this.f28390b.hashCode() + (this.f28389a.hashCode() * 31);
    }
}
