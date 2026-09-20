package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class a0t0 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final a0t0 f11161g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f11162h = new uo60(9);

    /* JADX INFO: renamed from: a */
    public final hva f11163a;

    /* JADX INFO: renamed from: b */
    public int f11164b;

    /* JADX INFO: renamed from: c */
    public int f11165c;

    /* JADX INFO: renamed from: d */
    public xj90 f11166d;

    /* JADX INFO: renamed from: e */
    public byte f11167e;

    /* JADX INFO: renamed from: f */
    public int f11168f;

    static {
        a0t0 a0t0Var = new a0t0();
        f11161g = a0t0Var;
        a0t0Var.f11165c = 0;
        a0t0Var.f11166d = hva.f95637a;
    }

    public a0t0() {
        this.f11167e = (byte) -1;
        this.f11168f = -1;
        this.f11163a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f11168f;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f11164b & 1) == 1 ? w780.m87319g(1, this.f11165c) : 0;
        if ((this.f11164b & 2) == 2) {
            xj90 xj90Var = this.f11166d;
            iM87319g += xj90Var.size() + w780.m87323k(xj90Var.size()) + w780.m87325m(2);
        }
        int size = this.f11163a.size() + iM87319g;
        this.f11168f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        qzs0 qzs0Var = new qzs0(1);
        qzs0Var.f194263e = hva.f95637a;
        return qzs0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        qzs0 qzs0Var = new qzs0(1);
        qzs0Var.f194263e = hva.f95637a;
        qzs0Var.m74353i(this);
        return qzs0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f11164b & 1) == 1) {
            w780Var.m87344P(1, this.f11165c);
        }
        if ((this.f11164b & 2) == 2) {
            xj90 xj90Var = this.f11166d;
            w780Var.m87356a0(2, 2);
            w780Var.m87353Y(xj90Var.size());
            w780Var.m87349U(xj90Var);
        }
        w780Var.m87349U(this.f11163a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f11167e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f11164b;
        if ((i & 1) != 1) {
            this.f11167e = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.f11167e = (byte) 1;
            return true;
        }
        this.f11167e = (byte) 0;
        return false;
    }

    public a0t0(pwe pweVar) {
        this.f11167e = (byte) -1;
        this.f11168f = -1;
        boolean z = false;
        this.f11165c = 0;
        this.f11166d = hva.f95637a;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM71249o = pweVar.m71249o();
                        if (iM71249o != 0) {
                            if (iM71249o == 8) {
                                this.f11164b |= 1;
                                this.f11165c = pweVar.m71246l();
                            } else if (iM71249o != 18) {
                                if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                }
                            } else {
                                this.f11164b |= 2;
                                this.f11166d = pweVar.m71240f();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.f10912a = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f10912a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f11163a = evaVar.m40103e();
                }
                throw th;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f11163a = evaVar.m40103e();
        }
    }

    public a0t0(qzs0 qzs0Var) {
        this.f11167e = (byte) -1;
        this.f11168f = -1;
        this.f11163a = qzs0Var.f149263a;
    }
}
