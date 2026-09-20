package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class vzs0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f246534b;

    /* JADX INFO: renamed from: c */
    public int f246535c;

    /* JADX INFO: renamed from: d */
    public List f246536d;

    /* JADX INFO: renamed from: e */
    public int f246537e;

    public /* synthetic */ vzs0(int i) {
        this.f246534b = i;
    }

    /* JADX INFO: renamed from: h */
    public static vzs0 m86909h() {
        vzs0 vzs0Var = new vzs0(1);
        vzs0Var.f246536d = Collections.EMPTY_LIST;
        vzs0Var.f246537e = -1;
        return vzs0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        switch (this.f246534b) {
            case 0:
                wzs0 wzs0VarM86910e = m86910e();
                if (wzs0VarM86910e.isInitialized()) {
                    return wzs0VarM86910e;
                }
                throw new UninitializedMessageException();
            default:
                p1t0 p1t0VarM86911g = m86911g();
                if (p1t0VarM86911g.isInitialized()) {
                    return p1t0VarM86911g;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        switch (this.f246534b) {
            case 0:
                wzs0 wzs0Var = null;
                try {
                    try {
                        m86912i((wzs0) wzs0.f256674h.mo77051a(pweVar, buxVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (wzs0Var != null) {
                            m86912i(wzs0Var);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    wzs0 wzs0Var2 = (wzs0) e.f10912a;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        wzs0Var = wzs0Var2;
                        if (wzs0Var != null) {
                            m86912i(wzs0Var);
                        }
                        throw th;
                    }
                }
            default:
                p1t0 p1t0Var = null;
                try {
                    try {
                        p1t0.f173162h.getClass();
                        m86913j(new p1t0(pweVar, buxVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        p1t0 p1t0Var2 = (p1t0) e2.f10912a;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            p1t0Var = p1t0Var2;
                            if (p1t0Var != null) {
                                m86913j(p1t0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (p1t0Var != null) {
                        m86913j(p1t0Var);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f246534b) {
            case 0:
                vzs0 vzs0Var = new vzs0(0);
                vzs0Var.f246536d = Collections.EMPTY_LIST;
                vzs0Var.m86912i(m86910e());
                return vzs0Var;
            default:
                vzs0 vzs0VarM86909h = m86909h();
                vzs0VarM86909h.m86913j(m86911g());
                return vzs0VarM86909h;
        }
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        switch (this.f246534b) {
            case 0:
                m86912i((wzs0) a210Var);
                break;
            default:
                m86913j((p1t0) a210Var);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public wzs0 m86910e() {
        wzs0 wzs0Var = new wzs0(this);
        int i = this.f246535c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        wzs0Var.f256677c = this.f246537e;
        if ((i & 2) == 2) {
            this.f246536d = Collections.unmodifiableList(this.f246536d);
            this.f246535c &= -3;
        }
        wzs0Var.f256678d = this.f246536d;
        wzs0Var.f256676b = i2;
        return wzs0Var;
    }

    /* JADX INFO: renamed from: g */
    public p1t0 m86911g() {
        p1t0 p1t0Var = new p1t0(this);
        int i = this.f246535c;
        if ((i & 1) == 1) {
            this.f246536d = Collections.unmodifiableList(this.f246536d);
            this.f246535c &= -2;
        }
        p1t0Var.f173165c = this.f246536d;
        int i2 = (i & 2) != 2 ? 0 : 1;
        p1t0Var.f173166d = this.f246537e;
        p1t0Var.f173164b = i2;
        return p1t0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m86912i(wzs0 wzs0Var) {
        if (wzs0Var == wzs0.f256673g) {
            return;
        }
        if ((wzs0Var.f256676b & 1) == 1) {
            int i = wzs0Var.f256677c;
            this.f246535c = 1 | this.f246535c;
            this.f246537e = i;
        }
        if (!wzs0Var.f256678d.isEmpty()) {
            if (this.f246536d.isEmpty()) {
                this.f246536d = wzs0Var.f256678d;
                this.f246535c &= -3;
            } else {
                if ((this.f246535c & 2) != 2) {
                    this.f246536d = new ArrayList(this.f246536d);
                    this.f246535c |= 2;
                }
                this.f246536d.addAll(wzs0Var.f256678d);
            }
        }
        this.f149263a = this.f149263a.m48763b(wzs0Var.f256675a);
    }

    /* JADX INFO: renamed from: j */
    public void m86913j(p1t0 p1t0Var) {
        if (p1t0Var == p1t0.f173161g) {
            return;
        }
        if (!p1t0Var.f173165c.isEmpty()) {
            if (this.f246536d.isEmpty()) {
                this.f246536d = p1t0Var.f173165c;
                this.f246535c &= -2;
            } else {
                if ((this.f246535c & 1) != 1) {
                    this.f246536d = new ArrayList(this.f246536d);
                    this.f246535c |= 1;
                }
                this.f246536d.addAll(p1t0Var.f173165c);
            }
        }
        if ((p1t0Var.f173164b & 1) == 1) {
            int i = p1t0Var.f173166d;
            this.f246535c |= 2;
            this.f246537e = i;
        }
        this.f149263a = this.f149263a.m48763b(p1t0Var.f173163a);
    }
}
