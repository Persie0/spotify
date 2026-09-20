package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zhx implements b581 {

    /* JADX INFO: renamed from: a */
    public final c581 f283017a;

    /* JADX INFO: renamed from: b */
    public final pg41 f283018b;

    /* JADX INFO: renamed from: c */
    public final ypo f283019c;

    /* JADX INFO: renamed from: d */
    public final eh00 f283020d;

    /* JADX INFO: renamed from: e */
    public final yhx f283021e = new yhx(this);

    public zhx(c581 c581Var, pg41 pg41Var, ypo ypoVar, eh00 eh00Var) {
        this.f283017a = c581Var;
        this.f283018b = pg41Var;
        this.f283019c = ypoVar;
        this.f283020d = eh00Var;
    }

    @Override // p204p.b581
    /* JADX INFO: renamed from: a */
    public final vfj0 mo28148a() {
        return this.f283021e;
    }

    @Override // p204p.b581
    /* JADX INFO: renamed from: b */
    public final boolean mo28149b() {
        return false;
    }

    @Override // p204p.b581
    /* JADX INFO: renamed from: c */
    public final ypo mo28150c() {
        return this.f283019c;
    }

    @Override // p204p.b581
    /* JADX INFO: renamed from: d */
    public final n05 mo28151d() {
        return this.f283018b;
    }

    @Override // p204p.b581
    public final c581 getState() {
        return this.f283017a;
    }
}
