package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uai0 {

    /* JADX INFO: renamed from: a */
    public final yi70 f228507a;

    /* JADX INFO: renamed from: b */
    public pqm0 f228508b = new pqm0("", null);

    public uai0(yi70 yi70Var) {
        this.f228507a = yi70Var;
    }

    /* JADX INFO: renamed from: a */
    public final d850 m82696a(String str) {
        Object obj;
        d850 d850Var = this.f228507a.f273059c;
        if (wj50.m88271j(this.f228508b.f180350a, str) && (obj = this.f228508b.f180351b) != null) {
            return (d850) obj;
        }
        this.f228508b.getClass();
        this.f228508b = new pqm0(str, d850Var);
        return d850Var;
    }
}
