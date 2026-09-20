package p204p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class z0t0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public int f278165b;

    /* JADX INFO: renamed from: c */
    public int f278166c;

    /* JADX INFO: renamed from: d */
    public int f278167d;

    /* JADX INFO: renamed from: e */
    public a1t0 f278168e;

    /* JADX INFO: renamed from: g */
    public static z0t0 m95085g() {
        z0t0 z0t0Var = new z0t0();
        z0t0Var.f278166c = -1;
        z0t0Var.f278168e = a1t0.PACKAGE;
        return z0t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        b1t0 b1t0VarM95086e = m95086e();
        if (b1t0VarM95086e.isInitialized()) {
            return b1t0VarM95086e;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        b1t0 b1t0Var = null;
        try {
            try {
                b1t0.f22405i.getClass();
                m95087h(new b1t0(pweVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                b1t0 b1t0Var2 = (b1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    b1t0Var = b1t0Var2;
                    if (b1t0Var != null) {
                        m95087h(b1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (b1t0Var != null) {
                m95087h(b1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        z0t0 z0t0VarM95085g = m95085g();
        z0t0VarM95085g.m95087h(m95086e());
        return z0t0VarM95085g;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m95087h((b1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final b1t0 m95086e() {
        b1t0 b1t0Var = new b1t0(this);
        int i = this.f278165b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        b1t0Var.f22408c = this.f278166c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        b1t0Var.f22409d = this.f278167d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        b1t0Var.f22410e = this.f278168e;
        b1t0Var.f22407b = i2;
        return b1t0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m95087h(b1t0 b1t0Var) {
        if (b1t0Var == b1t0.f22404h) {
            return;
        }
        int i = b1t0Var.f22407b;
        if ((i & 1) == 1) {
            int i2 = b1t0Var.f22408c;
            this.f278165b = 1 | this.f278165b;
            this.f278166c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = b1t0Var.f22409d;
            this.f278165b = 2 | this.f278165b;
            this.f278167d = i3;
        }
        if ((i & 4) == 4) {
            a1t0 a1t0Var = b1t0Var.f22410e;
            a1t0Var.getClass();
            this.f278165b = 4 | this.f278165b;
            this.f278168e = a1t0Var;
        }
        this.f149263a = this.f149263a.m48763b(b1t0Var.f22406a);
    }
}
