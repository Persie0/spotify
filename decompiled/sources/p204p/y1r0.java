package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class y1r0 extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final v2r0 f268375d;

    /* JADX INFO: renamed from: e */
    public z1r0 f268376e;

    /* JADX INFO: renamed from: f */
    public final c9k f268377f = kk40.m56661c(qlg1.m73202g());

    /* JADX INFO: renamed from: g */
    public di41 f268378g;

    public y1r0(v2r0 v2r0Var) {
        this.f268375d = v2r0Var;
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        m35107j();
        this.f268378g = x0h1.m89578u(this.f268377f, null, 0, new onm0(this, (fbk) null, 25), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f268378g;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m92665k(ibk ibkVar) {
        x1r0 x1r0Var;
        Object objM84526b;
        if (ibkVar instanceof x1r0) {
            x1r0Var = (x1r0) ibkVar;
            int i = x1r0Var.f257263c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1r0Var.f257263c = i - Integer.MIN_VALUE;
            } else {
                x1r0Var = new x1r0(this, ibkVar);
            }
        } else {
            x1r0Var = new x1r0(this, ibkVar);
        }
        Object obj = x1r0Var.f257261a;
        int i2 = x1r0Var.f257263c;
        if (i2 == 0) {
            bga.m29073P(obj);
            x1r0Var.f257263c = 1;
            objM84526b = this.f268375d.m84526b(x1r0Var);
            yuk yukVar = yuk.f276404a;
            if (objM84526b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM84526b = ((s6x0) obj).f206218a;
        }
        if (objM84526b instanceof c6x0) {
            return objM84526b;
        }
        try {
            List list = (List) objM84526b;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Preset response must not be empty");
            }
            return new z1r0(list);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
