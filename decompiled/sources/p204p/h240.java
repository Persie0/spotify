package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class h240 implements z140 {

    /* JADX INFO: renamed from: a */
    public final j240 f86884a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f86885b;

    /* JADX INFO: renamed from: e */
    public final c9k f86888e;

    /* JADX INFO: renamed from: f */
    public final c9k f86889f;

    /* JADX INFO: renamed from: g */
    public volatile di41 f86890g;

    /* JADX INFO: renamed from: c */
    public final zv41 f86886c = jag1.m52819d(pg5.f177228a);

    /* JADX INFO: renamed from: d */
    public final lsi0 f86887d = msi0.m62770a();

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f86891h = new LinkedHashSet();

    public h240(j240 j240Var, ArrayList arrayList, luk lukVar, luk lukVar2) {
        this.f86884a = j240Var;
        this.f86885b = arrayList;
        this.f86888e = kk40.m56661c(cct.m32296A(lukVar, njg1.m64613f()).mo26608y(new uuk("IdleManagerScope")).mo26608y(new g12(8)));
        this.f86889f = kk40.m56661c(cct.m32296A(lukVar2, njg1.m64613f()).mo26608y(new uuk("IdleManager-AuditScope")).mo26608y(new g12(9)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m46470a(h240 h240Var, ibk ibkVar) {
        g240 g240Var;
        lsi0 lsi0Var;
        if (ibkVar instanceof g240) {
            g240Var = (g240) ibkVar;
            int i = g240Var.f75833d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g240Var.f75833d = i - Integer.MIN_VALUE;
            } else {
                g240Var = new g240(h240Var, ibkVar);
            }
        } else {
            g240Var = new g240(h240Var, ibkVar);
        }
        Object obj = g240Var.f75831b;
        int i2 = g240Var.f75833d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lsi0 lsi0Var2 = h240Var.f86887d;
            g240Var.f75830a = lsi0Var2;
            g240Var.f75833d = 1;
            Object objMo54248a = lsi0Var2.mo54248a(g240Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
            lsi0Var = lsi0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0Var = g240Var.f75830a;
            bga.m29073P(obj);
        }
        try {
            x0h1.m89578u(h240Var.f86889f, null, 0, new y22(h240Var, null, 9), 3);
            zv41 zv41Var = h240Var.f86886c;
            pg5 pg5Var = pg5.f177228a;
            zv41Var.getClass();
            zv41Var.m97091m(null, pg5Var);
            return w2a1.f247311a;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m46471b(MusicAppLock musicAppLock) {
        x0h1.m89581x(dau.f47107a, new lw2(this, musicAppLock, null, 18));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m46472c(MusicAppLock musicAppLock, ibk ibkVar) {
        b240 b240Var;
        lsi0 lsi0Var;
        if (ibkVar instanceof b240) {
            b240Var = (b240) ibkVar;
            int i = b240Var.f22496e;
            if ((i & Integer.MIN_VALUE) != 0) {
                b240Var.f22496e = i - Integer.MIN_VALUE;
            } else {
                b240Var = new b240(this, ibkVar);
            }
        } else {
            b240Var = new b240(this, ibkVar);
        }
        Object obj = b240Var.f22494c;
        int i2 = b240Var.f22496e;
        if (i2 == 0) {
            bga.m29073P(obj);
            b240Var.f22492a = musicAppLock;
            lsi0Var = this.f86887d;
            b240Var.f22493b = lsi0Var;
            b240Var.f22496e = 1;
            Object objMo54248a = lsi0Var.mo54248a(b240Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = b240Var.f22493b;
            MusicAppLock musicAppLock2 = b240Var.f22492a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            musicAppLock = musicAppLock2;
        }
        try {
            m46474e(musicAppLock);
            return w2a1.f247311a;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m46473d() {
        di41 di41Var = this.f86890g;
        if (di41Var != null) {
            di41Var.mo38779R(new CancellationException("IdleTimer is cancelled"));
            x0h1.m89578u(this.f86889f, null, 0, new c240(this, null, 0), 3);
            this.f86890g = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m46474e(MusicAppLock musicAppLock) {
        LinkedHashSet linkedHashSet = this.f86891h;
        boolean zAdd = linkedHashSet.add(musicAppLock);
        c9k c9kVar = this.f86889f;
        fbk fbkVar = null;
        if (zAdd) {
            x0h1.m89578u(c9kVar, null, 0, new cv0(this, (fbk) null, musicAppLock), 3);
            zv41 zv41Var = this.f86886c;
            if (wj50.m88271j(zv41Var.getValue(), pg5.f177228a)) {
                x0h1.m89578u(c9kVar, null, 0, new c240(this, fbkVar, 1), 3);
                zv41Var.getClass();
                zv41Var.m97091m(null, og5.f164996a);
            }
            m46473d();
            if (linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                m46479j(((jdi0) this.f86884a).f111358b);
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (!((MusicAppLock) it.next()).getWeak()) {
                    }
                }
                linkedHashSet.clear();
                m46479j(((jdi0) this.f86884a).f111358b);
            }
        } else {
            linkedHashSet.remove(musicAppLock);
            linkedHashSet.add(musicAppLock);
            x0h1.m89578u(c9kVar, null, 0, new d240(this, fbkVar, musicAppLock, 0), 3);
        }
        Logger.m3965a(s571.m77251j("Locks: ", g6f.m43753y0(linkedHashSet, ", ", "[", "]", null, 56), " after acquire"), new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public final void m46475f(MusicAppLock musicAppLock) {
        LinkedHashSet linkedHashSet = this.f86891h;
        boolean zRemove = linkedHashSet.remove(musicAppLock);
        fbk fbkVar = null;
        c9k c9kVar = this.f86889f;
        if (zRemove) {
            x0h1.m89578u(c9kVar, null, 0, new d240(this, fbkVar, musicAppLock, 1), 3);
            boolean z = true;
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (!((MusicAppLock) it.next()).getWeak()) {
                        z = false;
                        break;
                    }
                }
            }
            if (linkedHashSet.isEmpty() || z) {
                j240 j240Var = this.f86884a;
                long j = z ? ((jdi0) j240Var).f111358b : ((jdi0) j240Var).f111357a;
                linkedHashSet.clear();
                Logger.m3965a(edb.m38562k(j / ((long) 1000), "Starting timeout: ", " sec"), new Object[0]);
                m46479j(j);
            }
        } else {
            x0h1.m89578u(c9kVar, null, 0, new d240(this, fbkVar, musicAppLock, 2), 3);
        }
        Logger.m3965a(s571.m77251j("Locks: ", g6f.m43753y0(linkedHashSet, ", ", "[", "]", null, 56), " after release"), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m46476g(ibk ibkVar) {
        e240 e240Var;
        lsi0 lsi0Var;
        if (ibkVar instanceof e240) {
            e240Var = (e240) ibkVar;
            int i = e240Var.f55342d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e240Var.f55342d = i - Integer.MIN_VALUE;
            } else {
                e240Var = new e240(this, ibkVar);
            }
        } else {
            e240Var = new e240(this, ibkVar);
        }
        Object obj = e240Var.f55340b;
        int i2 = e240Var.f55342d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lsi0 lsi0Var2 = this.f86887d;
            e240Var.f55339a = lsi0Var2;
            e240Var.f55342d = 1;
            Object objMo54248a = lsi0Var2.mo54248a(e240Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
            lsi0Var = lsi0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0Var = e240Var.f55339a;
            bga.m29073P(obj);
        }
        fbk fbkVar = null;
        try {
            Iterator it = g6f.m43728j1(this.f86891h).iterator();
            while (it.hasNext()) {
                m46475f((MusicAppLock) it.next());
            }
            m46473d();
            x0h1.m89578u(this.f86889f, null, 0, new y22(this, fbkVar, 9), 3);
            zv41 zv41Var = this.f86886c;
            pg5 pg5Var = pg5.f177228a;
            zv41Var.getClass();
            zv41Var.m97091m(null, pg5Var);
            return w2a1.f247311a;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46477h(MusicAppLock musicAppLock) {
        x0h1.m89581x(dau.f47107a, new f620(this, musicAppLock, null, 13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m46478i(MusicAppLock musicAppLock, ibk ibkVar) {
        f240 f240Var;
        lsi0 lsi0Var;
        if (ibkVar instanceof f240) {
            f240Var = (f240) ibkVar;
            int i = f240Var.f65109e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f240Var.f65109e = i - Integer.MIN_VALUE;
            } else {
                f240Var = new f240(this, ibkVar);
            }
        } else {
            f240Var = new f240(this, ibkVar);
        }
        Object obj = f240Var.f65107c;
        int i2 = f240Var.f65109e;
        if (i2 == 0) {
            bga.m29073P(obj);
            f240Var.f65105a = musicAppLock;
            lsi0Var = this.f86887d;
            f240Var.f65106b = lsi0Var;
            f240Var.f65109e = 1;
            Object objMo54248a = lsi0Var.mo54248a(f240Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = f240Var.f65106b;
            MusicAppLock musicAppLock2 = f240Var.f65105a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            musicAppLock = musicAppLock2;
        }
        try {
            m46475f(musicAppLock);
            return w2a1.f247311a;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m46479j(long j) {
        fbk fbkVar = null;
        this.f86890g = x0h1.m89578u(this.f86888e, null, 0, new gu4(j, this, fbkVar, 8), 3);
        x0h1.m89578u(this.f86889f, null, 0, new c240(this, fbkVar, 2), 3);
    }
}
