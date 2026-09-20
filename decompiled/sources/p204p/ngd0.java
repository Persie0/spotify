package p204p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ngd0 implements snd0 {

    /* JADX INFO: renamed from: b */
    public final MediaSessionManager.RemoteUserInfo f153652b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pgd0 f153654d;

    /* JADX INFO: renamed from: a */
    public final Object f153651a = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayList f153653c = new ArrayList();

    public ngd0(pgd0 pgd0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f153654d = pgd0Var;
        this.f153652b = remoteUserInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ngd0) {
            return Objects.equals(this.f153652b, ((ngd0) obj).f153652b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f153652b);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: m */
    public final void mo51516m(int i, String str) {
        this.f153654d.notifyChildrenChanged(this.f153652b, str, Bundle.EMPTY);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: n */
    public final void mo51517n(int i, String str, egd0 egd0Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f153651a) {
            try {
                for (int size = this.f153653c.size() - 1; size >= 0; size--) {
                    ogd0 ogd0Var = (ogd0) this.f153653c.get(size);
                    if (Objects.equals(this.f153652b, ogd0Var.f165092b) && ogd0Var.f165093c.equals(str)) {
                        arrayList.add(ogd0Var);
                        this.f153653c.remove(size);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f153654d.m69877b(new zaz(18, this, arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
