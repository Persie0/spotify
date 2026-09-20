package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class okx implements gm80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f166686b;

    public /* synthetic */ okx(Object obj, int i) {
        this.f166685a = i;
        this.f166686b = obj;
    }

    @Override // p204p.gm80
    /* JADX INFO: renamed from: a */
    public final void mo28832a(yl80 yl80Var) {
        switch (this.f166685a) {
            case 0:
                if (yl80Var instanceof xl80) {
                    ((gh00) this.f166686b).invoke(((xl80) yl80Var).f263064a);
                }
                break;
            case 1:
                if (yl80Var instanceof xl80) {
                    ((gh00) this.f166686b).invoke(new b100(((xl80) yl80Var).f263064a));
                }
                break;
            case 2:
                if (yl80Var instanceof xl80) {
                    ((gh00) this.f166686b).invoke(new mq20(((xl80) yl80Var).f263064a));
                }
                break;
            default:
                ((cn80) this.f166686b).f39920e.invoke();
                break;
        }
    }
}
