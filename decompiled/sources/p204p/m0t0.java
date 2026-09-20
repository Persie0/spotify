package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class m0t0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public int f138736b;

    /* JADX INFO: renamed from: c */
    public int f138737c;

    /* JADX INFO: renamed from: d */
    public int f138738d;

    /* JADX INFO: renamed from: e */
    public n0t0 f138739e;

    /* JADX INFO: renamed from: f */
    public j1t0 f138740f;

    /* JADX INFO: renamed from: g */
    public int f138741g;

    /* JADX INFO: renamed from: h */
    public List f138742h;

    /* JADX INFO: renamed from: i */
    public List f138743i;

    /* JADX INFO: renamed from: g */
    public static m0t0 m60475g() {
        m0t0 m0t0Var = new m0t0();
        m0t0Var.f138739e = n0t0.TRUE;
        m0t0Var.f138740f = j1t0.f107844S0;
        List list = Collections.EMPTY_LIST;
        m0t0Var.f138742h = list;
        m0t0Var.f138743i = list;
        return m0t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        o0t0 o0t0VarM60476e = m60476e();
        if (o0t0VarM60476e.isInitialized()) {
            return o0t0VarM60476e;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        o0t0 o0t0Var = null;
        try {
            try {
                o0t0.f160456Z.getClass();
                m60477h(new o0t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                o0t0 o0t0Var2 = (o0t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    o0t0Var = o0t0Var2;
                    if (o0t0Var != null) {
                        m60477h(o0t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (o0t0Var != null) {
                m60477h(o0t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        m0t0 m0t0VarM60475g = m60475g();
        m0t0VarM60475g.m60477h(m60476e());
        return m0t0VarM60475g;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m60477h((o0t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final o0t0 m60476e() {
        o0t0 o0t0Var = new o0t0(this);
        int i = this.f138736b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        o0t0Var.f160460c = this.f138737c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        o0t0Var.f160461d = this.f138738d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        o0t0Var.f160462e = this.f138739e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        o0t0Var.f160463f = this.f138740f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        o0t0Var.f160464g = this.f138741g;
        if ((i & 32) == 32) {
            this.f138742h = Collections.unmodifiableList(this.f138742h);
            this.f138736b &= -33;
        }
        o0t0Var.f160465h = this.f138742h;
        if ((this.f138736b & 64) == 64) {
            this.f138743i = Collections.unmodifiableList(this.f138743i);
            this.f138736b &= -65;
        }
        o0t0Var.f160466i = this.f138743i;
        o0t0Var.f160459b = i2;
        return o0t0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m60477h(o0t0 o0t0Var) {
        j1t0 j1t0Var;
        if (o0t0Var == o0t0.f160455Y) {
            return;
        }
        int i = o0t0Var.f160459b;
        if ((i & 1) == 1) {
            int i2 = o0t0Var.f160460c;
            this.f138736b = 1 | this.f138736b;
            this.f138737c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = o0t0Var.f160461d;
            this.f138736b = 2 | this.f138736b;
            this.f138738d = i3;
        }
        if ((i & 4) == 4) {
            n0t0 n0t0Var = o0t0Var.f160462e;
            n0t0Var.getClass();
            this.f138736b = 4 | this.f138736b;
            this.f138739e = n0t0Var;
        }
        if ((o0t0Var.f160459b & 8) == 8) {
            j1t0 j1t0Var2 = o0t0Var.f160463f;
            if ((this.f138736b & 8) != 8 || (j1t0Var = this.f138740f) == j1t0.f107844S0) {
                this.f138740f = j1t0Var2;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var);
                i1t0VarM52183p.m49425i(j1t0Var2);
                this.f138740f = i1t0VarM52183p.m49424g();
            }
            this.f138736b |= 8;
        }
        if ((o0t0Var.f160459b & 16) == 16) {
            int i4 = o0t0Var.f160464g;
            this.f138736b = 16 | this.f138736b;
            this.f138741g = i4;
        }
        if (!o0t0Var.f160465h.isEmpty()) {
            if (this.f138742h.isEmpty()) {
                this.f138742h = o0t0Var.f160465h;
                this.f138736b &= -33;
            } else {
                if ((this.f138736b & 32) != 32) {
                    this.f138742h = new ArrayList(this.f138742h);
                    this.f138736b |= 32;
                }
                this.f138742h.addAll(o0t0Var.f160465h);
            }
        }
        if (!o0t0Var.f160466i.isEmpty()) {
            if (this.f138743i.isEmpty()) {
                this.f138743i = o0t0Var.f160466i;
                this.f138736b &= -65;
            } else {
                if ((this.f138736b & 64) != 64) {
                    this.f138743i = new ArrayList(this.f138743i);
                    this.f138736b |= 64;
                }
                this.f138743i.addAll(o0t0Var.f160466i);
            }
        }
        this.f149263a = this.f149263a.m48763b(o0t0Var.f160458a);
    }
}
