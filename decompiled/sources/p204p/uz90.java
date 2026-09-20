package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uz90 {

    /* JADX INFO: renamed from: a */
    public final e3p f235451a;

    public uz90(e3p e3pVar) {
        this.f235451a = e3pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m84289a(String str, ibk ibkVar) {
        tz90 tz90Var;
        if (ibkVar instanceof tz90) {
            tz90Var = (tz90) ibkVar;
            int i = tz90Var.f225199c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tz90Var.f225199c = i - Integer.MIN_VALUE;
            } else {
                tz90Var = new tz90(this, ibkVar);
            }
        } else {
            tz90Var = new tz90(this, ibkVar);
        }
        Object objM37671f = tz90Var.f225197a;
        int i2 = tz90Var.f225199c;
        if (i2 == 0) {
            bga.m29073P(objM37671f);
            tz90Var.f225199c = 1;
            objM37671f = this.f235451a.m37671f(str, tz90Var);
            yuk yukVar = yuk.f276404a;
            if (objM37671f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM37671f);
        }
        rvc rvcVar = (rvc) objM37671f;
        sxd sxdVar = rvcVar.f203050b;
        if (sxdVar instanceof rxd) {
            return new thd(rvcVar.f203051c, opo.m67574x(rvcVar.f203053e), opo.m67574x(((rxd) sxdVar).f203576b));
        }
        throw new IllegalStateException("ChatMembersPage is only supported for group chats.");
    }
}
