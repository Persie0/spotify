package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zwt implements dxt {

    /* JADX INFO: renamed from: a */
    public boolean f287086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f287087b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f287088c;

    /* JADX WARN: Multi-variable type inference failed */
    public zwt(eh00 eh00Var, eh00 eh00Var2) {
        this.f287087b = (qe70) eh00Var;
        this.f287088c = (qe70) eh00Var2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.eh00, p.qe70] */
    @Override // p204p.dxt
    /* JADX INFO: renamed from: b */
    public final void mo37274b(boolean z) {
        if (z && !this.f287086a) {
            this.f287087b.invoke();
            this.f287086a = true;
        } else {
            if (z || !this.f287086a) {
                return;
            }
            this.f287088c.invoke();
            this.f287086a = false;
        }
    }

    @Override // p204p.dxt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37273a(cxt cxtVar) {
    }
}
