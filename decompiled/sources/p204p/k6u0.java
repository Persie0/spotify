package p204p;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class k6u0 {

    /* JADX INFO: renamed from: a */
    public final wra0 f119842a;

    /* JADX INFO: renamed from: b */
    public List f119843b = lau.f131415a;

    /* JADX INFO: renamed from: c */
    public final Object f119844c = new Object();

    public k6u0(wra0 wra0Var) {
        this.f119842a = wra0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55622a(String str) {
        synchronized (this.f119844c) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            for (p6u0 p6u0Var : this.f119843b) {
                int i = p6u0Var.f174497b;
                int i2 = p6u0Var.f174496a;
                if (i2 != 0 && i != 0) {
                    Queue queue = (Queue) p6u0Var.f174498c.get(str);
                    if (queue != null && queue.size() >= i) {
                        long j = seconds - ((long) i2);
                        Object objPeek = queue.peek();
                        wj50.m88279p(objPeek);
                        if (j > ((Number) objPeek).longValue()) {
                        }
                    }
                }
                return false;
            }
            for (p6u0 p6u0Var2 : this.f119843b) {
                LinkedHashMap linkedHashMap = p6u0Var2.f174498c;
                Queue queue2 = (Queue) linkedHashMap.get(str);
                if (queue2 == null) {
                    linkedHashMap.put(str, new LinkedList());
                    queue2 = (Queue) linkedHashMap.get(str);
                }
                if (queue2.size() == p6u0Var2.f174497b) {
                    queue2.poll();
                }
                queue2.add(Long.valueOf(seconds));
            }
            return true;
        }
    }
}
