package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class oqa implements y15 {

    /* JADX INFO: renamed from: a */
    public final ib70 f168140a;

    /* JADX INFO: renamed from: b */
    public final y400 f168141b;

    /* JADX INFO: renamed from: c */
    public final Map f168142c;

    /* JADX INFO: renamed from: d */
    public final Object f168143d = q3d0.m72078I(2, new C2642z9(this, 5));

    public oqa(ib70 ib70Var, y400 y400Var, Map map) {
        this.f168140a = ib70Var;
        this.f168141b = y400Var;
        this.f168142c = map;
    }

    @Override // p204p.y15
    /* JADX INFO: renamed from: a */
    public final Map mo51607a() {
        return this.f168142c;
    }

    @Override // p204p.y15
    /* JADX INFO: renamed from: b */
    public final y400 mo51608b() {
        return this.f168141b;
    }

    @Override // p204p.y15
    public final du31 getSource() {
        return du31.f52959o0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.y15
    public final gd70 getType() {
        return (gd70) this.f168143d.getValue();
    }
}
