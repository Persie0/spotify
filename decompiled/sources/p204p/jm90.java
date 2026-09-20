package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class jm90 {

    /* JADX INFO: renamed from: a */
    public final x5m f113795a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f113796b;

    /* JADX INFO: renamed from: c */
    public final im90 f113797c;

    public jm90(w5m w5mVar, String str, hc80 hc80Var) {
        x5m x5mVarM87255a = w5m.m87255a(w5mVar, new ysk(gbu.f78413a, 27), str);
        this.f113795a = x5mVarM87255a;
        this.f113796b = new LinkedHashSet();
        this.f113797c = new im90(this);
        x5mVarM87255a.start();
        hc80Var.getLifecycle().mo31986a(new dz2(this, 12));
    }
}
