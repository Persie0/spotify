package p204p;

/* JADX INFO: loaded from: classes2.dex */
public class fnc extends enc {

    /* JADX INFO: renamed from: d */
    public final mb61 f71259d;

    /* JADX WARN: Multi-variable type inference failed */
    public fnc(th00 th00Var, juk jukVar, int i, int i2) {
        super(jukVar, i, i2);
        this.f71259d = (mb61) th00Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.mb61, p.th00] */
    @Override // p204p.enc
    /* JADX INFO: renamed from: g */
    public Object mo39486g(sir0 sir0Var, fbk fbkVar) {
        Object objInvoke = this.f71259d.invoke(sir0Var, fbkVar);
        return objInvoke == yuk.f276404a ? objInvoke : w2a1.f247311a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.mb61, p.th00] */
    @Override // p204p.enc
    /* JADX INFO: renamed from: h */
    public enc mo39487h(juk jukVar, int i, int i2) {
        return new fnc(this.f71259d, jukVar, i, i2);
    }

    @Override // p204p.enc
    public final String toString() {
        return "block[" + this.f71259d + "] -> " + super.toString();
    }
}
