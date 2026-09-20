package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class v7i0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2609yd f238191a;

    /* JADX INFO: renamed from: b */
    public final boolean f238192b;

    /* JADX INFO: renamed from: c */
    public final scd1 f238193c;

    /* JADX INFO: renamed from: d */
    public s9p0 f238194d;

    /* JADX INFO: renamed from: e */
    public lg21 f238195e;

    /* JADX INFO: renamed from: f */
    public VideoSurfaceView f238196f;

    /* JADX INFO: renamed from: g */
    public final String f238197g = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h */
    public final zv41 f238198h;

    /* JADX INFO: renamed from: i */
    public final nnc f238199i;

    public v7i0(InterfaceC2609yd interfaceC2609yd, boolean z, scd1 scd1Var) {
        this.f238191a = interfaceC2609yd;
        this.f238192b = z;
        this.f238193c = scd1Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f238198h = zv41VarM52819d;
        this.f238199i = xtm0.m92074U(zv41VarM52819d, new zv3(11));
    }

    /* JADX INFO: renamed from: a */
    public final void m84850a(s9p0 s9p0Var, xzb1 xzb1Var) {
        vsb1 vsb1VarM92448c;
        String strM93802o;
        zv41 zv41Var;
        lg21 lg21Var;
        if (!s9p0Var.equals(this.f238194d)) {
            m84852c();
        }
        this.f238194d = s9p0Var;
        if (!xzb1Var.m92446a() || (vsb1VarM92448c = xzb1Var.m92448c()) == null || !vsb1VarM92448c.m86306c() || !this.f238191a.mo76359a(4) || this.f238192b) {
            m84852c();
            return;
        }
        s9p0 s9p0Var2 = this.f238194d;
        int i = 0;
        scd1 scd1Var = this.f238193c;
        if (s9p0Var2 != null) {
            b7g0 b7g0Var = null;
            if (((Boolean) s9p0Var2.f206993b.getValue()).booleanValue()) {
                lg21 lg21Var2 = this.f238195e;
                if (lg21Var2 == null || ((Boolean) lg21Var2.f133058d.m79675a().getValue()).booleanValue()) {
                    LinkedList linkedList = scd1Var.f207690a;
                    linkedList.removeIf(rcd1.f197848b);
                    while (true) {
                        u9p0 u9p0Var = s9p0Var2.f206994c;
                        if ((u9p0Var != null ? u9p0Var.f228247d.m81949a().size() : 0) != 0 || linkedList.isEmpty()) {
                            break;
                        }
                        WeakReference weakReference = (WeakReference) linkedList.poll();
                        if (weakReference != null && (lg21Var = (lg21) weakReference.get()) != null) {
                            lg21Var.m58929h();
                        }
                    }
                    lg21 lg21VarM77588a = s9p0Var2.m77588a();
                    if (lg21VarM77588a != null) {
                        linkedList.add(new WeakReference(lg21VarM77588a));
                    } else {
                        lg21VarM77588a = null;
                    }
                    this.f238195e = lg21VarM77588a;
                }
                lg21 lg21Var3 = this.f238195e;
                if (lg21Var3 != null) {
                    lg21Var3.m58931j(this.f238196f);
                }
            }
            lg21 lg21Var4 = this.f238195e;
            if (lg21Var4 != null && (zv41Var = lg21Var4.f133060f) != null) {
                b7g0Var = new b7g0(zv41Var, 1);
            }
            this.f238198h.m97090l(b7g0Var);
        }
        lg21 lg21Var5 = this.f238195e;
        if (lg21Var5 != null) {
            j7i0 j7i0Var = new j7i0(si51.f209361d, null, null, xzb1Var.m92447b(), "", null, 486);
            vsb1 vsb1VarM92448c2 = xzb1Var.m92448c();
            if (vsb1VarM92448c2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            i7i0 i7i0Var = new i7i0(Long.valueOf(vsb1VarM92448c2.mo81409b()), Long.valueOf(vsb1VarM92448c2.mo81408a()));
            if (vsb1VarM92448c2 instanceof tsb1) {
                strM93802o = ((tsb1) vsb1VarM92448c2).m81410d();
            } else {
                if (!(vsb1VarM92448c2 instanceof usb1)) {
                    throw new NoWhenBranchMatchedException();
                }
                strM93802o = yif1.m93802o(((usb1) vsb1VarM92448c2).f233581a);
            }
            lg21Var5.m58924b(new k7i0(strM93802o, j7i0Var, true, i7i0Var, 0L, (h7i0) null, this.f238197g, false, 0, 864));
            lg21.m58922g(lg21Var5, null, null, null, null, 15);
            LinkedList linkedList2 = scd1Var.f207690a;
            Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (wj50.m88271j(((WeakReference) it.next()).get(), lg21Var5)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1 || i == h6f.m46714K(linkedList2)) {
                return;
            }
            linkedList2.add((WeakReference) linkedList2.remove(i));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m84851b() {
        lg21 lg21Var = this.f238195e;
        if (lg21Var != null) {
            lg21Var.m58926d();
            LinkedList linkedList = this.f238193c.f207690a;
            Iterator it = linkedList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (wj50.m88271j(((WeakReference) it.next()).get(), lg21Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > 0) {
                linkedList.addFirst((WeakReference) linkedList.remove(i));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m84852c() {
        lg21 lg21Var = this.f238195e;
        if (lg21Var != null) {
            lg21Var.m58929h();
        }
        this.f238195e = null;
        this.f238198h.m97090l(null);
    }
}
