package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class j3g0 {

    /* JADX INFO: renamed from: a */
    public final t431 f108390a;

    /* JADX INFO: renamed from: b */
    public final jdp0 f108391b;

    /* JADX INFO: renamed from: c */
    public final vmz f108392c;

    /* JADX INFO: renamed from: e */
    public final irw f108394e;

    /* JADX INFO: renamed from: d */
    public final wg61 f108393d = new wg61(new uqd0(this, 25));

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f108395f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f108396g = new LinkedHashMap();

    public j3g0(t431 t431Var, jdp0 jdp0Var, vmz vmzVar, k7p0 k7p0Var, m500 m500Var) {
        this.f108390a = t431Var;
        this.f108391b = jdp0Var;
        this.f108392c = vmzVar;
        this.f108394e = k7p0Var.m55694a(m500Var.f31643a).m77809c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52257a(String str, ibk ibkVar) {
        f3g0 f3g0Var;
        if (ibkVar instanceof f3g0) {
            f3g0Var = (f3g0) ibkVar;
            int i = f3g0Var.f65500d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f3g0Var.f65500d = i - Integer.MIN_VALUE;
            } else {
                f3g0Var = new f3g0(this, ibkVar);
            }
        } else {
            f3g0Var = new f3g0(this, ibkVar);
        }
        Object objM52259c = f3g0Var.f65498b;
        int i2 = f3g0Var.f65500d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM52259c);
            f3g0Var.f65497a = str;
            f3g0Var.f65500d = 1;
            objM52259c = m52259c(f3g0Var);
            if (objM52259c != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = f3g0Var.f65497a;
            bga.m29073P(objM52259c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = f3g0Var.f65497a;
            bga.m29073P(objM52259c);
        }
        this.f108395f.put(str, ((s431) objM52259c).f205428a);
        return w2a1Var;
        if (!((Boolean) objM52259c).booleanValue()) {
            return w2a1Var;
        }
        LinkedHashMap linkedHashMap = this.f108396g;
        Disposable disposable = (Disposable) linkedHashMap.get(str);
        if (disposable != null) {
            disposable.dispose();
        }
        wg61 wg61Var = this.f108393d;
        linkedHashMap.put(str, ((hy21) ((kx21) wg61Var.getValue())).m49110d(str).subscribe());
        Observable observableM49110d = ((hy21) ((kx21) wg61Var.getValue())).m49110d(str);
        f3g0Var.f65497a = str;
        f3g0Var.f65500d = 2;
        objM52259c = zn91.m96571q(observableM49110d, 1, null, f3g0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m52258b(String str) {
        Disposable disposable = (Disposable) this.f108396g.remove(str);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m52259c(ibk ibkVar) {
        g3g0 g3g0Var;
        boolean zM37217F;
        if (ibkVar instanceof g3g0) {
            g3g0Var = (g3g0) ibkVar;
            int i = g3g0Var.f76212c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3g0Var.f76212c = i - Integer.MIN_VALUE;
            } else {
                g3g0Var = new g3g0(this, ibkVar);
            }
        } else {
            g3g0Var = new g3g0(this, ibkVar);
        }
        Object objM86755t = g3g0Var.f76210a;
        int i2 = g3g0Var.f76212c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86755t);
                yab yabVar = this.f108392c.f242953a;
                g3g0Var.f76212c = 1;
                objM86755t = vyf1.m86755t(yabVar, g3g0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
            }
            zM37217F = dxf1.m37217F((Map) objM86755t);
        } catch (Throwable unused) {
            zM37217F = false;
        }
        return Boolean.valueOf(zM37217F);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4 A[Catch: all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00bb, blocks: (B:14:0x0030, B:38:0x00a4), top: B:45:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (p204p.zn91.m96565n(r12, r0) == r8) goto L40;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52260d(String str, ibk ibkVar) {
        h3g0 h3g0Var;
        r431 r431Var;
        Object objM52259c;
        Object objM96571q;
        if (ibkVar instanceof h3g0) {
            h3g0Var = (h3g0) ibkVar;
            int i = h3g0Var.f87228e;
            if ((i & Integer.MIN_VALUE) != 0) {
                h3g0Var.f87228e = i - Integer.MIN_VALUE;
            } else {
                h3g0Var = new h3g0(this, ibkVar);
            }
        } else {
            h3g0Var = new h3g0(this, ibkVar);
        }
        Object obj = h3g0Var.f87226c;
        int i2 = h3g0Var.f87228e;
        wg61 wg61Var = this.f108393d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                r431Var = (r431) this.f108395f.remove(str);
                if (r431Var == null) {
                    m52258b(str);
                    return w2a1Var;
                }
                h3g0Var.f87224a = str;
                h3g0Var.f87225b = r431Var;
                h3g0Var.f87228e = 1;
                objM52259c = m52259c(h3g0Var);
                if (objM52259c != obj2) {
                }
                return obj2;
            }
            if (i2 == 1) {
                r431 r431Var2 = h3g0Var.f87225b;
                String str2 = h3g0Var.f87224a;
                bga.m29073P(obj);
                r431Var = r431Var2;
                str = str2;
                objM52259c = obj;
            } else if (i2 == 2) {
                r431 r431Var3 = h3g0Var.f87225b;
                String str3 = h3g0Var.f87224a;
                bga.m29073P(obj);
                r431Var = r431Var3;
                str = str3;
                objM96571q = obj;
                if (((s431) objM96571q).f205428a != r431.f195645a) {
                    m52258b(str);
                    return w2a1Var;
                }
                Completable completableM49111e = ((hy21) ((kx21) wg61Var.getValue())).m49111e(str, r431Var, null);
                h3g0Var.f87224a = str;
                h3g0Var.f87225b = null;
                h3g0Var.f87228e = 3;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = h3g0Var.f87224a;
                bga.m29073P(obj);
            }
            m52258b(str);
            return w2a1Var;
            if (!((Boolean) objM52259c).booleanValue()) {
                m52258b(str);
                return w2a1Var;
            }
            Observable observableM49110d = ((hy21) ((kx21) wg61Var.getValue())).m49110d(str);
            h3g0Var.f87224a = str;
            h3g0Var.f87225b = r431Var;
            h3g0Var.f87228e = 2;
            objM96571q = zn91.m96571q(observableM49110d, 1, null, h3g0Var);
            if (objM96571q != obj2) {
                if (((s431) objM96571q).f205428a != r431.f195645a) {
                    m52258b(str);
                    return w2a1Var;
                }
                Completable completableM49111e2 = ((hy21) ((kx21) wg61Var.getValue())).m49111e(str, r431Var, null);
                h3g0Var.f87224a = str;
                h3g0Var.f87225b = null;
                h3g0Var.f87228e = 3;
            }
            return obj2;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a5 A[Catch: all -> 0x00bb, TRY_ENTER, TryCatch #0 {all -> 0x00bb, blocks: (B:15:0x0031, B:45:0x00b9, B:42:0x00a5), top: B:48:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (p204p.zn91.m96565n(r11, r0) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        if (r11 == r8) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52261e(String str, ibk ibkVar) {
        i3g0 i3g0Var;
        String str2;
        if (ibkVar instanceof i3g0) {
            i3g0Var = (i3g0) ibkVar;
            int i = i3g0Var.f98177e;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3g0Var.f98177e = i - Integer.MIN_VALUE;
            } else {
                i3g0Var = new i3g0(this, ibkVar);
            }
        } else {
            i3g0Var = new i3g0(this, ibkVar);
        }
        Object objM79833n = i3g0Var.f98175c;
        int i2 = i3g0Var.f98177e;
        Object c6x0Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM79833n);
                    i3g0Var.f98173a = str;
                    i3g0Var.f98177e = 1;
                    objM79833n = m52259c(i3g0Var);
                    if (objM79833n != obj) {
                    }
                    str2 = str;
                    str = str2;
                    str = str;
                    return obj;
                }
                if (i2 == 1) {
                    String str3 = i3g0Var.f98173a;
                    bga.m29073P(objM79833n);
                    str2 = str3;
                } else {
                    if (i2 == 2) {
                        String str4 = i3g0Var.f98173a;
                        bga.m29073P(objM79833n);
                        str = str4;
                        str = str2;
                        i3g0Var.f98173a = null;
                        i3g0Var.f98174b = c6x0Var;
                        i3g0Var.f98177e = 3;
                        objM79833n = t0j.m79833n(this.f108391b, str, i3g0Var);
                        if (objM79833n != obj) {
                            str = c6x0Var;
                            if (((Boolean) objM79833n).booleanValue()) {
                                Single singleMo51472a = this.f108394e.mo51472a(false);
                                i3g0Var.f98173a = null;
                                i3g0Var.f98174b = str;
                                i3g0Var.f98177e = 4;
                                objM79833n = zn91.m96567o(singleMo51472a, i3g0Var);
                            }
                            return str;
                        }
                        str2 = str;
                        str = str2;
                        str = str;
                        return obj;
                    }
                    if (i2 == 3) {
                        Object obj2 = i3g0Var.f98174b;
                        bga.m29073P(objM79833n);
                        str = obj2;
                        if (((Boolean) objM79833n).booleanValue()) {
                            Single singleMo51472a2 = this.f108394e.mo51472a(false);
                            i3g0Var.f98173a = null;
                            i3g0Var.f98174b = str;
                            i3g0Var.f98177e = 4;
                            objM79833n = zn91.m96567o(singleMo51472a2, i3g0Var);
                        }
                        return str;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = i3g0Var.f98174b;
                    bga.m29073P(objM79833n);
                    str = obj3;
                }
                str = str;
                return str;
                str2 = str;
                if (!((Boolean) objM79833n).booleanValue()) {
                    return c6x0Var;
                }
                Completable completableM49111e = ((hy21) ((kx21) this.f108393d.getValue())).m49111e(str2, r431.f195645a, null);
                i3g0Var.f98173a = str2;
                i3g0Var.f98174b = null;
                i3g0Var.f98177e = 2;
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
    }
}
