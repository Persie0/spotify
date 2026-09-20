package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ik5 implements kk5 {

    /* JADX INFO: renamed from: a */
    public final String f103022a;

    public ik5(String str) {
        this.f103022a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik5) && wj50.m88271j(this.f103022a, ((ik5) obj).f103022a);
    }

    @Override // p204p.kk5
    public final String getMessage() {
        return this.f103022a;
    }

    public final int hashCode() {
        return this.f103022a.hashCode();
    }
}
