package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class zm80 {

    /* JADX INFO: renamed from: e */
    public StringBuilder f284185e;

    /* JADX INFO: renamed from: f */
    public String f284186f;

    /* JADX INFO: renamed from: g */
    public char f284187g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f284188h;

    /* JADX INFO: renamed from: a */
    public int f284181a = 1;

    /* JADX INFO: renamed from: b */
    public final ArrayList f284182b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f284183c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f284184d = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f284189i = false;

    /* JADX INFO: renamed from: a */
    public final void m96409a() {
        if (this.f284189i) {
            String strM96698b = zpw.m96698b(this.f284186f);
            StringBuilder sb = this.f284188h;
            String strM96698b2 = sb != null ? zpw.m96698b(sb.toString()) : null;
            String string = this.f284185e.toString();
            ym80 ym80Var = new ym80();
            ym80Var.f274178g = string;
            ym80Var.f274179h = strM96698b;
            ym80Var.f274180i = strM96698b2;
            ArrayList arrayList = this.f284184d;
            ym80Var.m73297e(arrayList);
            arrayList.clear();
            this.f284183c.add(ym80Var);
            this.f284185e = null;
            this.f284189i = false;
            this.f284186f = null;
            this.f284188h = null;
        }
    }
}
