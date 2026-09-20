package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: classes11.dex */
public final class o9b1 extends yew {
    @Override // p204p.yew, com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        String strM56833e;
        if (next.m15609c() && next.m15610d()) {
            strM56833e = "next=" + next.m15613g() + "\n\tdispatch=" + next.mo15561b();
        } else if (next.m15610d()) {
            strM56833e = klh.m56833e(next.m15613g(), "next=");
        } else if (next.m15609c()) {
            strM56833e = "dispatch=" + next.mo15561b();
        } else {
            strM56833e = "next=Nothing";
        }
        Logger.m3969e("UPDATE:\n\tevent=%s\n\tmodel=%s\n\t%s", obj2, obj, strM56833e);
    }

    @Override // p204p.yew, com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
        Logger.m3969e("INIT:\n\tmodel=%s\n\tinitialized=%s\n\teffects=%s", obj, first.mo15560d(), first.mo15559a());
    }
}
