package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0059e;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l110 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0059e f128565a;

    /* JADX INFO: renamed from: b */
    public AbstractC0059e f128566b;

    public l110(AbstractC0059e abstractC0059e) {
        this.f128565a = abstractC0059e;
        if (abstractC0059e.m671f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f128566b = abstractC0059e.m673h();
    }

    /* JADX INFO: renamed from: e */
    public static void m57848e(Object obj, Object obj2) {
        b3t0.m28052a().m28054c(obj).mo700d(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0059e m57849b() {
        AbstractC0059e abstractC0059eM57850c = m57850c();
        abstractC0059eM57850c.getClass();
        if (AbstractC0059e.m668e(abstractC0059eM57850c, true)) {
            return abstractC0059eM57850c;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0059e m57850c() {
        if (!this.f128566b.m671f()) {
            return this.f128566b;
        }
        AbstractC0059e abstractC0059e = this.f128566b;
        abstractC0059e.getClass();
        b3t0.m28052a().m28054c(abstractC0059e).mo697a(abstractC0059e);
        abstractC0059e.m672g();
        return this.f128566b;
    }

    public final Object clone() {
        l110 l110Var = (l110) this.f128565a.mo670b(5);
        l110Var.f128566b = m57850c();
        return l110Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m57851d() {
        if (this.f128566b.m671f()) {
            return;
        }
        AbstractC0059e abstractC0059eM673h = this.f128565a.m673h();
        m57848e(abstractC0059eM673h, this.f128566b);
        this.f128566b = abstractC0059eM673h;
    }
}
