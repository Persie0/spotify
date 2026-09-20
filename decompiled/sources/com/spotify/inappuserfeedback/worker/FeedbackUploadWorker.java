package com.spotify.inappuserfeedback.worker;

import android.content.Context;
import android.util.Base64;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.b890;
import p204p.bga;
import p204p.bk5;
import p204p.c6x0;
import p204p.c890;
import p204p.d890;
import p204p.e890;
import p204p.edb;
import p204p.fbk;
import p204p.hv31;
import p204p.ibk;
import p204p.ipa1;
import p204p.jpa1;
import p204p.klh;
import p204p.n0e1;
import p204p.pxy;
import p204p.qqy;
import p204p.rqy;
import p204p.s6x0;
import p204p.sco;
import p204p.sqy;
import p204p.tqy;
import p204p.uqe1;
import p204p.uqy;
import p204p.wj50;
import p204p.wl51;
import p204p.wy3;
import p204p.xre;
import p204p.yuk;
import p204p.yx8;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/inappuserfeedback/worker/FeedbackUploadWorker;", "Landroidx/work/CoroutineWorker;", "Lp/ipa1;", "userFeedbackRepository", "Lp/hv31;", "", "preferences", "Lp/xre;", "clock", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Lp/ipa1;Lp/hv31;Lp/xre;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/won", "src_main_java_com_spotify_inappuserfeedback_worker-worker"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FeedbackUploadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final ipa1 f4263g;

    /* JADX INFO: renamed from: h */
    public final xre f4264h;

    /* JADX INFO: renamed from: i */
    public final rqy f4265i;

    public FeedbackUploadWorker(ipa1 ipa1Var, hv31 hv31Var, xre xreVar, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4263g = ipa1Var;
        this.f4264h = xreVar;
        this.f4265i = new rqy(hv31Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        if (r2 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
    
        if (r2 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
    
        r0 = r2;
        r2 = r8;
     */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo750f(fbk fbkVar) {
        sqy sqyVar;
        Serializable serializableM12019j;
        Object obj;
        String[] strArr;
        yx8 yx8Var;
        if (fbkVar instanceof sqy) {
            sqyVar = (sqy) fbkVar;
            int i = sqyVar.f213188d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqyVar.f213188d = i - Integer.MIN_VALUE;
            } else {
                sqyVar = new sqy(this, (ibk) fbkVar);
            }
        } else {
            sqyVar = new sqy(this, (ibk) fbkVar);
        }
        Object obj2 = sqyVar.f213186b;
        int i2 = sqyVar.f213188d;
        if (i2 == 0) {
            bga.m29073P(obj2);
            WorkerParameters workerParameters = this.f66917b;
            sco scoVar = workerParameters.f1404b;
            sco scoVar2 = workerParameters.f1404b;
            String strM77815d = scoVar.m77815d("summary");
            if (strM77815d == null) {
                m12018i(new String[0]);
                return new b890();
            }
            String strM77815d2 = scoVar2.m77815d("description");
            if (strM77815d2 == null) {
                m12018i(new String[0]);
                return new b890();
            }
            String[] strArrM77816e = scoVar2.m77816e("file_paths");
            if (strArrM77816e == null) {
                m12018i(new String[0]);
                return new b890();
            }
            boolean zM77813b = scoVar2.m77813b("use_jira");
            long jM77814c = scoVar2.m77814c("enqueued_at_millis");
            if (zM77813b && jM77814c != 0) {
                ((wy3) this.f4264h).getClass();
                if (uqe1.m83773l(jM77814c, System.currentTimeMillis())) {
                    m12018i(strArrM77816e);
                    return e890.m38084a();
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArrM77816e) {
                File file = new File(str);
                if (file.isFile()) {
                    try {
                        String strEncodeToString = Base64.encodeToString(pxy.m71563W(file), 2);
                        String name = file.getName();
                        wj50.m88279p(strEncodeToString);
                        yx8Var = new yx8(name, strEncodeToString);
                    } catch (Exception e) {
                        Logger.m3967c(e, edb.m38564m("Failed to read feedback attachment: ", file.getName()), new Object[0]);
                        yx8Var = null;
                    }
                } else {
                    yx8Var = null;
                }
                if (yx8Var != null) {
                    arrayList.add(yx8Var);
                }
            }
            Serializable serializable = yuk.f276404a;
            if (zM77813b) {
                sqyVar.f213185a = strArrM77816e;
                sqyVar.f213188d = 1;
                serializableM12019j = m12020k(strM77815d, strM77815d2, arrayList, sqyVar);
            } else {
                sqyVar.f213185a = strArrM77816e;
                sqyVar.f213188d = 2;
                serializableM12019j = m12019j(strM77815d, strM77815d2, arrayList, sqyVar);
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strArr = sqyVar.f213185a;
            bga.m29073P(obj2);
            obj = ((s6x0) obj2).f206218a;
        }
        if (obj instanceof c6x0) {
            return new c890();
        }
        m12018i(strArr);
        bga.m29073P(obj);
        String str2 = (String) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!wl51.m88460J0(str2)) {
            linkedHashMap.put("ticket_key", str2);
        }
        sco scoVar3 = new sco(linkedHashMap);
        n0e1.m63412T(scoVar3);
        return new d890(scoVar3);
    }

    /* JADX INFO: renamed from: i */
    public final void m12018i(String[] strArr) {
        qqy qqyVarM76270d = this.f4265i.m76270d(this.f66917b.f1403a);
        Set setM73581a = qqyVarM76270d != null ? qqyVarM76270d.m73581a() : null;
        if (setM73581a == null) {
            setM73581a = bk5.m29624m1(strArr);
        }
        Iterator it = setM73581a.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Serializable m12019j(String str, String str2, ArrayList arrayList, ibk ibkVar) {
        tqy tqyVar;
        if (ibkVar instanceof tqy) {
            tqyVar = (tqy) ibkVar;
            int i = tqyVar.f222917c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqyVar.f222917c = i - Integer.MIN_VALUE;
            } else {
                tqyVar = new tqy(this, ibkVar);
            }
        } else {
            tqyVar = new tqy(this, ibkVar);
        }
        tqy tqyVar2 = tqyVar;
        Object objM53909a = tqyVar2.f222915a;
        int i2 = tqyVar2.f222917c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM53909a);
                boolean zM77813b = this.f66917b.f1404b.m77813b("is_employee");
                ipa1 ipa1Var = this.f4263g;
                tqyVar2.f222917c = 1;
                objM53909a = ((jpa1) ipa1Var).m53909a(str, str2, arrayList, zM77813b, tqyVar2);
                yuk yukVar = yuk.f276404a;
                if (objM53909a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM53909a);
            }
            return (String) objM53909a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Serializable m12020k(String str, String str2, ArrayList arrayList, ibk ibkVar) {
        uqy uqyVar;
        if (ibkVar instanceof uqy) {
            uqyVar = (uqy) ibkVar;
            int i = uqyVar.f233151c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqyVar.f233151c = i - Integer.MIN_VALUE;
            } else {
                uqyVar = new uqy(this, ibkVar);
            }
        } else {
            uqyVar = new uqy(this, ibkVar);
        }
        uqy uqyVar2 = uqyVar;
        Object objM53910b = uqyVar2.f233149a;
        int i2 = uqyVar2.f233151c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM53910b);
                WorkerParameters workerParameters = this.f66917b;
                sco scoVar = workerParameters.f1404b;
                sco scoVar2 = workerParameters.f1404b;
                String strM77815d = scoVar.m77815d("jira_feature");
                String[] strArrM77816e = scoVar2.m77816e("jira_labels");
                List listM29620k1 = strArrM77816e != null ? bk5.m29620k1(strArrM77816e) : null;
                String strM77815d2 = scoVar2.m77815d("jira_report_source");
                if (strM77815d2 != null) {
                    str2 = klh.m56834f(str2, "\n\n---\nReport source: ", strM77815d2);
                }
                String str3 = str2;
                ipa1 ipa1Var = this.f4263g;
                uqyVar2.f233151c = 1;
                objM53910b = ((jpa1) ipa1Var).m53910b(str, str3, arrayList, strM77815d, listM29620k1, uqyVar2);
                yuk yukVar = yuk.f276404a;
                if (objM53910b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM53910b);
            }
            return (String) objM53910b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
