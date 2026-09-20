package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rl5 {

    /* JADX INFO: renamed from: a */
    public final List f200221a;

    public rl5(List list) {
        this.f200221a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl5) && wj50.m88271j(this.f200221a, ((rl5) obj).f200221a);
    }

    public final int hashCode() {
        return this.f200221a.hashCode();
    }
}
