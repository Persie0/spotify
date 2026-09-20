package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d7u extends g7u {

    /* JADX INFO: renamed from: c */
    public long f46273c;

    /* JADX INFO: renamed from: d */
    public pi21 f46274d;

    public d7u() {
        super(0, 3);
        this.f46273c = 9205357640488583168L;
        this.f46274d = oi21.f165652a;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: a */
    public final w6u mo24995a() {
        d7u d7uVar = new d7u();
        d7uVar.f46273c = this.f46273c;
        d7uVar.f46274d = this.f46274d;
        ArrayList arrayList = this.f77354b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w6u) it.next()).mo24995a());
        }
        d7uVar.f77354b.addAll(arrayList2);
        return d7uVar;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: b */
    public final qe10 mo24996b() {
        qe10 qe10VarMo24996b;
        w6u w6uVar = (w6u) g6f.m43708V0(this.f77354b);
        return (w6uVar == null || (qe10VarMo24996b = w6uVar.mo24996b()) == null) ? y85.m93066k(oe10.f164317a) : qe10VarMo24996b;
    }

    @Override // p204p.w6u
    /* JADX INFO: renamed from: c */
    public final void mo24997c(qe10 qe10Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) bcs.m28783c(this.f46273c)) + ", sizeMode=" + this.f46274d + ", children=[\n" + m43928d() + "\n])";
    }
}
