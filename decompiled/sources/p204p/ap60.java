package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class ap60 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public int f17842b;

    /* JADX INFO: renamed from: c */
    public List f17843c;

    /* JADX INFO: renamed from: d */
    public List f17844d;

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        ep60 ep60VarM26648e = m26648e();
        ep60VarM26648e.isInitialized();
        return ep60VarM26648e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        ep60 ep60Var = null;
        try {
            try {
                ep60.f61554h.getClass();
                m26649g(new ep60(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ep60 ep60Var2 = (ep60) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ep60Var = ep60Var2;
                    if (ep60Var != null) {
                        m26649g(ep60Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ep60Var != null) {
                m26649g(ep60Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ap60 ap60Var = new ap60();
        List list = Collections.EMPTY_LIST;
        ap60Var.f17843c = list;
        ap60Var.f17844d = list;
        ap60Var.m26649g(m26648e());
        return ap60Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m26649g((ep60) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final ep60 m26648e() {
        ep60 ep60Var = new ep60(this);
        if ((this.f17842b & 1) == 1) {
            this.f17843c = Collections.unmodifiableList(this.f17843c);
            this.f17842b &= -2;
        }
        ep60Var.f61556b = this.f17843c;
        if ((this.f17842b & 2) == 2) {
            this.f17844d = Collections.unmodifiableList(this.f17844d);
            this.f17842b &= -3;
        }
        ep60Var.f61557c = this.f17844d;
        return ep60Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m26649g(ep60 ep60Var) {
        if (ep60Var == ep60.f61553g) {
            return;
        }
        if (!ep60Var.f61556b.isEmpty()) {
            if (this.f17843c.isEmpty()) {
                this.f17843c = ep60Var.f61556b;
                this.f17842b &= -2;
            } else {
                if ((this.f17842b & 1) != 1) {
                    this.f17843c = new ArrayList(this.f17843c);
                    this.f17842b |= 1;
                }
                this.f17843c.addAll(ep60Var.f61556b);
            }
        }
        if (!ep60Var.f61557c.isEmpty()) {
            if (this.f17844d.isEmpty()) {
                this.f17844d = ep60Var.f61557c;
                this.f17842b &= -3;
            } else {
                if ((this.f17842b & 2) != 2) {
                    this.f17844d = new ArrayList(this.f17844d);
                    this.f17842b |= 2;
                }
                this.f17844d.addAll(ep60Var.f61557c);
            }
        }
        this.f149263a = this.f149263a.m48763b(ep60Var.f61555a);
    }
}
