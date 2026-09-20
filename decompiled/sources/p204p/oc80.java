package p204p;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oc80 extends gb80 {

    /* JADX INFO: renamed from: b */
    public final boolean f163855b;

    /* JADX INFO: renamed from: c */
    public zdy f163856c = new zdy();

    /* JADX INFO: renamed from: d */
    public fb80 f163857d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f163858e;

    /* JADX INFO: renamed from: f */
    public int f163859f;

    /* JADX INFO: renamed from: g */
    public boolean f163860g;

    /* JADX INFO: renamed from: h */
    public boolean f163861h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f163862i;

    /* JADX INFO: renamed from: j */
    public final zv41 f163863j;

    public oc80(hc80 hc80Var, boolean z) {
        this.f163855b = z;
        fb80 fb80Var = fb80.f67751b;
        this.f163857d = fb80Var;
        this.f163862i = new ArrayList();
        this.f163858e = new WeakReference(hc80Var);
        this.f163863j = jag1.m52819d(fb80Var);
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: a */
    public final void mo31986a(gc80 gc80Var) {
        zb80 sr0Var;
        Object obj;
        hc80 hc80Var;
        ta80 ta80Var;
        m66675f("addObserver");
        fb80 fb80Var = this.f163857d;
        fb80 fb80Var2 = fb80.f67750a;
        if (fb80Var != fb80Var2) {
            fb80Var2 = fb80.f67751b;
        }
        nc80 nc80Var = new nc80();
        HashMap map = cd80.f36830a;
        boolean z = gc80Var instanceof zb80;
        boolean z2 = gc80Var instanceof onp;
        int i = 3;
        if (z && z2) {
            sr0Var = new qnp((onp) gc80Var, (zb80) gc80Var);
        } else if (z2) {
            sr0Var = new qnp((onp) gc80Var, null);
        } else if (z) {
            sr0Var = (zb80) gc80Var;
        } else {
            Class<?> cls = gc80Var.getClass();
            if (cd80.m32430b(cls) == 2) {
                Object obj2 = cd80.f36831b.get(cls);
                wj50.m88279p(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    cd80.m32429a((Constructor) list.get(0), gc80Var);
                    throw null;
                }
                int size = list.size();
                b110[] b110VarArr = new b110[size];
                if (size > 0) {
                    cd80.m32429a((Constructor) list.get(0), gc80Var);
                    throw null;
                }
                sr0Var = new ne2(b110VarArr, i);
            } else {
                sr0Var = new sr0(gc80Var);
            }
        }
        nc80Var.f152460b = sr0Var;
        nc80Var.f152459a = fb80Var2;
        zdy zdyVar = this.f163856c;
        qzx0 qzx0VarMo84312a = zdyVar.mo84312a(gc80Var);
        if (qzx0VarMo84312a != null) {
            obj = qzx0VarMo84312a.f194329b;
        } else {
            HashMap map2 = zdyVar.f281835e;
            qzx0 qzx0Var = new qzx0(gc80Var, nc80Var);
            zdyVar.f235655d++;
            qzx0 qzx0Var2 = zdyVar.f235653b;
            if (qzx0Var2 == null) {
                zdyVar.f235652a = qzx0Var;
                zdyVar.f235653b = qzx0Var;
            } else {
                qzx0Var2.f194330c = qzx0Var;
                qzx0Var.f194331d = qzx0Var2;
                zdyVar.f235653b = qzx0Var;
            }
            map2.put(gc80Var, qzx0Var);
            obj = null;
        }
        if (((nc80) obj) == null && (hc80Var = (hc80) this.f163858e.get()) != null) {
            boolean z3 = this.f163859f != 0 || this.f163860g;
            fb80 fb80VarM66674e = m66674e(gc80Var);
            this.f163859f++;
            while (nc80Var.f152459a.compareTo(fb80VarM66674e) < 0 && this.f163856c.f281835e.containsKey(gc80Var)) {
                fb80 fb80Var3 = nc80Var.f152459a;
                ArrayList arrayList = this.f163862i;
                arrayList.add(fb80Var3);
                ra80 ra80Var = ta80.Companion;
                fb80 fb80Var4 = nc80Var.f152459a;
                ra80Var.getClass();
                int iOrdinal = fb80Var4.ordinal();
                if (iOrdinal == 1) {
                    ta80Var = ta80.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ta80Var = iOrdinal != 3 ? null : ta80.ON_RESUME;
                } else {
                    ta80Var = ta80.ON_START;
                }
                if (ta80Var == null) {
                    throw new IllegalStateException("no event up from " + nc80Var.f152459a);
                }
                nc80Var.m64124a(hc80Var, ta80Var);
                arrayList.remove(arrayList.size() - 1);
                fb80VarM66674e = m66674e(gc80Var);
            }
            if (!z3) {
                m66679j();
            }
            this.f163859f--;
        }
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: b */
    public final fb80 mo31987b() {
        return this.f163857d;
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: c */
    public final nuu0 mo44208c() {
        return bzf1.m31021m(this.f163863j);
    }

    @Override // p204p.gb80
    /* JADX INFO: renamed from: d */
    public final void mo31988d(gc80 gc80Var) {
        m66675f("removeObserver");
        this.f163856c.mo84313b(gc80Var);
    }

    /* JADX INFO: renamed from: e */
    public final fb80 m66674e(gc80 gc80Var) {
        HashMap map = this.f163856c.f281835e;
        qzx0 qzx0Var = map.containsKey(gc80Var) ? ((qzx0) map.get(gc80Var)).f194331d : null;
        fb80 fb80Var = qzx0Var != null ? ((nc80) qzx0Var.f194329b).f152459a : null;
        ArrayList arrayList = this.f163862i;
        return w9h1.m87515w(w9h1.m87515w(this.f163857d, fb80Var), arrayList.isEmpty() ? null : (fb80) edb.m38559h(1, arrayList));
    }

    /* JADX INFO: renamed from: f */
    public final void m66675f(String str) {
        if (this.f163855b && !dul.m37016s()) {
            throw new IllegalStateException(s571.m77251j("Method ", str, " must be called on the main thread").toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m66676g(ta80 ta80Var) {
        m66675f("handleLifecycleEvent");
        m66677h(ta80Var.m80335a());
    }

    /* JADX INFO: renamed from: h */
    public final void m66677h(fb80 fb80Var) {
        if (this.f163857d == fb80Var) {
            return;
        }
        exb.m40213k((hc80) this.f163858e.get(), this.f163857d, fb80Var);
        this.f163857d = fb80Var;
        if (this.f163860g || this.f163859f != 0) {
            this.f163861h = true;
            return;
        }
        this.f163860g = true;
        m66679j();
        this.f163860g = false;
        if (this.f163857d == fb80.f67750a) {
            this.f163856c = new zdy();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m66678i(fb80 fb80Var) {
        m66675f("setCurrentState");
        m66677h(fb80Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m66679j() {
        ta80 ta80Var;
        ta80 ta80Var2;
        hc80 hc80Var = (hc80) this.f163858e.get();
        if (hc80Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            zdy zdyVar = this.f163856c;
            if (zdyVar.f235655d != 0) {
                qzx0 qzx0Var = zdyVar.f235652a;
                wj50.m88279p(qzx0Var);
                fb80 fb80Var = ((nc80) qzx0Var.f194329b).f152459a;
                qzx0 qzx0Var2 = this.f163856c.f235653b;
                wj50.m88279p(qzx0Var2);
                fb80 fb80Var2 = ((nc80) qzx0Var2.f194329b).f152459a;
                if (fb80Var == fb80Var2 && this.f163857d == fb80Var2) {
                    break;
                }
                this.f163861h = false;
                fb80 fb80Var3 = this.f163857d;
                qzx0 qzx0Var3 = this.f163856c.f235652a;
                wj50.m88279p(qzx0Var3);
                int iCompareTo = fb80Var3.compareTo(((nc80) qzx0Var3.f194329b).f152459a);
                ArrayList arrayList = this.f163862i;
                if (iCompareTo < 0) {
                    zdy zdyVar2 = this.f163856c;
                    pzx0 pzx0Var = new pzx0(zdyVar2.f235653b, zdyVar2.f235652a);
                    zdyVar2.f235654c.put(pzx0Var, Boolean.FALSE);
                    while (pzx0Var.hasNext() && !this.f163861h) {
                        Map.Entry entry = (Map.Entry) pzx0Var.next();
                        wj50.m88279p(entry);
                        gc80 gc80Var = (gc80) entry.getKey();
                        nc80 nc80Var = (nc80) entry.getValue();
                        while (nc80Var.f152459a.compareTo(this.f163857d) > 0 && !this.f163861h && this.f163856c.f281835e.containsKey(gc80Var)) {
                            ra80 ra80Var = ta80.Companion;
                            fb80 fb80Var4 = nc80Var.f152459a;
                            ra80Var.getClass();
                            int iOrdinal = fb80Var4.ordinal();
                            if (iOrdinal == 2) {
                                ta80Var2 = ta80.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                ta80Var2 = iOrdinal != 4 ? null : ta80.ON_PAUSE;
                            } else {
                                ta80Var2 = ta80.ON_STOP;
                            }
                            if (ta80Var2 == null) {
                                throw new IllegalStateException("no event down from " + nc80Var.f152459a);
                            }
                            arrayList.add(ta80Var2.m80335a());
                            nc80Var.m64124a(hc80Var, ta80Var2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                qzx0 qzx0Var4 = this.f163856c.f235653b;
                if (!this.f163861h && qzx0Var4 != null && this.f163857d.compareTo(((nc80) qzx0Var4.f194329b).f152459a) > 0) {
                    zdy zdyVar3 = this.f163856c;
                    zdyVar3.getClass();
                    rzx0 rzx0Var = new rzx0(zdyVar3);
                    zdyVar3.f235654c.put(rzx0Var, Boolean.FALSE);
                    while (rzx0Var.hasNext() && !this.f163861h) {
                        Map.Entry entry2 = (Map.Entry) rzx0Var.next();
                        gc80 gc80Var2 = (gc80) entry2.getKey();
                        nc80 nc80Var2 = (nc80) entry2.getValue();
                        while (nc80Var2.f152459a.compareTo(this.f163857d) < 0 && !this.f163861h && this.f163856c.f281835e.containsKey(gc80Var2)) {
                            arrayList.add(nc80Var2.f152459a);
                            ra80 ra80Var2 = ta80.Companion;
                            fb80 fb80Var5 = nc80Var2.f152459a;
                            ra80Var2.getClass();
                            int iOrdinal2 = fb80Var5.ordinal();
                            if (iOrdinal2 == 1) {
                                ta80Var = ta80.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                ta80Var = iOrdinal2 != 3 ? null : ta80.ON_RESUME;
                            } else {
                                ta80Var = ta80.ON_START;
                            }
                            if (ta80Var == null) {
                                throw new IllegalStateException("no event up from " + nc80Var2.f152459a);
                            }
                            nc80Var2.m64124a(hc80Var, ta80Var);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f163861h = false;
        this.f163863j.m97090l(this.f163857d);
    }
}
