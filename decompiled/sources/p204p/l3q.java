package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class l3q {

    /* JADX INFO: renamed from: a */
    public final er70 f129414a;

    public l3q(er70 er70Var) {
        this.f129414a = er70Var;
    }

    /* JADX INFO: renamed from: a */
    public final tw91 m58020a(r4t0 r4t0Var) {
        for (v9r v9rVar : (Iterable) this.f129414a.get()) {
            if (v9rVar.getType() == r4t0Var) {
                return v9rVar.mo26951a();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
