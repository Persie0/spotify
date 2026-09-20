package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ppa0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f179987a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final int f179988b = 10000;

    /* JADX INFO: renamed from: c */
    public final int f179989c = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;

    /* JADX INFO: renamed from: a */
    public final dqa0 m70546a(long j) {
        ArrayDeque arrayDeque = this.f179987a;
        dqa0 dqa0Var = arrayDeque.size() >= this.f179989c ? (dqa0) arrayDeque.removeFirst() : null;
        while (true) {
            dqa0 dqa0Var2 = (dqa0) arrayDeque.peekFirst();
            if (dqa0Var2 == null || dqa0Var2.f51937f >= j - ((long) this.f179988b)) {
                break;
            }
            dqa0Var = (dqa0) arrayDeque.removeFirst();
        }
        if (dqa0Var == null) {
            dqa0Var = new dqa0();
        }
        dqa0Var.f51937f = j;
        arrayDeque.addLast(dqa0Var);
        return dqa0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f179987a.iterator();
    }
}
