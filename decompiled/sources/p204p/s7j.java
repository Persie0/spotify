package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s7j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f206389a = 0;

    static {
        gaz.m44194g("ConstraintTrkngWrkr");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m77379a(uo80 uo80Var, i1e1 i1e1Var, ibk ibkVar) {
        r7j r7jVar;
        if (ibkVar instanceof r7j) {
            r7jVar = (r7j) ibkVar;
            int i = r7jVar.f196598b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r7jVar.f196598b = i - Integer.MIN_VALUE;
            } else {
                r7jVar = new r7j(ibkVar);
            }
        } else {
            r7jVar = new r7j(ibkVar);
        }
        Object objM86755t = r7jVar.f196597a;
        int i2 = r7jVar.f196598b;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            woe woeVar = new woe(new r1a(uo80Var.m83600k(i1e1Var), new yse(i1e1Var, null, 9), 8), 1);
            r7jVar.f196598b = 1;
            objM86755t = vyf1.m86755t(woeVar, r7jVar);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return new Integer(((i8j) objM86755t).f99797a);
    }
}
