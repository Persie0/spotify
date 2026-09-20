package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class cy41 {

    /* JADX INFO: renamed from: a */
    public final xre f43156a;

    /* JADX INFO: renamed from: b */
    public xul0 f43157b;

    /* JADX INFO: renamed from: c */
    public xul0 f43158c;

    /* JADX INFO: renamed from: d */
    public List f43159d = new ArrayList(1);

    /* JADX INFO: renamed from: e */
    public xul0 f43160e;

    /* JADX INFO: renamed from: f */
    public List f43161f;

    /* JADX INFO: renamed from: g */
    public ArrayList f43162g;

    /* JADX INFO: renamed from: h */
    public int f43163h;

    /* JADX INFO: renamed from: i */
    public int f43164i;

    /* JADX INFO: renamed from: j */
    public xul0 f43165j;

    public cy41(xre xreVar) {
        C2244p5 c2244p5 = C2244p5.f174033a;
        this.f43160e = c2244p5;
        this.f43161f = new ArrayList(1);
        this.f43162g = new ArrayList(1);
        this.f43165j = c2244p5;
        this.f43156a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m34338a() {
        int i = this.f43163h + this.f43164i;
        c95.m31851q(i, this.f43162g.size());
        this.f43159d = this.f43162g.subList(0, i);
        this.f43160e = xul0.m92200a((ContextTrack) this.f43162g.get(i));
        ArrayList arrayList = this.f43162g;
        this.f43161f = arrayList.subList(i + 1, arrayList.size());
    }
}
