package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y1t0 {

    /* JADX INFO: renamed from: b */
    public static final f0t0 f268404b;

    /* JADX INFO: renamed from: a */
    public final i82 f268405a;

    static {
        ujg1.m83266g();
        f268404b = new f0t0(muz0.f147459a);
    }

    public y1t0(i82 i82Var) {
        this.f268405a = i82Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m92669a(rr60 rr60Var, byte[] bArr) {
        return new m3t0(this, new o3t0(new i4b1(bArr)), rr60Var.getDescriptor()).m60733W0(rr60Var, null);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m92670b(rr60 rr60Var, Object obj) {
        gua guaVar = new gua();
        new n3t0(this, new djs0(guaVar, 2), rr60Var.getDescriptor()).mo35825i(rr60Var, obj);
        int i = guaVar.f84423b;
        byte[] bArr = new byte[i];
        bk5.m29634s0(0, i, 2, guaVar.f84422a, bArr);
        return bArr;
    }
}
