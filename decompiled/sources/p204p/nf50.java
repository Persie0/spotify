package p204p;

import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nf50 {

    /* JADX INFO: renamed from: a */
    public final xre f153250a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f153251b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f153252c = new LinkedHashMap();

    public nf50(List list, xre xreVar) {
        this.f153250a = xreVar;
        this.f153251b = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public final long m64325a() {
        ((wy3) this.f153250a).getClass();
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final Map.Entry m64326b(String str) {
        Object next;
        Iterator it = this.f153252c.entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(((g6s) ((Map.Entry) next).getKey()).mo43762a(), str)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    /* JADX INFO: renamed from: c */
    public final void m64327c(String str, long j, BetamaxDownloadException betamaxDownloadException) {
        long jM64325a = m64325a();
        Map.Entry entryM64326b = m64326b(str);
        if (entryM64326b != null) {
            g6s g6sVar = (g6s) entryM64326b.getKey();
            Iterator it = ((List) entryM64326b.getValue()).iterator();
            while (it.hasNext()) {
                ((s89) it.next()).mo26723g(g6sVar, j, betamaxDownloadException, jM64325a);
            }
        }
        m64328d(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m64328d(String str) {
        g6s g6sVar;
        Map.Entry entryM64326b = m64326b(str);
        if (entryM64326b == null || (g6sVar = (g6s) entryM64326b.getKey()) == null) {
            return;
        }
    }
}
