package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class t0t0 extends t110 {

    /* JADX INFO: renamed from: d */
    public int f215982d;

    /* JADX INFO: renamed from: e */
    public List f215983e;

    /* JADX INFO: renamed from: f */
    public List f215984f;

    /* JADX INFO: renamed from: g */
    public List f215985g;

    /* JADX INFO: renamed from: h */
    public p1t0 f215986h;

    /* JADX INFO: renamed from: i */
    public w1t0 f215987i;

    /* JADX INFO: renamed from: h */
    public static t0t0 m79847h() {
        t0t0 t0t0Var = new t0t0();
        List list = Collections.EMPTY_LIST;
        t0t0Var.f215983e = list;
        t0t0Var.f215984f = list;
        t0t0Var.f215985g = list;
        t0t0Var.f215986h = p1t0.f173161g;
        t0t0Var.f215987i = w1t0.f247176e;
        return t0t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        u0t0 u0t0VarM79848g = m79848g();
        if (u0t0VarM79848g.isInitialized()) {
            return u0t0VarM79848g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        u0t0 u0t0Var = null;
        try {
            try {
                u0t0.f225604Y.getClass();
                m79849i(new u0t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                u0t0 u0t0Var2 = (u0t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    u0t0Var = u0t0Var2;
                    if (u0t0Var != null) {
                        m79849i(u0t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (u0t0Var != null) {
                m79849i(u0t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        t0t0 t0t0VarM79847h = m79847h();
        t0t0VarM79847h.m79849i(m79848g());
        return t0t0VarM79847h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m79849i((u0t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final u0t0 m79848g() {
        u0t0 u0t0Var = new u0t0(this);
        int i = this.f215982d;
        if ((i & 1) == 1) {
            this.f215983e = Collections.unmodifiableList(this.f215983e);
            this.f215982d &= -2;
        }
        u0t0Var.f225607d = this.f215983e;
        if ((this.f215982d & 2) == 2) {
            this.f215984f = Collections.unmodifiableList(this.f215984f);
            this.f215982d &= -3;
        }
        u0t0Var.f225608e = this.f215984f;
        if ((this.f215982d & 4) == 4) {
            this.f215985g = Collections.unmodifiableList(this.f215985g);
            this.f215982d &= -5;
        }
        u0t0Var.f225609f = this.f215985g;
        int i2 = (i & 8) != 8 ? 0 : 1;
        u0t0Var.f225610g = this.f215986h;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        u0t0Var.f225611h = this.f215987i;
        u0t0Var.f225606c = i2;
        return u0t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m79849i(u0t0 u0t0Var) {
        w1t0 w1t0Var;
        p1t0 p1t0Var;
        if (u0t0Var == u0t0.f225603X) {
            return;
        }
        if (!u0t0Var.f225607d.isEmpty()) {
            if (this.f215983e.isEmpty()) {
                this.f215983e = u0t0Var.f225607d;
                this.f215982d &= -2;
            } else {
                if ((this.f215982d & 1) != 1) {
                    this.f215983e = new ArrayList(this.f215983e);
                    this.f215982d |= 1;
                }
                this.f215983e.addAll(u0t0Var.f225607d);
            }
        }
        if (!u0t0Var.f225608e.isEmpty()) {
            if (this.f215984f.isEmpty()) {
                this.f215984f = u0t0Var.f225608e;
                this.f215982d &= -3;
            } else {
                if ((this.f215982d & 2) != 2) {
                    this.f215984f = new ArrayList(this.f215984f);
                    this.f215982d |= 2;
                }
                this.f215984f.addAll(u0t0Var.f225608e);
            }
        }
        if (!u0t0Var.f225609f.isEmpty()) {
            if (this.f215985g.isEmpty()) {
                this.f215985g = u0t0Var.f225609f;
                this.f215982d &= -5;
            } else {
                if ((this.f215982d & 4) != 4) {
                    this.f215985g = new ArrayList(this.f215985g);
                    this.f215982d |= 4;
                }
                this.f215985g.addAll(u0t0Var.f225609f);
            }
        }
        if ((u0t0Var.f225606c & 1) == 1) {
            p1t0 p1t0Var2 = u0t0Var.f225610g;
            if ((this.f215982d & 8) != 8 || (p1t0Var = this.f215986h) == p1t0.f173161g) {
                this.f215986h = p1t0Var2;
            } else {
                vzs0 vzs0VarM68843g = p1t0.m68843g(p1t0Var);
                vzs0VarM68843g.m86913j(p1t0Var2);
                this.f215986h = vzs0VarM68843g.m86911g();
            }
            this.f215982d |= 8;
        }
        if ((u0t0Var.f225606c & 2) == 2) {
            w1t0 w1t0Var2 = u0t0Var.f225611h;
            if ((this.f215982d & 16) != 16 || (w1t0Var = this.f215987i) == w1t0.f247176e) {
                this.f215987i = w1t0Var2;
            } else {
                d0t0 d0t0Var = new d0t0(2);
                d0t0Var.f44052d = Collections.EMPTY_LIST;
                d0t0Var.m34561m(w1t0Var);
                d0t0Var.m34561m(w1t0Var2);
                this.f215987i = d0t0Var.m34557i();
            }
            this.f215982d |= 16;
        }
        m79857e(u0t0Var);
        this.f149263a = this.f149263a.m48763b(u0t0Var.f225605b);
    }
}
