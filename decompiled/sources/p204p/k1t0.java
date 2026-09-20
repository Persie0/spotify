package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class k1t0 extends t110 {

    /* JADX INFO: renamed from: L0 */
    public List f118423L0;

    /* JADX INFO: renamed from: X */
    public int f118424X;

    /* JADX INFO: renamed from: Y */
    public List f118425Y;

    /* JADX INFO: renamed from: Z */
    public List f118426Z;

    /* JADX INFO: renamed from: d */
    public int f118427d;

    /* JADX INFO: renamed from: e */
    public int f118428e;

    /* JADX INFO: renamed from: f */
    public int f118429f;

    /* JADX INFO: renamed from: g */
    public List f118430g;

    /* JADX INFO: renamed from: h */
    public j1t0 f118431h;

    /* JADX INFO: renamed from: i */
    public int f118432i;

    /* JADX INFO: renamed from: t */
    public j1t0 f118433t;

    /* JADX INFO: renamed from: h */
    public static k1t0 m55135h() {
        k1t0 k1t0Var = new k1t0();
        k1t0Var.f118428e = 6;
        List list = Collections.EMPTY_LIST;
        k1t0Var.f118430g = list;
        j1t0 j1t0Var = j1t0.f107844S0;
        k1t0Var.f118431h = j1t0Var;
        k1t0Var.f118433t = j1t0Var;
        k1t0Var.f118425Y = list;
        k1t0Var.f118426Z = list;
        k1t0Var.f118423L0 = list;
        return k1t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        l1t0 l1t0VarM55136g = m55136g();
        if (l1t0VarM55136g.isInitialized()) {
            return l1t0VarM55136g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        l1t0 l1t0Var = null;
        try {
            try {
                l1t0.f128785O0.getClass();
                m55137i(new l1t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                l1t0 l1t0Var2 = (l1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    l1t0Var = l1t0Var2;
                    if (l1t0Var != null) {
                        m55137i(l1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (l1t0Var != null) {
                m55137i(l1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        k1t0 k1t0VarM55135h = m55135h();
        k1t0VarM55135h.m55137i(m55136g());
        return k1t0VarM55135h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m55137i((l1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final l1t0 m55136g() {
        l1t0 l1t0Var = new l1t0(this);
        int i = this.f118427d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        l1t0Var.f128793d = this.f118428e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        l1t0Var.f128794e = this.f118429f;
        if ((i & 4) == 4) {
            this.f118430g = Collections.unmodifiableList(this.f118430g);
            this.f118427d &= -5;
        }
        l1t0Var.f128795f = this.f118430g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        l1t0Var.f128796g = this.f118431h;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        l1t0Var.f128797h = this.f118432i;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        l1t0Var.f128798i = this.f118433t;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        l1t0Var.f128799t = this.f118424X;
        if ((this.f118427d & 128) == 128) {
            this.f118425Y = Collections.unmodifiableList(this.f118425Y);
            this.f118427d &= -129;
        }
        l1t0Var.f128788X = this.f118425Y;
        if ((this.f118427d & 256) == 256) {
            this.f118426Z = Collections.unmodifiableList(this.f118426Z);
            this.f118427d &= -257;
        }
        l1t0Var.f128789Y = this.f118426Z;
        if ((this.f118427d & 512) == 512) {
            this.f118423L0 = Collections.unmodifiableList(this.f118423L0);
            this.f118427d &= -513;
        }
        l1t0Var.f128790Z = this.f118423L0;
        l1t0Var.f128792c = i2;
        return l1t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m55137i(l1t0 l1t0Var) {
        j1t0 j1t0Var;
        j1t0 j1t0Var2;
        if (l1t0Var == l1t0.f128784N0) {
            return;
        }
        int i = l1t0Var.f128792c;
        if ((i & 1) == 1) {
            int i2 = l1t0Var.f128793d;
            this.f118427d = 1 | this.f118427d;
            this.f118428e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = l1t0Var.f128794e;
            this.f118427d = 2 | this.f118427d;
            this.f118429f = i3;
        }
        if (!l1t0Var.f128795f.isEmpty()) {
            if (this.f118430g.isEmpty()) {
                this.f118430g = l1t0Var.f128795f;
                this.f118427d &= -5;
            } else {
                if ((this.f118427d & 4) != 4) {
                    this.f118430g = new ArrayList(this.f118430g);
                    this.f118427d |= 4;
                }
                this.f118430g.addAll(l1t0Var.f128795f);
            }
        }
        if ((l1t0Var.f128792c & 4) == 4) {
            j1t0 j1t0Var3 = l1t0Var.f128796g;
            if ((this.f118427d & 8) != 8 || (j1t0Var2 = this.f118431h) == j1t0.f107844S0) {
                this.f118431h = j1t0Var3;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var2);
                i1t0VarM52183p.m49425i(j1t0Var3);
                this.f118431h = i1t0VarM52183p.m49424g();
            }
            this.f118427d |= 8;
        }
        int i4 = l1t0Var.f128792c;
        if ((i4 & 8) == 8) {
            int i5 = l1t0Var.f128797h;
            this.f118427d |= 16;
            this.f118432i = i5;
        }
        if ((i4 & 16) == 16) {
            j1t0 j1t0Var4 = l1t0Var.f128798i;
            if ((this.f118427d & 32) != 32 || (j1t0Var = this.f118433t) == j1t0.f107844S0) {
                this.f118433t = j1t0Var4;
            } else {
                i1t0 i1t0VarM52183p2 = j1t0.m52183p(j1t0Var);
                i1t0VarM52183p2.m49425i(j1t0Var4);
                this.f118433t = i1t0VarM52183p2.m49424g();
            }
            this.f118427d |= 32;
        }
        if ((l1t0Var.f128792c & 32) == 32) {
            int i6 = l1t0Var.f128799t;
            this.f118427d |= 64;
            this.f118424X = i6;
        }
        if (!l1t0Var.f128788X.isEmpty()) {
            if (this.f118425Y.isEmpty()) {
                this.f118425Y = l1t0Var.f128788X;
                this.f118427d &= -129;
            } else {
                if ((this.f118427d & 128) != 128) {
                    this.f118425Y = new ArrayList(this.f118425Y);
                    this.f118427d |= 128;
                }
                this.f118425Y.addAll(l1t0Var.f128788X);
            }
        }
        if (!l1t0Var.f128789Y.isEmpty()) {
            if (this.f118426Z.isEmpty()) {
                this.f118426Z = l1t0Var.f128789Y;
                this.f118427d &= -257;
            } else {
                if ((this.f118427d & 256) != 256) {
                    this.f118426Z = new ArrayList(this.f118426Z);
                    this.f118427d |= 256;
                }
                this.f118426Z.addAll(l1t0Var.f128789Y);
            }
        }
        if (!l1t0Var.f128790Z.isEmpty()) {
            if (this.f118423L0.isEmpty()) {
                this.f118423L0 = l1t0Var.f128790Z;
                this.f118427d &= -513;
            } else {
                if ((this.f118427d & 512) != 512) {
                    this.f118423L0 = new ArrayList(this.f118423L0);
                    this.f118427d |= 512;
                }
                this.f118423L0.addAll(l1t0Var.f128790Z);
            }
        }
        m79857e(l1t0Var);
        this.f149263a = this.f149263a.m48763b(l1t0Var.f128791b);
    }
}
