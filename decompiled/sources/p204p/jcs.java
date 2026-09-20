package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jcs implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f111181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f111182c;

    public /* synthetic */ jcs(ArrayList arrayList, kqi0 kqi0Var, int i) {
        this.f111180a = i;
        this.f111181b = arrayList;
        this.f111182c = kqi0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f111180a) {
            case 0:
                b650 b650Var = (b650) obj;
                boolean z = b650Var instanceof hcs;
                ArrayList arrayList = this.f111181b;
                if (z) {
                    arrayList.add(b650Var);
                } else if (b650Var instanceof ics) {
                    arrayList.remove(((ics) b650Var).f100877a);
                }
                this.f111182c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                b650 b650Var2 = (b650) obj;
                boolean z2 = b650Var2 instanceof gpz;
                ArrayList arrayList2 = this.f111181b;
                if (z2) {
                    arrayList2.add(b650Var2);
                } else if (b650Var2 instanceof hpz) {
                    arrayList2.remove(((hpz) b650Var2).f93924a);
                }
                this.f111182c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                b650 b650Var3 = (b650) obj;
                boolean z3 = b650Var3 instanceof m3r0;
                ArrayList arrayList3 = this.f111181b;
                if (z3) {
                    arrayList3.add(b650Var3);
                } else if (b650Var3 instanceof n3r0) {
                    arrayList3.remove(((n3r0) b650Var3).f150116a);
                } else if (b650Var3 instanceof l3r0) {
                    arrayList3.remove(((l3r0) b650Var3).f129419a);
                }
                this.f111182c.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return w2a1.f247311a;
    }
}
