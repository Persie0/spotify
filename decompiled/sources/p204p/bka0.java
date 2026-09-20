package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class bka0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final Object f27885a;

    public bka0(List list) {
        this.f27885a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bka0) && this.f27885a.equals(((bka0) obj).f27885a);
    }

    public final int hashCode() {
        return this.f27885a.hashCode();
    }
}
