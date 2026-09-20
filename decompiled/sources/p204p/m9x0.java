package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m9x0 implements p9x0 {

    /* JADX INFO: renamed from: a */
    public final Map f141401a;

    public m9x0(Map map) {
        this.f141401a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9x0) && wj50.m88271j(this.f141401a, ((m9x0) obj).f141401a);
    }

    public final int hashCode() {
        return this.f141401a.hashCode();
    }
}
