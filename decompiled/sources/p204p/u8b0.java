package p204p;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u8b0 {

    /* JADX INFO: renamed from: c */
    public HashMap f227884c;

    /* JADX INFO: renamed from: d */
    public HashMap f227885d;

    /* JADX INFO: renamed from: e */
    public float f227886e;

    /* JADX INFO: renamed from: f */
    public HashMap f227887f;

    /* JADX INFO: renamed from: g */
    public ArrayList f227888g;

    /* JADX INFO: renamed from: h */
    public mw31 f227889h;

    /* JADX INFO: renamed from: i */
    public w2b0 f227890i;

    /* JADX INFO: renamed from: j */
    public ArrayList f227891j;

    /* JADX INFO: renamed from: k */
    public Rect f227892k;

    /* JADX INFO: renamed from: l */
    public float f227893l;

    /* JADX INFO: renamed from: m */
    public float f227894m;

    /* JADX INFO: renamed from: n */
    public float f227895n;

    /* JADX INFO: renamed from: o */
    public boolean f227896o;

    /* JADX INFO: renamed from: a */
    public final xln0 f227882a = new xln0();

    /* JADX INFO: renamed from: b */
    public final HashSet f227883b = new HashSet();

    /* JADX INFO: renamed from: p */
    public int f227897p = 0;

    /* JADX INFO: renamed from: a */
    public final void m82566a(String str) {
        sra0.m79109c(str);
        this.f227883b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final float m82567b() {
        return (long) (((this.f227894m - this.f227893l) / this.f227895n) * 1000.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Map m82568c() {
        float fM89551c = x0b1.m89551c();
        if (fM89551c != this.f227886e) {
            for (Map.Entry entry : this.f227885d.entrySet()) {
                this.f227885d.put((String) entry.getKey(), ((w9b0) entry.getValue()).m87488a(this.f227886e / fM89551c));
            }
        }
        this.f227886e = fM89551c;
        return this.f227885d;
    }

    /* JADX INFO: renamed from: d */
    public final anc0 m82569d(String str) {
        int size = this.f227888g.size();
        for (int i = 0; i < size; i++) {
            anc0 anc0Var = (anc0) this.f227888g.get(i);
            if (anc0Var.m26487a(str)) {
                return anc0Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f227891j.iterator();
        while (it.hasNext()) {
            sb.append(((wn70) it.next()).m88579a("\t"));
        }
        return sb.toString();
    }
}
