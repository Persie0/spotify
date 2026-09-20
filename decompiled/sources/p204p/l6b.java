package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l6b {

    /* JADX INFO: renamed from: a */
    public final it31 f130294a;

    public l6b(it31 it31Var) {
        this.f130294a = it31Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m58324a(String str, ibk ibkVar) throws Throwable {
        k6b k6bVar;
        Object objM51601d;
        if (ibkVar instanceof k6b) {
            k6bVar = (k6b) ibkVar;
            int i = k6bVar.f119711c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k6bVar.f119711c = i - Integer.MIN_VALUE;
            } else {
                k6bVar = new k6b(this, ibkVar);
            }
        } else {
            k6bVar = new k6b(this, ibkVar);
        }
        Object obj = k6bVar.f119709a;
        int i2 = k6bVar.f119711c;
        if (i2 == 0) {
            bga.m29073P(obj);
            k6bVar.f119711c = 1;
            objM51601d = this.f130294a.m51601d(str, k6bVar);
            yuk yukVar = yuk.f276404a;
            if (objM51601d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM51601d = ((s6x0) obj).f206218a;
        }
        if (objM51601d instanceof c6x0) {
            return null;
        }
        return objM51601d;
    }
}
