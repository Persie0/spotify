package p204p;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class k2e1 {

    /* JADX INFO: renamed from: a */
    public final i1e1 f118606a;

    /* JADX INFO: renamed from: b */
    public final Context f118607b;

    /* JADX INFO: renamed from: c */
    public final String f118608c;

    /* JADX INFO: renamed from: d */
    public final o0e1 f118609d;

    /* JADX INFO: renamed from: e */
    public final dii f118610e;

    /* JADX INFO: renamed from: f */
    public final qbn0 f118611f;

    /* JADX INFO: renamed from: g */
    public final mir0 f118612g;

    /* JADX INFO: renamed from: h */
    public final WorkDatabase f118613h;

    /* JADX INFO: renamed from: i */
    public final o1e1 f118614i;

    /* JADX INFO: renamed from: j */
    public final etq f118615j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f118616k;

    /* JADX INFO: renamed from: l */
    public final String f118617l;

    /* JADX INFO: renamed from: m */
    public final uf60 f118618m;

    public k2e1(h481 h481Var) {
        i1e1 i1e1Var = (i1e1) h481Var.f87470f;
        this.f118606a = i1e1Var;
        this.f118607b = h481Var.f87465a;
        String str = i1e1Var.f97499a;
        this.f118608c = str;
        this.f118609d = (o0e1) h481Var.f87467c;
        dii diiVar = (dii) h481Var.f87466b;
        this.f118610e = diiVar;
        this.f118611f = diiVar.f49366d;
        this.f118612g = (mir0) h481Var.f87468d;
        WorkDatabase workDatabase = (WorkDatabase) h481Var.f87469e;
        this.f118613h = workDatabase;
        this.f118614i = workDatabase.mo1155F();
        this.f118615j = workDatabase.mo1157z();
        ArrayList arrayList = (ArrayList) h481Var.f87471g;
        this.f118616k = arrayList;
        this.f118617l = dq60.m36616p(g6f.m43753y0(arrayList, ",", null, null, null, 62), " } ]", edb.m38572u("Work [ id=", str, ", tags={ "));
        this.f118618m = qlg1.m73202g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: a */
    public static final Object m55163a(k2e1 k2e1Var, ibk ibkVar) {
        i2e1 i2e1Var;
        sco scoVarM72559a;
        final k2e1 k2e1Var2 = k2e1Var;
        String str = k2e1Var2.f118608c;
        o0e1 o0e1Var = k2e1Var2.f118609d;
        WorkDatabase workDatabase = k2e1Var2.f118613h;
        dii diiVar = k2e1Var2.f118610e;
        tm4 tm4Var = diiVar.f49375m;
        i1e1 i1e1Var = k2e1Var2.f118606a;
        if (ibkVar instanceof i2e1) {
            i2e1Var = (i2e1) ibkVar;
            int i = i2e1Var.f97830d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2e1Var.f97830d = i - Integer.MIN_VALUE;
            } else {
                i2e1Var = new i2e1(k2e1Var2, ibkVar);
            }
        } else {
            i2e1Var = new i2e1(k2e1Var2, ibkVar);
        }
        Object objM89557A = i2e1Var.f97828b;
        int i2 = i2e1Var.f97830d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                x1e1 x1e1Var = diiVar.f49367e;
                tm4Var.getClass();
                boolean zM81094r = tm4.m81094r();
                String str2 = i1e1Var.f97522x;
                if (zM81094r && str2 != null) {
                    tm4.m81089e(str2, i1e1Var.hashCode());
                }
                final int i3 = 0;
                if (((Boolean) workDatabase.m59192v(new Callable(k2e1Var2) { // from class: p.d2e1

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ k2e1 f44558b;

                    {
                        this.f44558b = k2e1Var2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        int i4 = i3;
                        h0e1 h0e1Var = h0e1.f86263a;
                        k2e1 k2e1Var3 = this.f44558b;
                        switch (i4) {
                            case 0:
                                i1e1 i1e1Var2 = k2e1Var3.f118606a;
                                if (i1e1Var2.f97500b != h0e1Var) {
                                    int i5 = l2e1.f128994a;
                                    gaz.m44190b().getClass();
                                    return Boolean.TRUE;
                                }
                                if (i1e1Var2.m49413d() || (i1e1Var2.f97500b == h0e1Var && i1e1Var2.f97509k > 0)) {
                                    k2e1Var3.f118611f.getClass();
                                    if (System.currentTimeMillis() < i1e1Var2.m49411a()) {
                                        gaz gazVarM44190b = gaz.m44190b();
                                        int i6 = l2e1.f128994a;
                                        gazVarM44190b.getClass();
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                o1e1 o1e1Var = k2e1Var3.f118614i;
                                String str3 = k2e1Var3.f118608c;
                                if (o1e1Var.m66058i(str3) == h0e1Var) {
                                    o1e1Var.m66065p(str3, h0e1.f86264b);
                                    WorkDatabase_Impl workDatabase_Impl = o1e1Var.f160711a;
                                    workDatabase_Impl.m59182b();
                                    mh61 mh61Var = o1e1Var.f160720j;
                                    fa00 fa00VarM93329a = mh61Var.m93329a();
                                    z = true;
                                    fa00VarM93329a.mo38269L0(1, str3);
                                    try {
                                        workDatabase_Impl.m59183c();
                                        try {
                                            fa00VarM93329a.m41115a();
                                            workDatabase_Impl.m59194x();
                                            workDatabase_Impl.m59184i();
                                            mh61Var.m93330c(fa00VarM93329a);
                                            o1e1Var.m66066q(-256, str3);
                                        } catch (Throwable th) {
                                            workDatabase_Impl.m59184i();
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        mh61Var.m93330c(fa00VarM93329a);
                                        throw th2;
                                    }
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                })).booleanValue()) {
                    return new g2e1();
                }
                if (i1e1Var.m49413d()) {
                    scoVarM72559a = i1e1Var.f97503e;
                } else {
                    gaz gazVar = diiVar.f49368f;
                    String str3 = i1e1Var.f97502d;
                    gazVar.getClass();
                    if (gaz.m44189a(str3) == null) {
                        int i4 = l2e1.f128994a;
                        gaz.m44190b().getClass();
                        return new e2e1();
                    }
                    List listM44518y = geg1.m44518y(i1e1Var.f97503e);
                    o1e1 o1e1Var = k2e1Var2.f118614i;
                    o1e1Var.getClass();
                    TreeMap treeMap = ojx0.f166164i;
                    ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    ojx0VarM50495m.mo38269L0(1, str);
                    WorkDatabase_Impl workDatabase_Impl = o1e1Var.f160711a;
                    workDatabase_Impl.m59182b();
                    Cursor cursorM65531q = nsf1.m65531q(workDatabase_Impl, ojx0VarM50495m, false);
                    try {
                        ArrayList arrayList = new ArrayList(cursorM65531q.getCount());
                        while (cursorM65531q.moveToNext()) {
                            arrayList.add(sco.m77812a(cursorM65531q.getBlob(0)));
                        }
                        cursorM65531q.close();
                        ojx0VarM50495m.m67120a();
                        ArrayList arrayListM43700N0 = g6f.m43700N0(arrayList, listM44518y);
                        qco qcoVar = new qco(0);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = arrayListM43700N0.iterator();
                        while (it.hasNext()) {
                            linkedHashMap.putAll(Collections.unmodifiableMap(((sco) it.next()).f207773a));
                        }
                        qcoVar.m72561e(linkedHashMap);
                        scoVarM72559a = qcoVar.m72559a();
                    } catch (Throwable th) {
                        cursorM65531q.close();
                        ojx0VarM50495m.m67120a();
                        throw th;
                    }
                }
                UUID uuidFromString = UUID.fromString(str);
                ArrayList arrayList2 = k2e1Var2.f118616k;
                int i5 = i1e1Var.f97509k;
                ExecutorService executorService = diiVar.f49363a;
                n5q n5qVar = diiVar.f49364b;
                x0e1 x0e1Var = new x0e1(workDatabase, o0e1Var);
                i2e1 i2e1Var2 = i2e1Var;
                e0e1 e0e1Var = new e0e1(workDatabase, k2e1Var2.f118612g, o0e1Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f1403a = uuidFromString;
                workerParameters.f1404b = scoVarM72559a;
                new HashSet(arrayList2);
                workerParameters.f1405c = i5;
                workerParameters.f1406d = executorService;
                workerParameters.f1407e = n5qVar;
                workerParameters.f1408f = o0e1Var;
                workerParameters.f1409g = x1e1Var;
                workerParameters.f1410h = x0e1Var;
                workerParameters.f1411i = e0e1Var;
                try {
                    f890 f890VarM89636b = x1e1Var.m89636b(k2e1Var2.f118607b, i1e1Var.f97501c, workerParameters);
                    final int i6 = 1;
                    f890VarM89636b.f66919d = true;
                    huk hukVarMo26595B = i2e1Var2.getContext().mo26595B(gk40.f80712X0);
                    wj50.m88279p(hukVarMo26595B);
                    tf60 tf60Var = (tf60) hukVarMo26595B;
                    tf60Var.mo26599N(new j2e1(f890VarM89636b, zM81094r, str2, k2e1Var2));
                    if (!((Boolean) workDatabase.m59192v(new Callable(k2e1Var2) { // from class: p.d2e1

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ k2e1 f44558b;

                        {
                            this.f44558b = k2e1Var2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z;
                            int i7 = i6;
                            h0e1 h0e1Var = h0e1.f86263a;
                            k2e1 k2e1Var3 = this.f44558b;
                            switch (i7) {
                                case 0:
                                    i1e1 i1e1Var2 = k2e1Var3.f118606a;
                                    if (i1e1Var2.f97500b != h0e1Var) {
                                        int i8 = l2e1.f128994a;
                                        gaz.m44190b().getClass();
                                        return Boolean.TRUE;
                                    }
                                    if (i1e1Var2.m49413d() || (i1e1Var2.f97500b == h0e1Var && i1e1Var2.f97509k > 0)) {
                                        k2e1Var3.f118611f.getClass();
                                        if (System.currentTimeMillis() < i1e1Var2.m49411a()) {
                                            gaz gazVarM44190b = gaz.m44190b();
                                            int i9 = l2e1.f128994a;
                                            gazVarM44190b.getClass();
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    o1e1 o1e1Var2 = k2e1Var3.f118614i;
                                    String str4 = k2e1Var3.f118608c;
                                    if (o1e1Var2.m66058i(str4) == h0e1Var) {
                                        o1e1Var2.m66065p(str4, h0e1.f86264b);
                                        WorkDatabase_Impl workDatabase_Impl2 = o1e1Var2.f160711a;
                                        workDatabase_Impl2.m59182b();
                                        mh61 mh61Var = o1e1Var2.f160720j;
                                        fa00 fa00VarM93329a = mh61Var.m93329a();
                                        z = true;
                                        fa00VarM93329a.mo38269L0(1, str4);
                                        try {
                                            workDatabase_Impl2.m59183c();
                                            try {
                                                fa00VarM93329a.m41115a();
                                                workDatabase_Impl2.m59194x();
                                                workDatabase_Impl2.m59184i();
                                                mh61Var.m93330c(fa00VarM93329a);
                                                o1e1Var2.m66066q(-256, str4);
                                            } catch (Throwable th2) {
                                                workDatabase_Impl2.m59184i();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            mh61Var.m93330c(fa00VarM93329a);
                                            throw th3;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    })).booleanValue()) {
                        return new g2e1();
                    }
                    if (tf60Var.isCancelled()) {
                        return new g2e1();
                    }
                    luk lukVarM95213t = z2h1.m95213t(o0e1Var.f160374d);
                    s6d1 s6d1Var = new s6d1(k2e1Var2, f890VarM89636b, e0e1Var, null, 4);
                    i2e1Var2.f97827a = k2e1Var2;
                    i2e1Var2.f97830d = 1;
                    objM89557A = x0h1.m89557A(lukVarM95213t, s6d1Var, i2e1Var2);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                } catch (Throwable unused) {
                    int i7 = l2e1.f128994a;
                    gaz.m44190b().getClass();
                    return new e2e1();
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k2e1Var2 = i2e1Var.f97827a;
                bga.m29073P(objM89557A);
            }
            return new f2e1((e890) objM89557A);
        } catch (CancellationException e) {
            int i8 = l2e1.f128994a;
            gaz gazVarM44190b = gaz.m44190b();
            String str4 = k2e1Var2.f118617l;
            gazVarM44190b.getClass();
            throw e;
        } catch (Throwable unused2) {
            int i9 = l2e1.f128994a;
            gaz gazVarM44190b2 = gaz.m44190b();
            String str5 = k2e1Var2.f118617l;
            gazVarM44190b2.getClass();
            return new e2e1();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m55164b(int i) {
        o1e1 o1e1Var = this.f118614i;
        String str = this.f118608c;
        o1e1Var.m66065p(str, h0e1.f86263a);
        this.f118611f.getClass();
        o1e1Var.m66063n(System.currentTimeMillis(), str);
        o1e1Var.m66062m(this.f118606a.f97520v, str);
        o1e1Var.m66061l(-1L, str);
        o1e1Var.m66066q(i, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m55165c() {
        this.f118611f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o1e1 o1e1Var = this.f118614i;
        String str = this.f118608c;
        o1e1Var.m66063n(jCurrentTimeMillis, str);
        o1e1Var.m66065p(str, h0e1.f86263a);
        WorkDatabase_Impl workDatabase_Impl = o1e1Var.f160711a;
        workDatabase_Impl.m59182b();
        mh61 mh61Var = o1e1Var.f160721k;
        fa00 fa00VarM93329a = mh61Var.m93329a();
        fa00VarM93329a.mo38269L0(1, str);
        try {
            workDatabase_Impl.m59183c();
            try {
                fa00VarM93329a.m41115a();
                workDatabase_Impl.m59194x();
                workDatabase_Impl.m59184i();
                mh61Var.m93330c(fa00VarM93329a);
                o1e1Var.m66062m(this.f118606a.f97520v, str);
                workDatabase_Impl.m59182b();
                mh61 mh61Var2 = o1e1Var.f160717g;
                fa00 fa00VarM93329a2 = mh61Var2.m93329a();
                fa00VarM93329a2.mo38269L0(1, str);
                try {
                    workDatabase_Impl.m59183c();
                    try {
                        fa00VarM93329a2.m41115a();
                        workDatabase_Impl.m59194x();
                        workDatabase_Impl.m59184i();
                        mh61Var2.m93330c(fa00VarM93329a2);
                        o1e1Var.m66061l(-1L, str);
                    } catch (Throwable th) {
                        workDatabase_Impl.m59184i();
                        throw th;
                    }
                } catch (Throwable th2) {
                    mh61Var2.m93330c(fa00VarM93329a2);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase_Impl.m59184i();
                throw th3;
            }
        } catch (Throwable th4) {
            mh61Var.m93330c(fa00VarM93329a);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m55166d(e890 e890Var) {
        String str = this.f118608c;
        ArrayList arrayListM46717N = h6f.m46717N(str);
        while (true) {
            boolean zIsEmpty = arrayListM46717N.isEmpty();
            o1e1 o1e1Var = this.f118614i;
            if (zIsEmpty) {
                sco scoVarM28421b = ((b890) e890Var).m28421b();
                o1e1Var.m66062m(this.f118606a.f97520v, str);
                o1e1Var.m66064o(str, scoVarM28421b);
                return;
            } else {
                String str2 = (String) j6f.m52570b0(arrayListM46717N);
                if (o1e1Var.m66058i(str2) != h0e1.f86268f) {
                    o1e1Var.m66065p(str2, h0e1.f86266d);
                }
                arrayListM46717N.addAll(this.f118615j.m39967h(str2));
            }
        }
    }
}
