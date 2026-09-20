package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kly0 implements h2m0 {

    /* JADX INFO: renamed from: a */
    public final int f124006a;

    /* JADX INFO: renamed from: b */
    public final List f124007b;

    /* JADX INFO: renamed from: c */
    public Float f124008c = null;

    /* JADX INFO: renamed from: d */
    public Float f124009d = null;

    /* JADX INFO: renamed from: e */
    public bky0 f124010e = null;

    /* JADX INFO: renamed from: f */
    public bky0 f124011f = null;

    public kly0(int i, ArrayList arrayList) {
        this.f124006a = i;
        this.f124007b = arrayList;
    }

    @Override // p204p.h2m0
    /* JADX INFO: renamed from: B0 */
    public final boolean mo29991B0() {
        return this.f124007b.contains(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m56859a(bky0 bky0Var) {
        this.f124010e = bky0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m56860b(bky0 bky0Var) {
        this.f124011f = bky0Var;
    }
}
