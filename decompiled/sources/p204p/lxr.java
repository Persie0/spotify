package p204p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class lxr extends AbstractC1804e7 {

    /* JADX INFO: renamed from: c */
    public final Iterator f137864c;

    /* JADX INFO: renamed from: d */
    public final gh00 f137865d;

    /* JADX INFO: renamed from: e */
    public final HashSet f137866e = new HashSet();

    public lxr(Iterator it, gh00 gh00Var) {
        this.f137864c = it;
        this.f137865d = gh00Var;
    }

    @Override // p204p.AbstractC1804e7
    /* JADX INFO: renamed from: a */
    public final void mo37275a() {
        Object next;
        do {
            Iterator it = this.f137864c;
            if (!it.hasNext()) {
                this.f56782a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f137866e.add(this.f137865d.invoke(next)));
        this.f56783b = next;
        this.f56782a = 1;
    }
}
