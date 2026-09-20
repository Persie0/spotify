package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class y0a {

    /* JADX INFO: renamed from: a */
    public final Context f267939a;

    /* JADX INFO: renamed from: b */
    public final hz6 f267940b;

    /* JADX INFO: renamed from: c */
    public final lsi0 f267941c = msi0.m62770a();

    /* JADX INFO: renamed from: d */
    public volatile r0a f267942d;

    public y0a(Context context, hz6 hz6Var) {
        this.f267939a = context;
        this.f267940b = hz6Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[PHI: r12
      0x00b2: PHI (r12v5 ??) = (r12v33 ??), (r12v34 ??), (r12v35 ??) binds: [B:67:0x00ed, B:65:0x00e4, B:51:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4 A[Catch: all -> 0x0035, Exception -> 0x0038, CancellationException -> 0x003b, TimeoutCancellationException -> 0x003e, TRY_ENTER, TryCatch #3 {Exception -> 0x0038, blocks: (B:15:0x0030, B:62:0x00df, B:63:0x00e1, B:28:0x004b, B:58:0x00cb, B:53:0x00b4, B:55:0x00ba, B:59:0x00ce), top: B:73:0x0024, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba A[Catch: all -> 0x0035, Exception -> 0x0038, CancellationException -> 0x003b, TimeoutCancellationException -> 0x003e, TryCatch #3 {Exception -> 0x0038, blocks: (B:15:0x0030, B:62:0x00df, B:63:0x00e1, B:28:0x004b, B:58:0x00cb, B:53:0x00b4, B:55:0x00ba, B:59:0x00ce), top: B:73:0x0024, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ce A[Catch: all -> 0x0035, Exception -> 0x0038, CancellationException -> 0x003b, TimeoutCancellationException -> 0x003e, TryCatch #3 {Exception -> 0x0038, blocks: (B:15:0x0030, B:62:0x00df, B:63:0x00e1, B:28:0x004b, B:58:0x00cb, B:53:0x00b4, B:55:0x00ba, B:59:0x00ce), top: B:73:0x0024, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        if (r13 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.y0a] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v4, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m92555a(List list, ibk ibkVar) throws Throwable {
        s0a s0aVar;
        ?? r12;
        r0a r0aVar;
        ?? r13;
        jsi0 jsi0Var;
        int i;
        ?? r14;
        ?? r5;
        jsi0 jsi0Var2;
        int i2;
        ?? r6;
        jsi0 jsi0Var3;
        int i3;
        jsi0 jsi0Var4;
        jsi0 jsi0Var5;
        if (ibkVar instanceof s0a) {
            s0aVar = (s0a) ibkVar;
            int i4 = s0aVar.f204332g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s0aVar.f204332g = i4 - Integer.MIN_VALUE;
            } else {
                s0aVar = new s0a(this, ibkVar);
            }
        } else {
            s0aVar = new s0a(this, ibkVar);
        }
        Object objM92557c = s0aVar.f204330e;
        yuk yukVar = yuk.f276404a;
        int i5 = s0aVar.f204332g;
        try {
            try {
                try {
                    try {
                        if (i5 == 0) {
                            bga.m29073P(objM92557c);
                            jsi0Var = this.f267941c;
                            s0aVar.f204326a = list;
                            s0aVar.f204327b = jsi0Var;
                            s0aVar.f204328c = 0;
                            s0aVar.f204332g = 1;
                            if (jsi0Var.mo54248a(s0aVar) != yukVar) {
                                i = 0;
                                r14 = list;
                            }
                            jsi0Var5 = jsi0Var2;
                            return yukVar;
                        }
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    jsi0 jsi0Var6 = s0aVar.f204327b;
                                    bga.m29073P(objM92557c);
                                    jsi0Var4 = jsi0Var6;
                                    jsi0Var4 = jsi0Var2;
                                    r0aVar = (r0a) objM92557c;
                                    list = jsi0Var4;
                                    this.f267942d = r0aVar;
                                    r13 = list;
                                    r13.mo54249c(null);
                                    return r0aVar;
                                }
                                if (i5 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                jsi0 jsi0Var7 = s0aVar.f204327b;
                                bga.m29073P(objM92557c);
                                jsi0Var5 = jsi0Var7;
                                jsi0Var5 = jsi0Var2;
                                r0aVar = (r0a) objM92557c;
                                list = jsi0Var5;
                                this.f267942d = r0aVar;
                                r13 = list;
                                r13.mo54249c(null);
                                return r0aVar;
                            }
                            i3 = s0aVar.f204329d;
                            i = s0aVar.f204328c;
                            jsi0Var3 = s0aVar.f204327b;
                            List list2 = s0aVar.f204326a;
                            try {
                                bga.m29073P(objM92557c);
                                r6 = list2;
                                i2 = i3;
                                jsi0Var2 = jsi0Var3;
                                r5 = r6;
                                r12 = jsi0Var2;
                                if (((pz6) this.f267940b).f183611a.getMode() != 3) {
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        s0aVar.f204326a = null;
                                        s0aVar.f204327b = jsi0Var2;
                                        s0aVar.f204328c = i;
                                        s0aVar.f204329d = i2;
                                        s0aVar.f204332g = 3;
                                        objM92557c = m92556b(r5, s0aVar);
                                        if (objM92557c == yukVar) {
                                            jsi0Var4 = jsi0Var2;
                                        }
                                        jsi0Var4 = jsi0Var2;
                                        r0aVar = (r0a) objM92557c;
                                        list = jsi0Var4;
                                        this.f267942d = r0aVar;
                                        r13 = list;
                                    } else {
                                        s0aVar.f204326a = null;
                                        s0aVar.f204327b = jsi0Var2;
                                        s0aVar.f204328c = i;
                                        s0aVar.f204329d = i2;
                                        s0aVar.f204332g = 4;
                                        objM92557c = m92557c(s0aVar);
                                    }
                                    jsi0Var5 = jsi0Var2;
                                    return yukVar;
                                }
                                r0aVar = null;
                                r13 = r12;
                                r13.mo54249c(null);
                                return r0aVar;
                            } catch (Throwable th) {
                                th = th;
                                list = jsi0Var3;
                                list.mo54249c(null);
                                throw th;
                            }
                        }
                        int i6 = s0aVar.f204328c;
                        jsi0 jsi0Var8 = s0aVar.f204327b;
                        List list3 = s0aVar.f204326a;
                        bga.m29073P(objM92557c);
                        jsi0Var = jsi0Var8;
                        i = i6;
                        r14 = list3;
                        r0a r0aVar2 = this.f267942d;
                        if (r0aVar2 == null) {
                            r5 = r14;
                            jsi0Var2 = jsi0Var;
                            i2 = 0;
                            r12 = jsi0Var2;
                            if (((pz6) this.f267940b).f183611a.getMode() != 3) {
                                r0aVar = null;
                                r13 = r12;
                            } else if (Build.VERSION.SDK_INT >= 31) {
                                s0aVar.f204326a = null;
                                s0aVar.f204327b = jsi0Var2;
                                s0aVar.f204328c = i;
                                s0aVar.f204329d = i2;
                                s0aVar.f204332g = 3;
                                objM92557c = m92556b(r5, s0aVar);
                                if (objM92557c == yukVar) {
                                    jsi0Var4 = jsi0Var2;
                                }
                                jsi0Var4 = jsi0Var2;
                                r0aVar = (r0a) objM92557c;
                                list = jsi0Var4;
                                this.f267942d = r0aVar;
                                r13 = list;
                            } else {
                                s0aVar.f204326a = null;
                                s0aVar.f204327b = jsi0Var2;
                                s0aVar.f204328c = i;
                                s0aVar.f204329d = i2;
                                s0aVar.f204332g = 4;
                                objM92557c = m92557c(s0aVar);
                            }
                            r13.mo54249c(null);
                            return r0aVar;
                        }
                        s0aVar.f204326a = r14;
                        s0aVar.f204327b = jsi0Var;
                        s0aVar.f204328c = i;
                        s0aVar.f204329d = 0;
                        s0aVar.f204332g = 2;
                        if (r0aVar2.m74366a(s0aVar) != yukVar) {
                            r6 = r14;
                            jsi0Var3 = jsi0Var;
                            i3 = 0;
                            i2 = i3;
                            jsi0Var2 = jsi0Var3;
                            r5 = r6;
                            r12 = jsi0Var2;
                            if (((pz6) this.f267940b).f183611a.getMode() != 3) {
                                r0aVar = null;
                                r13 = r12;
                            } else if (Build.VERSION.SDK_INT >= 31) {
                                s0aVar.f204326a = null;
                                s0aVar.f204327b = jsi0Var2;
                                s0aVar.f204328c = i;
                                s0aVar.f204329d = i2;
                                s0aVar.f204332g = 3;
                                objM92557c = m92556b(r5, s0aVar);
                                if (objM92557c == yukVar) {
                                    jsi0Var4 = jsi0Var2;
                                }
                                jsi0Var4 = jsi0Var2;
                                r0aVar = (r0a) objM92557c;
                                list = jsi0Var4;
                                this.f267942d = r0aVar;
                                r13 = list;
                            } else {
                                s0aVar.f204326a = null;
                                s0aVar.f204327b = jsi0Var2;
                                s0aVar.f204328c = i;
                                s0aVar.f204329d = i2;
                                s0aVar.f204332g = 4;
                                objM92557c = m92557c(s0aVar);
                            }
                            r13.mo54249c(null);
                            return r0aVar;
                        }
                        jsi0Var5 = jsi0Var2;
                        return yukVar;
                    } catch (Throwable th2) {
                        jsi0 jsi0Var9 = jsi0Var;
                        th = th2;
                        list = jsi0Var9;
                        list.mo54249c(null);
                        throw th;
                    }
                } catch (Exception e) {
                    Logger.m3974j(e, "Bluetooth microphone route activation failed; using phone microphone", new Object[0]);
                    r12 = list;
                }
            } catch (TimeoutCancellationException e2) {
                Logger.m3974j(e2, "Bluetooth microphone route activation timed out; using phone microphone", new Object[0]);
                r12 = list;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fc A[Catch: Exception -> 0x0202, TRY_LEAVE, TryCatch #4 {Exception -> 0x0202, blocks: (B:98:0x01f2, B:100:0x01fc), top: B:114:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:123:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m92556b(List list, ibk ibkVar) throws Exception {
        t0a t0aVar;
        jw6 jw6Var;
        int mode;
        Exception exc;
        cxe cxeVar;
        int i;
        cxe cxeVar2;
        jw6 jw6Var2;
        AtomicBoolean atomicBoolean;
        hb11 hb11Var;
        guf gufVar;
        AudioDeviceInfo audioDeviceInfo;
        Object next;
        char c;
        char c2;
        pz6 pz6Var;
        Object objRemove;
        if (ibkVar instanceof t0a) {
            t0aVar = (t0a) ibkVar;
            int i2 = t0aVar.f215799i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t0aVar.f215799i = i2 - Integer.MIN_VALUE;
            } else {
                t0aVar = new t0a(this, ibkVar);
            }
        } else {
            t0aVar = new t0a(this, ibkVar);
        }
        Object obj = t0aVar.f215797g;
        int i3 = t0aVar.f215799i;
        kz6 kz6Var = kz6.f128021a;
        hz6 hz6Var = this.f267940b;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mode = t0aVar.f215796f;
            cxeVar = t0aVar.f215795e;
            AtomicBoolean atomicBoolean2 = t0aVar.f215794d;
            guf gufVar2 = t0aVar.f215793c;
            hb11Var = t0aVar.f215792b;
            jw6 jw6Var3 = t0aVar.f215791a;
            try {
                bga.m29073P(obj);
                jw6Var2 = jw6Var3;
                cxeVar2 = cxeVar;
                gufVar = gufVar2;
                i = mode;
                atomicBoolean = atomicBoolean2;
                return new r0a(this, i, hb11Var, new v0a(0, atomicBoolean, this, jw6Var2, gufVar, cxeVar2, null));
            } catch (Exception e) {
                exc = e;
                try {
                    kz6Var.m57734b(((pz6) hz6Var).f183611a);
                } catch (Exception e2) {
                    y85.m93061f(exc, e2);
                }
                try {
                    ((pz6) hz6Var).m71696g(mode);
                } catch (Exception e3) {
                    y85.m93061f(exc, e3);
                }
                try {
                    pz6Var = (pz6) hz6Var;
                    objRemove = pz6Var.f183615e.remove(cxeVar);
                    if (objRemove != null) {
                        throw exc;
                    }
                    kz6Var.m57738f(pz6Var.f183611a, objRemove);
                    throw exc;
                } catch (Exception e4) {
                    y85.m93061f(exc, e4);
                    throw exc;
                }
            }
        }
        bga.m29073P(obj);
        pz6 pz6Var2 = (pz6) hz6Var;
        List<AudioDeviceInfo> listM57735c = kz6Var.m57735c(pz6Var2.f183611a);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM57735c, 10));
        Iterator<T> it = listM57735c.iterator();
        while (it.hasNext()) {
            arrayList.add(new kw6((AudioDeviceInfo) it.next()));
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                jw6Var = null;
                break;
            }
            z6z z6zVar = new z6z(btz0.m30480D(new bm9(this, (String) it2.next()), new ek5(arrayList, 1)));
            if (z6zVar.hasNext()) {
                next = z6zVar.next();
                if (z6zVar.hasNext()) {
                    int type = ((jw6) next).getType();
                    if (type == 7) {
                        c = 2;
                    } else if (type != 23) {
                        c = type != 26 ? (char) 65535 : (char) 0;
                    } else {
                        c = 1;
                    }
                    do {
                        Object next2 = z6zVar.next();
                        int type2 = ((jw6) next2).getType();
                        if (type2 == 7) {
                            c2 = 2;
                        } else if (type2 != 23) {
                            c2 = type2 != 26 ? (char) 65535 : (char) 0;
                        } else {
                            c2 = 1;
                        }
                        if (c > c2) {
                            c = c2;
                            next = next2;
                        }
                    } while (z6zVar.hasNext());
                }
            } else {
                next = null;
            }
            jw6 jw6Var4 = (jw6) next;
            if (jw6Var4 != null) {
                jw6Var = jw6Var4;
                break;
            }
        }
        if (jw6Var == null) {
            throw new IllegalStateException(("Bluetooth communication device could not be resolved from " + list.size() + " identifiers and " + arrayList.size() + " available devices").toString());
        }
        new Integer(jw6Var.getType());
        new Integer(arrayList.size());
        mode = pz6Var2.f183611a.getMode();
        guf gufVarM62210c = mlg1.m62210c();
        hb11 hb11VarM52092t = j0g1.m52092t(1, 1, 0, 4);
        guf gufVarM62210c2 = mlg1.m62210c();
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        cxe cxeVar3 = new cxe(jw6Var, gufVarM62210c, atomicBoolean3, hb11VarM52092t, gufVarM62210c2);
        Executor executorM60328F = lzj.m60328F(this.f267939a);
        AudioManager audioManager = pz6Var2.f183611a;
        Object objM57737e = kz6Var.m57737e(new sr5(cxeVar3, 22));
        Object objPut = pz6Var2.f183615e.put(cxeVar3, objM57737e);
        if (objPut != null) {
            kz6Var.m57738f(audioManager, objPut);
        }
        kz6Var.m57733a(audioManager, executorM60328F, objM57737e);
        try {
            ((pz6) hz6Var).m71696g(3);
            pz6 pz6Var3 = (pz6) hz6Var;
            pz6Var3.getClass();
            kw6 kw6Var = jw6Var instanceof kw6 ? (kw6) jw6Var : null;
            if (!((kw6Var == null || (audioDeviceInfo = kw6Var.f127013a) == null) ? false : kz6Var.m57739g(pz6Var3.f183611a, audioDeviceInfo))) {
                throw new IllegalStateException("Communication-device request rejected");
            }
            AudioDeviceInfo audioDeviceInfoM57736d = kz6Var.m57736d(((pz6) hz6Var).f183611a);
            kw6 kw6Var2 = audioDeviceInfoM57736d != null ? new kw6(audioDeviceInfoM57736d) : null;
            if (kw6Var2 != null && kw6Var2.f127013a.getId() == jw6Var.getId()) {
                gufVarM62210c.m38797k0(w2a1.f247311a);
            }
            u0a u0aVar = new u0a(gufVarM62210c, null, 0);
            t0aVar.f215791a = jw6Var;
            t0aVar.f215792b = hb11VarM52092t;
            t0aVar.f215793c = gufVarM62210c2;
            t0aVar.f215794d = atomicBoolean3;
            t0aVar.f215795e = cxeVar3;
            t0aVar.f215796f = mode;
            t0aVar.f215799i = 1;
            Object objM76978s = s1h1.m76978s(5000L, u0aVar, t0aVar);
            yuk yukVar = yuk.f276404a;
            if (objM76978s == yukVar) {
                return yukVar;
            }
            i = mode;
            cxeVar2 = cxeVar3;
            jw6Var2 = jw6Var;
            atomicBoolean = atomicBoolean3;
            hb11Var = hb11VarM52092t;
            gufVar = gufVarM62210c2;
            return new r0a(this, i, hb11Var, new v0a(0, atomicBoolean, this, jw6Var2, gufVar, cxeVar2, null));
        } catch (Exception e5) {
            exc = e5;
            cxeVar = cxeVar3;
            kz6Var.m57734b(((pz6) hz6Var).f183611a);
            ((pz6) hz6Var).m71696g(mode);
            pz6Var = (pz6) hz6Var;
            objRemove = pz6Var.f183615e.remove(cxeVar);
            if (objRemove != null) {
                throw exc;
            }
            kz6Var.m57738f(pz6Var.f183611a, objRemove);
            throw exc;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m92557c(ibk ibkVar) throws Exception {
        w0a w0aVar;
        int mode;
        Exception exc;
        x0a x0aVar;
        x0a x0aVar2;
        guf gufVar;
        hb11 hb11Var;
        AtomicBoolean atomicBoolean;
        if (ibkVar instanceof w0a) {
            w0aVar = (w0a) ibkVar;
            int i = w0aVar.f246683h;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0aVar.f246683h = i - Integer.MIN_VALUE;
            } else {
                w0aVar = new w0a(this, ibkVar);
            }
        } else {
            w0aVar = new w0a(this, ibkVar);
        }
        Object obj = w0aVar.f246681f;
        int i2 = w0aVar.f246683h;
        Context context = this.f267939a;
        hz6 hz6Var = this.f267940b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mode = w0aVar.f246676a;
            x0aVar = w0aVar.f246680e;
            AtomicBoolean atomicBoolean2 = w0aVar.f246679d;
            gufVar = w0aVar.f246678c;
            hb11Var = w0aVar.f246677b;
            try {
                bga.m29073P(obj);
                x0aVar2 = x0aVar;
                atomicBoolean = atomicBoolean2;
                return new r0a(this, mode, hb11Var, new qi2(3, atomicBoolean, this, gufVar, x0aVar2, null));
            } catch (Exception e) {
                exc = e;
                try {
                    ((pz6) hz6Var).f183611a.stopBluetoothSco();
                } catch (Exception e2) {
                    y85.m93061f(exc, e2);
                }
                try {
                    context.unregisterReceiver(x0aVar);
                } catch (Exception e3) {
                    y85.m93061f(exc, e3);
                }
                try {
                    ((pz6) hz6Var).m71696g(mode);
                    throw exc;
                } catch (Exception e4) {
                    y85.m93061f(exc, e4);
                    throw exc;
                }
            }
        }
        bga.m29073P(obj);
        mode = ((pz6) hz6Var).f183611a.getMode();
        guf gufVarM62210c = mlg1.m62210c();
        hb11 hb11VarM52092t = j0g1.m52092t(1, 1, 0, 4);
        guf gufVarM62210c2 = mlg1.m62210c();
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        x0a x0aVar3 = new x0a(gufVarM62210c, atomicBoolean3, hb11VarM52092t, gufVarM62210c2);
        try {
            fbk fbkVar = null;
            Intent intentM60346X = lzj.m60346X(context, x0aVar3, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), null, 2);
            if (intentM60346X != null) {
                try {
                    if (intentM60346X.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1) {
                        gufVarM62210c.m38797k0(w2a1.f247311a);
                    }
                } catch (Exception e5) {
                    exc = e5;
                    x0aVar = x0aVar3;
                    ((pz6) hz6Var).f183611a.stopBluetoothSco();
                    context.unregisterReceiver(x0aVar);
                    ((pz6) hz6Var).m71696g(mode);
                    throw exc;
                }
            }
            ((pz6) hz6Var).m71696g(3);
            ((pz6) hz6Var).f183611a.startBluetoothSco();
            u0a u0aVar = new u0a(gufVarM62210c, fbkVar, 1);
            w0aVar.f246677b = hb11VarM52092t;
            w0aVar.f246678c = gufVarM62210c2;
            w0aVar.f246679d = atomicBoolean3;
            w0aVar.f246680e = x0aVar3;
            w0aVar.f246676a = mode;
            w0aVar.f246683h = 1;
            Object objM76978s = s1h1.m76978s(5000L, u0aVar, w0aVar);
            yuk yukVar = yuk.f276404a;
            if (objM76978s == yukVar) {
                return yukVar;
            }
            x0aVar2 = x0aVar3;
            gufVar = gufVarM62210c2;
            hb11Var = hb11VarM52092t;
            atomicBoolean = atomicBoolean3;
            return new r0a(this, mode, hb11Var, new qi2(3, atomicBoolean, this, gufVar, x0aVar2, null));
        } catch (Exception e6) {
            exc = e6;
        }
    }
}
