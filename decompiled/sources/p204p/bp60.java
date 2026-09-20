package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class bp60 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public int f29329b;

    /* JADX INFO: renamed from: c */
    public int f29330c;

    /* JADX INFO: renamed from: d */
    public int f29331d;

    /* JADX INFO: renamed from: e */
    public Object f29332e;

    /* JADX INFO: renamed from: f */
    public cp60 f29333f;

    /* JADX INFO: renamed from: g */
    public List f29334g;

    /* JADX INFO: renamed from: h */
    public List f29335h;

    /* JADX INFO: renamed from: g */
    public static bp60 m30101g() {
        bp60 bp60Var = new bp60();
        bp60Var.f29330c = 1;
        bp60Var.f29332e = "";
        bp60Var.f29333f = cp60.NONE;
        List list = Collections.EMPTY_LIST;
        bp60Var.f29334g = list;
        bp60Var.f29335h = list;
        return bp60Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        dp60 dp60VarM30102e = m30102e();
        dp60VarM30102e.isInitialized();
        return dp60VarM30102e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        dp60 dp60Var = null;
        try {
            try {
                dp60.f51185L0.getClass();
                m30103h(new dp60(pweVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                dp60 dp60Var2 = (dp60) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dp60Var = dp60Var2;
                    if (dp60Var != null) {
                        m30103h(dp60Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (dp60Var != null) {
                m30103h(dp60Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        bp60 bp60VarM30101g = m30101g();
        bp60VarM30101g.m30103h(m30102e());
        return bp60VarM30101g;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m30103h((dp60) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final dp60 m30102e() {
        dp60 dp60Var = new dp60(this);
        int i = this.f29329b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        dp60Var.f51191c = this.f29330c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        dp60Var.f51192d = this.f29331d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        dp60Var.f51193e = this.f29332e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        dp60Var.f51194f = this.f29333f;
        if ((i & 16) == 16) {
            this.f29334g = Collections.unmodifiableList(this.f29334g);
            this.f29329b &= -17;
        }
        dp60Var.f51195g = this.f29334g;
        if ((this.f29329b & 32) == 32) {
            this.f29335h = Collections.unmodifiableList(this.f29335h);
            this.f29329b &= -33;
        }
        dp60Var.f51197i = this.f29335h;
        dp60Var.f51190b = i2;
        return dp60Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m30103h(dp60 dp60Var) {
        if (dp60Var == dp60.f51186Z) {
            return;
        }
        int i = dp60Var.f51190b;
        if ((i & 1) == 1) {
            int i2 = dp60Var.f51191c;
            this.f29329b = 1 | this.f29329b;
            this.f29330c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = dp60Var.f51192d;
            this.f29329b = 2 | this.f29329b;
            this.f29331d = i3;
        }
        if ((i & 4) == 4) {
            this.f29329b |= 4;
            this.f29332e = dp60Var.f51193e;
        }
        if ((i & 8) == 8) {
            cp60 cp60Var = dp60Var.f51194f;
            cp60Var.getClass();
            this.f29329b = 8 | this.f29329b;
            this.f29333f = cp60Var;
        }
        if (!dp60Var.f51195g.isEmpty()) {
            if (this.f29334g.isEmpty()) {
                this.f29334g = dp60Var.f51195g;
                this.f29329b &= -17;
            } else {
                if ((this.f29329b & 16) != 16) {
                    this.f29334g = new ArrayList(this.f29334g);
                    this.f29329b |= 16;
                }
                this.f29334g.addAll(dp60Var.f51195g);
            }
        }
        if (!dp60Var.f51197i.isEmpty()) {
            if (this.f29335h.isEmpty()) {
                this.f29335h = dp60Var.f51197i;
                this.f29329b &= -33;
            } else {
                if ((this.f29329b & 32) != 32) {
                    this.f29335h = new ArrayList(this.f29335h);
                    this.f29329b |= 32;
                }
                this.f29335h.addAll(dp60Var.f51197i);
            }
        }
        this.f149263a = this.f149263a.m48763b(dp60Var.f51189a);
    }
}
