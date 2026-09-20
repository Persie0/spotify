package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sgl implements chl {

    /* JADX INFO: renamed from: a */
    public final Map f208888a;

    public sgl(Map map) {
        this.f208888a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgl) && wj50.m88271j(this.f208888a, ((sgl) obj).f208888a);
    }

    public final int hashCode() {
        return this.f208888a.hashCode();
    }
}
