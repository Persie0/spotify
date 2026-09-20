package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mm4 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f145041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f145042c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f145043d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f145044e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f145045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(0);
        this.f145040a = i;
        this.f145041b = obj;
        this.f145042c = obj2;
        this.f145043d = obj3;
        this.f145044e = obj4;
        this.f145045f = obj5;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f145040a) {
            case 0:
                ((maq0) this.f145041b).m61328w((eh00) this.f145042c, (raq0) this.f145043d, (String) this.f145044e, (ko70) this.f145045f);
                break;
            default:
                float fM84031v = ((uum0) this.f145041b).m84031v();
                kqi0 kqi0Var = (kqi0) this.f145044e;
                boolean zM53898e = joy0.m53898e(kqi0Var);
                joy0.m53899f(kqi0Var, false);
                kqi0 kqi0Var2 = (kqi0) this.f145045f;
                zny0 zny0VarM53900g = joy0.m53900g(kqi0Var2);
                long jM96602b = (long) (joy0.m53900g(kqi0Var2).m96602b() * fM84031v);
                ((wy3) ((xre) this.f145042c)).getClass();
                joy0.m53901h(kqi0Var2, zny0.m96601a(zny0VarM53900g, jM96602b, System.currentTimeMillis()));
                ((gh00) this.f145043d).invoke(new uny0(fM84031v, zM53898e));
                break;
        }
        return w2a1.f247311a;
    }
}
