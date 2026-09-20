package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bdx0 implements xxd {

    /* JADX INFO: renamed from: a */
    public final gh00 f26228a;

    /* JADX INFO: renamed from: b */
    public final String f26229b;

    public bdx0(String str, gh00 gh00Var) {
        this.f26228a = gh00Var;
        this.f26229b = "must return ".concat(str);
    }

    @Override // p204p.xxd
    /* JADX INFO: renamed from: a */
    public final boolean mo28860a(nd60 nd60Var) {
        return wj50.m88271j(nd60Var.f177802h, this.f26228a.invoke(txq.m81932e(nd60Var)));
    }

    @Override // p204p.xxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ String mo28861b(nd60 nd60Var) {
        return quf1.m73916h(this, nd60Var);
    }

    @Override // p204p.xxd
    public final String getDescription() {
        return this.f26229b;
    }
}
