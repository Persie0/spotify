package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class xo60 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final xo60 f263769g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f263770h = new uo60(1);

    /* JADX INFO: renamed from: a */
    public final hva f263771a;

    /* JADX INFO: renamed from: b */
    public int f263772b;

    /* JADX INFO: renamed from: c */
    public int f263773c;

    /* JADX INFO: renamed from: d */
    public int f263774d;

    /* JADX INFO: renamed from: e */
    public byte f263775e;

    /* JADX INFO: renamed from: f */
    public int f263776f;

    static {
        xo60 xo60Var = new xo60();
        f263769g = xo60Var;
        xo60Var.f263773c = 0;
        xo60Var.f263774d = 0;
    }

    public xo60() {
        this.f263775e = (byte) -1;
        this.f263776f = -1;
        this.f263771a = hva.f95637a;
    }

    /* JADX INFO: renamed from: k */
    public static vo60 m91528k(xo60 xo60Var) {
        vo60 vo60Var = new vo60(1);
        vo60Var.m86086i(xo60Var);
        return vo60Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f263776f;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f263772b & 1) == 1 ? w780.m87319g(1, this.f263773c) : 0;
        if ((this.f263772b & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f263774d);
        }
        int size = this.f263771a.size() + iM87319g;
        this.f263776f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return new vo60(1);
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        return m91528k(this);
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f263772b & 1) == 1) {
            w780Var.m87344P(1, this.f263773c);
        }
        if ((this.f263772b & 2) == 2) {
            w780Var.m87344P(2, this.f263774d);
        }
        w780Var.m87349U(this.f263771a);
    }

    /* JADX INFO: renamed from: g */
    public final int m91529g() {
        return this.f263774d;
    }

    /* JADX INFO: renamed from: h */
    public final int m91530h() {
        return this.f263773c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91531i() {
        return (this.f263772b & 2) == 2;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f263775e == 1) {
            return true;
        }
        this.f263775e = (byte) 1;
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91532j() {
        return (this.f263772b & 1) == 1;
    }

    public xo60(pwe pweVar) {
        this.f263775e = (byte) -1;
        this.f263776f = -1;
        boolean z = false;
        this.f263773c = 0;
        this.f263774d = 0;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM71249o = pweVar.m71249o();
                        if (iM71249o != 0) {
                            if (iM71249o == 8) {
                                this.f263772b |= 1;
                                this.f263773c = pweVar.m71246l();
                            } else if (iM71249o != 16) {
                                if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                }
                            } else {
                                this.f263772b |= 2;
                                this.f263774d = pweVar.m71246l();
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
                    this.f263771a = evaVar.m40103e();
                }
                throw th;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f263771a = evaVar.m40103e();
        }
    }

    public xo60(vo60 vo60Var) {
        this.f263775e = (byte) -1;
        this.f263776f = -1;
        this.f263771a = vo60Var.f149263a;
    }
}
