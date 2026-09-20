package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class in11 implements ln11 {

    /* JADX INFO: renamed from: a */
    public final String f103831a;

    public in11(String str) {
        this.f103831a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in11) && wj50.m88271j(this.f103831a, ((in11) obj).f103831a);
    }

    public final int hashCode() {
        return this.f103831a.hashCode();
    }
}
