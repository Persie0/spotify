package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class d0t0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f44050b;

    /* JADX INFO: renamed from: c */
    public int f44051c;

    /* JADX INFO: renamed from: d */
    public List f44052d;

    public /* synthetic */ d0t0(int i) {
        this.f44050b = i;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        switch (this.f44050b) {
            case 0:
                e0t0 e0t0VarM34554e = m34554e();
                if (e0t0VarM34554e.isInitialized()) {
                    return e0t0VarM34554e;
                }
                throw new UninitializedMessageException();
            case 1:
                c1t0 c1t0VarM34555g = m34555g();
                if (c1t0VarM34555g.isInitialized()) {
                    return c1t0VarM34555g;
                }
                throw new UninitializedMessageException();
            case 2:
                w1t0 w1t0VarM34557i = m34557i();
                w1t0VarM34557i.isInitialized();
                return w1t0VarM34557i;
            default:
                e1t0 e1t0VarM34556h = m34556h();
                e1t0VarM34556h.isInitialized();
                return e1t0VarM34556h;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:58:0x007d  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        switch (this.f44050b) {
            case 0:
                e0t0 e0t0Var = null;
                try {
                    try {
                        e0t0.f55032f.getClass();
                        m34558j(new e0t0(pweVar, buxVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (e0t0Var != null) {
                            m34558j(e0t0Var);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e0t0 e0t0Var2 = (e0t0) e.f10912a;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        e0t0Var = e0t0Var2;
                        if (e0t0Var != null) {
                            m34558j(e0t0Var);
                        }
                        throw th;
                    }
                }
            case 1:
                c1t0 c1t0Var = null;
                try {
                    try {
                        c1t0.f33185f.getClass();
                        m34559k(new c1t0(pweVar, buxVar));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (c1t0Var != null) {
                            m34559k(c1t0Var);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    c1t0 c1t0Var2 = (c1t0) e2.f10912a;
                    try {
                        throw e2;
                    } catch (Throwable th4) {
                        th = th4;
                        c1t0Var = c1t0Var2;
                        if (c1t0Var != null) {
                            m34559k(c1t0Var);
                        }
                        throw th;
                    }
                }
            case 2:
                w1t0 w1t0Var = null;
                try {
                    try {
                        w1t0.f247177f.getClass();
                        m34561m(new w1t0(pweVar, buxVar));
                        return this;
                    } catch (InvalidProtocolBufferException e3) {
                        w1t0 w1t0Var2 = (w1t0) e3.f10912a;
                        try {
                            throw e3;
                        } catch (Throwable th5) {
                            th = th5;
                            w1t0Var = w1t0Var2;
                            if (w1t0Var != null) {
                                m34561m(w1t0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (w1t0Var != null) {
                        m34561m(w1t0Var);
                    }
                    throw th;
                }
            default:
                e1t0 e1t0Var = null;
                try {
                    try {
                        e1t0.f55251f.getClass();
                        m34560l(new e1t0(pweVar));
                        return this;
                    } catch (InvalidProtocolBufferException e4) {
                        e1t0 e1t0Var2 = (e1t0) e4.f10912a;
                        try {
                            throw e4;
                        } catch (Throwable th7) {
                            th = th7;
                            e1t0Var = e1t0Var2;
                            if (e1t0Var != null) {
                                m34560l(e1t0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (e1t0Var != null) {
                        m34560l(e1t0Var);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f44050b) {
            case 0:
                d0t0 d0t0Var = new d0t0(0);
                d0t0Var.f44052d = Collections.EMPTY_LIST;
                d0t0Var.m34558j(m34554e());
                return d0t0Var;
            case 1:
                d0t0 d0t0Var2 = new d0t0(1);
                d0t0Var2.f44052d = Collections.EMPTY_LIST;
                d0t0Var2.m34559k(m34555g());
                return d0t0Var2;
            case 2:
                d0t0 d0t0Var3 = new d0t0(2);
                d0t0Var3.f44052d = Collections.EMPTY_LIST;
                d0t0Var3.m34561m(m34557i());
                return d0t0Var3;
            default:
                d0t0 d0t0Var4 = new d0t0(3);
                d0t0Var4.f44052d = vy70.f245998b;
                d0t0Var4.m34560l(m34556h());
                return d0t0Var4;
        }
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        switch (this.f44050b) {
            case 0:
                m34558j((e0t0) a210Var);
                break;
            case 1:
                m34559k((c1t0) a210Var);
                break;
            case 2:
                m34561m((w1t0) a210Var);
                break;
            default:
                m34560l((e1t0) a210Var);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public e0t0 m34554e() {
        e0t0 e0t0Var = new e0t0(this);
        if ((this.f44051c & 1) == 1) {
            this.f44052d = Collections.unmodifiableList(this.f44052d);
            this.f44051c &= -2;
        }
        e0t0Var.f55034b = this.f44052d;
        return e0t0Var;
    }

    /* JADX INFO: renamed from: g */
    public c1t0 m34555g() {
        c1t0 c1t0Var = new c1t0(this);
        if ((this.f44051c & 1) == 1) {
            this.f44052d = Collections.unmodifiableList(this.f44052d);
            this.f44051c &= -2;
        }
        c1t0Var.f33187b = this.f44052d;
        return c1t0Var;
    }

    /* JADX INFO: renamed from: h */
    public e1t0 m34556h() {
        e1t0 e1t0Var = new e1t0(this);
        if ((this.f44051c & 1) == 1) {
            this.f44052d = ((zy70) this.f44052d).mo77121g();
            this.f44051c &= -2;
        }
        e1t0Var.f55253b = (zy70) this.f44052d;
        return e1t0Var;
    }

    /* JADX INFO: renamed from: i */
    public w1t0 m34557i() {
        w1t0 w1t0Var = new w1t0(this);
        if ((this.f44051c & 1) == 1) {
            this.f44052d = Collections.unmodifiableList(this.f44052d);
            this.f44051c &= -2;
        }
        w1t0Var.f247179b = this.f44052d;
        return w1t0Var;
    }

    /* JADX INFO: renamed from: j */
    public void m34558j(e0t0 e0t0Var) {
        if (e0t0Var == e0t0.f55031e) {
            return;
        }
        if (!e0t0Var.f55034b.isEmpty()) {
            if (this.f44052d.isEmpty()) {
                this.f44052d = e0t0Var.f55034b;
                this.f44051c &= -2;
            } else {
                if ((this.f44051c & 1) != 1) {
                    this.f44052d = new ArrayList(this.f44052d);
                    this.f44051c |= 1;
                }
                this.f44052d.addAll(e0t0Var.f55034b);
            }
        }
        this.f149263a = this.f149263a.m48763b(e0t0Var.f55033a);
    }

    /* JADX INFO: renamed from: k */
    public void m34559k(c1t0 c1t0Var) {
        if (c1t0Var == c1t0.f33184e) {
            return;
        }
        if (!c1t0Var.f33187b.isEmpty()) {
            if (this.f44052d.isEmpty()) {
                this.f44052d = c1t0Var.f33187b;
                this.f44051c &= -2;
            } else {
                if ((this.f44051c & 1) != 1) {
                    this.f44052d = new ArrayList(this.f44052d);
                    this.f44051c |= 1;
                }
                this.f44052d.addAll(c1t0Var.f33187b);
            }
        }
        this.f149263a = this.f149263a.m48763b(c1t0Var.f33186a);
    }

    /* JADX INFO: renamed from: l */
    public void m34560l(e1t0 e1t0Var) {
        if (e1t0Var == e1t0.f55250e) {
            return;
        }
        if (!e1t0Var.f55253b.isEmpty()) {
            if (((zy70) this.f44052d).isEmpty()) {
                this.f44052d = e1t0Var.f55253b;
                this.f44051c &= -2;
            } else {
                if ((this.f44051c & 1) != 1) {
                    this.f44052d = new vy70((zy70) this.f44052d);
                    this.f44051c |= 1;
                }
                ((zy70) this.f44052d).addAll(e1t0Var.f55253b);
            }
        }
        this.f149263a = this.f149263a.m48763b(e1t0Var.f55252a);
    }

    /* JADX INFO: renamed from: m */
    public void m34561m(w1t0 w1t0Var) {
        if (w1t0Var == w1t0.f247176e) {
            return;
        }
        if (!w1t0Var.f247179b.isEmpty()) {
            if (this.f44052d.isEmpty()) {
                this.f44052d = w1t0Var.f247179b;
                this.f44051c &= -2;
            } else {
                if ((this.f44051c & 1) != 1) {
                    this.f44052d = new ArrayList(this.f44052d);
                    this.f44051c |= 1;
                }
                this.f44052d.addAll(w1t0Var.f247179b);
            }
        }
        this.f149263a = this.f149263a.m48763b(w1t0Var.f247178a);
    }
}
