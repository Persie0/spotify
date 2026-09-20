package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class yo60 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f274580b;

    /* JADX INFO: renamed from: c */
    public int f274581c;

    /* JADX INFO: renamed from: d */
    public Serializable f274582d;

    /* JADX INFO: renamed from: e */
    public Object f274583e;

    /* JADX INFO: renamed from: f */
    public a210 f274584f;

    /* JADX INFO: renamed from: g */
    public Serializable f274585g;

    /* JADX INFO: renamed from: h */
    public Serializable f274586h;

    public /* synthetic */ yo60(int i) {
        this.f274580b = i;
    }

    /* JADX INFO: renamed from: h */
    public static yo60 m94266h() {
        yo60 yo60Var = new yo60(0);
        yo60Var.f274582d = wo60.f253384g;
        xo60 xo60Var = xo60.f263769g;
        yo60Var.f274583e = xo60Var;
        yo60Var.f274584f = xo60Var;
        yo60Var.f274585g = xo60Var;
        yo60Var.f274586h = xo60Var;
        return yo60Var;
    }

    /* JADX INFO: renamed from: i */
    public static yo60 m94267i() {
        yo60 yo60Var = new yo60(1);
        yo60Var.f274582d = h0t0.RETURNS_CONSTANT;
        yo60Var.f274583e = Collections.EMPTY_LIST;
        yo60Var.f274584f = o0t0.f160455Y;
        yo60Var.f274585g = i0t0.AT_MOST_ONCE;
        yo60Var.f274586h = g0t0.CONCLUSION_CONDITION;
        return yo60Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        switch (this.f274580b) {
            case 0:
                zo60 zo60VarM94268e = m94268e();
                zo60VarM94268e.isInitialized();
                return zo60VarM94268e;
            default:
                j0t0 j0t0VarM94269g = m94269g();
                if (j0t0VarM94269g.isInitialized()) {
                    return j0t0VarM94269g;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        switch (this.f274580b) {
            case 0:
                zo60 zo60Var = null;
                try {
                    try {
                        zo60.f284706X.getClass();
                        m94270j(new zo60(pweVar, buxVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        zo60 zo60Var2 = (zo60) e.f10912a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            zo60Var = zo60Var2;
                            if (zo60Var != null) {
                                m94270j(zo60Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (zo60Var != null) {
                        m94270j(zo60Var);
                    }
                    throw th;
                }
            default:
                j0t0 j0t0Var = null;
                try {
                    try {
                        j0t0.f107545X.getClass();
                        m94271k(new j0t0(pweVar, buxVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        j0t0 j0t0Var2 = (j0t0) e2.f10912a;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            j0t0Var = j0t0Var2;
                            if (j0t0Var != null) {
                                m94271k(j0t0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (j0t0Var != null) {
                        m94271k(j0t0Var);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f274580b) {
            case 0:
                yo60 yo60VarM94266h = m94266h();
                yo60VarM94266h.m94270j(m94268e());
                return yo60VarM94266h;
            default:
                yo60 yo60VarM94267i = m94267i();
                yo60VarM94267i.m94271k(m94269g());
                return yo60VarM94267i;
        }
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        switch (this.f274580b) {
            case 0:
                m94270j((zo60) a210Var);
                break;
            default:
                m94271k((j0t0) a210Var);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public zo60 m94268e() {
        zo60 zo60Var = new zo60(this);
        int i = this.f274581c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zo60Var.f284710c = (wo60) this.f274582d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zo60Var.f284711d = (xo60) this.f274583e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zo60Var.f284712e = (xo60) this.f274584f;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        zo60Var.f284713f = (xo60) this.f274585g;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        zo60Var.f284714g = (xo60) this.f274586h;
        zo60Var.f284709b = i2;
        return zo60Var;
    }

    /* JADX INFO: renamed from: g */
    public j0t0 m94269g() {
        j0t0 j0t0Var = new j0t0(this);
        int i = this.f274581c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        j0t0Var.f107549c = (h0t0) this.f274582d;
        if ((i & 2) == 2) {
            this.f274583e = Collections.unmodifiableList((List) this.f274583e);
            this.f274581c &= -3;
        }
        j0t0Var.f107550d = (List) this.f274583e;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        j0t0Var.f107551e = (o0t0) this.f274584f;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        j0t0Var.f107552f = (i0t0) this.f274585g;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        j0t0Var.f107553g = (g0t0) this.f274586h;
        j0t0Var.f107548b = i2;
        return j0t0Var;
    }

    /* JADX INFO: renamed from: j */
    public void m94270j(zo60 zo60Var) {
        xo60 xo60Var;
        xo60 xo60Var2;
        xo60 xo60Var3;
        xo60 xo60Var4;
        wo60 wo60Var;
        if (zo60Var == zo60.f284707t) {
            return;
        }
        if ((zo60Var.f284709b & 1) == 1) {
            wo60 wo60Var2 = zo60Var.f284710c;
            if ((this.f274581c & 1) != 1 || (wo60Var = (wo60) this.f274582d) == wo60.f253384g) {
                this.f274582d = wo60Var2;
            } else {
                vo60 vo60Var = new vo60(0);
                vo60Var.m86085h(wo60Var);
                vo60Var.m86085h(wo60Var2);
                this.f274582d = vo60Var.m86083e();
            }
            this.f274581c |= 1;
        }
        if ((zo60Var.f284709b & 2) == 2) {
            xo60 xo60Var5 = zo60Var.f284711d;
            if ((this.f274581c & 2) != 2 || (xo60Var4 = (xo60) this.f274583e) == xo60.f263769g) {
                this.f274583e = xo60Var5;
            } else {
                vo60 vo60VarM91528k = xo60.m91528k(xo60Var4);
                vo60VarM91528k.m86086i(xo60Var5);
                this.f274583e = vo60VarM91528k.m86084g();
            }
            this.f274581c |= 2;
        }
        if (zo60Var.m96612i()) {
            xo60 xo60Var6 = zo60Var.f284712e;
            if ((this.f274581c & 4) != 4 || (xo60Var3 = (xo60) this.f274584f) == xo60.f263769g) {
                this.f274584f = xo60Var6;
            } else {
                vo60 vo60VarM91528k2 = xo60.m91528k(xo60Var3);
                vo60VarM91528k2.m86086i(xo60Var6);
                this.f274584f = vo60VarM91528k2.m86084g();
            }
            this.f274581c |= 4;
        }
        if ((zo60Var.f284709b & 8) == 8) {
            xo60 xo60Var7 = zo60Var.f284713f;
            if ((this.f274581c & 8) != 8 || (xo60Var2 = (xo60) this.f274585g) == xo60.f263769g) {
                this.f274585g = xo60Var7;
            } else {
                vo60 vo60VarM91528k3 = xo60.m91528k(xo60Var2);
                vo60VarM91528k3.m86086i(xo60Var7);
                this.f274585g = vo60VarM91528k3.m86084g();
            }
            this.f274581c |= 8;
        }
        if (zo60Var.m96611h()) {
            xo60 xo60Var8 = zo60Var.f284714g;
            if ((this.f274581c & 16) != 16 || (xo60Var = (xo60) this.f274586h) == xo60.f263769g) {
                this.f274586h = xo60Var8;
            } else {
                vo60 vo60VarM91528k4 = xo60.m91528k(xo60Var);
                vo60VarM91528k4.m86086i(xo60Var8);
                this.f274586h = vo60VarM91528k4.m86084g();
            }
            this.f274581c |= 16;
        }
        this.f149263a = this.f149263a.m48763b(zo60Var.f284708a);
    }

    /* JADX INFO: renamed from: k */
    public void m94271k(j0t0 j0t0Var) {
        o0t0 o0t0Var;
        if (j0t0Var == j0t0.f107546t) {
            return;
        }
        if ((j0t0Var.f107548b & 1) == 1) {
            h0t0 h0t0Var = j0t0Var.f107549c;
            h0t0Var.getClass();
            this.f274581c = 1 | this.f274581c;
            this.f274582d = h0t0Var;
        }
        if (!j0t0Var.f107550d.isEmpty()) {
            if (((List) this.f274583e).isEmpty()) {
                this.f274583e = j0t0Var.f107550d;
                this.f274581c &= -3;
            } else {
                if ((this.f274581c & 2) != 2) {
                    this.f274583e = new ArrayList((List) this.f274583e);
                    this.f274581c |= 2;
                }
                ((List) this.f274583e).addAll(j0t0Var.f107550d);
            }
        }
        if ((j0t0Var.f107548b & 2) == 2) {
            o0t0 o0t0Var2 = j0t0Var.f107551e;
            if ((this.f274581c & 4) != 4 || (o0t0Var = (o0t0) this.f274584f) == o0t0.f160455Y) {
                this.f274584f = o0t0Var2;
            } else {
                m0t0 m0t0VarM60475g = m0t0.m60475g();
                m0t0VarM60475g.m60477h(o0t0Var);
                m0t0VarM60475g.m60477h(o0t0Var2);
                this.f274584f = m0t0VarM60475g.m60476e();
            }
            this.f274581c |= 4;
        }
        if ((j0t0Var.f107548b & 4) == 4) {
            i0t0 i0t0Var = j0t0Var.f107552f;
            i0t0Var.getClass();
            this.f274581c |= 8;
            this.f274585g = i0t0Var;
        }
        if ((j0t0Var.f107548b & 8) == 8) {
            g0t0 g0t0Var = j0t0Var.f107553g;
            g0t0Var.getClass();
            this.f274581c |= 16;
            this.f274586h = g0t0Var;
        }
        this.f149263a = this.f149263a.m48763b(j0t0Var.f107547a);
    }
}
