package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n93 implements ke50 {

    /* JADX INFO: renamed from: a */
    public final fin f151689a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f151690b;

    /* JADX INFO: renamed from: c */
    public final luk f151691c;

    /* JADX INFO: renamed from: d */
    public final ke50 f151692d;

    public n93(fin finVar, h4t0 h4t0Var, luk lukVar, ke50 ke50Var) {
        this.f151689a = finVar;
        this.f151690b = h4t0Var;
        this.f151691c = lukVar;
        this.f151692d = ke50Var;
    }

    /* JADX INFO: renamed from: e */
    public static Completable m63879e(n93 n93Var, List list, String str, String str2) {
        return n93Var.f151692d.mo56199b(list, str, str2, new f93(31, null));
    }

    @Override // p204p.ke50
    /* JADX INFO: renamed from: a */
    public final Single mo56198a(List list, String str, String str2, boolean z, g3m g3mVar, f93 f93Var) {
        return this.f151692d.mo56198a(list, str, str2, z, g3mVar, f93Var);
    }

    @Override // p204p.ke50
    /* JADX INFO: renamed from: b */
    public final Completable mo56199b(List list, String str, String str2, f93 f93Var) {
        return this.f151692d.mo56199b(list, str, str2, f93Var);
    }

    /* JADX INFO: renamed from: c */
    public final Single m63880c(List list, String str, String str2, boolean z, f93 f93Var) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Set set = dd41.f47702f;
        return vjf1.m85770t(this.f151691c, new iq2(this, list, r46.m74726U((String) g6f.m43741q0(list)).f47709c, z, f93Var, null, 1)).flatMap(new bsa(this, str, str2, z, f93Var, 1));
    }
}
