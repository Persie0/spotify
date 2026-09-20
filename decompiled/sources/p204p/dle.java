package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dle implements fft0 {

    /* JADX INFO: renamed from: a */
    public final up60 f50195a = qpv0.f191387a.mo54112b(i2k0.class);

    public dle(twy twyVar, yho yhoVar, hg5 hg5Var, m45 m45Var) {
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: a */
    public final up60 mo36355a() {
        return this.f50195a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fft0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object mo36356b(i2k0 i2k0Var, ibk ibkVar) {
        cle cleVar;
        if (ibkVar instanceof cle) {
            cleVar = (cle) ibkVar;
            int i = cleVar.f39266c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cleVar.f39266c = i - Integer.MIN_VALUE;
            } else {
                cleVar = new cle(this, ibkVar);
            }
        } else {
            cleVar = new cle(this, ibkVar);
        }
        Object obj = cleVar.f39264a;
        int i2 = cleVar.f39266c;
        if (i2 == 0) {
            bga.m29073P(obj);
            return new vb20(new jqj0(3), i2k0Var.f97860d, "");
        }
        if (i2 == 1) {
            bga.m29073P(obj);
            throw null;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        return obj;
    }
}
