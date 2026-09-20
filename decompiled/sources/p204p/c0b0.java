package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c0b0 implements ewz0 {

    /* JADX INFO: renamed from: a */
    public final ewz0 f32731a;

    /* JADX INFO: renamed from: b */
    public final long f32732b;

    /* JADX INFO: renamed from: c */
    public final xre f32733c;

    public c0b0(ewz0 ewz0Var, long j, xre xreVar) {
        this.f32731a = ewz0Var;
        this.f32732b = j;
        this.f32733c = xreVar;
    }

    @Override // p204p.ewz0
    public final xul0 call() {
        xul0 xul0VarCall = this.f32731a.call();
        if (!xul0VarCall.mo49279c()) {
            return C2244p5.f174033a;
        }
        ((wy3) this.f32733c).getClass();
        return new hzq0(Long.valueOf(((Long) xul0VarCall.mo49278b()).longValue() - ((System.currentTimeMillis() - this.f32732b) / 1000)));
    }
}
