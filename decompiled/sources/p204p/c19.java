package p204p;

import com.spotify.interapp.model.AbstractC0800a;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c19 {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f33021d = new AtomicInteger();

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f33022e = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f33023a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final fu51 f33024b;

    /* JADX INFO: renamed from: c */
    public final uzx f33025c;

    public c19(uzx uzxVar, fu51 fu51Var) {
        fu51Var.getClass();
        this.f33024b = fu51Var;
        uzxVar.getClass();
        this.f33025c = uzxVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m31248a(int i, AbstractC0800a abstractC0800a) {
        if (this.f33023a.contains(Integer.valueOf(i))) {
            ((b6q) this.f33024b).m28302a(i, f33022e.incrementAndGet(), abstractC0800a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m31249b(Object obj) {
        for (Integer num : this.f33023a) {
            ((b6q) this.f33024b).m28302a(num.intValue(), f33022e.incrementAndGet(), obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo31250c();

    /* JADX INFO: renamed from: e */
    public abstract void mo31252e(rg41 rg41Var, int i);

    /* JADX INFO: renamed from: d */
    public void mo31251d() {
    }
}
