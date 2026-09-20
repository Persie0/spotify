package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class pu40 implements Init {

    /* JADX INFO: renamed from: a */
    public final Init f181332a;

    /* JADX INFO: renamed from: b */
    public final Init f181333b;

    /* JADX INFO: renamed from: c */
    public final wys0 f181334c;

    /* JADX INFO: renamed from: d */
    public final qe70 f181335d;

    /* JADX INFO: renamed from: e */
    public final ri00 f181336e;

    /* JADX WARN: Multi-variable type inference failed */
    public pu40(Init init, Init init2, wys0 wys0Var, th00 th00Var, gh00 gh00Var) {
        this.f181332a = init;
        this.f181333b = init2;
        this.f181334c = wys0Var;
        this.f181335d = (qe70) th00Var;
        this.f181336e = (ri00) gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu40)) {
            return false;
        }
        pu40 pu40Var = (pu40) obj;
        return this.f181332a.equals(pu40Var.f181332a) && this.f181333b.equals(pu40Var.f181333b) && this.f181334c.equals(pu40Var.f181334c) && this.f181335d.equals(pu40Var.f181335d) && this.f181336e.equals(pu40Var.f181336e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.gh00, p.ri00] */
    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public final First mo15576f0(Object obj) {
        First firstMo15576f0 = this.f181332a.mo15576f0(obj);
        First firstMo15576f1 = this.f181333b.mo15576f0(this.f181334c.get(firstMo15576f0.mo15560d()));
        Object objInvoke = this.f181335d.invoke(firstMo15576f0.mo15560d(), firstMo15576f1.mo15560d());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(firstMo15576f0.mo15559a());
        Set setMo15559a = firstMo15576f1.mo15559a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(setMo15559a, 10));
        Iterator it = setMo15559a.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f181336e.invoke(it.next()));
        }
        linkedHashSet.addAll(arrayList);
        return First.m15575c(objInvoke, linkedHashSet);
    }

    public final int hashCode() {
        return this.f181336e.hashCode() + ((this.f181335d.hashCode() + ((this.f181334c.hashCode() + ((this.f181333b.hashCode() + (this.f181332a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
