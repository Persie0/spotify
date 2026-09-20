package p204p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w6l0 {

    /* JADX INFO: renamed from: a */
    public boolean f248420a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f248421b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public ri00 f248422c;

    public w6l0(boolean z) {
        this.f248420a = z;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo42561b();

    /* JADX INFO: renamed from: e */
    public final void m87300e() {
        Iterator it = this.f248421b.iterator();
        while (it.hasNext()) {
            ((aqb) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.eh00, p.ri00] */
    /* JADX INFO: renamed from: f */
    public final void m87301f(boolean z) {
        this.f248420a = z;
        ?? r1 = this.f248422c;
        if (r1 != 0) {
            r1.invoke();
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo42560a() {
    }

    /* JADX INFO: renamed from: c */
    public void mo42562c(fi8 fi8Var) {
    }

    /* JADX INFO: renamed from: d */
    public void mo42563d(fi8 fi8Var) {
    }
}
