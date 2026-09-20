package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class flx {

    /* JADX INFO: renamed from: a */
    public final String f70881a;

    /* JADX INFO: renamed from: b */
    public final o3v f70882b;

    /* JADX INFO: renamed from: c */
    public final String f70883c;

    public flx(String str, o3v o3vVar, String str2) {
        this.f70881a = str;
        this.f70882b = o3vVar;
        this.f70883c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m42037a(ibk ibkVar) {
        elx elxVar;
        if (ibkVar instanceof elx) {
            elxVar = (elx) ibkVar;
            int i = elxVar.f60768c;
            if ((i & Integer.MIN_VALUE) != 0) {
                elxVar.f60768c = i - Integer.MIN_VALUE;
            } else {
                elxVar = new elx(this, ibkVar);
            }
        } else {
            elxVar = new elx(this, ibkVar);
        }
        Object objM86755t = elxVar.f60766a;
        int i2 = elxVar.f60768c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            s5u s5uVarM66217a = this.f70882b.m66217a();
            elxVar.f60768c = 1;
            objM86755t = vyf1.m86755t(s5uVarM66217a, elxVar);
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
        return edb.m38564m("voice-", ((r0s) objM86755t).f194556c);
    }
}
