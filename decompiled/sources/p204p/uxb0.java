package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uxb0 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f234884b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vxb0 f234885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxb0(vmb0 vmb0Var, vxb0 vxb0Var) {
        super(vmb0Var);
        this.f234884b = 2;
        this.f234885c = vxb0Var;
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f234884b) {
            case 0:
                if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
                    vxb0.m86650b(this.f234885c);
                }
                break;
            case 1:
                if (!wj50.m88271j((dx40) obj, (dx40) obj2)) {
                    vxb0.m86650b(this.f234885c);
                }
                break;
            default:
                if (!wj50.m88271j((eh00) obj, (eh00) obj2)) {
                    vxb0.m86650b(this.f234885c);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxb0(vxb0 vxb0Var, int i) {
        super(0);
        this.f234884b = i;
        switch (i) {
            case 1:
                this.f234885c = vxb0Var;
                super(dx40.f53847e);
                break;
            default:
                this.f234885c = vxb0Var;
                break;
        }
    }
}
