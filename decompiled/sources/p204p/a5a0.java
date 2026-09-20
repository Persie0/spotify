package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a5a0 implements bbm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12469b;

    public /* synthetic */ a5a0(Object obj, int i) {
        this.f12468a = i;
        this.f12469b = obj;
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        zam0 zam0Var;
        zam0 zam0Var2;
        switch (this.f12468a) {
            case 0:
                ofm0 ofm0Var = ((c5a0) this.f12469b).f34117f;
                q040 q040Var = (q040) ofm0Var.mo15684j0(q040.class).mo31538a();
                if (q040Var != null && (zam0Var = q040Var.f183901a) != null) {
                    return zam0Var;
                }
                say sayVar = (say) ofm0Var.mo15684j0(say.class).mo31538a();
                if (sayVar != null) {
                    return sayVar.f207288a;
                }
                throw new IllegalStateException("Your page must declare a Identifier or FallbackIdentifier");
            default:
                ofm0 ofm0Var2 = (ofm0) this.f12469b;
                q040 q040Var2 = (q040) ofm0Var2.mo15684j0(q040.class).mo31538a();
                if (q040Var2 != null && (zam0Var2 = q040Var2.f183901a) != null) {
                    return zam0Var2;
                }
                say sayVar2 = (say) ofm0Var2.mo15684j0(say.class).mo31538a();
                if (sayVar2 != null) {
                    return sayVar2.f207288a;
                }
                throw new IllegalStateException("Your page must declare a Identifier or FallbackIdentifier");
        }
    }
}
