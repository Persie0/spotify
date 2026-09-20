package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pgb {

    /* JADX INFO: renamed from: b */
    public static final pgb f177278b;

    /* JADX INFO: renamed from: c */
    public static final pgb f177279c;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f177280a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new w580(0));
        f177278b = new pgb(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new w580(1));
        f177279c = new pgb(linkedHashSet2);
    }

    public pgb(LinkedHashSet linkedHashSet) {
        this.f177280a = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m69873a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (w580 w580Var : this.f177280a) {
            List<gfb> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            w580Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (gfb gfbVar : listUnmodifiableList) {
                wj50.m88275l("The camera info doesn't contain internal implementation.", gfbVar instanceof gfb);
                if (gfbVar.mo44592d() == w580Var.f248029a) {
                    arrayList3.add(gfbVar);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m69874b() {
        Integer num = null;
        for (w580 w580Var : this.f177280a) {
            if (w580Var instanceof w580) {
                Integer numValueOf = Integer.valueOf(w580Var.f248029a);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* JADX INFO: renamed from: c */
    public final ifb m69875c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((ifb) it.next()).mo50329g());
        }
        ArrayList arrayListM69873a = m69873a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ifb ifbVar = (ifb) it2.next();
            if (arrayListM69873a.contains(ifbVar.mo50329g())) {
                linkedHashSet2.add(ifbVar);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (ifb) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
