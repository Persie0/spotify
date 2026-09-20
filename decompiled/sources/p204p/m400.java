package p204p;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m400 implements ua40 {

    /* JADX INFO: renamed from: b */
    public final ua40 f139786b;

    /* JADX INFO: renamed from: a */
    public final Object f139785a = new Object();

    /* JADX INFO: renamed from: c */
    public final HashSet f139787c = new HashSet();

    public m400(ua40 ua40Var) {
        this.f139786b = ua40Var;
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: G0 */
    public final egb1[] mo60746G0() {
        return this.f139786b.mo60746G0();
    }

    /* JADX INFO: renamed from: a */
    public final void m60747a(l400 l400Var) {
        synchronized (this.f139785a) {
            this.f139787c.add(l400Var);
        }
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: b */
    public int mo60748b() {
        return this.f139786b.mo60748b();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f139786b.close();
        synchronized (this.f139785a) {
            hashSet = new HashSet(this.f139787c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((l400) it.next()).mo24662c(this);
        }
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: d */
    public int mo60749d() {
        return this.f139786b.mo60749d();
    }

    @Override // p204p.ua40
    public final int getFormat() {
        return this.f139786b.getFormat();
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: i1 */
    public s640 mo60750i1() {
        return this.f139786b.mo60750i1();
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: j */
    public final Image mo60751j() {
        return this.f139786b.mo60751j();
    }
}
