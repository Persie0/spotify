package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class xu31 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final gqa f265990a;

    public /* synthetic */ xu31(gqa gqaVar) {
        this.f265990a = gqaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m92119a(npa npaVar) {
        this.f265990a.mo45429w1(npaVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f265990a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xu31) {
            return wj50.m88271j(this.f265990a, ((xu31) obj).f265990a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f265990a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f265990a + ')';
    }
}
