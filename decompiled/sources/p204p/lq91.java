package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lq91 implements yxt {

    /* JADX INFO: renamed from: a */
    public final lt91 f135991a;

    /* JADX INFO: renamed from: b */
    public final kv91 f135992b;

    /* JADX INFO: renamed from: c */
    public final qu91 f135993c;

    public lq91(lt91 lt91Var, qu91 qu91Var, kv91 kv91Var) {
        this.f135991a = lt91Var;
        this.f135992b = kv91Var;
        this.f135993c = qu91Var;
    }

    @Override // p204p.yxt
    public final xxt create() {
        kv91 kv91Var = this.f135992b;
        return new mq91(this.f135991a, this.f135993c, kv91Var);
    }
}
