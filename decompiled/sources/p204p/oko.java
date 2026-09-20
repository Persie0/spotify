package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oko implements mko {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166420a = 0;

    /* JADX INFO: renamed from: b */
    public final mko f166421b;

    /* JADX INFO: renamed from: c */
    public final gh00 f166422c;

    public oko(gh00 gh00Var, mko mkoVar) {
        this.f166422c = gh00Var;
        this.f166421b = mkoVar;
    }

    @Override // p204p.mko
    /* JADX INFO: renamed from: a */
    public final lho mo28634a(Object obj) {
        switch (this.f166420a) {
            case 0:
                Object objInvoke = this.f166422c.invoke(obj);
                return objInvoke != null ? this.f166421b.mo28634a(objInvoke) : gga.m44669h();
            default:
                return this.f166421b.mo28634a(this.f166422c.invoke(obj));
        }
    }

    public oko(mko mkoVar, gh00 gh00Var) {
        this.f166421b = mkoVar;
        this.f166422c = gh00Var;
    }
}
