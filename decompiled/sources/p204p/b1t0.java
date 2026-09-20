package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class b1t0 extends a210 {

    /* JADX INFO: renamed from: h */
    public static final b1t0 f22404h;

    /* JADX INFO: renamed from: i */
    public static final uo60 f22405i = new uo60(20);

    /* JADX INFO: renamed from: a */
    public final hva f22406a;

    /* JADX INFO: renamed from: b */
    public int f22407b;

    /* JADX INFO: renamed from: c */
    public int f22408c;

    /* JADX INFO: renamed from: d */
    public int f22409d;

    /* JADX INFO: renamed from: e */
    public a1t0 f22410e;

    /* JADX INFO: renamed from: f */
    public byte f22411f;

    /* JADX INFO: renamed from: g */
    public int f22412g;

    static {
        b1t0 b1t0Var = new b1t0();
        f22404h = b1t0Var;
        b1t0Var.f22408c = -1;
        b1t0Var.f22409d = 0;
        b1t0Var.f22410e = a1t0.PACKAGE;
    }

    public b1t0() {
        this.f22411f = (byte) -1;
        this.f22412g = -1;
        this.f22406a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f22412g;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f22407b & 1) == 1 ? w780.m87319g(1, this.f22408c) : 0;
        if ((this.f22407b & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f22409d);
        }
        if ((this.f22407b & 4) == 4) {
            iM87319g += w780.m87318f(3, this.f22410e.f11476a);
        }
        int size = this.f22406a.size() + iM87319g;
        this.f22412g = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return z0t0.m95085g();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        z0t0 z0t0VarM95085g = z0t0.m95085g();
        z0t0VarM95085g.m95087h(this);
        return z0t0VarM95085g;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f22407b & 1) == 1) {
            w780Var.m87344P(1, this.f22408c);
        }
        if ((this.f22407b & 2) == 2) {
            w780Var.m87344P(2, this.f22409d);
        }
        if ((this.f22407b & 4) == 4) {
            w780Var.m87343O(3, this.f22410e.f11476a);
        }
        w780Var.m87349U(this.f22406a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f22411f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f22407b & 2) == 2) {
            this.f22411f = (byte) 1;
            return true;
        }
        this.f22411f = (byte) 0;
        return false;
    }

    public b1t0(pwe pweVar) {
        a1t0 a1t0Var;
        this.f22411f = (byte) -1;
        this.f22412g = -1;
        this.f22408c = -1;
        boolean z = false;
        this.f22409d = 0;
        a1t0 a1t0Var2 = a1t0.PACKAGE;
        this.f22410e = a1t0Var2;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM71249o = pweVar.m71249o();
                        if (iM71249o != 0) {
                            if (iM71249o == 8) {
                                this.f22407b |= 1;
                                this.f22408c = pweVar.m71246l();
                            } else if (iM71249o == 16) {
                                this.f22407b |= 2;
                                this.f22409d = pweVar.m71246l();
                            } else if (iM71249o != 24) {
                                if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                }
                            } else {
                                int iM71246l = pweVar.m71246l();
                                if (iM71246l == 0) {
                                    a1t0Var = a1t0.CLASS;
                                } else if (iM71246l != 1) {
                                    a1t0Var = iM71246l != 2 ? null : a1t0.LOCAL;
                                } else {
                                    a1t0Var = a1t0Var2;
                                }
                                if (a1t0Var == null) {
                                    w780VarM87328y.m87353Y(iM71249o);
                                    w780VarM87328y.m87353Y(iM71246l);
                                } else {
                                    this.f22407b |= 4;
                                    this.f22410e = a1t0Var;
                                }
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
                    this.f22406a = evaVar.m40103e();
                }
                throw th;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f22406a = evaVar.m40103e();
        }
    }

    public b1t0(z0t0 z0t0Var) {
        this.f22411f = (byte) -1;
        this.f22412g = -1;
        this.f22406a = z0t0Var.f149263a;
    }
}
