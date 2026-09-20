package p204p;

import android.app.Activity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ro9 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final bl9 f201182a;

    /* JADX INFO: renamed from: b */
    public final Activity f201183b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f201184c;

    /* JADX INFO: renamed from: d */
    public final e940 f201185d;

    /* JADX INFO: renamed from: e */
    public final vb5 f201186e;

    /* JADX INFO: renamed from: f */
    public final String f201187f;

    /* JADX INFO: renamed from: g */
    public final kv91 f201188g;

    /* JADX INFO: renamed from: h */
    public final b7a1 f201189h;

    /* JADX INFO: renamed from: i */
    public final i8g0 f201190i;

    public ro9(bl9 bl9Var, Activity activity, z9j0 z9j0Var, e940 e940Var, vb5 vb5Var, String str, kv91 kv91Var, b7a1 b7a1Var, i8g0 i8g0Var) {
        this.f201182a = bl9Var;
        this.f201183b = activity;
        this.f201184c = z9j0Var;
        this.f201185d = e940Var;
        this.f201186e = vb5Var;
        this.f201187f = str;
        this.f201188g = kv91Var;
        this.f201189h = b7a1Var;
        this.f201190i = i8g0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        try {
            u951 u951Var = (u951) this.f201182a.m29751c(this.f201187f).blockingGet().f161172b;
            if (u951Var != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new po9(this, u951Var));
                int size = arrayList.size();
                int i = 0;
                for (Object obj : u951Var.f228081c) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    arrayList.add(new qo9(this, (i29) obj, size, i));
                    i = i2;
                }
                return new fa51(new da51(arrayList));
            }
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            }
        }
        return ea51.f57588a;
    }
}
