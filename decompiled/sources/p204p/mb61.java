package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mb61 extends ibk implements hi00 {
    private final int arity;

    public mb61(int i, fbk fbkVar) {
        super(fbkVar);
        this.arity = i;
    }

    @Override // p204p.hi00
    public int getArity() {
        return this.arity;
    }

    @Override // p204p.ly8
    public String toString() {
        return getCompletion() == null ? qpv0.f191387a.mo54121k(this) : super.toString();
    }
}
