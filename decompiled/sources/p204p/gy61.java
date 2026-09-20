package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gy61 {

    /* JADX INFO: renamed from: a */
    public final er70 f85485a;

    /* JADX INFO: renamed from: b */
    public final er70 f85486b;

    /* JADX INFO: renamed from: c */
    public final am6 f85487c;

    /* JADX INFO: renamed from: d */
    public final wg61 f85488d;

    /* JADX INFO: renamed from: e */
    public final c9k f85489e;

    public gy61(er70 er70Var, er70 er70Var2, ron ronVar, luk lukVar, am6 am6Var) {
        this.f85485a = er70Var;
        this.f85486b = er70Var2;
        this.f85487c = am6Var;
        this.f85488d = new wg61(new mzc(ronVar, 20));
        this.f85489e = kk40.m56661c(cct.m32296A(new uuk("TelemetryCrashMetadataOrchestrator"), njg1.m64613f()).mo26608y(lukVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m46121a() {
        List list = (List) this.f85488d.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((j2l) it.next()).mo37123a(), arrayList);
        }
        ((ky61) this.f85485a.get()).mo53807a(arrayList);
    }
}
