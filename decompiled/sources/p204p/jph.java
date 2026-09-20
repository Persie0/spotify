package p204p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jph extends AbstractC2440u5 {

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f114655e;

    public jph(gph gphVar) {
        super(gphVar);
        this.f114655e = new LinkedHashSet();
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: C */
    public final void mo53942C() {
        iph iphVar = (iph) this.f226861b;
        iphVar.mo45369a().clear();
        if (iphVar instanceof gph) {
            this.f114655e.add(iphVar);
        }
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: b */
    public final void mo53943b(int i, int i2, int i3) {
        AbstractC2440u5.m82369B(i, i2, i3, ((iph) this.f226862c).mo45369a());
        iph iphVar = (iph) this.f226862c;
        if (iphVar instanceof gph) {
            this.f114655e.add(iphVar);
        }
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: f */
    public final void mo53944f(int i, int i2) {
        int i3 = i + i2;
        Iterator it = ((iph) this.f226862c).mo45369a().subList(i, i3).iterator();
        while (it.hasNext()) {
            ((iph) it.next()).getClass();
        }
        List listMo45369a = ((iph) this.f226862c).mo45369a();
        if (i2 == 1) {
            listMo45369a.remove(i);
        } else {
            listMo45369a.subList(i, i3).clear();
        }
        iph iphVar = (iph) this.f226862c;
        if (iphVar instanceof gph) {
            this.f114655e.add(iphVar);
        }
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: i */
    public final void mo53945i(int i, Object obj) {
        iph iphVar = (iph) obj;
        iph iphVar2 = (iph) this.f226862c;
        iphVar2.getClass();
        iphVar.getClass();
        iphVar2.mo45369a().add(i, iphVar);
        iph iphVar3 = (iph) this.f226862c;
        if (iphVar3 instanceof gph) {
            this.f114655e.add(iphVar3);
        }
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: j */
    public final void mo53946j() {
        LinkedHashSet<gph> linkedHashSet = this.f114655e;
        for (gph gphVar : linkedHashSet) {
            gphVar.f83193c.m86438w(gphVar.f83193c.m86437v() + 1);
        }
        linkedHashSet.clear();
    }

    @Override // p204p.ug5
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ void mo53947n(int i, Object obj) {
    }
}
