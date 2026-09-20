package p204p;

import com.spotify.messages.ListeningPartyChannelError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: p.c0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C1724c0 implements zzi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f32637b;

    public /* synthetic */ C1724c0(Object obj, int i) {
        this.f32636a = i;
        this.f32637b = obj;
    }

    @Override // p204p.zzi
    /* JADX INFO: renamed from: a */
    public final void mo31064a(yzi yziVar) {
        ArrayList arrayList;
        switch (this.f32636a) {
            case 0:
                wzi wziVar = yziVar.f277831b;
                int i = wziVar == null ? -1 : AbstractC1687b0.f21716a[wziVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    C2435u0 c2435u0 = (C2435u0) ((C1797e0) this.f32637b).f54817a;
                    synchronized (c2435u0.f225337c) {
                        c2435u0.f225337c.clear();
                    }
                    return;
                }
                C1797e0 c1797e0 = (C1797e0) this.f32637b;
                String strValueOf = String.valueOf(yziVar.f277832c);
                qre0 qre0Var = ((C2435u0) c1797e0.f54817a).f225335a;
                rh90 rh90VarM13925q = ListeningPartyChannelError.m13925q();
                rh90VarM13925q.m75508r((String) c1797e0.f54818b);
                rh90VarM13925q.m75507q("Ably connection failed: ".concat(strValueOf));
                rh90VarM13925q.m75506m("none");
                qre0Var.m73616a(rh90VarM13925q.build());
                C2435u0 c2435u1 = (C2435u0) c1797e0.f54817a;
                synchronized (c2435u1.f225337c) {
                    arrayList = new ArrayList(c2435u1.f225337c);
                    c2435u1.f225337c.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((gh00) it.next()).invoke(new C1962i0("Ably connection failed: ".concat(strValueOf)));
                }
                return;
            default:
                ((C2632z) this.f32637b).f188382a.clear();
                return;
        }
    }
}
