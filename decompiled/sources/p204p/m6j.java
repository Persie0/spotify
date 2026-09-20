package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m6j implements so70 {

    /* JADX INFO: renamed from: a */
    public final z5j f140531a;

    /* JADX INFO: renamed from: b */
    public final gh00 f140532b;

    /* JADX INFO: renamed from: c */
    public final Object f140533c;

    public m6j(z5j z5jVar, gh00 gh00Var) {
        this.f140531a = z5jVar;
        this.f140532b = gh00Var;
        this.f140533c = z5jVar.f279578c;
    }

    @Override // p204p.so70
    /* JADX INFO: renamed from: A0 */
    public final Object mo61019A0() {
        return this.f140533c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m6j)) {
            return false;
        }
        m6j m6jVar = (m6j) obj;
        return wj50.m88271j(this.f140531a.f279578c, m6jVar.f140531a.f279578c) && wj50.m88271j(this.f140532b, m6jVar.f140532b);
    }

    public final int hashCode() {
        return this.f140532b.hashCode() + (this.f140531a.f279578c.hashCode() * 31);
    }
}
