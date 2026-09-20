package p204p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes11.dex */
public final class zu51 implements xra0 {

    /* JADX INFO: renamed from: a */
    public final String f286347a;

    /* JADX INFO: renamed from: b */
    public volatile xra0 f286348b;

    /* JADX INFO: renamed from: c */
    public Boolean f286349c;

    /* JADX INFO: renamed from: d */
    public Method f286350d;

    /* JADX INFO: renamed from: e */
    public rb5 f286351e;

    /* JADX INFO: renamed from: f */
    public final Queue f286352f;

    /* JADX INFO: renamed from: g */
    public final boolean f286353g;

    public zu51(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f286347a = str;
        this.f286352f = linkedBlockingQueue;
        this.f286353g = z;
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: a */
    public final void mo27132a(Object obj) {
        m96998b().mo27132a(obj);
    }

    /* JADX INFO: renamed from: b */
    public final xra0 m96998b() {
        if (this.f286348b != null) {
            return this.f286348b;
        }
        if (this.f286353g) {
            return ati0.f19697b;
        }
        if (this.f286351e == null) {
            Queue queue = this.f286352f;
            rb5 rb5Var = new rb5(15);
            rb5Var.f197472c = this;
            rb5Var.f197471b = this.f286347a;
            rb5Var.f197473d = queue;
            this.f286351e = rb5Var;
        }
        return this.f286351e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m96999c() {
        Boolean bool = this.f286349c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f286350d = this.f286348b.getClass().getMethod("log", av51.class);
            this.f286349c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f286349c = Boolean.FALSE;
        }
        return this.f286349c.booleanValue();
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: d */
    public final void mo27133d(String str, Object obj, Object obj2) {
        m96998b().mo27133d(str, obj, obj2);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: e */
    public final void mo27134e(String str) {
        m96998b().mo27134e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zu51.class == obj.getClass() && this.f286347a.equals(((zu51) obj).f286347a);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: f */
    public final void mo27135f(String str, Object... objArr) {
        m96998b().mo27135f(str, objArr);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: g */
    public final void mo27136g(Exception exc, String str) {
        m96998b().mo27136g(exc, str);
    }

    @Override // p204p.xra0
    public final String getName() {
        return this.f286347a;
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: h */
    public final boolean mo27137h() {
        return m96998b().mo27137h();
    }

    public final int hashCode() {
        return this.f286347a.hashCode();
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: i */
    public final void mo27138i(String str, Integer num, Object obj) {
        m96998b().mo27138i(str, num, obj);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: j */
    public final void mo27139j(String str, Throwable th) {
        m96998b().mo27139j(str, th);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: k */
    public final void mo27140k(Object obj, Exception exc) {
        m96998b().mo27140k(obj, exc);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: l */
    public final void mo27141l(Object obj, String str) {
        m96998b().mo27141l(obj, str);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: m */
    public final void mo27142m(Object obj, String str) {
        m96998b().mo27142m(obj, str);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: n */
    public final void mo27143n(Object... objArr) {
        m96998b().mo27143n(objArr);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: o */
    public final void mo27144o(String str) {
        m96998b().mo27144o(str);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: p */
    public final void mo27145p(String str) {
        m96998b().mo27145p(str);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m97000q() {
        return this.f286348b instanceof ati0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m97001r() {
        return this.f286348b == null;
    }

    /* JADX INFO: renamed from: s */
    public final void m97002s(av51 av51Var) {
        if (m96999c()) {
            try {
                this.f286350d.invoke(this.f286348b, av51Var);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m97003t(xra0 xra0Var) {
        this.f286348b = xra0Var;
    }
}
