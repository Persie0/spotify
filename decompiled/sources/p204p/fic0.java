package p204p;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fic0 extends ReentrantLock {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f69841g = 0;

    /* JADX INFO: renamed from: a */
    public final ajc0 f69842a;

    /* JADX INFO: renamed from: b */
    public volatile int f69843b;

    /* JADX INFO: renamed from: c */
    public int f69844c;

    /* JADX INFO: renamed from: d */
    public int f69845d;

    /* JADX INFO: renamed from: e */
    public volatile AtomicReferenceArray f69846e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f69847f = new AtomicInteger();

    public fic0(ajc0 ajc0Var, int i) {
        this.f69842a = ajc0Var;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.f69845d = (atomicReferenceArray.length() * 3) / 4;
        this.f69846e = atomicReferenceArray;
    }

    /* JADX INFO: renamed from: a */
    public final void m41702a(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            dic0 dic0Var = (dic0) objPoll;
            ajc0 ajc0Var = this.f69842a;
            ajc0Var.getClass();
            int iMo26067b = dic0Var.mo26067b();
            fic0 fic0VarM26150b = ajc0Var.m26150b(iMo26067b);
            fic0VarM26150b.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = fic0VarM26150b.f69846e;
                int length = iMo26067b & (atomicReferenceArray.length() - 1);
                dic0 dic0Var2 = (dic0) atomicReferenceArray.get(length);
                for (dic0 dic0VarMo26068c = dic0Var2; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                    if (dic0VarMo26068c == dic0Var) {
                        fic0VarM26150b.f69844c++;
                        dic0 dic0VarM41710i = fic0VarM26150b.m41710i(dic0Var2, dic0VarMo26068c);
                        int i2 = fic0VarM26150b.f69843b - 1;
                        atomicReferenceArray.set(length, dic0VarM41710i);
                        fic0VarM26150b.f69843b = i2;
                        break;
                    }
                }
                fic0VarM26150b.unlock();
                i++;
            } catch (Throwable th) {
                fic0VarM26150b.unlock();
                throw th;
            }
        } while (i != 16);
    }

    /* JADX INFO: renamed from: b */
    public final void m41703b(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            xic0 xic0Var = (xic0) objPoll;
            ajc0 ajc0Var = this.f69842a;
            ajc0Var.getClass();
            dic0 dic0VarMo91116a = xic0Var.mo91116a();
            int iMo26067b = dic0VarMo91116a.mo26067b();
            fic0 fic0VarM26150b = ajc0Var.m26150b(iMo26067b);
            Object key = dic0VarMo91116a.getKey();
            fic0VarM26150b.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = fic0VarM26150b.f69846e;
                int length = (atomicReferenceArray.length() - 1) & iMo26067b;
                dic0 dic0Var = (dic0) atomicReferenceArray.get(length);
                for (dic0 dic0VarMo26068c = dic0Var; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                    Object key2 = dic0VarMo26068c.getKey();
                    if (dic0VarMo26068c.mo26067b() == iMo26067b && key2 != null && fic0VarM26150b.f69842a.f16235e.m28859c(key, key2)) {
                        if (((wic0) dic0VarMo26068c).mo67011a() != xic0Var) {
                            break;
                        }
                        fic0VarM26150b.f69844c++;
                        dic0 dic0VarM41710i = fic0VarM26150b.m41710i(dic0Var, dic0VarMo26068c);
                        int i2 = fic0VarM26150b.f69843b - 1;
                        atomicReferenceArray.set(length, dic0VarM41710i);
                        fic0VarM26150b.f69843b = i2;
                        break;
                    }
                }
                fic0VarM26150b.unlock();
                i++;
            } catch (Throwable th) {
                fic0VarM26150b.unlock();
                throw th;
            }
        } while (i != 16);
    }

    /* JADX INFO: renamed from: c */
    public final void m41704c() {
        AtomicReferenceArray atomicReferenceArray = this.f69846e;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.f69843b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f69845d = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            dic0 dic0VarMo26068c = (dic0) atomicReferenceArray.get(i2);
            if (dic0VarMo26068c != null) {
                dic0 dic0VarMo26068c2 = dic0VarMo26068c.mo26068c();
                int iMo26067b = dic0VarMo26068c.mo26067b() & length2;
                if (dic0VarMo26068c2 == null) {
                    atomicReferenceArray2.set(iMo26067b, dic0VarMo26068c);
                } else {
                    dic0 dic0Var = dic0VarMo26068c;
                    while (dic0VarMo26068c2 != null) {
                        int iMo26067b2 = dic0VarMo26068c2.mo26067b() & length2;
                        if (iMo26067b2 != iMo26067b) {
                            dic0Var = dic0VarMo26068c2;
                            iMo26067b = iMo26067b2;
                        }
                        dic0VarMo26068c2 = dic0VarMo26068c2.mo26068c();
                    }
                    atomicReferenceArray2.set(iMo26067b, dic0Var);
                    while (dic0VarMo26068c != dic0Var) {
                        int iMo26067b3 = dic0VarMo26068c.mo26067b() & length2;
                        dic0 dic0VarMo24402d = this.f69842a.f16236f.mo24402d(mo41712k(), dic0VarMo26068c, (dic0) atomicReferenceArray2.get(iMo26067b3));
                        if (dic0VarMo24402d != null) {
                            atomicReferenceArray2.set(iMo26067b3, dic0VarMo24402d);
                        } else {
                            i--;
                        }
                        dic0VarMo26068c = dic0VarMo26068c.mo26068c();
                    }
                }
            }
        }
        this.f69846e = atomicReferenceArray2;
        this.f69843b = i;
    }

    /* JADX INFO: renamed from: d */
    public final dic0 m41705d(int i, Object obj) {
        if (this.f69843b == 0) {
            return null;
        }
        AtomicReferenceArray atomicReferenceArray = this.f69846e;
        for (dic0 dic0VarMo26068c = (dic0) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
            if (dic0VarMo26068c.mo26067b() == i) {
                Object key = dic0VarMo26068c.getKey();
                if (key == null) {
                    m41714m();
                } else if (this.f69842a.f16235e.m28859c(obj, key)) {
                    return dic0VarMo26068c;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m41708g() {
        if ((this.f69847f.incrementAndGet() & 63) == 0) {
            m41711j();
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m41709h(Object obj, Object obj2, boolean z, int i) {
        lock();
        try {
            m41711j();
            int i2 = this.f69843b + 1;
            if (i2 > this.f69845d) {
                m41704c();
                i2 = this.f69843b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f69846e;
            int length = (atomicReferenceArray.length() - 1) & i;
            dic0 dic0Var = (dic0) atomicReferenceArray.get(length);
            for (dic0 dic0VarMo26068c = dic0Var; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                Object key = dic0VarMo26068c.getKey();
                if (dic0VarMo26068c.mo26067b() == i && key != null && this.f69842a.f16235e.m28859c(obj, key)) {
                    Object value = dic0VarMo26068c.getValue();
                    if (value == null) {
                        this.f69844c++;
                        m41713l(dic0VarMo26068c, obj2);
                        this.f69843b = this.f69843b;
                        return null;
                    }
                    if (z) {
                        return value;
                    }
                    this.f69844c++;
                    m41713l(dic0VarMo26068c, obj2);
                    return value;
                }
            }
            this.f69844c++;
            dic0 dic0VarMo24401c = this.f69842a.f16236f.mo24401c(mo41712k(), obj, i, dic0Var);
            m41713l(dic0VarMo24401c, obj2);
            atomicReferenceArray.set(length, dic0VarMo24401c);
            this.f69843b = i2;
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final dic0 m41710i(dic0 dic0Var, dic0 dic0Var2) {
        int i = this.f69843b;
        dic0 dic0VarMo26068c = dic0Var2.mo26068c();
        while (dic0Var != dic0Var2) {
            dic0 dic0VarMo24402d = this.f69842a.f16236f.mo24402d(mo41712k(), dic0Var, dic0VarMo26068c);
            if (dic0VarMo24402d != null) {
                dic0VarMo26068c = dic0VarMo24402d;
            } else {
                i--;
            }
            dic0Var = dic0Var.mo26068c();
        }
        this.f69843b = i;
        return dic0VarMo26068c;
    }

    /* JADX INFO: renamed from: j */
    public final void m41711j() {
        if (tryLock()) {
            try {
                mo41707f();
                this.f69847f.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract fic0 mo41712k();

    /* JADX INFO: renamed from: l */
    public final void m41713l(dic0 dic0Var, Object obj) {
        this.f69842a.f16236f.mo24399a(mo41712k(), dic0Var, obj);
    }

    /* JADX INFO: renamed from: m */
    public final void m41714m() {
        if (tryLock()) {
            try {
                mo41707f();
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo41706e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo41707f() {
    }
}
