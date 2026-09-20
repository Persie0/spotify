package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class o0t0 extends a210 {

    /* JADX INFO: renamed from: Y */
    public static final o0t0 f160455Y;

    /* JADX INFO: renamed from: Z */
    public static final uo60 f160456Z = new uo60(14);

    /* JADX INFO: renamed from: X */
    public int f160457X;

    /* JADX INFO: renamed from: a */
    public final hva f160458a;

    /* JADX INFO: renamed from: b */
    public int f160459b;

    /* JADX INFO: renamed from: c */
    public int f160460c;

    /* JADX INFO: renamed from: d */
    public int f160461d;

    /* JADX INFO: renamed from: e */
    public n0t0 f160462e;

    /* JADX INFO: renamed from: f */
    public j1t0 f160463f;

    /* JADX INFO: renamed from: g */
    public int f160464g;

    /* JADX INFO: renamed from: h */
    public List f160465h;

    /* JADX INFO: renamed from: i */
    public List f160466i;

    /* JADX INFO: renamed from: t */
    public byte f160467t;

    static {
        o0t0 o0t0Var = new o0t0();
        f160455Y = o0t0Var;
        o0t0Var.f160460c = 0;
        o0t0Var.f160461d = 0;
        o0t0Var.f160462e = n0t0.TRUE;
        o0t0Var.f160463f = j1t0.f107844S0;
        o0t0Var.f160464g = 0;
        List list = Collections.EMPTY_LIST;
        o0t0Var.f160465h = list;
        o0t0Var.f160466i = list;
    }

    public o0t0() {
        this.f160467t = (byte) -1;
        this.f160457X = -1;
        this.f160458a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f160457X;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f160459b & 1) == 1 ? w780.m87319g(1, this.f160460c) : 0;
        if ((this.f160459b & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f160461d);
        }
        if ((this.f160459b & 4) == 4) {
            iM87319g += w780.m87318f(3, this.f160462e.f149168a);
        }
        if ((this.f160459b & 8) == 8) {
            iM87319g += w780.m87321i(4, this.f160463f);
        }
        if ((this.f160459b & 16) == 16) {
            iM87319g += w780.m87319g(5, this.f160464g);
        }
        for (int i2 = 0; i2 < this.f160465h.size(); i2++) {
            iM87319g += w780.m87321i(6, (AbstractC2155n8) this.f160465h.get(i2));
        }
        for (int i3 = 0; i3 < this.f160466i.size(); i3++) {
            iM87319g += w780.m87321i(7, (AbstractC2155n8) this.f160466i.get(i3));
        }
        int size = this.f160458a.size() + iM87319g;
        this.f160457X = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return m0t0.m60475g();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        m0t0 m0t0VarM60475g = m0t0.m60475g();
        m0t0VarM60475g.m60477h(this);
        return m0t0VarM60475g;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f160459b & 1) == 1) {
            w780Var.m87344P(1, this.f160460c);
        }
        if ((this.f160459b & 2) == 2) {
            w780Var.m87344P(2, this.f160461d);
        }
        if ((this.f160459b & 4) == 4) {
            w780Var.m87343O(3, this.f160462e.f149168a);
        }
        if ((this.f160459b & 8) == 8) {
            w780Var.m87346R(4, this.f160463f);
        }
        if ((this.f160459b & 16) == 16) {
            w780Var.m87344P(5, this.f160464g);
        }
        for (int i = 0; i < this.f160465h.size(); i++) {
            w780Var.m87346R(6, (AbstractC2155n8) this.f160465h.get(i));
        }
        for (int i2 = 0; i2 < this.f160466i.size(); i2++) {
            w780Var.m87346R(7, (AbstractC2155n8) this.f160466i.get(i2));
        }
        w780Var.m87349U(this.f160458a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f160467t;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f160459b & 8) == 8 && !this.f160463f.isInitialized()) {
            this.f160467t = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f160465h.size(); i++) {
            if (!((o0t0) this.f160465h.get(i)).isInitialized()) {
                this.f160467t = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f160466i.size(); i2++) {
            if (!((o0t0) this.f160466i.get(i2)).isInitialized()) {
                this.f160467t = (byte) 0;
                return false;
            }
        }
        this.f160467t = (byte) 1;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0t0(pwe pweVar, bux buxVar) {
        n0t0 n0t0Var;
        this.f160467t = (byte) -1;
        this.f160457X = -1;
        boolean z = false;
        this.f160460c = 0;
        this.f160461d = 0;
        n0t0 n0t0Var2 = n0t0.TRUE;
        this.f160462e = n0t0Var2;
        this.f160463f = j1t0.f107844S0;
        this.f160464g = 0;
        List list = Collections.EMPTY_LIST;
        this.f160465h = list;
        this.f160466i = list;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f160459b |= 1;
                            this.f160460c = pweVar.m71246l();
                        } else if (iM71249o != 16) {
                            Object objM52183p = null;
                            if (iM71249o == 24) {
                                int iM71246l = pweVar.m71246l();
                                if (iM71246l != 0) {
                                    if (iM71246l == 1) {
                                        objM52183p = n0t0.FALSE;
                                    } else if (iM71246l == 2) {
                                        objM52183p = n0t0.NULL;
                                    }
                                    n0t0Var = objM52183p;
                                } else {
                                    n0t0Var = n0t0Var2;
                                }
                                if (n0t0Var == 0) {
                                    w780VarM87328y.m87353Y(iM71249o);
                                    w780VarM87328y.m87353Y(iM71246l);
                                } else {
                                    this.f160459b |= 4;
                                    this.f160462e = n0t0Var;
                                }
                            } else if (iM71249o == 34) {
                                if ((this.f160459b & 8) == 8) {
                                    j1t0 j1t0Var = this.f160463f;
                                    j1t0Var.getClass();
                                    objM52183p = j1t0.m52183p(j1t0Var);
                                }
                                i1t0 i1t0Var = objM52183p;
                                j1t0 j1t0Var2 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                                this.f160463f = j1t0Var2;
                                if (i1t0Var != 0) {
                                    i1t0Var.m49425i(j1t0Var2);
                                    this.f160463f = i1t0Var.m49424g();
                                }
                                this.f160459b |= 8;
                            } else if (iM71249o != 40) {
                                uo60 uo60Var = f160456Z;
                                if (iM71249o == 50) {
                                    if ((i & 32) != 32) {
                                        this.f160465h = new ArrayList();
                                        i |= 32;
                                    }
                                    this.f160465h.add(pweVar.m71242h(uo60Var, buxVar));
                                } else if (iM71249o != 58) {
                                    if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                    }
                                } else {
                                    if ((i & 64) != 64) {
                                        this.f160466i = new ArrayList();
                                        i |= 64;
                                    }
                                    this.f160466i.add(pweVar.m71242h(uo60Var, buxVar));
                                }
                            } else {
                                this.f160459b |= 16;
                                this.f160464g = pweVar.m71246l();
                            }
                        } else {
                            this.f160459b |= 2;
                            this.f160461d = pweVar.m71246l();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.f160465h = Collections.unmodifiableList(this.f160465h);
                    }
                    if ((i & 64) == 64) {
                        this.f160466i = Collections.unmodifiableList(this.f160466i);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f160458a = evaVar.m40103e();
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
        if ((i & 32) == 32) {
            this.f160465h = Collections.unmodifiableList(this.f160465h);
        }
        if ((i & 64) == 64) {
            this.f160466i = Collections.unmodifiableList(this.f160466i);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f160458a = evaVar.m40103e();
        }
    }

    public o0t0(m0t0 m0t0Var) {
        this.f160467t = (byte) -1;
        this.f160457X = -1;
        this.f160458a = m0t0Var.f149263a;
    }
}
