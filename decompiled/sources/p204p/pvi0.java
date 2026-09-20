package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pvi0 implements k330 {

    /* JADX INFO: renamed from: a */
    public final String f181778a;

    /* JADX INFO: renamed from: b */
    public final t3x0 f181779b;

    /* JADX INFO: renamed from: c */
    public final rvi0 f181780c;

    public pvi0(String str, t3x0 t3x0Var, rvi0 rvi0Var) {
        this.f181778a = str;
        this.f181779b = t3x0Var;
        this.f181780c = rvi0Var;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        rvi0 rvi0Var = this.f181780c;
        return Collections.singletonList(new mvi0(new ovi0(rvi0Var.f203088a, rvi0Var.f203089b), this.f181778a, b250Var));
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f181779b;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f181778a;
    }
}
