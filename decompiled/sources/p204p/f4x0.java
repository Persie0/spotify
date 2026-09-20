package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f4x0 extends ly8 {
    public f4x0(fbk fbkVar) {
        super(fbkVar);
        if (fbkVar != null && fbkVar.getContext() != dau.f47107a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return dau.f47107a;
    }
}
