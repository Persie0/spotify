package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s4x0 extends f4x0 implements hi00 {

    /* JADX INFO: renamed from: a */
    public final int f205661a;

    public s4x0(int i, fbk fbkVar) {
        super(fbkVar);
        this.f205661a = i;
    }

    @Override // p204p.hi00
    public final int getArity() {
        return this.f205661a;
    }

    @Override // p204p.ly8
    public final String toString() {
        return getCompletion() == null ? qpv0.f191387a.mo54121k(this) : super.toString();
    }
}
