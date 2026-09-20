package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h480 implements ofm0, x7l0 {

    /* JADX INFO: renamed from: a */
    public final btv0 f87464a;

    public h480(btv0 btv0Var) {
        this.f87464a = btv0Var;
    }

    @Override // p204p.x7l0
    /* JADX INFO: renamed from: b */
    public final void mo24810b(String str, i500 i500Var) {
        Iterator it = this.f87464a.entrySet().iterator();
        while (it.hasNext()) {
            ((z380) ((Map.Entry) it.next()).getValue()).mo24810b(str, i500Var);
        }
    }

    @Override // p204p.ofm0
    /* JADX INFO: renamed from: j0 */
    public final jfm0 mo15684j0(Class cls) {
        Object obj = this.f87464a.get(cls);
        return new g480(obj instanceof jfm0 ? (jfm0) obj : null, 0);
    }
}
