package p204p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class s1t0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public int f204795b;

    /* JADX INFO: renamed from: c */
    public int f204796c;

    /* JADX INFO: renamed from: d */
    public int f204797d;

    /* JADX INFO: renamed from: e */
    public t1t0 f204798e;

    /* JADX INFO: renamed from: f */
    public int f204799f;

    /* JADX INFO: renamed from: g */
    public int f204800g;

    /* JADX INFO: renamed from: h */
    public u1t0 f204801h;

    /* JADX INFO: renamed from: g */
    public static s1t0 m76985g() {
        s1t0 s1t0Var = new s1t0();
        s1t0Var.f204798e = t1t0.ERROR;
        s1t0Var.f204801h = u1t0.LANGUAGE_VERSION;
        return s1t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        v1t0 v1t0VarM76986e = m76986e();
        v1t0VarM76986e.isInitialized();
        return v1t0VarM76986e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        v1t0 v1t0Var = null;
        try {
            try {
                v1t0.f236465Y.getClass();
                m76987h(new v1t0(pweVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                v1t0 v1t0Var2 = (v1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    v1t0Var = v1t0Var2;
                    if (v1t0Var != null) {
                        m76987h(v1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (v1t0Var != null) {
                m76987h(v1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        s1t0 s1t0VarM76985g = m76985g();
        s1t0VarM76985g.m76987h(m76986e());
        return s1t0VarM76985g;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m76987h((v1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final v1t0 m76986e() {
        v1t0 v1t0Var = new v1t0(this);
        int i = this.f204795b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        v1t0Var.f236468c = this.f204796c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        v1t0Var.f236469d = this.f204797d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        v1t0Var.f236470e = this.f204798e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        v1t0Var.f236471f = this.f204799f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        v1t0Var.f236472g = this.f204800g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        v1t0Var.f236473h = this.f204801h;
        v1t0Var.f236467b = i2;
        return v1t0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m76987h(v1t0 v1t0Var) {
        if (v1t0Var == v1t0.f236464X) {
            return;
        }
        int i = v1t0Var.f236467b;
        if ((i & 1) == 1) {
            int i2 = v1t0Var.f236468c;
            this.f204795b = 1 | this.f204795b;
            this.f204796c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = v1t0Var.f236469d;
            this.f204795b = 2 | this.f204795b;
            this.f204797d = i3;
        }
        if ((i & 4) == 4) {
            t1t0 t1t0Var = v1t0Var.f236470e;
            t1t0Var.getClass();
            this.f204795b = 4 | this.f204795b;
            this.f204798e = t1t0Var;
        }
        int i4 = v1t0Var.f236467b;
        if ((i4 & 8) == 8) {
            int i5 = v1t0Var.f236471f;
            this.f204795b = 8 | this.f204795b;
            this.f204799f = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = v1t0Var.f236472g;
            this.f204795b = 16 | this.f204795b;
            this.f204800g = i6;
        }
        if ((i4 & 32) == 32) {
            u1t0 u1t0Var = v1t0Var.f236473h;
            u1t0Var.getClass();
            this.f204795b = 32 | this.f204795b;
            this.f204801h = u1t0Var;
        }
        this.f149263a = this.f149263a.m48763b(v1t0Var.f236466a);
    }
}
