package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ldi0 implements ofm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132178a;

    /* JADX INFO: renamed from: b */
    public final Object f132179b;

    /* JADX INFO: renamed from: c */
    public final Object f132180c;

    public ldi0(bbm0 bbm0Var, toc1 toc1Var) {
        this.f132178a = 0;
        this.f132179b = bbm0Var;
        this.f132180c = toc1Var;
    }

    @Override // p204p.ofm0
    /* JADX INFO: renamed from: j0 */
    public final jfm0 mo15684j0(Class cls) {
        int i = this.f132178a;
        Object obj = this.f132179b;
        Object obj2 = this.f132180c;
        switch (i) {
            case 0:
                return new pfm0(new qfm0[]{new q040(((bbm0) obj).mo3039c(), ((toc1) obj2).getF6520f1(), null)}, false).mo15684j0(cls);
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                Object c651Var = linkedHashMap.get(cls);
                if (c651Var == null) {
                    c651Var = new c651((xoi0) obj, cls);
                    linkedHashMap.put(cls, c651Var);
                }
                return (jfm0) c651Var;
        }
    }

    public ldi0() {
        this.f132178a = 1;
        this.f132179b = new xoi0(null);
        this.f132180c = new LinkedHashMap();
    }
}
