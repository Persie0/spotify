package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class k7a1 {
    public static final j7a1 Companion = new j7a1();

    /* JADX INFO: renamed from: a */
    public final Boolean f120030a;

    public /* synthetic */ k7a1(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f120030a = null;
        } else {
            this.f120030a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7a1) && wj50.m88271j(this.f120030a, ((k7a1) obj).f120030a);
    }

    public final int hashCode() {
        Boolean bool = this.f120030a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
