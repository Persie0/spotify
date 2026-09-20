package p204p;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class qpa0 implements n2l {

    /* JADX INFO: renamed from: a */
    public final rpa0 f191251a;

    public qpa0(rpa0 rpa0Var) {
        this.f191251a = rpa0Var;
    }

    @Override // p204p.o2l
    /* JADX INFO: renamed from: a */
    public final srw0 mo53449a() {
        String str = "Logs from the last " + TimeUnit.MILLISECONDS.toSeconds(this.f191251a.f201481a.f179988b) + " seconds or the last " + this.f191251a.f201481a.f179989c + " lines, whichever limit is reached first.";
        StringBuilder sb = new StringBuilder(2048);
        rpa0 rpa0Var = this.f191251a;
        synchronized (rpa0Var.f201482b) {
            try {
                Iterator it = rpa0Var.f201481a.f179987a.iterator();
                while (it.hasNext()) {
                    ((dqa0) it.next()).m36636a(sb);
                    sb.append('\n');
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new srw0("LogDog output", str, sb.toString());
    }
}
