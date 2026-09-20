package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public abstract class m110 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0156e f138790a;

    /* JADX INFO: renamed from: b */
    public AbstractC0156e f138791b;

    /* JADX INFO: renamed from: c */
    public boolean f138792c = false;

    public m110(AbstractC0156e abstractC0156e) {
        this.f138790a = abstractC0156e;
        this.f138791b = (AbstractC0156e) abstractC0156e.mo1803f(4);
    }

    /* JADX INFO: renamed from: e */
    public static void m60481e(AbstractC0156e abstractC0156e, AbstractC0156e abstractC0156e2) {
        c3t0 c3t0Var = c3t0.f33758c;
        c3t0Var.getClass();
        c3t0Var.m31410a(abstractC0156e.getClass()).mo1836h(abstractC0156e, abstractC0156e2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0156e m60482b() {
        AbstractC0156e abstractC0156eM60483c = m60483c();
        if (abstractC0156eM60483c.m1804i()) {
            return abstractC0156eM60483c;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0156e m60483c() {
        if (this.f138792c) {
            return this.f138791b;
        }
        AbstractC0156e abstractC0156e = this.f138791b;
        abstractC0156e.getClass();
        c3t0 c3t0Var = c3t0.f33758c;
        c3t0Var.getClass();
        c3t0Var.m31410a(abstractC0156e.getClass()).mo1829a(abstractC0156e);
        this.f138792c = true;
        return this.f138791b;
    }

    public final Object clone() {
        m110 m110Var = (m110) this.f138790a.mo1803f(5);
        AbstractC0156e abstractC0156eM60483c = m60483c();
        m110Var.m60484d();
        m60481e(m110Var.f138791b, abstractC0156eM60483c);
        return m110Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m60484d() {
        if (this.f138792c) {
            AbstractC0156e abstractC0156e = (AbstractC0156e) this.f138791b.mo1803f(4);
            m60481e(abstractC0156e, this.f138791b);
            this.f138791b = abstractC0156e;
            this.f138792c = false;
        }
    }
}
