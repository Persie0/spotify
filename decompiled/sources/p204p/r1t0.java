package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class r1t0 extends u110 {

    /* JADX INFO: renamed from: L0 */
    public static final r1t0 f194907L0;

    /* JADX INFO: renamed from: M0 */
    public static final uo60 f194908M0 = new uo60(27);

    /* JADX INFO: renamed from: X */
    public tzs0 f194909X;

    /* JADX INFO: renamed from: Y */
    public byte f194910Y;

    /* JADX INFO: renamed from: Z */
    public int f194911Z;

    /* JADX INFO: renamed from: b */
    public final hva f194912b;

    /* JADX INFO: renamed from: c */
    public int f194913c;

    /* JADX INFO: renamed from: d */
    public int f194914d;

    /* JADX INFO: renamed from: e */
    public int f194915e;

    /* JADX INFO: renamed from: f */
    public j1t0 f194916f;

    /* JADX INFO: renamed from: g */
    public int f194917g;

    /* JADX INFO: renamed from: h */
    public j1t0 f194918h;

    /* JADX INFO: renamed from: i */
    public int f194919i;

    /* JADX INFO: renamed from: t */
    public List f194920t;

    static {
        r1t0 r1t0Var = new r1t0();
        f194907L0 = r1t0Var;
        r1t0Var.f194914d = 0;
        r1t0Var.f194915e = 0;
        j1t0 j1t0Var = j1t0.f107844S0;
        r1t0Var.f194916f = j1t0Var;
        r1t0Var.f194917g = 0;
        r1t0Var.f194918h = j1t0Var;
        r1t0Var.f194919i = 0;
        r1t0Var.f194920t = Collections.EMPTY_LIST;
        r1t0Var.f194909X = tzs0.f225293N0;
    }

    public r1t0(q1t0 q1t0Var) {
        super(q1t0Var);
        this.f194910Y = (byte) -1;
        this.f194911Z = -1;
        this.f194912b = q1t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f194911Z;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f194913c & 1) == 1 ? w780.m87319g(1, this.f194914d) : 0;
        if ((this.f194913c & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f194915e);
        }
        if ((this.f194913c & 4) == 4) {
            iM87319g += w780.m87321i(3, this.f194916f);
        }
        if ((this.f194913c & 16) == 16) {
            iM87319g += w780.m87321i(4, this.f194918h);
        }
        if ((this.f194913c & 8) == 8) {
            iM87319g += w780.m87319g(5, this.f194917g);
        }
        if ((this.f194913c & 32) == 32) {
            iM87319g += w780.m87319g(6, this.f194919i);
        }
        for (int i2 = 0; i2 < this.f194920t.size(); i2++) {
            iM87319g += w780.m87321i(7, (AbstractC2155n8) this.f194920t.get(i2));
        }
        if ((this.f194913c & 64) == 64) {
            iM87319g += w780.m87321i(8, this.f194909X);
        }
        int size = this.f194912b.size() + m82139h() + iM87319g;
        this.f194911Z = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return q1t0.m71955h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        q1t0 q1t0VarM71955h = q1t0.m71955h();
        q1t0VarM71955h.m71957i(this);
        return q1t0VarM71955h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f194913c & 1) == 1) {
            w780Var.m87344P(1, this.f194914d);
        }
        if ((this.f194913c & 2) == 2) {
            w780Var.m87344P(2, this.f194915e);
        }
        if ((this.f194913c & 4) == 4) {
            w780Var.m87346R(3, this.f194916f);
        }
        if ((this.f194913c & 16) == 16) {
            w780Var.m87346R(4, this.f194918h);
        }
        if ((this.f194913c & 8) == 8) {
            w780Var.m87344P(5, this.f194917g);
        }
        if ((this.f194913c & 32) == 32) {
            w780Var.m87344P(6, this.f194919i);
        }
        for (int i = 0; i < this.f194920t.size(); i++) {
            w780Var.m87346R(7, (AbstractC2155n8) this.f194920t.get(i));
        }
        if ((this.f194913c & 64) == 64) {
            w780Var.m87346R(8, this.f194909X);
        }
        teyVar.m80597y(200, w780Var);
        w780Var.m87349U(this.f194912b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f194907L0;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f194910Y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f194913c;
        if ((i & 2) != 2) {
            this.f194910Y = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f194916f.isInitialized()) {
            this.f194910Y = (byte) 0;
            return false;
        }
        if ((this.f194913c & 16) == 16 && !this.f194918h.isInitialized()) {
            this.f194910Y = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f194920t.size(); i2++) {
            if (!((wzs0) this.f194920t.get(i2)).isInitialized()) {
                this.f194910Y = (byte) 0;
                return false;
            }
        }
        if ((this.f194913c & 64) == 64 && !this.f194909X.isInitialized()) {
            this.f194910Y = (byte) 0;
            return false;
        }
        if (m82138g()) {
            this.f194910Y = (byte) 1;
            return true;
        }
        this.f194910Y = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final int m74490n() {
        return this.f194915e;
    }

    /* JADX INFO: renamed from: o */
    public final q1t0 m74491o() {
        q1t0 q1t0VarM71955h = q1t0.m71955h();
        q1t0VarM71955h.m71957i(this);
        return q1t0VarM71955h;
    }

    public r1t0() {
        this.f194910Y = (byte) -1;
        this.f194911Z = -1;
        this.f194912b = hva.f95637a;
    }

    public r1t0(pwe pweVar, bux buxVar) {
        this.f194910Y = (byte) -1;
        this.f194911Z = -1;
        boolean z = false;
        this.f194914d = 0;
        this.f194915e = 0;
        j1t0 j1t0Var = j1t0.f107844S0;
        this.f194916f = j1t0Var;
        this.f194917g = 0;
        this.f194918h = j1t0Var;
        this.f194919i = 0;
        this.f194920t = Collections.EMPTY_LIST;
        this.f194909X = tzs0.f225293N0;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f194913c |= 1;
                            this.f194914d = pweVar.m71246l();
                        } else if (iM71249o != 16) {
                            rzs0 rzs0VarM82075h = null;
                            i1t0 i1t0VarM52183p = null;
                            i1t0 i1t0VarM52183p2 = null;
                            if (iM71249o == 26) {
                                if ((this.f194913c & 4) == 4) {
                                    j1t0 j1t0Var2 = this.f194916f;
                                    j1t0Var2.getClass();
                                    i1t0VarM52183p = j1t0.m52183p(j1t0Var2);
                                }
                                j1t0 j1t0Var3 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                                this.f194916f = j1t0Var3;
                                if (i1t0VarM52183p != null) {
                                    i1t0VarM52183p.m49425i(j1t0Var3);
                                    this.f194916f = i1t0VarM52183p.m49424g();
                                }
                                this.f194913c |= 4;
                            } else if (iM71249o == 34) {
                                if ((this.f194913c & 16) == 16) {
                                    j1t0 j1t0Var4 = this.f194918h;
                                    j1t0Var4.getClass();
                                    i1t0VarM52183p2 = j1t0.m52183p(j1t0Var4);
                                }
                                j1t0 j1t0Var5 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                                this.f194918h = j1t0Var5;
                                if (i1t0VarM52183p2 != null) {
                                    i1t0VarM52183p2.m49425i(j1t0Var5);
                                    this.f194918h = i1t0VarM52183p2.m49424g();
                                }
                                this.f194913c |= 16;
                            } else if (iM71249o == 40) {
                                this.f194913c |= 8;
                                this.f194917g = pweVar.m71246l();
                            } else if (iM71249o == 48) {
                                this.f194913c |= 32;
                                this.f194919i = pweVar.m71246l();
                            } else if (iM71249o == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.f194920t = new ArrayList();
                                    c = '@';
                                }
                                this.f194920t.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                            } else if (iM71249o != 66) {
                                if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                                }
                            } else {
                                if ((this.f194913c & 64) == 64) {
                                    tzs0 tzs0Var = this.f194909X;
                                    tzs0Var.getClass();
                                    rzs0VarM82075h = tzs0.m82075h(tzs0Var);
                                }
                                tzs0 tzs0Var2 = (tzs0) pweVar.m71242h(tzs0.f225294O0, buxVar);
                                this.f194909X = tzs0Var2;
                                if (rzs0VarM82075h != null) {
                                    rzs0VarM82075h.m76833h(tzs0Var2);
                                    this.f194909X = rzs0VarM82075h.m76832e();
                                }
                                this.f194913c |= 64;
                            }
                        } else {
                            this.f194913c |= 2;
                            this.f194915e = pweVar.m71246l();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.f10912a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f10912a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (((c == true ? 1 : 0) & '@') == 64) {
                    this.f194920t = Collections.unmodifiableList(this.f194920t);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f194912b = evaVar.m40103e();
                }
                m82142k();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.f194920t = Collections.unmodifiableList(this.f194920t);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f194912b = evaVar.m40103e();
        }
        m82142k();
    }
}
