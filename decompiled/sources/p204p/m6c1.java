package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m6c1 implements r6c1 {

    /* JADX INFO: renamed from: a */
    public final String f140465a;

    public m6c1(String str) {
        this.f140465a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6c1) && wj50.m88271j(this.f140465a, ((m6c1) obj).f140465a);
    }

    public final int hashCode() {
        return this.f140465a.hashCode();
    }
}
