package p204p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class d240 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h240 f44475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MusicAppLock f44476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d240(h240 h240Var, fbk fbkVar, MusicAppLock musicAppLock, int i) {
        super(2, fbkVar);
        this.f44474a = i;
        this.f44475b = h240Var;
        this.f44476c = musicAppLock;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f44474a) {
            case 0:
                return new d240(this.f44475b, fbkVar, this.f44476c, 0);
            case 1:
                return new d240(this.f44475b, fbkVar, this.f44476c, 1);
            default:
                return new d240(this.f44475b, fbkVar, this.f44476c, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f44474a) {
            case 0:
                d240 d240Var = (d240) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                d240Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                d240 d240Var2 = (d240) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                d240Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            default:
                d240 d240Var3 = (d240) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                d240Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f44474a) {
            case 0:
                bga.m29073P(obj);
                Iterator it = this.f44475b.f86885b.iterator();
                while (it.hasNext()) {
                    ((a240) it.next()).mo24494e(this.f44476c);
                }
                break;
            case 1:
                bga.m29073P(obj);
                Iterator it2 = this.f44475b.f86885b.iterator();
                while (it2.hasNext()) {
                    ((a240) it2.next()).mo24490a(this.f44476c);
                }
                break;
            default:
                bga.m29073P(obj);
                Iterator it3 = this.f44475b.f86885b.iterator();
                while (it3.hasNext()) {
                    ((a240) it3.next()).mo24497h(this.f44476c);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
