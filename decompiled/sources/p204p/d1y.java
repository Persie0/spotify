package p204p;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d1y extends lg01 {

    /* JADX INFO: renamed from: a */
    public final zv41 f44375a;

    /* JADX INFO: renamed from: b */
    public final fiz f44376b;

    public d1y() {
        fbk fbkVar = null;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f44375a = zv41VarM52819d;
        this.f44376b = npg1.m65338s(zv41VarM52819d) != null ? new kmx(zv41VarM52819d, 8) : nxf1.m65828g(new lmz0((Object) zv41VarM52819d, (Object) new laj(this, fbkVar, 16), fbkVar, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m34673b(d1y d1yVar, Object obj, Object obj2, d850 d850Var, ibk ibkVar) {
        c1y c1yVar;
        if (ibkVar instanceof c1y) {
            c1yVar = (c1y) ibkVar;
            int i = c1yVar.f33220e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1yVar.f33220e = i - Integer.MIN_VALUE;
            } else {
                c1yVar = new c1y(d1yVar, ibkVar);
            }
        } else {
            c1yVar = new c1y(d1yVar, ibkVar);
        }
        Object objMo34675c = c1yVar.f33218c;
        int i2 = c1yVar.f33220e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo34675c);
            c1yVar.f33216a = d1yVar;
            c1yVar.f33220e = 1;
            objMo34675c = d1yVar.mo34675c(obj, obj2, d850Var, c1yVar);
            if (objMo34675c != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ed01 ed01Var = c1yVar.f33217b;
            bga.m29073P(objMo34675c);
            return ed01Var;
        }
        d1yVar = c1yVar.f33216a;
        bga.m29073P(objMo34675c);
        fd01 fd01Var = (fd01) objMo34675c;
        if (fd01Var instanceof ed01) {
            zv41 zv41Var = d1yVar.f44375a;
            c1yVar.f33216a = null;
            c1yVar.f33217b = (ed01) fd01Var;
            c1yVar.f33220e = 2;
            zv41Var.emit(fd01Var, c1yVar);
            if (w2a1.f247311a == yukVar) {
                return yukVar;
            }
        }
        return fd01Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo34674a(ibk ibkVar);

    /* JADX INFO: renamed from: c */
    public abstract Object mo34675c(Object obj, Object obj2, d850 d850Var, c1y c1yVar);

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f44376b;
    }

    @Override // p204p.lg01
    public final Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return m34673b(this, obj, obj2, d850Var, (ibk) fbkVar);
    }
}
