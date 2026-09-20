package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class zo60 extends a210 {

    /* JADX INFO: renamed from: X */
    public static final uo60 f284706X = new uo60(2);

    /* JADX INFO: renamed from: t */
    public static final zo60 f284707t;

    /* JADX INFO: renamed from: a */
    public final hva f284708a;

    /* JADX INFO: renamed from: b */
    public int f284709b;

    /* JADX INFO: renamed from: c */
    public wo60 f284710c;

    /* JADX INFO: renamed from: d */
    public xo60 f284711d;

    /* JADX INFO: renamed from: e */
    public xo60 f284712e;

    /* JADX INFO: renamed from: f */
    public xo60 f284713f;

    /* JADX INFO: renamed from: g */
    public xo60 f284714g;

    /* JADX INFO: renamed from: h */
    public byte f284715h;

    /* JADX INFO: renamed from: i */
    public int f284716i;

    static {
        zo60 zo60Var = new zo60();
        f284707t = zo60Var;
        zo60Var.f284710c = wo60.f253384g;
        xo60 xo60Var = xo60.f263769g;
        zo60Var.f284711d = xo60Var;
        zo60Var.f284712e = xo60Var;
        zo60Var.f284713f = xo60Var;
        zo60Var.f284714g = xo60Var;
    }

    public zo60() {
        this.f284715h = (byte) -1;
        this.f284716i = -1;
        this.f284708a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f284716i;
        if (i != -1) {
            return i;
        }
        int iM87321i = (this.f284709b & 1) == 1 ? w780.m87321i(1, this.f284710c) : 0;
        if ((this.f284709b & 2) == 2) {
            iM87321i += w780.m87321i(2, this.f284711d);
        }
        if ((this.f284709b & 4) == 4) {
            iM87321i += w780.m87321i(3, this.f284712e);
        }
        if ((this.f284709b & 8) == 8) {
            iM87321i += w780.m87321i(4, this.f284713f);
        }
        if ((this.f284709b & 16) == 16) {
            iM87321i += w780.m87321i(5, this.f284714g);
        }
        int size = this.f284708a.size() + iM87321i;
        this.f284716i = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return yo60.m94266h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        yo60 yo60VarM94266h = yo60.m94266h();
        yo60VarM94266h.m94270j(this);
        return yo60VarM94266h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f284709b & 1) == 1) {
            w780Var.m87346R(1, this.f284710c);
        }
        if ((this.f284709b & 2) == 2) {
            w780Var.m87346R(2, this.f284711d);
        }
        if ((this.f284709b & 4) == 4) {
            w780Var.m87346R(3, this.f284712e);
        }
        if ((this.f284709b & 8) == 8) {
            w780Var.m87346R(4, this.f284713f);
        }
        if ((this.f284709b & 16) == 16) {
            w780Var.m87346R(5, this.f284714g);
        }
        w780Var.m87349U(this.f284708a);
    }

    /* JADX INFO: renamed from: g */
    public final xo60 m96610g() {
        return this.f284714g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m96611h() {
        return (this.f284709b & 16) == 16;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m96612i() {
        return (this.f284709b & 4) == 4;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f284715h == 1) {
            return true;
        }
        this.f284715h = (byte) 1;
        return true;
    }

    public zo60(pwe pweVar, bux buxVar) {
        this.f284715h = (byte) -1;
        this.f284716i = -1;
        this.f284710c = wo60.f253384g;
        xo60 xo60Var = xo60.f263769g;
        this.f284711d = xo60Var;
        this.f284712e = xo60Var;
        this.f284713f = xo60Var;
        this.f284714g = xo60Var;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        vo60 vo60VarM91528k = null;
                        if (iM71249o == 10) {
                            if ((this.f284709b & 1) == 1) {
                                wo60 wo60Var = this.f284710c;
                                wo60Var.getClass();
                                vo60VarM91528k = new vo60(0);
                                vo60VarM91528k.m86085h(wo60Var);
                            }
                            wo60 wo60Var2 = (wo60) pweVar.m71242h(wo60.f253385h, buxVar);
                            this.f284710c = wo60Var2;
                            if (vo60VarM91528k != null) {
                                vo60VarM91528k.m86085h(wo60Var2);
                                this.f284710c = vo60VarM91528k.m86083e();
                            }
                            this.f284709b |= 1;
                        } else if (iM71249o == 18) {
                            if ((this.f284709b & 2) == 2) {
                                xo60 xo60Var2 = this.f284711d;
                                xo60Var2.getClass();
                                vo60VarM91528k = xo60.m91528k(xo60Var2);
                            }
                            xo60 xo60Var3 = (xo60) pweVar.m71242h(xo60.f263770h, buxVar);
                            this.f284711d = xo60Var3;
                            if (vo60VarM91528k != null) {
                                vo60VarM91528k.m86086i(xo60Var3);
                                this.f284711d = vo60VarM91528k.m86084g();
                            }
                            this.f284709b |= 2;
                        } else if (iM71249o == 26) {
                            if ((this.f284709b & 4) == 4) {
                                xo60 xo60Var4 = this.f284712e;
                                xo60Var4.getClass();
                                vo60VarM91528k = xo60.m91528k(xo60Var4);
                            }
                            xo60 xo60Var5 = (xo60) pweVar.m71242h(xo60.f263770h, buxVar);
                            this.f284712e = xo60Var5;
                            if (vo60VarM91528k != null) {
                                vo60VarM91528k.m86086i(xo60Var5);
                                this.f284712e = vo60VarM91528k.m86084g();
                            }
                            this.f284709b |= 4;
                        } else if (iM71249o == 34) {
                            if ((this.f284709b & 8) == 8) {
                                xo60 xo60Var6 = this.f284713f;
                                xo60Var6.getClass();
                                vo60VarM91528k = xo60.m91528k(xo60Var6);
                            }
                            xo60 xo60Var7 = (xo60) pweVar.m71242h(xo60.f263770h, buxVar);
                            this.f284713f = xo60Var7;
                            if (vo60VarM91528k != null) {
                                vo60VarM91528k.m86086i(xo60Var7);
                                this.f284713f = vo60VarM91528k.m86084g();
                            }
                            this.f284709b |= 8;
                        } else if (iM71249o != 42) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            if ((this.f284709b & 16) == 16) {
                                xo60 xo60Var8 = this.f284714g;
                                xo60Var8.getClass();
                                vo60VarM91528k = xo60.m91528k(xo60Var8);
                            }
                            xo60 xo60Var9 = (xo60) pweVar.m71242h(xo60.f263770h, buxVar);
                            this.f284714g = xo60Var9;
                            if (vo60VarM91528k != null) {
                                vo60VarM91528k.m86086i(xo60Var9);
                                this.f284714g = vo60VarM91528k.m86084g();
                            }
                            this.f284709b |= 16;
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
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f284708a = evaVar.m40103e();
                }
                throw th;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f284708a = evaVar.m40103e();
        }
    }

    public zo60(yo60 yo60Var) {
        this.f284715h = (byte) -1;
        this.f284716i = -1;
        this.f284708a = yo60Var.f149263a;
    }
}
