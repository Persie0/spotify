package com.spotify.storage.localstorage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.spotify.music.R;
import com.spotify.storage.localstorageapi.CacheMovingWorker;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p204p.a4b;
import p204p.a4i0;
import p204p.af41;
import p204p.am71;
import p204p.b4b;
import p204p.b4i0;
import p204p.b890;
import p204p.bf41;
import p204p.bfa0;
import p204p.bga;
import p204p.c4b;
import p204p.c4i0;
import p204p.cg5;
import p204p.cx21;
import p204p.d4b;
import p204p.e4b;
import p204p.e890;
import p204p.ewy;
import p204p.f550;
import p204p.fbk;
import p204p.ib8;
import p204p.ibk;
import p204p.itj0;
import p204p.jt4;
import p204p.kk40;
import p204p.ktj0;
import p204p.luk;
import p204p.m200;
import p204p.n0e1;
import p204p.n5h1;
import p204p.nh61;
import p204p.ovy;
import p204p.qco;
import p204p.qwb;
import p204p.rr4;
import p204p.sco;
import p204p.sr4;
import p204p.u751;
import p204p.vf61;
import p204p.w2a1;
import p204p.wj50;
import p204p.x0e1;
import p204p.x0h1;
import p204p.yuk;
import p204p.z3b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0015\u0016BY\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/storage/localstorage/CacheMovingWorkerImpl;", "Lcom/spotify/storage/localstorageapi/CacheMovingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/af41;", "spotifyStorageManager", "Lp/bfa0;", "fileFactory", "Lp/am71;", "timeKeeper", "Lp/b4i0;", "movingOrchestrator", "Lp/f550;", "intentFactory", "Lp/luk;", "ioDispatcher", "mainDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/af41;Lp/bfa0;Lp/am71;Lp/b4i0;Lp/f550;Lp/luk;Lp/luk;)V", "p/z3b", "p/h5n", "src_main_java_com_spotify_storage_localstorage-localstorage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CacheMovingWorkerImpl extends CacheMovingWorker {

    /* JADX INFO: renamed from: g */
    public final Context f6666g;

    /* JADX INFO: renamed from: h */
    public final WorkerParameters f6667h;

    /* JADX INFO: renamed from: i */
    public final af41 f6668i;

    /* JADX INFO: renamed from: j */
    public final bfa0 f6669j;

    /* JADX INFO: renamed from: k */
    public final am71 f6670k;

    /* JADX INFO: renamed from: l */
    public final b4i0 f6671l;

    /* JADX INFO: renamed from: m */
    public final luk f6672m;

    /* JADX INFO: renamed from: n */
    public long f6673n;

    /* JADX INFO: renamed from: o */
    public final nh61 f6674o;

    public CacheMovingWorkerImpl(Context context, WorkerParameters workerParameters, af41 af41Var, bfa0 bfa0Var, am71 am71Var, b4i0 b4i0Var, f550 f550Var, luk lukVar, luk lukVar2) {
        super(context.getApplicationContext(), workerParameters);
        this.f6666g = context;
        this.f6667h = workerParameters;
        this.f6668i = af41Var;
        this.f6669j = bfa0Var;
        this.f6670k = am71Var;
        this.f6671l = b4i0Var;
        this.f6672m = lukVar;
        this.f6674o = new nh61(context.getApplicationContext(), f550Var, lukVar2);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x017b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0181  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x01d4 A[Catch: vf61 -> 0x01d9, TRY_LEAVE, TryCatch #0 {vf61 -> 0x01d9, blocks: (B:41:0x01b7, B:45:0x01d4), top: B:91:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0201  */
    /* JADX WARN: Code duplicated, block: B:62:0x020c  */
    /* JADX WARN: Code duplicated, block: B:68:0x026c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0271  */
    /* JADX WARN: Code duplicated, block: B:74:0x0278  */
    /* JADX WARN: Code duplicated, block: B:76:0x027b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final Object m21609i(CacheMovingWorkerImpl cacheMovingWorkerImpl, long j, String str, ibk ibkVar) {
        a4b a4bVar;
        ktj0 ktj0Var;
        ovy ovyVar;
        long j2;
        Object objM63423c;
        long j3;
        ovy ovyVar2;
        z3b z3bVar;
        long j4;
        int i;
        c4i0 c4i0Var;
        a4i0 a4i0Var;
        long j5;
        a4i0 a4i0Var2;
        int i2;
        boolean zM31446c;
        cx21 cx21Var;
        Object objM63423c2;
        long j6;
        int iOrdinal;
        Object objM38084a;
        Object objM89557A;
        Object obj;
        long j7 = j;
        WorkerParameters workerParameters = cacheMovingWorkerImpl.f66917b;
        a4i0 a4i0Var3 = a4i0.f12262a;
        a4i0 a4i0Var4 = a4i0.f12264c;
        if (ibkVar instanceof a4b) {
            a4bVar = (a4b) ibkVar;
            int i3 = a4bVar.f12186h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a4bVar.f12186h = i3 - Integer.MIN_VALUE;
            } else {
                a4bVar = new a4b(cacheMovingWorkerImpl, ibkVar);
            }
        } else {
            a4bVar = new a4b(cacheMovingWorkerImpl, ibkVar);
        }
        Object obj2 = a4bVar.f12184f;
        int i4 = a4bVar.f12186h;
        String str2 = "updateProgress";
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj3 = yuk.f276404a;
        switch (i4) {
            case 0:
                bga.m29073P(obj2);
                cacheMovingWorkerImpl.f6673n = ((rr4) cacheMovingWorkerImpl.f6670k).f201947a.m27521a();
                ovy ovyVarM60516m = cacheMovingWorkerImpl.f6669j.f26651a.m60516m(str, ((bf41) cacheMovingWorkerImpl.f6668i).f26555a.m51594a());
                if (!((ewy) ovyVarM60516m).f63623b.exists() && !ovyVarM60516m.mkdirs()) {
                    cacheMovingWorkerImpl.m21610j(-1, "destination_error");
                    a4bVar.f12180b = null;
                    a4bVar.f12179a = j7;
                    a4bVar.f12186h = 1;
                    if (cacheMovingWorkerImpl.m21611k(a4bVar) == obj3) {
                        return obj3;
                    }
                    return new b890();
                }
                Context context = cacheMovingWorkerImpl.f6666g;
                String string = context.getString(R.string.cache_migration_notification_text);
                ktj0Var = new ktj0(context, "spotify_updates_channel");
                ktj0Var.f126314e = ktj0.m57322d(context.getString(R.string.cache_migration_notification_title));
                ktj0Var.f126315f = ktj0.m57322d(string);
                ktj0Var.m57339r(context.getString(R.string.cache_migration_notification_title));
                itj0 itj0Var = new itj0(false);
                itj0Var.f105612f = ktj0.m57322d(string);
                ktj0Var.m57338q(itj0Var);
                ktj0Var.f126307D.icon = R.drawable.icn_notification;
                ktj0Var.f126320k = false;
                ktj0Var.m57336o(100, 0, false);
                ktj0Var.f126330u = context.getColor(R.color.notification_bg_color);
                Notification notificationM57325c = ktj0Var.m57325c();
                a4bVar.f12180b = ovyVarM60516m;
                a4bVar.f12181c = ktj0Var;
                a4bVar.f12179a = j7;
                a4bVar.f12186h = 2;
                if (cacheMovingWorkerImpl.m21612l(R.id.notification_cache_move, notificationM57325c, a4bVar) == obj3) {
                    return obj3;
                }
                ovyVar = ovyVarM60516m;
                qco qcoVar = new qco(0);
                qcoVar.m72560c(new Integer(0), "progress");
                sco scoVarM72559a = qcoVar.m72559a();
                a4bVar.f12180b = ovyVar;
                a4bVar.f12181c = ktj0Var;
                a4bVar.f12179a = j7;
                a4bVar.f12186h = 3;
                x0e1 x0e1Var = workerParameters.f1410h;
                j2 = j7;
                objM63423c = n0e1.m63423c(n5h1.m63736l(new jt4(x0e1Var.f256874b.f160371a, str2, new ib8(x0e1Var, workerParameters.f1403a, scoVarM72559a, 9), 16)), a4bVar);
                if (objM63423c != obj3) {
                    objM63423c = w2a1Var;
                }
                if (objM63423c == obj3) {
                    return obj3;
                }
                j3 = j2;
                ovyVar2 = ovyVar;
                z3bVar = new z3b(ktj0Var, j3, kk40.m56661c(cacheMovingWorkerImpl.f6672m), new b4b(cacheMovingWorkerImpl, null));
                j4 = j3;
                i = 50;
                while (true) {
                    c4i0Var = (c4i0) cacheMovingWorkerImpl.f6671l;
                    ovy ovyVar3 = ovyVar2;
                    c4i0Var.f33956c = new cx21(((ewy) ovyVar2).f63623b.getAbsolutePath(), c4i0Var.f33954a);
                    try {
                        zM31446c = c4i0Var.m31446c(z3bVar);
                        cx21Var = c4i0Var.f33955b;
                        wj50.m88279p(cx21Var);
                        if ("cancelled".equals(cx21Var.m34210w("moving-state"))) {
                            a4i0Var = a4i0Var4;
                        } else if (zM31446c) {
                            a4i0Var = a4i0.f12263b;
                        } else {
                            a4i0Var = a4i0Var3;
                        }
                    } catch (vf61 unused) {
                        Iterator it = c4i0Var.f33960g.iterator();
                        while (it.hasNext()) {
                            ((u751) it.next()).getClass();
                        }
                    }
                    if (a4i0Var == a4i0Var3 && a4i0Var != a4i0Var4) {
                        z3bVar.f278862g = true;
                        i--;
                        if (i > 0) {
                            ovyVar2 = ovyVar3;
                        }
                    }
                    break;
                }
                if (a4i0Var == a4i0Var3) {
                    cacheMovingWorkerImpl.m21610j(50 - i, "success");
                } else {
                    cacheMovingWorkerImpl.m21610j(50 - i, "error_while_syncing");
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = a4i0Var;
                    a4bVar.f12179a = j4;
                    a4bVar.f12183e = i;
                    a4bVar.f12186h = 4;
                    if (cacheMovingWorkerImpl.m21611k(a4bVar) == obj3) {
                        return obj3;
                    }
                }
                j5 = j4;
                a4i0Var2 = a4i0Var;
                i2 = i;
                qco qcoVar2 = new qco(0);
                qcoVar2.m72560c(new Integer(100), "progress");
                sco scoVarM72559a2 = qcoVar2.m72559a();
                a4bVar.f12180b = null;
                a4bVar.f12181c = null;
                a4bVar.f12182d = a4i0Var2;
                a4bVar.f12179a = j5;
                a4bVar.f12183e = i2;
                a4bVar.f12186h = 5;
                x0e1 x0e1Var2 = workerParameters.f1410h;
                objM63423c2 = n0e1.m63423c(n5h1.m63736l(new jt4(x0e1Var2.f256874b.f160371a, str2, new ib8(x0e1Var2, workerParameters.f1403a, scoVarM72559a2, 9), 16)), a4bVar);
                if (objM63423c2 != obj3) {
                    objM63423c2 = w2a1Var;
                }
                if (objM63423c2 == obj3) {
                    return obj3;
                }
                j6 = j5;
                iOrdinal = a4i0Var2.ordinal();
                if (iOrdinal == 0) {
                    objM38084a = e890.m38084a();
                } else {
                    if (iOrdinal == 1 && iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nh61 nh61Var = cacheMovingWorkerImpl.f6674o;
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = null;
                    a4bVar.f12179a = j6;
                    a4bVar.f12183e = i2;
                    a4bVar.f12186h = 6;
                    objM89557A = x0h1.m89557A((luk) nh61Var.f153886d, new e4b(nh61Var, null, 1), a4bVar);
                    if (objM89557A == obj3) {
                        obj = objM89557A;
                    } else {
                        obj = w2a1Var;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                    objM38084a = new b890();
                }
                return objM38084a;
            case 1:
                bga.m29073P(obj2);
                return new b890();
            case 2:
                j7 = a4bVar.f12179a;
                ktj0Var = a4bVar.f12181c;
                ovyVar = a4bVar.f12180b;
                bga.m29073P(obj2);
                qco qcoVar3 = new qco(0);
                qcoVar3.m72560c(new Integer(0), "progress");
                sco scoVarM72559a3 = qcoVar3.m72559a();
                a4bVar.f12180b = ovyVar;
                a4bVar.f12181c = ktj0Var;
                a4bVar.f12179a = j7;
                a4bVar.f12186h = 3;
                x0e1 x0e1Var3 = workerParameters.f1410h;
                j2 = j7;
                objM63423c = n0e1.m63423c(n5h1.m63736l(new jt4(x0e1Var3.f256874b.f160371a, str2, new ib8(x0e1Var3, workerParameters.f1403a, scoVarM72559a3, 9), 16)), a4bVar);
                if (objM63423c != obj3) {
                    objM63423c = w2a1Var;
                }
                if (objM63423c == obj3) {
                    return obj3;
                }
                j3 = j2;
                ovyVar2 = ovyVar;
                z3bVar = new z3b(ktj0Var, j3, kk40.m56661c(cacheMovingWorkerImpl.f6672m), new b4b(cacheMovingWorkerImpl, null));
                j4 = j3;
                i = 50;
                while (true) {
                    c4i0Var = (c4i0) cacheMovingWorkerImpl.f6671l;
                    ovy ovyVar4 = ovyVar2;
                    c4i0Var.f33956c = new cx21(((ewy) ovyVar2).f63623b.getAbsolutePath(), c4i0Var.f33954a);
                    zM31446c = c4i0Var.m31446c(z3bVar);
                    cx21Var = c4i0Var.f33955b;
                    wj50.m88279p(cx21Var);
                    if ("cancelled".equals(cx21Var.m34210w("moving-state"))) {
                        a4i0Var = a4i0Var4;
                    } else if (zM31446c) {
                        a4i0Var = a4i0.f12263b;
                    } else {
                        a4i0Var = a4i0Var3;
                    }
                    if (a4i0Var == a4i0Var3) {
                    }
                    ovyVar2 = ovyVar4;
                    break;
                }
                if (a4i0Var == a4i0Var3) {
                    cacheMovingWorkerImpl.m21610j(50 - i, "success");
                } else {
                    cacheMovingWorkerImpl.m21610j(50 - i, "error_while_syncing");
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = a4i0Var;
                    a4bVar.f12179a = j4;
                    a4bVar.f12183e = i;
                    a4bVar.f12186h = 4;
                    if (cacheMovingWorkerImpl.m21611k(a4bVar) == obj3) {
                        return obj3;
                    }
                }
                j5 = j4;
                a4i0Var2 = a4i0Var;
                i2 = i;
                qco qcoVar4 = new qco(0);
                qcoVar4.m72560c(new Integer(100), "progress");
                sco scoVarM72559a4 = qcoVar4.m72559a();
                a4bVar.f12180b = null;
                a4bVar.f12181c = null;
                a4bVar.f12182d = a4i0Var2;
                a4bVar.f12179a = j5;
                a4bVar.f12183e = i2;
                a4bVar.f12186h = 5;
                x0e1 x0e1Var4 = workerParameters.f1410h;
                objM63423c2 = n0e1.m63423c(n5h1.m63736l(new jt4(x0e1Var4.f256874b.f160371a, str2, new ib8(x0e1Var4, workerParameters.f1403a, scoVarM72559a4, 9), 16)), a4bVar);
                if (objM63423c2 != obj3) {
                    objM63423c2 = w2a1Var;
                }
                if (objM63423c2 == obj3) {
                    return obj3;
                }
                j6 = j5;
                iOrdinal = a4i0Var2.ordinal();
                if (iOrdinal == 0) {
                    if (iOrdinal == 1) {
                    }
                    nh61 nh61Var2 = cacheMovingWorkerImpl.f6674o;
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = null;
                    a4bVar.f12179a = j6;
                    a4bVar.f12183e = i2;
                    a4bVar.f12186h = 6;
                    objM89557A = x0h1.m89557A((luk) nh61Var2.f153886d, new e4b(nh61Var2, null, 1), a4bVar);
                    if (objM89557A == obj3) {
                        obj = objM89557A;
                    } else {
                        obj = w2a1Var;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                    objM38084a = new b890();
                    break;
                } else {
                    objM38084a = e890.m38084a();
                }
                return objM38084a;
            case 3:
                long j8 = a4bVar.f12179a;
                ktj0Var = a4bVar.f12181c;
                ovyVar = a4bVar.f12180b;
                bga.m29073P(obj2);
                j3 = j8;
                w2a1Var = w2a1Var;
                ovyVar2 = ovyVar;
                z3bVar = new z3b(ktj0Var, j3, kk40.m56661c(cacheMovingWorkerImpl.f6672m), new b4b(cacheMovingWorkerImpl, null));
                j4 = j3;
                i = 50;
                while (true) {
                    c4i0Var = (c4i0) cacheMovingWorkerImpl.f6671l;
                    ovy ovyVar5 = ovyVar2;
                    c4i0Var.f33956c = new cx21(((ewy) ovyVar2).f63623b.getAbsolutePath(), c4i0Var.f33954a);
                    zM31446c = c4i0Var.m31446c(z3bVar);
                    cx21Var = c4i0Var.f33955b;
                    wj50.m88279p(cx21Var);
                    if ("cancelled".equals(cx21Var.m34210w("moving-state"))) {
                        a4i0Var = a4i0Var4;
                    } else if (zM31446c) {
                        a4i0Var = a4i0.f12263b;
                    } else {
                        a4i0Var = a4i0Var3;
                    }
                    if (a4i0Var == a4i0Var3) {
                    }
                    ovyVar2 = ovyVar5;
                    break;
                }
                if (a4i0Var == a4i0Var3) {
                    cacheMovingWorkerImpl.m21610j(50 - i, "success");
                } else {
                    cacheMovingWorkerImpl.m21610j(50 - i, "error_while_syncing");
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = a4i0Var;
                    a4bVar.f12179a = j4;
                    a4bVar.f12183e = i;
                    a4bVar.f12186h = 4;
                    if (cacheMovingWorkerImpl.m21611k(a4bVar) == obj3) {
                        return obj3;
                    }
                }
                j5 = j4;
                a4i0Var2 = a4i0Var;
                i2 = i;
                qco qcoVar5 = new qco(0);
                qcoVar5.m72560c(new Integer(100), "progress");
                sco scoVarM72559a5 = qcoVar5.m72559a();
                a4bVar.f12180b = null;
                a4bVar.f12181c = null;
                a4bVar.f12182d = a4i0Var2;
                a4bVar.f12179a = j5;
                a4bVar.f12183e = i2;
                a4bVar.f12186h = 5;
                x0e1 x0e1Var5 = workerParameters.f1410h;
                objM63423c2 = n0e1.m63423c(n5h1.m63736l(new jt4(x0e1Var5.f256874b.f160371a, str2, new ib8(x0e1Var5, workerParameters.f1403a, scoVarM72559a5, 9), 16)), a4bVar);
                if (objM63423c2 != obj3) {
                    objM63423c2 = w2a1Var;
                }
                if (objM63423c2 == obj3) {
                    return obj3;
                }
                j6 = j5;
                iOrdinal = a4i0Var2.ordinal();
                if (iOrdinal == 0) {
                    if (iOrdinal == 1) {
                    }
                    nh61 nh61Var3 = cacheMovingWorkerImpl.f6674o;
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = null;
                    a4bVar.f12179a = j6;
                    a4bVar.f12183e = i2;
                    a4bVar.f12186h = 6;
                    objM89557A = x0h1.m89557A((luk) nh61Var3.f153886d, new e4b(nh61Var3, null, 1), a4bVar);
                    if (objM89557A == obj3) {
                        obj = objM89557A;
                    } else {
                        obj = w2a1Var;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                    objM38084a = new b890();
                    break;
                } else {
                    objM38084a = e890.m38084a();
                }
                return objM38084a;
            case 4:
                i2 = a4bVar.f12183e;
                j5 = a4bVar.f12179a;
                a4i0Var2 = a4bVar.f12182d;
                bga.m29073P(obj2);
                w2a1Var = w2a1Var;
                qco qcoVar6 = new qco(0);
                qcoVar6.m72560c(new Integer(100), "progress");
                sco scoVarM72559a6 = qcoVar6.m72559a();
                a4bVar.f12180b = null;
                a4bVar.f12181c = null;
                a4bVar.f12182d = a4i0Var2;
                a4bVar.f12179a = j5;
                a4bVar.f12183e = i2;
                a4bVar.f12186h = 5;
                x0e1 x0e1Var6 = workerParameters.f1410h;
                objM63423c2 = n0e1.m63423c(n5h1.m63736l(new jt4(x0e1Var6.f256874b.f160371a, str2, new ib8(x0e1Var6, workerParameters.f1403a, scoVarM72559a6, 9), 16)), a4bVar);
                if (objM63423c2 != obj3) {
                    objM63423c2 = w2a1Var;
                }
                if (objM63423c2 == obj3) {
                    return obj3;
                }
                j6 = j5;
                iOrdinal = a4i0Var2.ordinal();
                if (iOrdinal == 0) {
                    if (iOrdinal == 1) {
                    }
                    nh61 nh61Var4 = cacheMovingWorkerImpl.f6674o;
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = null;
                    a4bVar.f12179a = j6;
                    a4bVar.f12183e = i2;
                    a4bVar.f12186h = 6;
                    objM89557A = x0h1.m89557A((luk) nh61Var4.f153886d, new e4b(nh61Var4, null, 1), a4bVar);
                    if (objM89557A == obj3) {
                        obj = objM89557A;
                    } else {
                        obj = w2a1Var;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                    objM38084a = new b890();
                    break;
                } else {
                    objM38084a = e890.m38084a();
                }
                return objM38084a;
            case 5:
                i2 = a4bVar.f12183e;
                j6 = a4bVar.f12179a;
                a4i0Var2 = a4bVar.f12182d;
                bga.m29073P(obj2);
                w2a1Var = w2a1Var;
                iOrdinal = a4i0Var2.ordinal();
                if (iOrdinal == 0) {
                    if (iOrdinal == 1) {
                    }
                    nh61 nh61Var5 = cacheMovingWorkerImpl.f6674o;
                    a4bVar.f12180b = null;
                    a4bVar.f12181c = null;
                    a4bVar.f12182d = null;
                    a4bVar.f12179a = j6;
                    a4bVar.f12183e = i2;
                    a4bVar.f12186h = 6;
                    objM89557A = x0h1.m89557A((luk) nh61Var5.f153886d, new e4b(nh61Var5, null, 1), a4bVar);
                    if (objM89557A == obj3) {
                        obj = objM89557A;
                    } else {
                        obj = w2a1Var;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                    objM38084a = new b890();
                    break;
                } else {
                    objM38084a = e890.m38084a();
                }
                return objM38084a;
            case 6:
                bga.m29073P(obj2);
                objM38084a = new b890();
                return objM38084a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    public final Object mo750f(fbk fbkVar) throws Throwable {
        c4b c4bVar;
        if (fbkVar instanceof c4b) {
            c4bVar = (c4b) fbkVar;
            int i = c4bVar.f33903c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4bVar.f33903c = i - Integer.MIN_VALUE;
            } else {
                c4bVar = new c4b(this, (ibk) fbkVar);
            }
        } else {
            c4bVar = new c4b(this, (ibk) fbkVar);
        }
        Object obj = c4bVar.f33901a;
        int i2 = c4bVar.f33903c;
        fbk fbkVar2 = null;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            c4bVar.f33903c = 1;
            nh61 nh61Var = this.f6674o;
            Object objM89557A = x0h1.m89557A((luk) nh61Var.f153886d, new e4b(nh61Var, fbkVar2, 0), c4bVar);
            if (objM89557A != obj2) {
                objM89557A = w2a1.f247311a;
            }
            if (objM89557A != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        cg5 cg5Var = new cg5(this, fbkVar2, 18);
        c4bVar.f33903c = 2;
        Object objM89557A2 = x0h1.m89557A(this.f6672m, cg5Var, c4bVar);
        return objM89557A2 == obj2 ? obj2 : objM89557A2;
    }

    /* JADX INFO: renamed from: j */
    public final void m21610j(int i, String str) {
        rr4 rr4Var = (rr4) this.f6670k;
        long jM27521a = rr4Var.f201947a.m27521a() - this.f6673n;
        sr4 sr4VarM76275a = rr4Var.m76275a("move_cache");
        Long lValueOf = Long.valueOf(this.f6673n);
        Long lValueOf2 = Long.valueOf(jM27521a);
        sr4VarM76275a.f213232g = lValueOf;
        sr4VarM76275a.f213236k.add(new qwb("move_cache", "android-storage-localstorage", lValueOf, lValueOf2));
        sr4VarM76275a.f213230e.put(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
        sr4VarM76275a.f213229d.put("attempts", String.valueOf(i));
        rr4Var.m76276b(sr4VarM76275a.m79015d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m21611k(ibk ibkVar) {
        d4b d4bVar;
        if (ibkVar instanceof d4b) {
            d4bVar = (d4b) ibkVar;
            int i = d4bVar.f45126c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4bVar.f45126c = i - Integer.MIN_VALUE;
            } else {
                d4bVar = new d4b(this, ibkVar);
            }
        } else {
            d4bVar = new d4b(this, ibkVar);
        }
        Object obj = d4bVar.f45124a;
        int i2 = d4bVar.f45126c;
        if (i2 == 0) {
            bga.m29073P(obj);
            Context context = this.f6666g;
            String string = context.getString(R.string.cache_migration_failed_subtitle);
            ktj0 ktj0Var = new ktj0(context, "spotify_updates_channel");
            ktj0Var.f126314e = ktj0.m57322d(context.getString(R.string.cache_migration_failed));
            ktj0Var.f126315f = ktj0.m57322d(string);
            ktj0Var.m57339r(context.getString(R.string.cache_migration_failed));
            itj0 itj0Var = new itj0(false);
            itj0Var.f105612f = ktj0.m57322d(string);
            ktj0Var.m57338q(itj0Var);
            ktj0Var.f126307D.icon = R.drawable.icn_notification;
            ktj0Var.f126320k = false;
            ktj0Var.f126330u = context.getColor(R.color.notification_bg_color);
            Notification notificationM57325c = ktj0Var.m57325c();
            d4bVar.f45126c = 1;
            Object objM21612l = m21612l(42, notificationM57325c, d4bVar);
            Object obj2 = yuk.f276404a;
            if (objM21612l == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        ((c4i0) this.f6671l).m31444a();
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m21612l(int i, Notification notification, ibk ibkVar) {
        Object objM63423c = n0e1.m63423c(m41019c(Build.VERSION.SDK_INT >= 29 ? new m200(i, notification, 1) : new m200(i, notification, 0)), ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM63423c != yukVar) {
            objM63423c = w2a1Var;
        }
        return objM63423c == yukVar ? objM63423c : w2a1Var;
    }
}
