package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ioh0 implements MobiusLoop.Logger {

    /* JADX INFO: renamed from: a */
    public final String f104227a;

    public ioh0(String str) {
        this.f104227a = str;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        if (next.m15610d()) {
            Logger.m3965a("[" + this.f104227a + "] Event received: " + obj2 + " -> Model updated: " + next.m15613g() + " -> Effects dispatched: " + next.mo15561b(), new Object[0]);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final void mo15584b(Object obj, Object obj2, Exception exc) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f104227a);
        sb.append("] FATAL ERROR: exception updating model '");
        sb.append(obj);
        sb.append("' with event '");
        Logger.m3967c(exc, edb.m38568q(sb, obj2, "'"), new Object[0]);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
        Object objMo15560d = first.mo15560d();
        Set setMo15559a = first.mo15559a();
        Objects.toString(objMo15560d);
        Objects.toString(setMo15559a);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final void mo15586d(Object obj, Object obj2) {
        obj2.toString();
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final void mo15587e(Object obj) {
        obj.toString();
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final void mo15588f(Object obj, Exception exc) {
        Logger.m3967c(exc, "[" + this.f104227a + "] FATAL ERROR: exception during init '" + obj + "'", new Object[0]);
    }
}
