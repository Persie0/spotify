package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class wxq implements l25 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ qr60[] f256094b = {new wys0(wxq.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a */
    public final yma0 f256095a;

    public wxq(y751 y751Var, eh00 eh00Var) {
        bna0 bna0Var = (bna0) y751Var;
        bna0Var.getClass();
        this.f256095a = new yma0(bna0Var, eh00Var);
    }

    @Override // p204p.l25
    /* JADX INFO: renamed from: M */
    public final y15 mo55148M(y400 y400Var) {
        Object next;
        Iterator it = iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(((y15) next).mo51608b(), y400Var)) {
                return (y15) next;
            }
        }
        next = null;
        return (y15) next;
    }

    @Override // p204p.l25
    public boolean isEmpty() {
        qr60 qr60Var = f256094b[0];
        return ((List) this.f256095a.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qr60 qr60Var = f256094b[0];
        return ((List) this.f256095a.invoke()).iterator();
    }

    @Override // p204p.l25
    /* JADX INFO: renamed from: r0 */
    public final boolean mo55149r0(y400 y400Var) {
        return mo55148M(y400Var) != null;
    }
}
