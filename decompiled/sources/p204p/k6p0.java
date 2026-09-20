package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k6p0 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f119806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l6p0 f119807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6p0(Object obj, l6p0 l6p0Var, int i) {
        super(obj);
        this.f119806b = i;
        this.f119807c = l6p0Var;
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f119806b) {
            case 0:
                j6p0 j6p0Var = (j6p0) obj2;
                j6p0 j6p0Var2 = (j6p0) obj;
                if (!wj50.m88271j(j6p0Var2, j6p0Var)) {
                    boolean z = j6p0Var2.f109376a;
                    int i = j6p0Var2.f109377b;
                    l6p0 l6p0Var = this.f119807c;
                    if (!z && i > 0 && j6p0Var.f109376a) {
                        l6p0.m58383X(l6p0Var, qm0.MUTED, "player_volume_change");
                        break;
                    } else if (!z && i > 0 && j6p0Var.f109377b <= 0) {
                        l6p0.m58383X(l6p0Var, qm0.MUTED, "system_volume_change");
                        break;
                    } else {
                        if (!((i > 0) ^ z) && z && !j6p0Var.f109376a) {
                            l6p0.m58383X(l6p0Var, qm0.UNMUTED, "player_volume_change");
                            break;
                        } else {
                            if (!(z ^ (i > 0)) && i <= 0 && j6p0Var.f109377b > 0) {
                                l6p0.m58383X(l6p0Var, qm0.UNMUTED, "system_volume_change");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                l6p0 l6p0Var2 = this.f119807c;
                k6p0 k6p0Var = l6p0Var2.f130431x1;
                int iIntValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != iIntValue) {
                    l6p0.m58383X(l6p0Var2, qm0.VOLUME_CHANGE, "system_volume_change");
                }
                qr60[] qr60VarArr = l6p0.f130425z1;
                qr60 qr60Var2 = qr60VarArr[0];
                j6p0 j6p0Var3 = (j6p0) k6p0Var.f61172a;
                boolean z2 = j6p0Var3.f109376a;
                j6p0Var3.getClass();
                k6p0Var.m39516c(qr60VarArr[0], l6p0Var2, new j6p0(z2, iIntValue));
                break;
        }
    }
}
