package p204p;

import android.view.ViewGroup;
import com.spotify.music.SpotifyMainActivity;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class era0 implements fnj0 {

    /* JADX INFO: renamed from: a */
    public final gra0 f62049a;

    /* JADX INFO: renamed from: b */
    public final gh00 f62050b;

    /* JADX INFO: renamed from: c */
    public boolean f62051c;

    /* JADX INFO: renamed from: d */
    public boolean f62052d;

    /* JADX INFO: renamed from: e */
    public final qgy0 f62053e;

    /* JADX INFO: renamed from: f */
    public final qgy0 f62054f;

    /* JADX INFO: renamed from: g */
    public final elq f62055g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f62056h;

    /* JADX INFO: renamed from: i */
    public final r55 f62057i;

    /* JADX INFO: renamed from: j */
    public final Set f62058j;

    /* JADX INFO: renamed from: k */
    public final Set f62059k;

    /* JADX INFO: renamed from: l */
    public final c9k f62060l;

    /* JADX INFO: renamed from: m */
    public boolean f62061m;

    /* JADX INFO: renamed from: n */
    public final cra0 f62062n;

    public era0(gra0 gra0Var, gh00 gh00Var, boolean z, boolean z2) {
        this.f62049a = gra0Var;
        this.f62050b = gh00Var;
        this.f62051c = z;
        this.f62052d = z2;
        this.f62053e = gra0Var.f83695a;
        this.f62054f = gra0Var.f83696b;
        this.f62055g = ((SpotifyMainActivity) gra0Var.f83700f).m15687w0();
        this.f62056h = gra0Var.f83706l;
        r55 r55Var = gra0Var.f83699e;
        this.f62057i = r55Var;
        this.f62058j = gra0Var.f83703i;
        this.f62059k = gra0Var.f83704j;
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a;
        x461 x461VarM64613f = njg1.m64613f();
        rb20Var.getClass();
        this.f62060l = kk40.m56661c(opo.m67570t(rb20Var, x461VarM64613f));
        cra0 cra0Var = new cra0(this);
        this.f62062n = cra0Var;
        gra0Var.f83707m.mo39322o();
        r55Var.f31643a.mo31986a(cra0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m39770a() {
        gra0 gra0Var = this.f62049a;
        ((xy3) gra0Var.f83701g).m92400e("session_ui_plugins_on_ui_visible");
        Iterator it = gra0Var.f83697c.iterator();
        while (it.hasNext()) {
            ((jvb0) it.next()).mo26289c();
        }
        ((xy3) gra0Var.f83701g).m92396a("session_ui_plugins_on_ui_visible");
        gra0Var.f83698d.m64702b(kkq.f123687a);
    }

    @Override // p204p.fnj0
    public final void dispose() {
        this.f62049a.f83699e.f31643a.mo31988d(this.f62062n);
        kk40.m56680v(this.f62060l, null);
    }
}
