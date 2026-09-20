package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class q1t0 extends t110 {

    /* JADX INFO: renamed from: X */
    public List f184400X;

    /* JADX INFO: renamed from: Y */
    public tzs0 f184401Y;

    /* JADX INFO: renamed from: d */
    public int f184402d;

    /* JADX INFO: renamed from: e */
    public int f184403e;

    /* JADX INFO: renamed from: f */
    public int f184404f;

    /* JADX INFO: renamed from: g */
    public j1t0 f184405g;

    /* JADX INFO: renamed from: h */
    public int f184406h;

    /* JADX INFO: renamed from: i */
    public j1t0 f184407i;

    /* JADX INFO: renamed from: t */
    public int f184408t;

    /* JADX INFO: renamed from: h */
    public static q1t0 m71955h() {
        q1t0 q1t0Var = new q1t0();
        j1t0 j1t0Var = j1t0.f107844S0;
        q1t0Var.f184405g = j1t0Var;
        q1t0Var.f184407i = j1t0Var;
        q1t0Var.f184400X = Collections.EMPTY_LIST;
        q1t0Var.f184401Y = tzs0.f225293N0;
        return q1t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        r1t0 r1t0VarM71956g = m71956g();
        if (r1t0VarM71956g.isInitialized()) {
            return r1t0VarM71956g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        r1t0 r1t0Var = null;
        try {
            try {
                r1t0.f194908M0.getClass();
                m71957i(new r1t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                r1t0 r1t0Var2 = (r1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    r1t0Var = r1t0Var2;
                    if (r1t0Var != null) {
                        m71957i(r1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (r1t0Var != null) {
                m71957i(r1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        q1t0 q1t0VarM71955h = m71955h();
        q1t0VarM71955h.m71957i(m71956g());
        return q1t0VarM71955h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m71957i((r1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final r1t0 m71956g() {
        r1t0 r1t0Var = new r1t0(this);
        int i = this.f184402d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        r1t0Var.f194914d = this.f184403e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        r1t0Var.f194915e = this.f184404f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        r1t0Var.f194916f = this.f184405g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        r1t0Var.f194917g = this.f184406h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        r1t0Var.f194918h = this.f184407i;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        r1t0Var.f194919i = this.f184408t;
        if ((i & 64) == 64) {
            this.f184400X = Collections.unmodifiableList(this.f184400X);
            this.f184402d &= -65;
        }
        r1t0Var.f194920t = this.f184400X;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        r1t0Var.f194909X = this.f184401Y;
        r1t0Var.f194913c = i2;
        return r1t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m71957i(r1t0 r1t0Var) {
        tzs0 tzs0Var;
        j1t0 j1t0Var;
        j1t0 j1t0Var2;
        if (r1t0Var == r1t0.f194907L0) {
            return;
        }
        int i = r1t0Var.f194913c;
        if ((i & 1) == 1) {
            int i2 = r1t0Var.f194914d;
            this.f184402d = 1 | this.f184402d;
            this.f184403e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = r1t0Var.f194915e;
            this.f184402d = 2 | this.f184402d;
            this.f184404f = i3;
        }
        if ((i & 4) == 4) {
            j1t0 j1t0Var3 = r1t0Var.f194916f;
            if ((this.f184402d & 4) != 4 || (j1t0Var2 = this.f184405g) == j1t0.f107844S0) {
                this.f184405g = j1t0Var3;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var2);
                i1t0VarM52183p.m49425i(j1t0Var3);
                this.f184405g = i1t0VarM52183p.m49424g();
            }
            this.f184402d |= 4;
        }
        int i4 = r1t0Var.f194913c;
        if ((i4 & 8) == 8) {
            int i5 = r1t0Var.f194917g;
            this.f184402d = 8 | this.f184402d;
            this.f184406h = i5;
        }
        if ((i4 & 16) == 16) {
            j1t0 j1t0Var4 = r1t0Var.f194918h;
            if ((this.f184402d & 16) != 16 || (j1t0Var = this.f184407i) == j1t0.f107844S0) {
                this.f184407i = j1t0Var4;
            } else {
                i1t0 i1t0VarM52183p2 = j1t0.m52183p(j1t0Var);
                i1t0VarM52183p2.m49425i(j1t0Var4);
                this.f184407i = i1t0VarM52183p2.m49424g();
            }
            this.f184402d |= 16;
        }
        if ((r1t0Var.f194913c & 32) == 32) {
            int i6 = r1t0Var.f194919i;
            this.f184402d = 32 | this.f184402d;
            this.f184408t = i6;
        }
        if (!r1t0Var.f194920t.isEmpty()) {
            if (this.f184400X.isEmpty()) {
                this.f184400X = r1t0Var.f194920t;
                this.f184402d &= -65;
            } else {
                if ((this.f184402d & 64) != 64) {
                    this.f184400X = new ArrayList(this.f184400X);
                    this.f184402d |= 64;
                }
                this.f184400X.addAll(r1t0Var.f194920t);
            }
        }
        if ((r1t0Var.f194913c & 64) == 64) {
            tzs0 tzs0Var2 = r1t0Var.f194909X;
            if ((this.f184402d & 128) != 128 || (tzs0Var = this.f184401Y) == tzs0.f225293N0) {
                this.f184401Y = tzs0Var2;
            } else {
                rzs0 rzs0VarM82075h = tzs0.m82075h(tzs0Var);
                rzs0VarM82075h.m76833h(tzs0Var2);
                this.f184401Y = rzs0VarM82075h.m76832e();
            }
            this.f184402d |= 128;
        }
        m79857e(r1t0Var);
        this.f149263a = this.f149263a.m48763b(r1t0Var.f194912b);
    }
}
