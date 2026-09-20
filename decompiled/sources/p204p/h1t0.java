package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class h1t0 extends a210 {

    /* JADX INFO: renamed from: h */
    public static final h1t0 f86699h;

    /* JADX INFO: renamed from: i */
    public static final uo60 f86700i = new uo60(23);

    /* JADX INFO: renamed from: a */
    public final hva f86701a;

    /* JADX INFO: renamed from: b */
    public int f86702b;

    /* JADX INFO: renamed from: c */
    public g1t0 f86703c;

    /* JADX INFO: renamed from: d */
    public j1t0 f86704d;

    /* JADX INFO: renamed from: e */
    public int f86705e;

    /* JADX INFO: renamed from: f */
    public byte f86706f;

    /* JADX INFO: renamed from: g */
    public int f86707g;

    static {
        h1t0 h1t0Var = new h1t0();
        f86699h = h1t0Var;
        h1t0Var.f86703c = g1t0.INV;
        h1t0Var.f86704d = j1t0.f107844S0;
        h1t0Var.f86705e = 0;
    }

    public h1t0() {
        this.f86706f = (byte) -1;
        this.f86707g = -1;
        this.f86701a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f86707g;
        if (i != -1) {
            return i;
        }
        int iM87318f = (this.f86702b & 1) == 1 ? w780.m87318f(1, this.f86703c.f75721a) : 0;
        if ((this.f86702b & 2) == 2) {
            iM87318f += w780.m87321i(2, this.f86704d);
        }
        if ((this.f86702b & 4) == 4) {
            iM87318f += w780.m87319g(3, this.f86705e);
        }
        int size = this.f86701a.size() + iM87318f;
        this.f86707g = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return f1t0.m40560g();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        f1t0 f1t0VarM40560g = f1t0.m40560g();
        f1t0VarM40560g.m40562h(this);
        return f1t0VarM40560g;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f86702b & 1) == 1) {
            w780Var.m87343O(1, this.f86703c.f75721a);
        }
        if ((this.f86702b & 2) == 2) {
            w780Var.m87346R(2, this.f86704d);
        }
        if ((this.f86702b & 4) == 4) {
            w780Var.m87344P(3, this.f86705e);
        }
        w780Var.m87349U(this.f86701a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f86706f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f86702b & 2) != 2 || this.f86704d.isInitialized()) {
            this.f86706f = (byte) 1;
            return true;
        }
        this.f86706f = (byte) 0;
        return false;
    }

    public h1t0(pwe pweVar, bux buxVar) {
        this.f86706f = (byte) -1;
        this.f86707g = -1;
        g1t0 g1t0Var = g1t0.INV;
        this.f86703c = g1t0Var;
        this.f86704d = j1t0.f107844S0;
        boolean z = false;
        this.f86705e = 0;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        i1t0 i1t0VarM52183p = null;
                        g1t0 g1t0Var2 = null;
                        if (iM71249o == 8) {
                            int iM71246l = pweVar.m71246l();
                            if (iM71246l == 0) {
                                g1t0Var2 = g1t0.IN;
                            } else if (iM71246l == 1) {
                                g1t0Var2 = g1t0.OUT;
                            } else if (iM71246l == 2) {
                                g1t0Var2 = g1t0Var;
                            } else if (iM71246l == 3) {
                                g1t0Var2 = g1t0.STAR;
                            }
                            if (g1t0Var2 == null) {
                                w780VarM87328y.m87353Y(iM71249o);
                                w780VarM87328y.m87353Y(iM71246l);
                            } else {
                                this.f86702b |= 1;
                                this.f86703c = g1t0Var2;
                            }
                        } else if (iM71249o == 18) {
                            if ((this.f86702b & 2) == 2) {
                                j1t0 j1t0Var = this.f86704d;
                                j1t0Var.getClass();
                                i1t0VarM52183p = j1t0.m52183p(j1t0Var);
                            }
                            j1t0 j1t0Var2 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                            this.f86704d = j1t0Var2;
                            if (i1t0VarM52183p != null) {
                                i1t0VarM52183p.m49425i(j1t0Var2);
                                this.f86704d = i1t0VarM52183p.m49424g();
                            }
                            this.f86702b |= 2;
                        } else if (iM71249o != 24) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            this.f86702b |= 4;
                            this.f86705e = pweVar.m71246l();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f86701a = evaVar.m40103e();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f10912a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.f10912a = this;
                throw invalidProtocolBufferException;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f86701a = evaVar.m40103e();
        }
    }

    public h1t0(f1t0 f1t0Var) {
        this.f86706f = (byte) -1;
        this.f86707g = -1;
        this.f86701a = f1t0Var.f149263a;
    }
}
