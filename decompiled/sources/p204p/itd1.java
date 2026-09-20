package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class itd1 {

    /* JADX INFO: renamed from: a */
    public final v7j f105522a;

    /* JADX INFO: renamed from: b */
    public int f105523b;

    /* JADX INFO: renamed from: c */
    public int f105524c;

    /* JADX INFO: renamed from: d */
    public float f105525d;

    /* JADX INFO: renamed from: e */
    public float f105526e;

    /* JADX INFO: renamed from: f */
    public float f105527f;

    /* JADX INFO: renamed from: g */
    public float f105528g;

    /* JADX INFO: renamed from: h */
    public float f105529h;

    /* JADX INFO: renamed from: i */
    public float f105530i;

    /* JADX INFO: renamed from: j */
    public float f105531j;

    /* JADX INFO: renamed from: k */
    public float f105532k;

    /* JADX INFO: renamed from: l */
    public float f105533l;

    /* JADX INFO: renamed from: m */
    public float f105534m;

    /* JADX INFO: renamed from: n */
    public float f105535n;

    /* JADX INFO: renamed from: o */
    public final HashMap f105536o;

    public itd1(v7j v7jVar) {
        this.f105522a = null;
        this.f105523b = 0;
        this.f105524c = 0;
        this.f105525d = Float.NaN;
        this.f105526e = Float.NaN;
        this.f105527f = Float.NaN;
        this.f105528g = Float.NaN;
        this.f105529h = Float.NaN;
        this.f105530i = Float.NaN;
        this.f105531j = Float.NaN;
        this.f105532k = Float.NaN;
        this.f105533l = Float.NaN;
        this.f105534m = Float.NaN;
        this.f105535n = Float.NaN;
        this.f105536o = new HashMap();
        this.f105522a = v7jVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m51627a(itd1 itd1Var) {
        if (itd1Var == null) {
            return;
        }
        this.f105525d = itd1Var.f105525d;
        this.f105526e = itd1Var.f105526e;
        this.f105527f = itd1Var.f105527f;
        this.f105528g = itd1Var.f105528g;
        this.f105529h = itd1Var.f105529h;
        this.f105530i = itd1Var.f105530i;
        this.f105531j = itd1Var.f105531j;
        this.f105532k = itd1Var.f105532k;
        this.f105533l = itd1Var.f105533l;
        this.f105534m = itd1Var.f105534m;
        this.f105535n = itd1Var.f105535n;
        HashMap map = this.f105536o;
        map.clear();
        for (dcm dcmVar : itd1Var.f105536o.values()) {
            map.put(dcmVar.m35662b(), dcmVar.m35661a());
        }
    }

    public itd1(itd1 itd1Var) {
        this.f105522a = null;
        this.f105523b = 0;
        this.f105524c = 0;
        this.f105525d = Float.NaN;
        this.f105526e = Float.NaN;
        this.f105527f = Float.NaN;
        this.f105528g = Float.NaN;
        this.f105529h = Float.NaN;
        this.f105530i = Float.NaN;
        this.f105531j = Float.NaN;
        this.f105532k = Float.NaN;
        this.f105533l = Float.NaN;
        this.f105534m = Float.NaN;
        this.f105535n = Float.NaN;
        this.f105536o = new HashMap();
        this.f105522a = itd1Var.f105522a;
        this.f105523b = itd1Var.f105523b;
        this.f105524c = itd1Var.f105524c;
        m51627a(itd1Var);
    }
}
