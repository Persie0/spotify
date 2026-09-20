package p204p;

import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ui8 extends mic1 {

    /* JADX INFO: renamed from: b */
    public final UUID f230614b;

    /* JADX INFO: renamed from: c */
    public WeakReference f230615c;

    public ui8(x8y0 x8y0Var) {
        UUID uuidRandomUUID = (UUID) x8y0Var.m90232b("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            x8y0Var.m90234d(uuidRandomUUID, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f230614b = uuidRandomUUID;
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        WeakReference weakReference = this.f230615c;
        if (weakReference == null) {
            wj50.m88260d0("saveableStateHolderRef");
            throw null;
        }
        b8y0 b8y0Var = (b8y0) weakReference.get();
        if (b8y0Var != null) {
            b8y0Var.mo28440a(this.f230614b);
        }
        WeakReference weakReference2 = this.f230615c;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            wj50.m88260d0("saveableStateHolderRef");
            throw null;
        }
    }
}
