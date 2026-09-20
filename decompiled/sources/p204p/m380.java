package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class m380 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f139557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n380 f139558b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f139559c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f139560d;

    public m380(n380 n380Var, boolean z, boolean z2, boolean z3) {
        this.f139557a = z;
        this.f139558b = n380Var;
        this.f139559c = z2;
        this.f139560d = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f139557a;
        srr srrVar = srr.f213372a;
        n380 n380Var = this.f139558b;
        if (z) {
            n380Var.mo60159b("create_playlist", srrVar);
        }
        if (this.f139559c) {
            n380Var.mo60159b("follow_podcast", srrVar);
        }
        if (this.f139560d) {
            fv31 fv31Var = n380.f149956n;
            fv31 fv31Var2 = n380.f149957o;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!((mv31) n380Var.m63590c()).m62894o(fv31Var2)) {
                lv31 lv31VarEdit = n380Var.m63590c().edit();
                lv31VarEdit.m60050c(fv31Var2, jCurrentTimeMillis);
                lv31VarEdit.m60055h();
            } else if (jCurrentTimeMillis >= n380Var.m63590c().mo48715j(fv31Var2) + ((long) 1209600000)) {
                lv31 lv31VarEdit2 = n380Var.m63590c().edit();
                lv31VarEdit2.m60048a(fv31Var, true);
                lv31VarEdit2.m60055h();
            }
        }
    }
}
