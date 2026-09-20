package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class u0t0 extends u110 {

    /* JADX INFO: renamed from: X */
    public static final u0t0 f225603X;

    /* JADX INFO: renamed from: Y */
    public static final uo60 f225604Y = new uo60(16);

    /* JADX INFO: renamed from: b */
    public final hva f225605b;

    /* JADX INFO: renamed from: c */
    public int f225606c;

    /* JADX INFO: renamed from: d */
    public List f225607d;

    /* JADX INFO: renamed from: e */
    public List f225608e;

    /* JADX INFO: renamed from: f */
    public List f225609f;

    /* JADX INFO: renamed from: g */
    public p1t0 f225610g;

    /* JADX INFO: renamed from: h */
    public w1t0 f225611h;

    /* JADX INFO: renamed from: i */
    public byte f225612i;

    /* JADX INFO: renamed from: t */
    public int f225613t;

    static {
        u0t0 u0t0Var = new u0t0();
        f225603X = u0t0Var;
        List list = Collections.EMPTY_LIST;
        u0t0Var.f225607d = list;
        u0t0Var.f225608e = list;
        u0t0Var.f225609f = list;
        u0t0Var.f225610g = p1t0.f173161g;
        u0t0Var.f225611h = w1t0.f247176e;
    }

    public u0t0(t0t0 t0t0Var) {
        super(t0t0Var);
        this.f225612i = (byte) -1;
        this.f225613t = -1;
        this.f225605b = t0t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f225613t;
        if (i != -1) {
            return i;
        }
        int iM87321i = 0;
        for (int i2 = 0; i2 < this.f225607d.size(); i2++) {
            iM87321i += w780.m87321i(3, (AbstractC2155n8) this.f225607d.get(i2));
        }
        for (int i3 = 0; i3 < this.f225608e.size(); i3++) {
            iM87321i += w780.m87321i(4, (AbstractC2155n8) this.f225608e.get(i3));
        }
        for (int i4 = 0; i4 < this.f225609f.size(); i4++) {
            iM87321i += w780.m87321i(5, (AbstractC2155n8) this.f225609f.get(i4));
        }
        if ((this.f225606c & 1) == 1) {
            iM87321i += w780.m87321i(30, this.f225610g);
        }
        if ((this.f225606c & 2) == 2) {
            iM87321i += w780.m87321i(32, this.f225611h);
        }
        int size = this.f225605b.size() + m82139h() + iM87321i;
        this.f225613t = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return t0t0.m79847h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        t0t0 t0t0VarM79847h = t0t0.m79847h();
        t0t0VarM79847h.m79849i(this);
        return t0t0VarM79847h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        for (int i = 0; i < this.f225607d.size(); i++) {
            w780Var.m87346R(3, (AbstractC2155n8) this.f225607d.get(i));
        }
        for (int i2 = 0; i2 < this.f225608e.size(); i2++) {
            w780Var.m87346R(4, (AbstractC2155n8) this.f225608e.get(i2));
        }
        for (int i3 = 0; i3 < this.f225609f.size(); i3++) {
            w780Var.m87346R(5, (AbstractC2155n8) this.f225609f.get(i3));
        }
        if ((this.f225606c & 1) == 1) {
            w780Var.m87346R(30, this.f225610g);
        }
        if ((this.f225606c & 2) == 2) {
            w780Var.m87346R(32, this.f225611h);
        }
        teyVar.m80597y(200, w780Var);
        w780Var.m87349U(this.f225605b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f225603X;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f225612i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f225607d.size(); i++) {
            if (!((q0t0) this.f225607d.get(i)).isInitialized()) {
                this.f225612i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f225608e.size(); i2++) {
            if (!((y0t0) this.f225608e.get(i2)).isInitialized()) {
                this.f225612i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f225609f.size(); i3++) {
            if (!((l1t0) this.f225609f.get(i3)).isInitialized()) {
                this.f225612i = (byte) 0;
                return false;
            }
        }
        if ((this.f225606c & 1) == 1 && !this.f225610g.isInitialized()) {
            this.f225612i = (byte) 0;
            return false;
        }
        if (m82138g()) {
            this.f225612i = (byte) 1;
            return true;
        }
        this.f225612i = (byte) 0;
        return false;
    }

    public u0t0() {
        this.f225612i = (byte) -1;
        this.f225613t = -1;
        this.f225605b = hva.f95637a;
    }

    public u0t0(pwe pweVar, bux buxVar) {
        this.f225612i = (byte) -1;
        this.f225613t = -1;
        List list = Collections.EMPTY_LIST;
        this.f225607d = list;
        this.f225608e = list;
        this.f225609f = list;
        this.f225610g = p1t0.f173161g;
        this.f225611h = w1t0.f247176e;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.f225607d = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.f225607d.add(pweVar.m71242h(q0t0.f184075X0, buxVar));
                        } else if (iM71249o == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.f225608e = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.f225608e.add(pweVar.m71242h(y0t0.f268057d1, buxVar));
                        } else if (iM71249o != 42) {
                            d0t0 d0t0Var = null;
                            vzs0 vzs0VarM68843g = null;
                            if (iM71249o == 242) {
                                if ((this.f225606c & 1) == 1) {
                                    p1t0 p1t0Var = this.f225610g;
                                    p1t0Var.getClass();
                                    vzs0VarM68843g = p1t0.m68843g(p1t0Var);
                                }
                                p1t0 p1t0Var2 = (p1t0) pweVar.m71242h(p1t0.f173162h, buxVar);
                                this.f225610g = p1t0Var2;
                                if (vzs0VarM68843g != null) {
                                    vzs0VarM68843g.m86913j(p1t0Var2);
                                    this.f225610g = vzs0VarM68843g.m86911g();
                                }
                                this.f225606c |= 1;
                            } else if (iM71249o != 258) {
                                if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                                }
                            } else {
                                if ((this.f225606c & 2) == 2) {
                                    w1t0 w1t0Var = this.f225611h;
                                    w1t0Var.getClass();
                                    d0t0Var = new d0t0(2);
                                    d0t0Var.f44052d = Collections.EMPTY_LIST;
                                    d0t0Var.m34561m(w1t0Var);
                                }
                                w1t0 w1t0Var2 = (w1t0) pweVar.m71242h(w1t0.f247177f, buxVar);
                                this.f225611h = w1t0Var2;
                                if (d0t0Var != null) {
                                    d0t0Var.m34561m(w1t0Var2);
                                    this.f225611h = d0t0Var.m34557i();
                                }
                                this.f225606c |= 2;
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.f225609f = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.f225609f.add(pweVar.m71242h(l1t0.f128785O0, buxVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) == 1) {
                        this.f225607d = Collections.unmodifiableList(this.f225607d);
                    }
                    if (((i == true ? 1 : 0) & 2) == 2) {
                        this.f225608e = Collections.unmodifiableList(this.f225608e);
                    }
                    if (((i == true ? 1 : 0) & 4) == 4) {
                        this.f225609f = Collections.unmodifiableList(this.f225609f);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f225605b = evaVar.m40103e();
                    }
                    m82142k();
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
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.f225607d = Collections.unmodifiableList(this.f225607d);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.f225608e = Collections.unmodifiableList(this.f225608e);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.f225609f = Collections.unmodifiableList(this.f225609f);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f225605b = evaVar.m40103e();
        }
        m82142k();
    }
}
