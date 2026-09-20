package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class w6q {

    /* JADX INFO: renamed from: a */
    public final ri00 f248443a;

    /* JADX INFO: renamed from: b */
    public final p7x0 f248444b;

    /* JADX WARN: Multi-variable type inference failed */
    public w6q(rmm0 rmm0Var, gh00 gh00Var) {
        this.f248443a = (ri00) gh00Var;
        this.f248444b = rmm0Var.mo29877i().mo27151a(xl21.f263010c, new wh1(this, 16));
    }

    /* JADX INFO: renamed from: b */
    public static ur31 m87304b(wr31 wr31Var) {
        switch (wr31Var) {
            case RECENTLY_UPDATED:
                return ur31.f233215i;
            case RECENTLY_ADDED:
                return ur31.f233213g;
            case ALPHABETICAL:
                return ur31.f233207a;
            case CREATOR:
                return ur31.f233209c;
            case CUSTOM:
                return ur31.f233210d;
            case RECENTLY_PLAYED_OR_ADDED:
                return ur31.f233214h;
            case AUTHOR:
                return ur31.f233208b;
            case RELEVANCE:
                return ur31.f233216t;
            case DATE:
                return ur31.f233211e;
            case RELEASE_DATE:
                return ur31.f233212f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m87305a(bs31 bs31Var) {
        ur31 ur31VarM87304b = m87304b(bs31Var.f30227a);
        List list = bs31Var.f30228b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m87304b((wr31) it.next()));
        }
        this.f248444b.mo25060a(new kpe1(new vne1(arrayList, ur31VarM87304b)), null);
    }
}
