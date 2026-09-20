package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class j0t0 extends a210 {

    /* JADX INFO: renamed from: X */
    public static final uo60 f107545X = new uo60(12);

    /* JADX INFO: renamed from: t */
    public static final j0t0 f107546t;

    /* JADX INFO: renamed from: a */
    public final hva f107547a;

    /* JADX INFO: renamed from: b */
    public int f107548b;

    /* JADX INFO: renamed from: c */
    public h0t0 f107549c;

    /* JADX INFO: renamed from: d */
    public List f107550d;

    /* JADX INFO: renamed from: e */
    public o0t0 f107551e;

    /* JADX INFO: renamed from: f */
    public i0t0 f107552f;

    /* JADX INFO: renamed from: g */
    public g0t0 f107553g;

    /* JADX INFO: renamed from: h */
    public byte f107554h;

    /* JADX INFO: renamed from: i */
    public int f107555i;

    static {
        j0t0 j0t0Var = new j0t0();
        f107546t = j0t0Var;
        j0t0Var.f107549c = h0t0.RETURNS_CONSTANT;
        j0t0Var.f107550d = Collections.EMPTY_LIST;
        j0t0Var.f107551e = o0t0.f160455Y;
        j0t0Var.f107552f = i0t0.AT_MOST_ONCE;
        j0t0Var.f107553g = g0t0.CONCLUSION_CONDITION;
    }

    public j0t0() {
        this.f107554h = (byte) -1;
        this.f107555i = -1;
        this.f107547a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f107555i;
        if (i != -1) {
            return i;
        }
        int iM87318f = (this.f107548b & 1) == 1 ? w780.m87318f(1, this.f107549c.f86353a) : 0;
        for (int i2 = 0; i2 < this.f107550d.size(); i2++) {
            iM87318f += w780.m87321i(2, (AbstractC2155n8) this.f107550d.get(i2));
        }
        if ((this.f107548b & 2) == 2) {
            iM87318f += w780.m87321i(3, this.f107551e);
        }
        if ((this.f107548b & 4) == 4) {
            iM87318f += w780.m87318f(4, this.f107552f.f97321a);
        }
        if ((this.f107548b & 8) == 8) {
            iM87318f += w780.m87318f(5, this.f107553g.f75436a);
        }
        int size = this.f107547a.size() + iM87318f;
        this.f107555i = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return yo60.m94267i();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        yo60 yo60VarM94267i = yo60.m94267i();
        yo60VarM94267i.m94271k(this);
        return yo60VarM94267i;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f107548b & 1) == 1) {
            w780Var.m87343O(1, this.f107549c.f86353a);
        }
        for (int i = 0; i < this.f107550d.size(); i++) {
            w780Var.m87346R(2, (AbstractC2155n8) this.f107550d.get(i));
        }
        if ((this.f107548b & 2) == 2) {
            w780Var.m87346R(3, this.f107551e);
        }
        if ((this.f107548b & 4) == 4) {
            w780Var.m87343O(4, this.f107552f.f97321a);
        }
        if ((this.f107548b & 8) == 8) {
            w780Var.m87343O(5, this.f107553g.f75436a);
        }
        w780Var.m87349U(this.f107547a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f107554h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f107550d.size(); i++) {
            if (!((o0t0) this.f107550d.get(i)).isInitialized()) {
                this.f107554h = (byte) 0;
                return false;
            }
        }
        if ((this.f107548b & 2) != 2 || this.f107551e.isInitialized()) {
            this.f107554h = (byte) 1;
            return true;
        }
        this.f107554h = (byte) 0;
        return false;
    }

    public j0t0(pwe pweVar, bux buxVar) {
        this.f107554h = (byte) -1;
        this.f107555i = -1;
        h0t0 h0t0Var = h0t0.RETURNS_CONSTANT;
        this.f107549c = h0t0Var;
        this.f107550d = Collections.EMPTY_LIST;
        this.f107551e = o0t0.f160455Y;
        i0t0 i0t0Var = i0t0.AT_MOST_ONCE;
        this.f107552f = i0t0Var;
        g0t0 g0t0Var = g0t0.CONCLUSION_CONDITION;
        this.f107553g = g0t0Var;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        g0t0 g0t0Var2 = null;
                        h0t0 h0t0Var2 = null;
                        m0t0 m0t0VarM60475g = null;
                        i0t0 i0t0Var2 = null;
                        if (iM71249o == 8) {
                            int iM71246l = pweVar.m71246l();
                            if (iM71246l == 0) {
                                h0t0Var2 = h0t0Var;
                            } else if (iM71246l == 1) {
                                h0t0Var2 = h0t0.CALLS;
                            } else if (iM71246l == 2) {
                                h0t0Var2 = h0t0.RETURNS_NOT_NULL;
                            }
                            if (h0t0Var2 == null) {
                                w780VarM87328y.m87353Y(iM71249o);
                                w780VarM87328y.m87353Y(iM71246l);
                            } else {
                                this.f107548b |= 1;
                                this.f107549c = h0t0Var2;
                            }
                        } else if (iM71249o == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.f107550d = new ArrayList();
                                c = 2;
                            }
                            this.f107550d.add(pweVar.m71242h(o0t0.f160456Z, buxVar));
                        } else if (iM71249o == 26) {
                            if ((this.f107548b & 2) == 2) {
                                o0t0 o0t0Var = this.f107551e;
                                o0t0Var.getClass();
                                m0t0VarM60475g = m0t0.m60475g();
                                m0t0VarM60475g.m60477h(o0t0Var);
                            }
                            o0t0 o0t0Var2 = (o0t0) pweVar.m71242h(o0t0.f160456Z, buxVar);
                            this.f107551e = o0t0Var2;
                            if (m0t0VarM60475g != null) {
                                m0t0VarM60475g.m60477h(o0t0Var2);
                                this.f107551e = m0t0VarM60475g.m60476e();
                            }
                            this.f107548b |= 2;
                        } else if (iM71249o == 32) {
                            int iM71246l2 = pweVar.m71246l();
                            if (iM71246l2 == 0) {
                                i0t0Var2 = i0t0Var;
                            } else if (iM71246l2 == 1) {
                                i0t0Var2 = i0t0.EXACTLY_ONCE;
                            } else if (iM71246l2 == 2) {
                                i0t0Var2 = i0t0.AT_LEAST_ONCE;
                            }
                            if (i0t0Var2 == null) {
                                w780VarM87328y.m87353Y(iM71249o);
                                w780VarM87328y.m87353Y(iM71246l2);
                            } else {
                                this.f107548b |= 4;
                                this.f107552f = i0t0Var2;
                            }
                        } else if (iM71249o != 40) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            int iM71246l3 = pweVar.m71246l();
                            if (iM71246l3 == 0) {
                                g0t0Var2 = g0t0Var;
                            } else if (iM71246l3 == 1) {
                                g0t0Var2 = g0t0.RETURNS_CONDITION;
                            } else if (iM71246l3 == 2) {
                                g0t0Var2 = g0t0.HOLDSIN_CONDITION;
                            }
                            if (g0t0Var2 == null) {
                                w780VarM87328y.m87353Y(iM71249o);
                                w780VarM87328y.m87353Y(iM71246l3);
                            } else {
                                this.f107548b |= 8;
                                this.f107553g = g0t0Var2;
                            }
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.f107550d = Collections.unmodifiableList(this.f107550d);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f107547a = evaVar.m40103e();
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
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f107550d = Collections.unmodifiableList(this.f107550d);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f107547a = evaVar.m40103e();
        }
    }

    public j0t0(yo60 yo60Var) {
        this.f107554h = (byte) -1;
        this.f107555i = -1;
        this.f107547a = yo60Var.f149263a;
    }
}
