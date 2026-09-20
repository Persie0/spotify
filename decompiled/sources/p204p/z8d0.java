package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z8d0 {

    /* JADX INFO: renamed from: a */
    public final Object f280447a;

    /* JADX INFO: renamed from: b */
    public boolean f280448b;

    /* JADX INFO: renamed from: c */
    public boolean f280449c;

    /* JADX INFO: renamed from: d */
    public int f280450d;

    public z8d0(Object obj) {
        this.f280447a = obj;
    }

    /* JADX INFO: renamed from: a */
    public void mo82570a() {
        boolean z = this.f280448b;
        Object obj = this.f280447a;
        if (z) {
            throw new IllegalStateException(klh.m56833e(obj, "detach() called when detach() had already been called for: "));
        }
        if (this.f280449c) {
            throw new IllegalStateException(klh.m56833e(obj, "detach() called when sendResult() had already been called for: "));
        }
        this.f280448b = true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95579b() {
        return this.f280448b || this.f280449c;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo74980c(Object obj);

    /* JADX INFO: renamed from: d */
    public final void m95580d(ArrayList arrayList) {
        if (this.f280449c) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f280447a);
        }
        this.f280449c = true;
        mo74980c(arrayList);
    }
}
