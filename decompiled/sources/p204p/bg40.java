package p204p;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class bg40 extends o3a1 {

    /* JADX INFO: renamed from: b */
    public int f26829b;

    /* JADX INFO: renamed from: c */
    public Object f26830c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Iterator f26831d;

    public bg40(o3a1 o3a1Var) {
        super(0);
        this.f26831d = o3a1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26829b > 0 || this.f26831d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f26829b <= 0) {
            xlk0 xlk0Var = (xlk0) this.f26831d.next();
            this.f26830c = xlk0Var.f263159a;
            this.f26829b = xlk0Var.m91436a();
        }
        this.f26829b--;
        Object obj = this.f26830c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
