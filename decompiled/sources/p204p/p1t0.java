package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class p1t0 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final p1t0 f173161g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f173162h = new uo60(26);

    /* JADX INFO: renamed from: a */
    public final hva f173163a;

    /* JADX INFO: renamed from: b */
    public int f173164b;

    /* JADX INFO: renamed from: c */
    public List f173165c;

    /* JADX INFO: renamed from: d */
    public int f173166d;

    /* JADX INFO: renamed from: e */
    public byte f173167e;

    /* JADX INFO: renamed from: f */
    public int f173168f;

    static {
        p1t0 p1t0Var = new p1t0();
        f173161g = p1t0Var;
        p1t0Var.f173165c = Collections.EMPTY_LIST;
        p1t0Var.f173166d = -1;
    }

    public p1t0() {
        this.f173167e = (byte) -1;
        this.f173168f = -1;
        this.f173163a = hva.f95637a;
    }

    /* JADX INFO: renamed from: g */
    public static vzs0 m68843g(p1t0 p1t0Var) {
        vzs0 vzs0VarM86909h = vzs0.m86909h();
        vzs0VarM86909h.m86913j(p1t0Var);
        return vzs0VarM86909h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f173168f;
        if (i != -1) {
            return i;
        }
        int iM87319g = 0;
        for (int i2 = 0; i2 < this.f173165c.size(); i2++) {
            iM87319g += w780.m87321i(1, (AbstractC2155n8) this.f173165c.get(i2));
        }
        if ((this.f173164b & 1) == 1) {
            iM87319g += w780.m87319g(2, this.f173166d);
        }
        int size = this.f173163a.size() + iM87319g;
        this.f173168f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return vzs0.m86909h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        return m68843g(this);
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        for (int i = 0; i < this.f173165c.size(); i++) {
            w780Var.m87346R(1, (AbstractC2155n8) this.f173165c.get(i));
        }
        if ((this.f173164b & 1) == 1) {
            w780Var.m87344P(2, this.f173166d);
        }
        w780Var.m87349U(this.f173163a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f173167e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f173165c.size(); i++) {
            if (!((j1t0) this.f173165c.get(i)).isInitialized()) {
                this.f173167e = (byte) 0;
                return false;
            }
        }
        this.f173167e = (byte) 1;
        return true;
    }

    public p1t0(pwe pweVar, bux buxVar) {
        this.f173167e = (byte) -1;
        this.f173168f = -1;
        this.f173165c = Collections.EMPTY_LIST;
        this.f173166d = -1;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 10) {
                            if (!z2) {
                                this.f173165c = new ArrayList();
                                z2 = true;
                            }
                            this.f173165c.add(pweVar.m71242h(j1t0.f107845T0, buxVar));
                        } else if (iM71249o != 16) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            this.f173164b |= 1;
                            this.f173166d = pweVar.m71246l();
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
                if (z2) {
                    this.f173165c = Collections.unmodifiableList(this.f173165c);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f173163a = evaVar.m40103e();
                }
                throw th;
            }
        }
        if (z2) {
            this.f173165c = Collections.unmodifiableList(this.f173165c);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f173163a = evaVar.m40103e();
        }
    }

    public p1t0(vzs0 vzs0Var) {
        this.f173167e = (byte) -1;
        this.f173168f = -1;
        this.f173163a = vzs0Var.f149263a;
    }
}
