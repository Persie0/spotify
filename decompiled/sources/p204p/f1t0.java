package p204p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class f1t0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public int f64958b;

    /* JADX INFO: renamed from: c */
    public g1t0 f64959c;

    /* JADX INFO: renamed from: d */
    public j1t0 f64960d;

    /* JADX INFO: renamed from: e */
    public int f64961e;

    /* JADX INFO: renamed from: g */
    public static f1t0 m40560g() {
        f1t0 f1t0Var = new f1t0();
        f1t0Var.f64959c = g1t0.INV;
        f1t0Var.f64960d = j1t0.f107844S0;
        return f1t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        h1t0 h1t0VarM40561e = m40561e();
        if (h1t0VarM40561e.isInitialized()) {
            return h1t0VarM40561e;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        h1t0 h1t0Var = null;
        try {
            try {
                h1t0.f86700i.getClass();
                m40562h(new h1t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                h1t0 h1t0Var2 = (h1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    h1t0Var = h1t0Var2;
                    if (h1t0Var != null) {
                        m40562h(h1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (h1t0Var != null) {
                m40562h(h1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        f1t0 f1t0VarM40560g = m40560g();
        f1t0VarM40560g.m40562h(m40561e());
        return f1t0VarM40560g;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m40562h((h1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final h1t0 m40561e() {
        h1t0 h1t0Var = new h1t0(this);
        int i = this.f64958b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        h1t0Var.f86703c = this.f64959c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        h1t0Var.f86704d = this.f64960d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        h1t0Var.f86705e = this.f64961e;
        h1t0Var.f86702b = i2;
        return h1t0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m40562h(h1t0 h1t0Var) {
        j1t0 j1t0Var;
        if (h1t0Var == h1t0.f86699h) {
            return;
        }
        if ((h1t0Var.f86702b & 1) == 1) {
            g1t0 g1t0Var = h1t0Var.f86703c;
            g1t0Var.getClass();
            this.f64958b = 1 | this.f64958b;
            this.f64959c = g1t0Var;
        }
        if ((h1t0Var.f86702b & 2) == 2) {
            j1t0 j1t0Var2 = h1t0Var.f86704d;
            if ((this.f64958b & 2) != 2 || (j1t0Var = this.f64960d) == j1t0.f107844S0) {
                this.f64960d = j1t0Var2;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var);
                i1t0VarM52183p.m49425i(j1t0Var2);
                this.f64960d = i1t0VarM52183p.m49424g();
            }
            this.f64958b |= 2;
        }
        if ((h1t0Var.f86702b & 4) == 4) {
            int i = h1t0Var.f86705e;
            this.f64958b = 4 | this.f64958b;
            this.f64961e = i;
        }
        this.f149263a = this.f149263a.m48763b(h1t0Var.f86701a);
    }
}
