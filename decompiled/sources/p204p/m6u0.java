package p204p;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m6u0 {

    /* JADX INFO: renamed from: a */
    public final ljx0 f140576a;

    /* JADX INFO: renamed from: b */
    public final ar0 f140577b = new ar0(7);

    public m6u0(ljx0 ljx0Var) {
        this.f140576a = ljx0Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m61027a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            j1r0 j1r0Var = new j1r0(str, 21);
            ljx0 ljx0Var = this.f140576a;
            h6u0 h6u0Var = (h6u0) nsf1.m65528n(ljx0Var, true, false, j1r0Var);
            if (h6u0Var == null) {
                nsf1.m65528n(ljx0Var, false, true, new b6u0(1, this, new h6u0(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), iIntValue, str)));
            } else if (h6u0Var.f88257b != iIntValue) {
                nsf1.m65528n(ljx0Var, false, true, new l6u0(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), iIntValue, str));
            }
        }
    }
}
