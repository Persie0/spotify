package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e8b implements h8b {

    /* JADX INFO: renamed from: a */
    public final int f57122a;

    /* JADX INFO: renamed from: b */
    public final List f57123b;

    public e8b(int i, List list) {
        this.f57122a = i;
        this.f57123b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8b)) {
            return false;
        }
        e8b e8bVar = (e8b) obj;
        return this.f57122a == e8bVar.f57122a && wj50.m88271j(this.f57123b, e8bVar.f57123b);
    }

    public final int hashCode() {
        return this.f57123b.hashCode() + (Integer.hashCode(this.f57122a) * 31);
    }

    public /* synthetic */ e8b(int i) {
        this(i, lau.f131415a);
    }
}
