package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tg71 implements iuk {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f220136a;

    public tg71(ThreadLocal threadLocal) {
        this.f220136a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg71) && wj50.m88271j(this.f220136a, ((tg71) obj).f220136a);
    }

    public final int hashCode() {
        return this.f220136a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f220136a + ')';
    }
}
