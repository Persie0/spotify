package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t040 implements jfm0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f215758a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jfm0 f215759b;

    public t040(jfm0 jfm0Var) {
        this.f215759b = jfm0Var;
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        return (q040) this.f215759b.mo31538a();
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        dqk0 dqk0Var2 = (dqk0) this.f215758a.remove(dqk0Var);
        if (dqk0Var2 != null) {
            this.f215759b.mo31539c(dqk0Var2);
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        s040 s040Var = new s040(new nlv0(), this, new rlv0(), dqk0Var);
        this.f215758a.put(dqk0Var, s040Var);
        this.f215759b.mo31540d(s040Var);
    }
}
