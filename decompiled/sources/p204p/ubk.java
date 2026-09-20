package p204p;

import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class ubk implements pa81 {

    /* JADX INFO: renamed from: a */
    public final String f228806a;

    /* JADX INFO: renamed from: b */
    public final nok0 f228807b;

    /* JADX INFO: renamed from: c */
    public final iaz f228808c;

    /* JADX INFO: renamed from: e */
    public final long f228810e;

    /* JADX INFO: renamed from: d */
    public final UUID f228809d = UUID.randomUUID();

    /* JADX INFO: renamed from: f */
    public final ReentrantLock f228811f = new ReentrantLock();

    /* JADX INFO: renamed from: g */
    public final ArrayList f228812g = new ArrayList();

    public ubk(String str, nok0 nok0Var, iaz iazVar) {
        this.f228806a = str;
        this.f228807b = nok0Var;
        this.f228808c = iazVar;
        this.f228810e = nok0Var.m65241a();
    }

    @Override // p204p.pa81
    /* JADX INFO: renamed from: b */
    public final long mo51101b() {
        return this.f228810e;
    }

    @Override // p204p.pa81
    /* JADX INFO: renamed from: c */
    public final aw31 mo51102c(Long l, String str) {
        bw31 bw31Var;
        if (l != null) {
            bw31Var = new bw31(str, this.f228807b, l.longValue(), 0L, this.f228808c, this.f228806a, 8);
        } else {
            bw31Var = new bw31(str, this.f228807b, 0L, 0L, this.f228808c, this.f228806a, 12);
        }
        ReentrantLock reentrantLock = this.f228811f;
        reentrantLock.lock();
        try {
            this.f228812g.add(bw31Var);
            return bw31Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p204p.pa81
    /* JADX INFO: renamed from: d */
    public final void mo51103d(String str) {
        Object objPrevious;
        ReentrantLock reentrantLock = this.f228811f;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.f228812g;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!wj50.m88271j(((bw31) objPrevious).f31520a, str));
            bw31 bw31Var = (bw31) objPrevious;
            if (bw31Var != null) {
                bw31Var.mo27275a(null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p204p.pa81
    /* JADX INFO: renamed from: e */
    public final aw31 mo51104e(long j, String str, long j2) {
        bw31 bw31Var = new bw31(str, this.f228807b, j, j2, null, null, ContentType.LONG_FORM_ON_DEMAND);
        ReentrantLock reentrantLock = this.f228811f;
        reentrantLock.lock();
        try {
            this.f228812g.add(bw31Var);
            return bw31Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p204p.pa81
    public final UUID getId() {
        return this.f228809d;
    }

    @Override // p204p.pa81
    public final String getKey() {
        return this.f228806a;
    }

    @Override // p204p.pa81
    public final void stop() {
    }

    @Override // p204p.pa81
    /* JADX INFO: renamed from: a */
    public final void mo51100a(long j) {
    }

    @Override // p204p.pa81
    public final void setAttribute(String str, String str2) {
    }
}
