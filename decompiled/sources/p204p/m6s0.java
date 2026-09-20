package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m6s0 {

    /* JADX INFO: renamed from: a */
    public final Map f140572a;

    public m6s0(Map map) {
        this.f140572a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6s0) && wj50.m88271j(this.f140572a, ((m6s0) obj).f140572a);
    }

    public final int hashCode() {
        return this.f140572a.hashCode();
    }
}
