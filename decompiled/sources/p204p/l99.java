package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l99 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f131037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f131038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rlv0 f131039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l99(long j, long j2, rlv0 rlv0Var, int i) {
        super(1);
        this.f131036a = i;
        this.f131037b = j;
        this.f131038c = j2;
        this.f131039d = rlv0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f131036a) {
            case 0:
                sh50 sh50Var = (sh50) obj;
                Long l = (Long) this.f131039d.f200373a;
                return sh50.m78126a(sh50Var, null, false, dg21.f48708a, false, l != null ? l.longValue() : this.f131037b, 0L, 0.0f, this.f131038c, null, 361);
            case 1:
                sh50 sh50Var2 = (sh50) obj;
                Long l2 = (Long) this.f131039d.f200373a;
                return sh50.m78126a(sh50Var2, null, false, gg21.f79519a, false, l2 != null ? l2.longValue() : this.f131037b, 0L, 0.0f, this.f131038c, null, 363);
            case 2:
                sh50 sh50Var3 = (sh50) obj;
                Long l3 = (Long) this.f131039d.f200373a;
                return sh50.m78126a(sh50Var3, null, false, hg21.f91006a, false, l3 != null ? l3.longValue() : this.f131037b, 0L, 0.0f, this.f131038c, null, 363);
            case 3:
                sh50 sh50Var4 = (sh50) obj;
                Long l4 = (Long) this.f131039d.f200373a;
                return sh50.m78126a(sh50Var4, null, true, hg21.f91006a, false, l4 != null ? l4.longValue() : this.f131037b, 0L, 0.0f, this.f131038c, null, 361);
            case 4:
                sh50 sh50Var5 = (sh50) obj;
                Long l5 = (Long) this.f131039d.f200373a;
                return sh50.m78126a(sh50Var5, null, true, gg21.f79519a, false, l5 != null ? l5.longValue() : this.f131037b, 0L, 0.0f, this.f131038c, null, 361);
            default:
                sh50 sh50Var6 = (sh50) obj;
                Long l6 = (Long) this.f131039d.f200373a;
                return sh50.m78126a(sh50Var6, null, false, sh50Var6.f209104b ? hg21.f91006a : sh50Var6.f209105c, false, l6 != null ? l6.longValue() : this.f131037b, 0L, 0.0f, this.f131038c, null, 363);
        }
    }
}
