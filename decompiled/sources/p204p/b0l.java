package p204p;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes6.dex */
public final class b0l {

    /* JADX INFO: renamed from: e */
    public static final b0l f21940e = new b0l();

    /* JADX INFO: renamed from: a */
    public final Object f21941a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f21942b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public C2401t5 f21943c;

    /* JADX INFO: renamed from: d */
    public boolean f21944d;

    /* JADX INFO: renamed from: a */
    public final void m27836a(long j, String str, String str2) {
        m27838c(2, str, str2, j);
    }

    /* JADX INFO: renamed from: b */
    public final void m27837b() {
        a0l a0lVar;
        C2401t5 c2401t5;
        while (true) {
            synchronized (this.f21941a) {
                a0lVar = (a0l) this.f21942b.pollFirst();
                if (a0lVar == null) {
                    this.f21944d = false;
                    return;
                } else {
                    c2401t5 = this.f21943c;
                    if (c2401t5 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            c2401t5.invoke(a0lVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27838c(int i, String str, String str2, long j) {
        boolean z;
        synchronized (this.f21941a) {
            a0l a0lVar = new a0l(i, str, str2, j);
            ArrayDeque arrayDeque = this.f21942b;
            if (this.f21943c == null && arrayDeque.size() == 128) {
                arrayDeque.removeFirst();
            }
            arrayDeque.addLast(a0lVar);
            if (this.f21944d || this.f21943c == null || this.f21942b.isEmpty()) {
                z = false;
            } else {
                z = true;
                this.f21944d = true;
            }
        }
        if (z) {
            m27837b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m27839d(long j, String str) {
        m27838c(1, str, null, j);
    }
}
