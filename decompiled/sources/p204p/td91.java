package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class td91 implements ftd1 {

    /* JADX INFO: renamed from: a */
    public final i5z f219271a;

    public td91(i5z i5zVar) {
        this.f219271a = i5zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ftd1
    /* JADX INFO: renamed from: a */
    public final Object mo42598a(int i, ibk ibkVar) throws Throwable {
        sd91 sd91Var;
        if (ibkVar instanceof sd91) {
            sd91Var = (sd91) ibkVar;
            int i2 = sd91Var.f207955c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sd91Var.f207955c = i2 - Integer.MIN_VALUE;
            } else {
                sd91Var = new sd91(this, ibkVar);
            }
        } else {
            sd91Var = new sd91(this, ibkVar);
        }
        Object objM89557A = sd91Var.f207953a;
        int i3 = sd91Var.f207955c;
        if (i3 == 0) {
            bga.m29073P(objM89557A);
            sd91Var.f207955c = 1;
            i5z i5zVar = this.f219271a;
            objM89557A = x0h1.m89557A((luk) i5zVar.f99060c, new q950(i, 2, i5zVar, null), sd91Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        return ((Boolean) objM89557A).booleanValue() ? etd1.TRANSSION_HOME_SCREEN_CARD : etd1.TRANSSION_HOME_SCREEN;
    }
}
