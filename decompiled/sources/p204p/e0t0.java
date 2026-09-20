package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class e0t0 extends a210 {

    /* JADX INFO: renamed from: e */
    public static final e0t0 f55031e;

    /* JADX INFO: renamed from: f */
    public static final uo60 f55032f = new uo60(11);

    /* JADX INFO: renamed from: a */
    public final hva f55033a;

    /* JADX INFO: renamed from: b */
    public List f55034b;

    /* JADX INFO: renamed from: c */
    public byte f55035c;

    /* JADX INFO: renamed from: d */
    public int f55036d;

    static {
        e0t0 e0t0Var = new e0t0();
        f55031e = e0t0Var;
        e0t0Var.f55034b = Collections.EMPTY_LIST;
    }

    public e0t0() {
        this.f55035c = (byte) -1;
        this.f55036d = -1;
        this.f55033a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f55036d;
        if (i != -1) {
            return i;
        }
        int iM87321i = 0;
        for (int i2 = 0; i2 < this.f55034b.size(); i2++) {
            iM87321i += w780.m87321i(1, (AbstractC2155n8) this.f55034b.get(i2));
        }
        int size = this.f55033a.size() + iM87321i;
        this.f55036d = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        d0t0 d0t0Var = new d0t0(0);
        d0t0Var.f44052d = Collections.EMPTY_LIST;
        return d0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        d0t0 d0t0Var = new d0t0(0);
        d0t0Var.f44052d = Collections.EMPTY_LIST;
        d0t0Var.m34558j(this);
        return d0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        for (int i = 0; i < this.f55034b.size(); i++) {
            w780Var.m87346R(1, (AbstractC2155n8) this.f55034b.get(i));
        }
        w780Var.m87349U(this.f55033a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f55035c;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f55034b.size(); i++) {
            if (!((j0t0) this.f55034b.get(i)).isInitialized()) {
                this.f55035c = (byte) 0;
                return false;
            }
        }
        this.f55035c = (byte) 1;
        return true;
    }

    public e0t0(pwe pweVar, bux buxVar) {
        this.f55035c = (byte) -1;
        this.f55036d = -1;
        this.f55034b = Collections.EMPTY_LIST;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o != 10) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            if (!z2) {
                                this.f55034b = new ArrayList();
                                z2 = true;
                            }
                            this.f55034b.add(pweVar.m71242h(j0t0.f107545X, buxVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.f55034b = Collections.unmodifiableList(this.f55034b);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f55033a = evaVar.m40103e();
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
        if (z2) {
            this.f55034b = Collections.unmodifiableList(this.f55034b);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f55033a = evaVar.m40103e();
        }
    }

    public e0t0(d0t0 d0t0Var) {
        this.f55035c = (byte) -1;
        this.f55036d = -1;
        this.f55033a = d0t0Var.f149263a;
    }
}
