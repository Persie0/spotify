package p204p;

import android.content.Context;
import com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException;
import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class zqy implements vqy {

    /* JADX INFO: renamed from: d */
    public static final lsi0 f285476d = msi0.m62770a();

    /* JADX INFO: renamed from: a */
    public final az1 f285477a;

    /* JADX INFO: renamed from: b */
    public final rqy f285478b;

    /* JADX INFO: renamed from: c */
    public final e8x f285479c;

    public zqy(Context context, hv31 hv31Var, xre xreVar) {
        az1 az1Var = new az1(context);
        rqy rqyVar = new rqy(hv31Var);
        e8x e8xVar = new e8x(0, xreVar, xre.class, "currentTimeMillis", "currentTimeMillis()J", 0, 0, 3);
        this.f285477a = az1Var;
        this.f285478b = rqyVar;
        this.f285479c = e8xVar;
    }

    /* JADX INFO: renamed from: c */
    public static lnl0 m96748c(sco scoVar) {
        return (lnl0) ((knl0) ((knl0) new knl0(FeedbackUploadWorker.class).m31262i(scoVar)).m31259f(new a8j(new thj0(null), 2, false, false, true, false, -1L, -1L, g6f.m43736n1(new LinkedHashSet())))).m31255b();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:23:0x0052, B:36:0x009e, B:38:0x00aa, B:39:0x00e5, B:41:0x00eb, B:42:0x00f9, B:43:0x0105, B:54:0x012d, B:55:0x0134), top: B:64:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[Catch: all -> 0x0056, LOOP:0: B:39:0x00e5->B:41:0x00eb, LOOP_END, TryCatch #2 {all -> 0x0056, blocks: (B:23:0x0052, B:36:0x009e, B:38:0x00aa, B:39:0x00e5, B:41:0x00eb, B:42:0x00f9, B:43:0x0105, B:54:0x012d, B:55:0x0134), top: B:64:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #2 {all -> 0x0056, blocks: (B:23:0x0052, B:36:0x009e, B:38:0x00aa, B:39:0x00e5, B:41:0x00eb, B:42:0x00f9, B:43:0x0105, B:54:0x012d, B:55:0x0134), top: B:64:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m96749a(sco scoVar, List list, ibk ibkVar) throws Throwable {
        wqy wqyVar;
        List list2;
        sco scoVar2;
        int i;
        jsi0 jsi0Var;
        jsi0 jsi0Var2;
        jsi0 jsi0Var3;
        sco scoVar3;
        List list3;
        int i2;
        lnl0 lnl0VarM96748c;
        ArrayList arrayList;
        Iterator it;
        lnl0 lnl0Var;
        az1 az1Var;
        if (ibkVar instanceof wqy) {
            wqyVar = (wqy) ibkVar;
            int i3 = wqyVar.f254201i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wqyVar.f254201i = i3 - Integer.MIN_VALUE;
            } else {
                wqyVar = new wqy(this, ibkVar);
            }
        } else {
            wqyVar = new wqy(this, ibkVar);
        }
        Object obj = wqyVar.f254199g;
        int i4 = wqyVar.f254201i;
        int i5 = 0;
        rqy rqyVar = this.f285478b;
        Object obj2 = yuk.f276404a;
        try {
            if (i4 == 0) {
                bga.m29073P(obj);
                wqyVar.f254193a = scoVar;
                list2 = list;
                wqyVar.f254194b = list2;
                lsi0 lsi0Var = f285476d;
                wqyVar.f254195c = lsi0Var;
                wqyVar.f254197e = 0;
                wqyVar.f254201i = 1;
                if (lsi0Var.mo54248a(wqyVar) != obj2) {
                    scoVar2 = scoVar;
                    i = 0;
                    jsi0Var = lsi0Var;
                }
                return obj2;
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    i5 = wqyVar.f254198f;
                    i2 = wqyVar.f254197e;
                    jsi0Var3 = wqyVar.f254195c;
                    list3 = wqyVar.f254194b;
                    scoVar3 = wqyVar.f254193a;
                    try {
                        bga.m29073P(obj);
                        if (rqyVar.m76269c().size() < 20) {
                            throw new FeedbackSubmissionException("Bug report queue is full (max 20 reports). Please wait for connectivity.", null);
                        }
                        long jLongValue = ((Number) this.f285479c.invoke()).longValue();
                        qco qcoVar = new qco(0);
                        qcoVar.m72561e(scoVar3.f207773a);
                        qcoVar.f187393a.put("enqueued_at_millis", Long.valueOf(jLongValue));
                        lnl0VarM96748c = m96748c(qcoVar.m72559a());
                        UUID uuid = lnl0VarM96748c.f55193a;
                        arrayList = new ArrayList(i6f.m49804T(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((File) it.next()).getAbsolutePath());
                        }
                        rqyVar.m76268a(new qqy(uuid, jLongValue, g6f.m43736n1(arrayList)));
                        try {
                            az1Var = this.f285477a;
                            wqyVar.f254193a = null;
                            wqyVar.f254194b = null;
                            wqyVar.f254195c = jsi0Var3;
                            wqyVar.f254196d = lnl0VarM96748c;
                            wqyVar.f254197e = i2;
                            wqyVar.f254198f = i5;
                            wqyVar.f254201i = 3;
                            if (az1Var.m27562c(lnl0VarM96748c, wqyVar) != obj2) {
                                jsi0Var2 = jsi0Var3;
                                lnl0Var = lnl0VarM96748c;
                                UUID uuid2 = lnl0Var.f55193a;
                                jsi0Var2.mo54249c(null);
                                return uuid2;
                            }
                            return obj2;
                        } catch (Exception e) {
                            e = e;
                            lnl0Var = lnl0VarM96748c;
                            rqyVar.m76270d(lnl0Var.f55193a);
                            throw e;
                        }
                    } catch (Throwable th) {
                        th = th;
                        jsi0Var2 = jsi0Var3;
                    }
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lnl0Var = wqyVar.f254196d;
                    jsi0Var2 = wqyVar.f254195c;
                    try {
                        try {
                            bga.m29073P(obj);
                            UUID uuid3 = lnl0Var.f55193a;
                            jsi0Var2.mo54249c(null);
                            return uuid3;
                        } catch (Exception e2) {
                            e = e2;
                            rqyVar.m76270d(lnl0Var.f55193a);
                            throw e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                jsi0Var2.mo54249c(null);
                throw th;
            }
            int i6 = wqyVar.f254197e;
            jsi0Var = wqyVar.f254195c;
            List list4 = wqyVar.f254194b;
            scoVar2 = wqyVar.f254193a;
            bga.m29073P(obj);
            i = i6;
            list2 = list4;
            wqyVar.f254193a = scoVar2;
            wqyVar.f254194b = list2;
            wqyVar.f254195c = jsi0Var;
            wqyVar.f254197e = i;
            wqyVar.f254198f = 0;
            wqyVar.f254201i = 2;
            if (m96751d(wqyVar) != obj2) {
                jsi0Var3 = jsi0Var;
                scoVar3 = scoVar2;
                list3 = list2;
                i2 = i;
                if (rqyVar.m76269c().size() < 20) {
                    throw new FeedbackSubmissionException("Bug report queue is full (max 20 reports). Please wait for connectivity.", null);
                }
                long jLongValue2 = ((Number) this.f285479c.invoke()).longValue();
                qco qcoVar2 = new qco(0);
                qcoVar2.m72561e(scoVar3.f207773a);
                qcoVar2.f187393a.put("enqueued_at_millis", Long.valueOf(jLongValue2));
                lnl0VarM96748c = m96748c(qcoVar2.m72559a());
                UUID uuid4 = lnl0VarM96748c.f55193a;
                arrayList = new ArrayList(i6f.m49804T(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((File) it.next()).getAbsolutePath());
                }
                rqyVar.m76268a(new qqy(uuid4, jLongValue2, g6f.m43736n1(arrayList)));
                az1Var = this.f285477a;
                wqyVar.f254193a = null;
                wqyVar.f254194b = null;
                wqyVar.f254195c = jsi0Var3;
                wqyVar.f254196d = lnl0VarM96748c;
                wqyVar.f254197e = i2;
                wqyVar.f254198f = i5;
                wqyVar.f254201i = 3;
                if (az1Var.m27562c(lnl0VarM96748c, wqyVar) != obj2) {
                    jsi0Var2 = jsi0Var3;
                    lnl0Var = lnl0VarM96748c;
                    UUID uuid5 = lnl0Var.f55193a;
                    jsi0Var2.mo54249c(null);
                    return uuid5;
                }
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            jsi0Var2 = jsi0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m96750b(sco scoVar, ibk ibkVar) {
        xqy xqyVar;
        lnl0 lnl0VarM96748c;
        if (ibkVar instanceof xqy) {
            xqyVar = (xqy) ibkVar;
            int i = xqyVar.f265148d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xqyVar.f265148d = i - Integer.MIN_VALUE;
            } else {
                xqyVar = new xqy(this, ibkVar);
            }
        } else {
            xqyVar = new xqy(this, ibkVar);
        }
        Object obj = xqyVar.f265146b;
        int i2 = xqyVar.f265148d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lnl0VarM96748c = m96748c(scoVar);
            xqyVar.f265145a = lnl0VarM96748c;
            xqyVar.f265148d = 1;
            Object objM27562c = this.f285477a.m27562c(lnl0VarM96748c, xqyVar);
            yuk yukVar = yuk.f276404a;
            if (objM27562c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lnl0VarM96748c = xqyVar.f265145a;
            bga.m29073P(obj);
        }
        return lnl0VarM96748c.f55193a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c1 -> B:36:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d0 -> B:17:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m96751d(p204p.ibk r18) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zqy.m96751d(p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final void m96752e(UUID uuid) {
        Set set;
        qqy qqyVarM76270d = this.f285478b.m76270d(uuid);
        if (qqyVarM76270d == null || (set = qqyVarM76270d.f191676c) == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            new File((String) it.next()).delete();
        }
    }
}
