package p204p;

import com.google.android.recaptcha.internal.zzahy;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jaf1 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final laf1 f110457a;

    /* JADX INFO: renamed from: b */
    public laf1 f110458b;

    public jaf1(laf1 laf1Var) {
        this.f110457a = laf1Var;
        if (laf1Var.m58559v()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f110458b = laf1Var.m58555h();
    }

    /* JADX INFO: renamed from: b */
    public static void m52810b(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m52811c() {
        if (this.f110458b.m58559v()) {
            return;
        }
        m52812d();
    }

    public final Object clone() {
        jaf1 jaf1Var = (jaf1) this.f110457a.mo25248u(5);
        jaf1Var.f110458b = m52813e();
        return jaf1Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m52812d() {
        laf1 laf1VarM58555h = this.f110457a.m58555h();
        qbf1.f187085b.m72493a(laf1VarM58555h.getClass()).mo61383b(laf1VarM58555h, this.f110458b);
        this.f110458b = laf1VarM58555h;
    }

    /* JADX INFO: renamed from: e */
    public final laf1 m52813e() {
        if (!this.f110458b.m58559v()) {
            return this.f110458b;
        }
        laf1 laf1Var = this.f110458b;
        laf1Var.getClass();
        qbf1.f187085b.m72493a(laf1Var.getClass()).mo61382a(laf1Var);
        laf1Var.m58554g();
        return this.f110458b;
    }

    /* JADX INFO: renamed from: g */
    public final laf1 m52814g() {
        laf1 laf1VarM52813e = m52813e();
        laf1VarM52813e.getClass();
        if (laf1.m58551r(laf1VarM52813e, true)) {
            return laf1VarM52813e;
        }
        throw new zzahy();
    }

    /* JADX INFO: renamed from: h */
    public final void m52815h(laf1 laf1Var) {
        laf1 laf1Var2 = this.f110457a;
        if (laf1Var != null && !laf1Var2.getClass().isInstance(laf1Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (laf1Var2.equals(laf1Var)) {
            return;
        }
        if (!this.f110458b.m58559v()) {
            m52812d();
        }
        laf1 laf1Var3 = this.f110458b;
        qbf1.f187085b.m72493a(laf1Var3.getClass()).mo61383b(laf1Var3, laf1Var);
    }
}
