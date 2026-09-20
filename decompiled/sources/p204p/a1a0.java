package p204p;

import com.spotify.home.evopage.mobius.AbstractC0784a;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a1a0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f11369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l1a0 f11370b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f11371c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f11372d;

    public a1a0(niz nizVar, l1a0 l1a0Var, boolean z, boolean z2) {
        this.f11369a = nizVar;
        this.f11370b = l1a0Var;
        this.f11371c = z;
        this.f11372d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        z0a0 z0a0Var;
        if (fbkVar instanceof z0a0) {
            z0a0Var = (z0a0) fbkVar;
            int i = z0a0Var.f278046b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z0a0Var.f278046b = i - Integer.MIN_VALUE;
            } else {
                z0a0Var = new z0a0(this, fbkVar);
            }
        } else {
            z0a0Var = new z0a0(this, fbkVar);
        }
        Object obj2 = z0a0Var.f278045a;
        int i2 = z0a0Var.f278046b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ls21 ls21Var = (ls21) obj;
            l1a0 l1a0Var = this.f11370b;
            Set setM75983b = l1a0Var.f128667d.m75983b();
            ArrayList arrayList = new ArrayList();
            Iterator it = setM75983b.iterator();
            while (it.hasNext()) {
                k330 k330Var = (k330) AbstractC0784a.m11787d(ls21Var.f136428a).get((String) it.next());
                DismissedEntity dismissedEntity = k330Var == null ? null : new DismissedEntity(k330Var.getId(), DismissedEntity.Type.EXPLICIT_FEEDBACK);
                if (dismissedEntity != null) {
                    arrayList.add(dismissedEntity);
                }
            }
            Set setM43736n1 = g6f.m43736n1(arrayList);
            ro80 ro80VarM44508o = geg1.m44508o();
            if (this.f11372d) {
                ro80VarM44508o.add(new mfm(ls21Var.f136430c));
            }
            ro80VarM44508o.addAll(ls21Var.f136428a);
            ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
            Set set = (Set) l1a0Var.f128672i.f107156a.getValue();
            i3a0 i3a0Var = ls21Var.f136433f;
            if (i3a0Var == null) {
                i3a0Var = i3a0.f98081c;
            }
            Event.GotSlotBasedHomeContent gotSlotBasedHomeContent = new Event.GotSlotBasedHomeContent(ro80VarM44506m, setM43736n1, set, i3a0Var, ls21Var.f136429b, this.f11371c, l1a0Var.f128669f.f151186a, ls21Var.f136432e, ls21Var.f136431d, ls21Var.f136434g, ls21Var.f136430c);
            z0a0Var.f278046b = 1;
            Object objEmit = this.f11369a.emit(gotSlotBasedHomeContent, z0a0Var);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
