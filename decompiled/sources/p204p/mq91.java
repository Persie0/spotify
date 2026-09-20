package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class mq91 implements xxt {

    /* JADX INFO: renamed from: a */
    public final lt91 f146223a;

    /* JADX INFO: renamed from: b */
    public final kv91 f146224b;

    /* JADX INFO: renamed from: c */
    public final qu91 f146225c;

    /* JADX INFO: renamed from: d */
    public boolean f146226d;

    /* JADX INFO: renamed from: e */
    public jt91 f146227e;

    /* JADX INFO: renamed from: f */
    public aj40 f146228f;

    /* JADX INFO: renamed from: g */
    public ou91 f146229g;

    /* JADX INFO: renamed from: h */
    public st91 f146230h;

    /* JADX INFO: renamed from: i */
    public final zkq f146231i = new zkq();

    public mq91(lt91 lt91Var, qu91 qu91Var, kv91 kv91Var) {
        this.f146223a = lt91Var;
        this.f146224b = kv91Var;
        this.f146225c = qu91Var;
    }

    @Override // p204p.xxt
    /* JADX INFO: renamed from: a */
    public final boolean mo62533a() {
        return (this.f146227e == null && this.f146228f == null) ? false : true;
    }

    @Override // p204p.xxt
    /* JADX INFO: renamed from: b */
    public final cvt mo47884b(Object obj) {
        if (!(obj instanceof av91)) {
            throw new IllegalArgumentException("The interaction model should be UbiInteractionEvent");
        }
        x401 x401VarM96332a = this.f146231i.m96332a();
        return k3h1.m55264w(qpv0.f191387a.mo54112b(d850.class), this.f146224b.mo57453r((av91) obj, x401VarM96332a));
    }

    @Override // p204p.xxt
    /* JADX INFO: renamed from: c */
    public final void mo47885c(int i, b250 b250Var, eh00 eh00Var) {
        ou91 ou91Var;
        aj40 aj40Var;
        hfm0 hfm0VarM41748z;
        ifm0 ifm0Var;
        zkq zkqVar = this.f146231i;
        zkqVar.m96336g(i);
        qu91 qu91Var = this.f146225c;
        if (qu91Var == null) {
            boolean z = this.f146226d;
            lt91 lt91Var = this.f146223a;
            if (!z && i >= 50) {
                Object objInvoke = eh00Var.invoke();
                if (objInvoke != null) {
                    if (objInvoke instanceof ou91) {
                        this.f146224b.mo57449i((ou91) objInvoke, Collections.singleton(eq91.f61817b));
                    } else {
                        if (!(objInvoke instanceof kt91)) {
                            throw new IllegalStateException("Unknown impression type! UBI impressions are required!");
                        }
                        this.f146227e = lt91Var.mo59874d((kt91) objInvoke);
                    }
                }
                this.f146226d = true;
                zkqVar.m96333c();
                return;
            }
            if (!z || i >= 50) {
                return;
            }
            jt91 jt91Var = this.f146227e;
            if (jt91Var != null) {
                lt91Var.mo59875q(jt91Var);
                this.f146227e = null;
            }
            this.f146227e = null;
            this.f146226d = false;
            zkqVar.m96334d();
            return;
        }
        if (i >= 50 || this.f146228f != null || this.f146226d) {
            Object objInvoke2 = eh00Var.invoke();
            if (objInvoke2 == null) {
                aj40 aj40Var2 = this.f146228f;
                if (aj40Var2 != null) {
                    ((zz8) qu91Var).m97278s(aj40Var2, zkq.m96330b(i));
                }
                this.f146228f = null;
                this.f146229g = null;
                this.f146230h = null;
                if (this.f146226d) {
                    this.f146226d = false;
                    zkqVar.m96334d();
                    return;
                }
                return;
            }
            if (objInvoke2 instanceof ou91) {
                ou91Var = (ou91) objInvoke2;
            } else {
                if (!(objInvoke2 instanceof kt91)) {
                    throw new IllegalStateException("Unknown impression type! UBI impressions are required!");
                }
                ou91Var = ((kt91) objInvoke2).f126193a;
            }
            st91 st91Var = (b250Var == null || (hfm0VarM41748z = fig1.m41748z(b250Var)) == null || (ifm0Var = hfm0VarM41748z.f90761b) == null) ? null : ifm0Var.f101786b;
            st91 st91Var2 = this.f146230h;
            boolean z2 = (st91Var2 == null || wj50.m88271j(st91Var, st91Var2)) ? false : true;
            this.f146230h = st91Var;
            if (z2 && (aj40Var = this.f146228f) != null) {
                zz8 zz8Var = (zz8) qu91Var;
                zz8Var.m97278s(aj40Var, zkq.m96330b(i));
                this.f146228f = zz8Var.m97279t(ou91Var, zkq.m96330b(i));
                return;
            }
            ou91 ou91Var2 = this.f146229g;
            if (ou91Var2 != null && !wj50.m88271j(ou91Var, ou91Var2) && this.f146226d && i >= 50) {
                aj40 aj40Var3 = this.f146228f;
                if (aj40Var3 != null) {
                    ((zz8) qu91Var).m97278s(aj40Var3, zkq.m96330b(i));
                }
                this.f146228f = ((zz8) qu91Var).m97279t(ou91Var, zkq.m96330b(i));
                this.f146229g = ou91Var;
                this.f146226d = true;
                zkqVar.m96333c();
                return;
            }
            boolean z3 = this.f146226d;
            if (!z3 && i >= 50 && this.f146228f == null) {
                this.f146228f = ((zz8) qu91Var).m97279t(ou91Var, zkq.m96330b(i));
                this.f146229g = ou91Var;
                this.f146226d = true;
                zkqVar.m96333c();
                return;
            }
            if (!z3 || i >= 50) {
                return;
            }
            aj40 aj40Var4 = this.f146228f;
            if (aj40Var4 != null) {
                ((zz8) qu91Var).m97278s(aj40Var4, zkq.m96330b(i));
            }
            this.f146228f = null;
            this.f146226d = false;
            zkqVar.m96334d();
        }
    }
}
