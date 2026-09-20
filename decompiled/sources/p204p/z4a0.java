package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z4a0 implements toc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f279178b;

    public /* synthetic */ z4a0(Object obj, int i) {
        this.f279177a = i;
        this.f279178b = obj;
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a */
    public final voc1 getF6520f1() {
        voc1 voc1Var;
        switch (this.f279177a) {
            case 0:
                ofm0 ofm0Var = ((c5a0) this.f279178b).f34117f;
                q040 q040Var = (q040) ofm0Var.mo15684j0(q040.class).mo31538a();
                if (q040Var != null && (voc1Var = q040Var.f183902b) != null) {
                    return voc1Var;
                }
                say sayVar = (say) ofm0Var.mo15684j0(say.class).mo31538a();
                if (sayVar != null) {
                    return sayVar.f207289b;
                }
                throw new IllegalStateException("Your page must declare a Identifier or FallbackIdentifier");
            default:
                return ((wnp0) this.f279178b).f253233b;
        }
    }
}
