package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class mxr implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148166a;

    /* JADX INFO: renamed from: b */
    public final qsz0 f148167b;

    /* JADX INFO: renamed from: c */
    public final gh00 f148168c;

    public /* synthetic */ mxr(qsz0 qsz0Var, gh00 gh00Var, int i) {
        this.f148166a = i;
        this.f148167b = qsz0Var;
        this.f148168c = gh00Var;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        switch (this.f148166a) {
            case 0:
                return new lxr(this.f148167b.iterator(), this.f148168c);
            default:
                return new dgz(this);
        }
    }
}
