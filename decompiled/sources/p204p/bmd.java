package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class bmd implements f7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28507b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f28508c;

    public /* synthetic */ bmd(int i, Object obj, Object obj2) {
        this.f28506a = i;
        this.f28507b = obj;
        this.f28508c = obj2;
    }

    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        awd0 awd0Var;
        switch (this.f28506a) {
            case 0:
                hmd hmdVar = (hmd) this.f28507b;
                z9j0 z9j0Var = hmdVar.f92925d;
                if (!(c7x0Var instanceof n6x0)) {
                    if (!c7x0Var.equals(b6x0.f24069a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                i2d i2dVar = ((j2d) ((n6x0) c7x0Var).f150980a).f108009a;
                if (wj50.m88271j(i2dVar, f2d.f65151a)) {
                    z9j0Var.mo47345e();
                    return;
                }
                if (wj50.m88271j(i2dVar, g2d.f75887a)) {
                    if (hmdVar.f92937j.f274426a.m58077i()) {
                        return;
                    }
                    z9j0Var.mo47345e();
                    return;
                } else {
                    if (!(i2dVar instanceof h2d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((gh00) this.f28508c).invoke(new r9d(((h2d) i2dVar).f86953a));
                    return;
                }
            case 1:
                if (c7x0Var instanceof n6x0) {
                    ArrayList<n2j> arrayList = ((m4j) ((n6x0) c7x0Var).f150980a).f139973a;
                    int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (n2j n2jVar : arrayList) {
                        linkedHashMap.put(n2jVar.f149772a, Boolean.valueOf(n2jVar.f149773b));
                    }
                    if (!linkedHashMap.isEmpty()) {
                        ((gh00) ((kqi0) this.f28508c).getValue()).invoke(new l4j(linkedHashMap));
                    }
                }
                ((dqi) this.f28507b).m36641e();
                return;
            case 2:
                ((atr) this.f28507b).f19733b.invoke(new ahr(2, (f7x0) this.f28508c, c7x0Var));
                return;
            case 3:
                fbk fbkVar = null;
                n6x0 n6x0Var = c7x0Var instanceof n6x0 ? (n6x0) c7x0Var : null;
                if (n6x0Var == null || (awd0Var = (awd0) n6x0Var.f150980a) == null || !(awd0Var instanceof yvd0)) {
                    return;
                }
                x0h1.m89578u((xuk) this.f28507b, null, 0, new sqc0(awd0Var, (kqi0) this.f28508c, fbkVar, 11), 3);
                return;
            case 4:
                if (c7x0Var instanceof n6x0) {
                    ((gh00) this.f28508c).invoke(new sns0(((uns0) this.f28507b).mo73361c(), null));
                    return;
                }
                return;
            default:
                if (c7x0Var instanceof n6x0) {
                    ((gh00) this.f28508c).invoke(new kxs0(((gxs0) this.f28507b).f85327a, null));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bmd(int i, Object obj, gh00 gh00Var) {
        this.f28506a = i;
        this.f28508c = gh00Var;
        this.f28507b = obj;
    }
}
