package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class l50 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n50 f129784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k35 f129785c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f129786d;

    public /* synthetic */ l50(n50 n50Var, k35 k35Var, Object obj, int i) {
        this.f129783a = i;
        this.f129784b = n50Var;
        this.f129785c = k35Var;
        this.f129786d = obj;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f129783a) {
            case 0:
                isl0 isl0Var = this.f129784b.f150442c;
                ConcurrentHashMap concurrentHashMap = isl0Var.f105267b;
                k35 k35Var = this.f129785c;
                Object obj2 = concurrentHashMap.get(k35Var);
                Object obj3 = this.f129786d;
                if (obj2 == obj3) {
                    isl0Var.m51545b(k35Var, obj, obj3);
                }
                break;
            default:
                isl0 isl0Var2 = this.f129784b.f150442c;
                ConcurrentHashMap concurrentHashMap2 = isl0Var2.f105267b;
                k35 k35Var2 = this.f129785c;
                Object obj4 = concurrentHashMap2.get(k35Var2);
                Object obj5 = this.f129786d;
                if (obj4 == obj5) {
                    isl0Var2.m51545b(k35Var2, obj, obj5);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
