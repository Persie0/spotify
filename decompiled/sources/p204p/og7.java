package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class og7 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f165014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f165015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og7(AtomicReference atomicReference, eh00 eh00Var, int i) {
        super(0);
        this.f165013a = i;
        this.f165014b = atomicReference;
        this.f165015c = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f165013a) {
            case 0:
                this.f165014b.set(Boolean.TRUE);
                this.f165015c.invoke();
                break;
            case 1:
                this.f165014b.set(Boolean.TRUE);
                this.f165015c.invoke();
                break;
            default:
                this.f165014b.set(Boolean.TRUE);
                this.f165015c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
