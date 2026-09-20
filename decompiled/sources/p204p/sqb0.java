package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class sqb0 implements tqb0 {

    /* JADX INFO: renamed from: a */
    public final Map f213053a;

    public sqb0(Map map) {
        this.f213053a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqb0) && wj50.m88271j(this.f213053a, ((sqb0) obj).f213053a);
    }

    public final int hashCode() {
        return this.f213053a.hashCode();
    }
}
