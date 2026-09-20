package p204p;

/* JADX INFO: loaded from: classes3.dex */
public class ra8 implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197229a;

    /* JADX INFO: renamed from: b */
    public final long f197230b;

    /* JADX INFO: renamed from: c */
    public final Object f197231c;

    public /* synthetic */ ra8(Object obj, long j, int i) {
        this.f197229a = i;
        this.f197231c = obj;
        this.f197230b = j;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        switch (this.f197229a) {
            case 0:
                ta8 ta8Var = (ta8) this.f197231c;
                cdz0 cdz0VarM69576b = ta8Var.f218499i[0].m69576b(j);
                int i = 1;
                while (true) {
                    pce[] pceVarArr = ta8Var.f218499i;
                    if (i >= pceVarArr.length) {
                        return cdz0VarM69576b;
                    }
                    cdz0 cdz0VarM69576b2 = pceVarArr[i].m69576b(j);
                    if (cdz0VarM69576b2.f36973a.f152876b < cdz0VarM69576b.f36973a.f152876b) {
                        cdz0VarM69576b = cdz0VarM69576b2;
                    }
                    i++;
                }
                break;
            case 1:
                uez uezVar = (uez) this.f197231c;
                uezVar.f229625k.getClass();
                tey teyVar = uezVar.f229625k;
                long[] jArr = (long[]) teyVar.f219808b;
                long[] jArr2 = (long[]) teyVar.f219809c;
                int iM46309f = h0b1.m46309f(jArr, h0b1.m46319k((((long) uezVar.f229619e) * j) / 1000000, 0L, uezVar.f229624j - 1), false);
                long j2 = iM46309f == -1 ? 0L : jArr[iM46309f];
                long j3 = iM46309f != -1 ? jArr2[iM46309f] : 0L;
                int i2 = uezVar.f229619e;
                long j4 = (j2 * 1000000) / ((long) i2);
                long j5 = this.f197230b;
                ndz0 ndz0Var = new ndz0(j4, j3 + j5);
                if (j4 == j || iM46309f == jArr.length - 1) {
                    return new cdz0(ndz0Var, ndz0Var);
                }
                int i3 = iM46309f + 1;
                return new cdz0(ndz0Var, new ndz0((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (cdz0) this.f197231c;
        }
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        switch (this.f197229a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        switch (this.f197229a) {
            case 0:
                return this.f197230b;
            case 1:
                return ((uez) this.f197231c).m82945b();
            default:
                return this.f197230b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ra8(long j) {
        this(j, 0L);
        this.f197229a = 2;
    }

    public ra8(long j, long j2) {
        this.f197229a = 2;
        this.f197230b = j;
        ndz0 ndz0Var = j2 == 0 ? ndz0.f152874c : new ndz0(0L, j2);
        this.f197231c = new cdz0(ndz0Var, ndz0Var);
    }
}
