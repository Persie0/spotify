package p204p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class vo60 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f243382b;

    /* JADX INFO: renamed from: c */
    public int f243383c;

    /* JADX INFO: renamed from: d */
    public int f243384d;

    /* JADX INFO: renamed from: e */
    public int f243385e;

    public /* synthetic */ vo60(int i) {
        this.f243382b = i;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        switch (this.f243382b) {
            case 0:
                wo60 wo60VarM86083e = m86083e();
                wo60VarM86083e.isInitialized();
                return wo60VarM86083e;
            default:
                xo60 xo60VarM86084g = m86084g();
                xo60VarM86084g.isInitialized();
                return xo60VarM86084g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        switch (this.f243382b) {
            case 0:
                wo60 wo60Var = null;
                try {
                    try {
                        wo60.f253385h.getClass();
                        m86085h(new wo60(pweVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        wo60 wo60Var2 = (wo60) e.f10912a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            wo60Var = wo60Var2;
                            if (wo60Var != null) {
                                m86085h(wo60Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (wo60Var != null) {
                        m86085h(wo60Var);
                    }
                    throw th;
                }
            default:
                xo60 xo60Var = null;
                try {
                    try {
                        xo60.f263770h.getClass();
                        m86086i(new xo60(pweVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        xo60 xo60Var2 = (xo60) e2.f10912a;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            xo60Var = xo60Var2;
                            if (xo60Var != null) {
                                m86086i(xo60Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (xo60Var != null) {
                        m86086i(xo60Var);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f243382b) {
            case 0:
                vo60 vo60Var = new vo60(0);
                vo60Var.m86085h(m86083e());
                return vo60Var;
            default:
                vo60 vo60Var2 = new vo60(1);
                vo60Var2.m86086i(m86084g());
                return vo60Var2;
        }
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        switch (this.f243382b) {
            case 0:
                m86085h((wo60) a210Var);
                break;
            default:
                m86086i((xo60) a210Var);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public wo60 m86083e() {
        wo60 wo60Var = new wo60(this);
        int i = this.f243383c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wo60Var.f253388c = this.f243384d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        wo60Var.f253389d = this.f243385e;
        wo60Var.f253387b = i2;
        return wo60Var;
    }

    /* JADX INFO: renamed from: g */
    public xo60 m86084g() {
        xo60 xo60Var = new xo60(this);
        int i = this.f243383c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        xo60Var.f263773c = this.f243384d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        xo60Var.f263774d = this.f243385e;
        xo60Var.f263772b = i2;
        return xo60Var;
    }

    /* JADX INFO: renamed from: h */
    public void m86085h(wo60 wo60Var) {
        if (wo60Var == wo60.f253384g) {
            return;
        }
        int i = wo60Var.f253387b;
        if ((i & 1) == 1) {
            int i2 = wo60Var.f253388c;
            this.f243383c = 1 | this.f243383c;
            this.f243384d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = wo60Var.f253389d;
            this.f243383c = 2 | this.f243383c;
            this.f243385e = i3;
        }
        this.f149263a = this.f149263a.m48763b(wo60Var.f253386a);
    }

    /* JADX INFO: renamed from: i */
    public void m86086i(xo60 xo60Var) {
        if (xo60Var == xo60.f263769g) {
            return;
        }
        if (xo60Var.m91532j()) {
            int i = xo60Var.f263773c;
            this.f243383c |= 1;
            this.f243384d = i;
        }
        if (xo60Var.m91531i()) {
            int i2 = xo60Var.f263774d;
            this.f243383c |= 2;
            this.f243385e = i2;
        }
        this.f149263a = this.f149263a.m48763b(xo60Var.f263771a);
    }
}
