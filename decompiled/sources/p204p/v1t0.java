package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class v1t0 extends a210 {

    /* JADX INFO: renamed from: X */
    public static final v1t0 f236464X;

    /* JADX INFO: renamed from: Y */
    public static final uo60 f236465Y = new uo60(28);

    /* JADX INFO: renamed from: a */
    public final hva f236466a;

    /* JADX INFO: renamed from: b */
    public int f236467b;

    /* JADX INFO: renamed from: c */
    public int f236468c;

    /* JADX INFO: renamed from: d */
    public int f236469d;

    /* JADX INFO: renamed from: e */
    public t1t0 f236470e;

    /* JADX INFO: renamed from: f */
    public int f236471f;

    /* JADX INFO: renamed from: g */
    public int f236472g;

    /* JADX INFO: renamed from: h */
    public u1t0 f236473h;

    /* JADX INFO: renamed from: i */
    public byte f236474i;

    /* JADX INFO: renamed from: t */
    public int f236475t;

    static {
        v1t0 v1t0Var = new v1t0();
        f236464X = v1t0Var;
        v1t0Var.f236468c = 0;
        v1t0Var.f236469d = 0;
        v1t0Var.f236470e = t1t0.ERROR;
        v1t0Var.f236471f = 0;
        v1t0Var.f236472g = 0;
        v1t0Var.f236473h = u1t0.LANGUAGE_VERSION;
    }

    public v1t0() {
        this.f236474i = (byte) -1;
        this.f236475t = -1;
        this.f236466a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f236475t;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f236467b & 1) == 1 ? w780.m87319g(1, this.f236468c) : 0;
        if ((this.f236467b & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f236469d);
        }
        if ((this.f236467b & 4) == 4) {
            iM87319g += w780.m87318f(3, this.f236470e.f216357a);
        }
        if ((this.f236467b & 8) == 8) {
            iM87319g += w780.m87319g(4, this.f236471f);
        }
        if ((this.f236467b & 16) == 16) {
            iM87319g += w780.m87319g(5, this.f236472g);
        }
        if ((this.f236467b & 32) == 32) {
            iM87319g += w780.m87318f(6, this.f236473h.f225920a);
        }
        int size = this.f236466a.size() + iM87319g;
        this.f236475t = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return s1t0.m76985g();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        s1t0 s1t0VarM76985g = s1t0.m76985g();
        s1t0VarM76985g.m76987h(this);
        return s1t0VarM76985g;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f236467b & 1) == 1) {
            w780Var.m87344P(1, this.f236468c);
        }
        if ((this.f236467b & 2) == 2) {
            w780Var.m87344P(2, this.f236469d);
        }
        if ((this.f236467b & 4) == 4) {
            w780Var.m87343O(3, this.f236470e.f216357a);
        }
        if ((this.f236467b & 8) == 8) {
            w780Var.m87344P(4, this.f236471f);
        }
        if ((this.f236467b & 16) == 16) {
            w780Var.m87344P(5, this.f236472g);
        }
        if ((this.f236467b & 32) == 32) {
            w780Var.m87343O(6, this.f236473h.f225920a);
        }
        w780Var.m87349U(this.f236466a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f236474i == 1) {
            return true;
        }
        this.f236474i = (byte) 1;
        return true;
    }

    public v1t0(pwe pweVar) {
        this.f236474i = (byte) -1;
        this.f236475t = -1;
        boolean z = false;
        this.f236468c = 0;
        this.f236469d = 0;
        t1t0 t1t0Var = t1t0.ERROR;
        this.f236470e = t1t0Var;
        this.f236471f = 0;
        this.f236472g = 0;
        u1t0 u1t0Var = u1t0.LANGUAGE_VERSION;
        this.f236473h = u1t0Var;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f236467b |= 1;
                            this.f236468c = pweVar.m71246l();
                        } else if (iM71249o != 16) {
                            u1t0 u1t0Var2 = null;
                            t1t0 t1t0Var2 = null;
                            if (iM71249o == 24) {
                                int iM71246l = pweVar.m71246l();
                                if (iM71246l == 0) {
                                    t1t0Var2 = t1t0.WARNING;
                                } else if (iM71246l == 1) {
                                    t1t0Var2 = t1t0Var;
                                } else if (iM71246l == 2) {
                                    t1t0Var2 = t1t0.HIDDEN;
                                }
                                if (t1t0Var2 == null) {
                                    w780VarM87328y.m87353Y(iM71249o);
                                    w780VarM87328y.m87353Y(iM71246l);
                                } else {
                                    this.f236467b |= 4;
                                    this.f236470e = t1t0Var2;
                                }
                            } else if (iM71249o == 32) {
                                this.f236467b |= 8;
                                this.f236471f = pweVar.m71246l();
                            } else if (iM71249o == 40) {
                                this.f236467b |= 16;
                                this.f236472g = pweVar.m71246l();
                            } else if (iM71249o != 48) {
                                if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                }
                            } else {
                                int iM71246l2 = pweVar.m71246l();
                                if (iM71246l2 == 0) {
                                    u1t0Var2 = u1t0Var;
                                } else if (iM71246l2 == 1) {
                                    u1t0Var2 = u1t0.COMPILER_VERSION;
                                } else if (iM71246l2 == 2) {
                                    u1t0Var2 = u1t0.API_VERSION;
                                }
                                if (u1t0Var2 == null) {
                                    w780VarM87328y.m87353Y(iM71249o);
                                    w780VarM87328y.m87353Y(iM71246l2);
                                } else {
                                    this.f236467b |= 32;
                                    this.f236473h = u1t0Var2;
                                }
                            }
                        } else {
                            this.f236467b |= 2;
                            this.f236469d = pweVar.m71246l();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f236466a = evaVar.m40103e();
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
            this.f236466a = evaVar.m40103e();
        }
    }

    public v1t0(s1t0 s1t0Var) {
        this.f236474i = (byte) -1;
        this.f236475t = -1;
        this.f236466a = s1t0Var.f149263a;
    }
}
