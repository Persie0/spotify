package p204p;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class eb9 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jb9 f57861b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f57862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb9(jb9 jb9Var, long j, int i) {
        super(1);
        this.f57860a = i;
        this.f57861b = jb9Var;
        this.f57862c = j;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        AtomicReference atomicReference;
        switch (this.f57860a) {
            case 0:
                y49 y49Var = (y49) obj;
                ConcurrentHashMap concurrentHashMap = this.f57861b.f110709h;
                long j = this.f57862c;
                kb9 kb9Var = (kb9) concurrentHashMap.get(Long.valueOf(j));
                if (kb9Var != null) {
                    y49Var.getClass();
                    kb9Var.mo35543b((long) (0.0f * 100), j);
                }
                break;
            case 1:
                h49 h49Var = (h49) obj;
                kb9 kb9Var2 = (kb9) this.f57861b.f110709h.get(Long.valueOf(this.f57862c));
                if (kb9Var2 != null) {
                    kb9Var2.mo47022i(h49Var);
                }
                break;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                ConcurrentHashMap concurrentHashMap2 = this.f57861b.f110709h;
                long j2 = this.f57862c;
                kb9 kb9Var3 = (kb9) concurrentHashMap2.get(Long.valueOf(j2));
                if (kb9Var3 != null) {
                    kb9Var3.mo35543b((long) (fFloatValue * 100), j2);
                }
                break;
            default:
                a691 a691Var = (a691) obj;
                ny81 ny81Var = (ny81) this.f57861b.f110710i.get(Long.valueOf(this.f57862c));
                if (ny81Var != null && (atomicReference = ny81Var.f159744a) != null) {
                    atomicReference.set(a691Var);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
