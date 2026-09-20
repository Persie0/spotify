package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;

/* JADX INFO: loaded from: classes7.dex */
public final class w0p0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246788a = 0;

    /* JADX INFO: renamed from: b */
    public final luk f246789b;

    /* JADX INFO: renamed from: c */
    public final onc f246790c;

    public w0p0(Flowable flowable, luk lukVar) {
        this.f246789b = lukVar;
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f246790c = new onc(flowable);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m86957a(w0p0 w0p0Var, String str, PlayerQueue playerQueue) {
        pf40<ContextTrack> pf40VarNextTracks = playerQueue.nextTracks();
        if (pf40VarNextTracks.isEmpty()) {
            return false;
        }
        for (ContextTrack contextTrack : pf40VarNextTracks) {
            wj50.m88279p(contextTrack);
            if (e72.m37988V(contextTrack) && wj50.m88271j(contextTrack.uri(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f246788a) {
            case 0:
                zv41 zv41VarM52819d = jag1.m52819d("");
                c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(njg1.m64613f(), this.f246789b));
                fbk fbkVar = null;
                x0h1.m89578u(c9kVarM56661c, null, 0, new iso0(zv41VarM52819d, this, consumer, fbkVar, 2), 3);
                x0h1.m89578u(c9kVarM56661c, null, 0, new d2n0(this, consumer, fbkVar, 25), 3);
                return new v0p0(zv41VarM52819d, c9kVarM56661c);
            default:
                zv41 zv41VarM52819d2 = jag1.m52819d(new pqm0("", Boolean.FALSE));
                c9k c9kVarM56661c2 = kk40.m56661c(opo.m67570t(njg1.m64613f(), this.f246789b));
                x0h1.m89578u(c9kVarM56661c2, null, 0, new hrt0(zv41VarM52819d2, this, consumer, null, 0), 3);
                return new v0p0(zv41VarM52819d2, this, c9kVarM56661c2);
        }
    }

    public w0p0(jrw jrwVar, luk lukVar) {
        this.f246789b = lukVar;
        FlowableRefCount flowableRefCount = jrwVar.f115322c;
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f246790c = new onc(flowableRefCount);
    }
}
