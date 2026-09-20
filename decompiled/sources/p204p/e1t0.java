package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class e1t0 extends a210 {

    /* JADX INFO: renamed from: e */
    public static final e1t0 f55250e;

    /* JADX INFO: renamed from: f */
    public static final uo60 f55251f = new uo60(21);

    /* JADX INFO: renamed from: a */
    public final hva f55252a;

    /* JADX INFO: renamed from: b */
    public zy70 f55253b;

    /* JADX INFO: renamed from: c */
    public byte f55254c;

    /* JADX INFO: renamed from: d */
    public int f55255d;

    static {
        e1t0 e1t0Var = new e1t0();
        f55250e = e1t0Var;
        e1t0Var.f55253b = vy70.f245998b;
    }

    public e1t0() {
        this.f55254c = (byte) -1;
        this.f55255d = -1;
        this.f55252a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f55255d;
        if (i != -1) {
            return i;
        }
        int size = 0;
        for (int i2 = 0; i2 < this.f55253b.size(); i2++) {
            hva hvaVarMo77122q0 = this.f55253b.mo77122q0(i2);
            size += hvaVarMo77122q0.size() + w780.m87323k(hvaVarMo77122q0.size());
        }
        int size2 = this.f55252a.size() + this.f55253b.size() + size;
        this.f55255d = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        d0t0 d0t0Var = new d0t0(3);
        d0t0Var.f44052d = vy70.f245998b;
        return d0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        d0t0 d0t0Var = new d0t0(3);
        d0t0Var.f44052d = vy70.f245998b;
        d0t0Var.m34560l(this);
        return d0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        for (int i = 0; i < this.f55253b.size(); i++) {
            hva hvaVarMo77122q0 = this.f55253b.mo77122q0(i);
            w780Var.m87356a0(1, 2);
            w780Var.m87353Y(hvaVarMo77122q0.size());
            w780Var.m87349U(hvaVarMo77122q0);
        }
        w780Var.m87349U(this.f55252a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f55254c == 1) {
            return true;
        }
        this.f55254c = (byte) 1;
        return true;
    }

    public e1t0(pwe pweVar) {
        this.f55254c = (byte) -1;
        this.f55255d = -1;
        this.f55253b = vy70.f245998b;
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
                            xj90 xj90VarM71240f = pweVar.m71240f();
                            if (!z2) {
                                this.f55253b = new vy70();
                                z2 = true;
                            }
                            this.f55253b.mo77120f1(xj90VarM71240f);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.f55253b = this.f55253b.mo77121g();
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f55252a = evaVar.m40103e();
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
            this.f55253b = this.f55253b.mo77121g();
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f55252a = evaVar.m40103e();
        }
    }

    public e1t0(d0t0 d0t0Var) {
        this.f55254c = (byte) -1;
        this.f55255d = -1;
        this.f55252a = d0t0Var.f149263a;
    }
}
