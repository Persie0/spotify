package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class l8x {

    /* JADX INFO: renamed from: a */
    public final ljx0 f130954a;

    /* JADX INFO: renamed from: b */
    public final ar0 f130955b = new ar0(3);

    public l8x(ljx0 ljx0Var) {
        this.f130954a = ljx0Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m58486a(Collection collection) {
        if (((LinkedList) collection).size() <= 999) {
            m58488c((AbstractList) collection);
            return;
        }
        ArrayList arrayList = new ArrayList(ResolvedHome.ONDEMAND_SET_FIELD_NUMBER);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            if (arrayList.size() == 999) {
                m58488c(arrayList);
                arrayList.clear();
            }
        }
        if (arrayList.size() > 0) {
            m58488c(arrayList);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58488c(AbstractList abstractList) {
        StringBuilder sbM36620t = dq60.m36620t("DELETE FROM EventSequenceNumbers WHERE sequenceId IN (");
        n0e1.m63421b(abstractList.size(), sbM36620t);
        sbM36620t.append(")");
        nsf1.m65528n(this.f130954a, false, true, new tsv(19, sbM36620t.toString(), abstractList));
    }
}
