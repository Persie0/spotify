package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zy3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final yy3 f287479a;

    /* JADX INFO: renamed from: b */
    public final bji f287480b;

    /* JADX INFO: renamed from: c */
    public final wg61 f287481c = new wg61(new ey3(this, 9));

    public zy3(yy3 yy3Var, bji bjiVar) {
        this.f287479a = yy3Var;
        this.f287480b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final yy3 m97219a() {
        yy3 yy3VarM97219a;
        zy3 zy3Var = (zy3) this.f287481c.getValue();
        return (zy3Var == null || (yy3VarM97219a = zy3Var.m97219a()) == null) ? this.f287479a : yy3VarM97219a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m97219a().f277390a;
        yy3[] yy3VarArrValues = yy3.values();
        ArrayList arrayList = new ArrayList(yy3VarArrValues.length);
        for (yy3 yy3Var : yy3VarArrValues) {
            arrayList.add(yy3Var.f277390a);
        }
        return Collections.singletonList(new k8a("mark_as_played_endpoint_options", "android-collection-content-impl", str, arrayList));
    }
}
