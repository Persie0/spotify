package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class r27 implements Function, ceb {

    /* JADX INFO: renamed from: a */
    public long f195072a;

    /* JADX INFO: renamed from: b */
    public Object f195073b;

    /* JADX INFO: renamed from: c */
    public Object f195074c;

    public /* synthetic */ r27(Object obj, long j, Object obj2) {
        this.f195073b = obj;
        this.f195074c = obj2;
        this.f195072a = j;
    }

    @Override // p204p.ceb
    /* JADX INFO: renamed from: a */
    public fs61 mo31880a() {
        return (fs61) this.f195074c;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return xap0.m90290a((xap0) this.f195073b, null, (String) this.f195074c, (lea0) obj, this.f195072a, true);
    }

    /* JADX INFO: renamed from: b */
    public void m74505b(long j, long j2) {
        ((o5b1) this.f195073b).m66281a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((o5b1) this.f195074c).m66281a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m74506c(ibk ibkVar) {
        tf11 tf11Var;
        if (ibkVar instanceof tf11) {
            tf11Var = (tf11) ibkVar;
            int i = tf11Var.f219833c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tf11Var.f219833c = i - Integer.MIN_VALUE;
            } else {
                tf11Var = new tf11(this, ibkVar);
            }
        } else {
            tf11Var = new tf11(this, ibkVar);
        }
        Object obj = tf11Var.f219831a;
        int i2 = tf11Var.f219833c;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            long j = this.f195072a;
            if (j > 0) {
                tf11Var.f219833c = 1;
                if (njg1.m64619l(j, tf11Var) != yukVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        luk lukVar = (luk) this.f195074c;
        r611 r611Var = new r611(this, null, 2);
        tf11Var.f219833c = 2;
        return x0h1.m89557A(lukVar, r611Var, tf11Var) == yukVar ? yukVar : w2a1Var;
    }

    /* JADX INFO: renamed from: e */
    public s27 m74507e() {
        Object obj;
        if (!((qp71) this.f195073b).m73436p() && (obj = this.f195074c) != null) {
            c95.m31843i(((qp71) this.f195073b).mo26650b(obj) != -1);
        }
        return new s27(this);
    }

    @Override // p204p.ceb
    public long getTimestamp() {
        ceb cebVar = (ceb) this.f195073b;
        if (cebVar != null) {
            return cebVar.getTimestamp();
        }
        long j = this.f195072a;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // p204p.ceb
    /* JADX INFO: renamed from: h */
    public aeb mo31886h() {
        ceb cebVar = (ceb) this.f195073b;
        return cebVar != null ? cebVar.mo31886h() : aeb.f14817a;
    }

    @Override // p204p.ceb
    /* JADX INFO: renamed from: i */
    public beb mo31887i() {
        ceb cebVar = (ceb) this.f195073b;
        return cebVar != null ? cebVar.mo31887i() : beb.f26315a;
    }

    @Override // p204p.ceb
    /* JADX INFO: renamed from: j */
    public zdb mo31888j() {
        ceb cebVar = (ceb) this.f195073b;
        return cebVar != null ? cebVar.mo31888j() : zdb.f281664a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r27(eh00 eh00Var, long j, luk lukVar) {
        this.f195073b = (ri00) eh00Var;
        this.f195072a = j;
        this.f195074c = lukVar;
    }

    public r27(int i) {
        switch (i) {
            case 1:
                this.f195073b = new o5b1();
                this.f195074c = new o5b1();
                break;
            default:
                this.f195072a = 0L;
                this.f195073b = qp71.f191180a;
                this.f195074c = null;
                break;
        }
    }
}
