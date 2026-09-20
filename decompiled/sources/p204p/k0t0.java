package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class k0t0 extends t110 {

    /* JADX INFO: renamed from: d */
    public int f118142d;

    /* JADX INFO: renamed from: e */
    public int f118143e;

    /* JADX INFO: renamed from: f */
    public List f118144f;

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        l0t0 l0t0VarM55011g = m55011g();
        if (l0t0VarM55011g.isInitialized()) {
            return l0t0VarM55011g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        l0t0 l0t0Var = null;
        try {
            try {
                l0t0.f128505i.getClass();
                m55012h(new l0t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                l0t0 l0t0Var2 = (l0t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    l0t0Var = l0t0Var2;
                    if (l0t0Var != null) {
                        m55012h(l0t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (l0t0Var != null) {
                m55012h(l0t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        k0t0 k0t0Var = new k0t0();
        k0t0Var.f118144f = Collections.EMPTY_LIST;
        k0t0Var.m55012h(m55011g());
        return k0t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m55012h((l0t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final l0t0 m55011g() {
        l0t0 l0t0Var = new l0t0(this);
        int i = this.f118142d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        l0t0Var.f128508d = this.f118143e;
        if ((i & 2) == 2) {
            this.f118144f = Collections.unmodifiableList(this.f118144f);
            this.f118142d &= -3;
        }
        l0t0Var.f128509e = this.f118144f;
        l0t0Var.f128507c = i2;
        return l0t0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m55012h(l0t0 l0t0Var) {
        if (l0t0Var == l0t0.f128504h) {
            return;
        }
        if ((l0t0Var.f128507c & 1) == 1) {
            int i = l0t0Var.f128508d;
            this.f118142d = 1 | this.f118142d;
            this.f118143e = i;
        }
        if (!l0t0Var.f128509e.isEmpty()) {
            if (this.f118144f.isEmpty()) {
                this.f118144f = l0t0Var.f128509e;
                this.f118142d &= -3;
            } else {
                if ((this.f118142d & 2) != 2) {
                    this.f118144f = new ArrayList(this.f118144f);
                    this.f118142d |= 2;
                }
                this.f118144f.addAll(l0t0Var.f128509e);
            }
        }
        m79857e(l0t0Var);
        this.f149263a = this.f149263a.m48763b(l0t0Var.f128506b);
    }
}
