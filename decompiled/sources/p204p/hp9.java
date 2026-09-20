package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hp9 extends np9 {

    /* JADX INFO: renamed from: a */
    public final String f93717a;

    public hp9(String str) {
        this.f93717a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp9) && wj50.m88271j(this.f93717a, ((hp9) obj).f93717a);
    }

    public final int hashCode() {
        return this.f93717a.hashCode();
    }
}
