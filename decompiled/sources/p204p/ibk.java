package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ibk extends ly8 {
    private final juk _context;
    private transient fbk<Object> intercepted;

    public ibk(fbk fbkVar, juk jukVar) {
        super(fbkVar);
        this._context = jukVar;
    }

    @Override // p204p.fbk
    public juk getContext() {
        juk jukVar = this._context;
        wj50.m88279p(jukVar);
        return jukVar;
    }

    public final fbk<Object> intercepted() {
        fbk<Object> fbkVar = this.intercepted;
        if (fbkVar != null) {
            return fbkVar;
        }
        jbk jbkVar = (jbk) getContext().mo26595B(hcp0.f89853L0);
        fbk<Object> lsrVar = jbkVar != null ? new lsr((luk) jbkVar, this) : this;
        this.intercepted = lsrVar;
        return lsrVar;
    }

    @Override // p204p.ly8
    public void releaseIntercepted() {
        fbk<Object> fbkVar = this.intercepted;
        if (fbkVar != null && fbkVar != this) {
            huk hukVarMo26595B = getContext().mo26595B(hcp0.f89853L0);
            wj50.m88279p(hukVarMo26595B);
            lsr lsrVar = (lsr) fbkVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lsr.f136585h;
            while (atomicReferenceFieldUpdater.get(lsrVar) == vvx.f245350b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(lsrVar);
            hqb hqbVar = obj instanceof hqb ? (hqb) obj : null;
            if (hqbVar != null) {
                hqbVar.m48218m();
            }
        }
        this.intercepted = quf.f192696b;
    }

    public ibk(fbk fbkVar) {
        this(fbkVar, fbkVar != null ? fbkVar.getContext() : null);
    }
}
