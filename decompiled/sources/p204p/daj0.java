package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class daj0 {

    /* JADX INFO: renamed from: a */
    public final luk f47054a;

    /* JADX INFO: renamed from: b */
    public final xiy0 f47055b;

    /* JADX INFO: renamed from: c */
    public final w6j0 f47056c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f47057d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f47058e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f47059f;

    /* JADX INFO: renamed from: g */
    public final sfn f47060g;

    /* JADX INFO: renamed from: h */
    public final i4t0 f47061h;

    /* JADX INFO: renamed from: i */
    public final tfn f47062i;

    /* JADX INFO: renamed from: j */
    public final i4t0 f47063j;

    /* JADX INFO: renamed from: k */
    public final i4t0 f47064k;

    /* JADX INFO: renamed from: l */
    public final i4t0 f47065l;

    /* JADX INFO: renamed from: m */
    public final ufn f47066m;

    /* JADX INFO: renamed from: n */
    public final kv91 f47067n;

    /* JADX INFO: renamed from: o */
    public final lw3 f47068o;

    /* JADX INFO: renamed from: p */
    public final bbg0 f47069p = new bbg0(5);

    /* JADX INFO: renamed from: q */
    public final wg61 f47070q = new wg61(new w0i0(this, 29));

    public daj0(luk lukVar, xiy0 xiy0Var, w6j0 w6j0Var, vfn vfnVar, vfn vfnVar2, vfn vfnVar3, sfn sfnVar, vfn vfnVar4, tfn tfnVar, vfn vfnVar5, vfn vfnVar6, vfn vfnVar7, ufn ufnVar, kv91 kv91Var, lw3 lw3Var) {
        this.f47054a = lukVar;
        this.f47055b = xiy0Var;
        this.f47056c = w6j0Var;
        this.f47057d = vfnVar;
        this.f47058e = vfnVar2;
        this.f47059f = vfnVar3;
        this.f47060g = sfnVar;
        this.f47061h = vfnVar4;
        this.f47062i = tfnVar;
        this.f47063j = vfnVar5;
        this.f47064k = vfnVar6;
        this.f47065l = vfnVar7;
        this.f47066m = ufnVar;
        this.f47067n = kv91Var;
        this.f47068o = lw3Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m35485f(w6j0 w6j0Var, b3j0 b3j0Var) {
        b3j0Var.mo28035b();
        w6j0Var.m87294e(b3j0Var);
        w6j0Var.m87295f(b3j0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m35486a(j1j0 j1j0Var, ibk ibkVar) throws Throwable {
        baj0 baj0Var;
        if (ibkVar instanceof baj0) {
            baj0Var = (baj0) ibkVar;
            int i = baj0Var.f25229d;
            if ((i & Integer.MIN_VALUE) != 0) {
                baj0Var.f25229d = i - Integer.MIN_VALUE;
            } else {
                baj0Var = new baj0(this, ibkVar);
            }
        } else {
            baj0Var = new baj0(this, ibkVar);
        }
        Object objM89557A = baj0Var.f25227b;
        int i2 = baj0Var.f25229d;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            j1j0Var.getClass();
            caj0 caj0Var = new caj0(this, null, 0);
            baj0Var.f25226a = j1j0Var;
            baj0Var.f25229d = 1;
            objM89557A = x0h1.m89557A(this.f47054a, caj0Var, baj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j1j0Var = baj0Var.f25226a;
            bga.m29073P(objM89557A);
        }
        this.f47056c.m87296g(new r6j0(j1j0Var.mo24455a(), j1j0Var.getUri(), (String) objM89557A));
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final ll61 m35487b() {
        return (ll61) this.f47070q.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m35488c() {
        r0j0 r0j0Var = r0j0.f194511a;
        bbg0 bbg0Var = this.f47069p;
        bbg0Var.getClass();
        av91 av91Var = new av91("", "", new dv91("hit", 1), new bv91("open_app", 1, kkc0.m56695h0(new pqm0("destination", "spotify:now-playing-view"), new pqm0("app", "music"))), bbg0Var.f25561b, st91.f213865b, System.currentTimeMillis());
        z650 z650Var = this.f47067n.mo57453r(av91Var, null).f46380a;
        this.f47068o.m60098a(av91Var, z650Var);
        m35485f(this.f47056c, new z2j0("spotify:now-playing-view", z650Var));
    }

    /* JADX INFO: renamed from: d */
    public final Object m35489d(j1j0 j1j0Var, fbk fbkVar) throws Throwable {
        Object objM89557A = x0h1.m89557A(this.f47054a, new rph0(j1j0Var, this, null, 19), fbkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m35490e(j1j0 j1j0Var, iig1 iig1Var, fbk fbkVar) {
        b3j0 z2j0Var;
        if (iig1Var instanceof s9j0) {
            z2j0Var = new z2j0(j1j0Var.getUri(), ((s9j0) iig1Var).f206965c);
        } else {
            if (!(iig1Var instanceof r9j0)) {
                throw new NoWhenBranchMatchedException();
            }
            z2j0Var = x2j0.f257512a;
        }
        m35485f(this.f47056c, z2j0Var);
        Object objM35489d = m35489d(j1j0Var, fbkVar);
        return objM35489d == yuk.f276404a ? objM35489d : w2a1.f247311a;
    }
}
