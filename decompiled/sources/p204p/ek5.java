package p204p;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ek5 implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60385a;

    /* JADX INFO: renamed from: b */
    public final Object f60386b;

    public /* synthetic */ ek5(Object obj, int i) {
        this.f60385a = i;
        this.f60386b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [p.s4x0, p.th00] */
    @Override // p204p.qsz0
    public final Iterator iterator() {
        switch (this.f60385a) {
            case 0:
                return new C2042k7((Object[]) this.f60386b, 1);
            case 1:
                return ((Iterable) this.f60386b).iterator();
            case 2:
                return new shs(this);
            case 3:
                return g0b1.m43277s((s4x0) this.f60386b);
            case 4:
                return (Iterator) this.f60386b;
            case 5:
                return new ctz0(this.f60386b);
            case 6:
                return bga.m29076S(new z6z((a7z) this.f60386b), 2, 1, false, false);
            case 7:
                return new ql80((CharSequence) this.f60386b);
            default:
                return new C2042k7((ViewGroup) this.f60386b, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ek5(th00 th00Var) {
        this.f60385a = 3;
        this.f60386b = (s4x0) th00Var;
    }
}
