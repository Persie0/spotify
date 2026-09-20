package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0048e;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o110 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0048e f160564a;

    /* JADX INFO: renamed from: b */
    public AbstractC0048e f160565b;

    /* JADX INFO: renamed from: c */
    public boolean f160566c = false;

    public o110(AbstractC0048e abstractC0048e) {
        this.f160564a = abstractC0048e;
        this.f160565b = (AbstractC0048e) abstractC0048e.mo521d(4);
    }

    /* JADX INFO: renamed from: e */
    public static void m66036e(AbstractC0048e abstractC0048e, AbstractC0048e abstractC0048e2) {
        f3t0 f3t0Var = f3t0.f65577c;
        f3t0Var.getClass();
        f3t0Var.m40698a(abstractC0048e.getClass()).mo545e(abstractC0048e, abstractC0048e2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0048e m66037b() {
        AbstractC0048e abstractC0048eM66038c = m66038c();
        if (abstractC0048eM66038c.m522g()) {
            return abstractC0048eM66038c;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0048e m66038c() {
        if (this.f160566c) {
            return this.f160565b;
        }
        AbstractC0048e abstractC0048e = this.f160565b;
        abstractC0048e.getClass();
        f3t0 f3t0Var = f3t0.f65577c;
        f3t0Var.getClass();
        f3t0Var.m40698a(abstractC0048e.getClass()).mo541a(abstractC0048e);
        this.f160566c = true;
        return this.f160565b;
    }

    public final Object clone() {
        o110 o110Var = (o110) this.f160564a.mo521d(5);
        AbstractC0048e abstractC0048eM66038c = m66038c();
        o110Var.m66039d();
        m66036e(o110Var.f160565b, abstractC0048eM66038c);
        return o110Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m66039d() {
        if (this.f160566c) {
            AbstractC0048e abstractC0048e = (AbstractC0048e) this.f160565b.mo521d(4);
            m66036e(abstractC0048e, this.f160565b);
            this.f160565b = abstractC0048e;
            this.f160566c = false;
        }
    }
}
