package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pfw0 implements sfw0 {

    /* JADX INFO: renamed from: a */
    public final Map f177151a;

    public pfw0(Map map) {
        this.f177151a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfw0) && wj50.m88271j(this.f177151a, ((pfw0) obj).f177151a);
    }

    public final int hashCode() {
        return this.f177151a.hashCode();
    }
}
