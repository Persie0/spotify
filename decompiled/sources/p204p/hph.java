package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hph implements iph {

    /* JADX INFO: renamed from: a */
    public final pgo f93784a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f93785b;

    /* JADX INFO: renamed from: c */
    public xmj f93786c;

    /* JADX INFO: renamed from: d */
    public lho f93787d;

    public hph(pgo pgoVar, xmj xmjVar, lho lhoVar) {
        ArrayList arrayList = new ArrayList();
        this.f93784a = pgoVar;
        this.f93785b = arrayList;
        this.f93786c = xmjVar;
        this.f93787d = lhoVar;
    }

    @Override // p204p.iph
    /* JADX INFO: renamed from: a */
    public final List mo45369a() {
        return this.f93785b;
    }

    /* JADX INFO: renamed from: b */
    public final lho m48173b() {
        return this.f93787d;
    }

    /* JADX INFO: renamed from: c */
    public final xmj m48174c() {
        return this.f93786c;
    }

    /* JADX INFO: renamed from: d */
    public final qho m48175d() {
        lho lhoVar = this.f93787d;
        if (lhoVar != null) {
            return this.f93784a.mo25866b(lhoVar);
        }
        return null;
    }
}
