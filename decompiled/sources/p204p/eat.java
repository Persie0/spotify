package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class eat implements gat {

    /* JADX INFO: renamed from: a */
    public final List f57724a;

    public eat(List list) {
        this.f57724a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eat) && wj50.m88271j(this.f57724a, ((eat) obj).f57724a);
    }

    public final int hashCode() {
        return this.f57724a.hashCode();
    }
}
