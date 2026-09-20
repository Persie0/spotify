package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class i3u implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u5u f98273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqi0 f98274b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u4u f98275c;

    public i3u(u5u u5uVar, hqi0 hqi0Var, u4u u4uVar) {
        this.f98273a = u5uVar;
        this.f98274b = hqi0Var;
        this.f98275c = u4uVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ef81 ef81Var;
        fh0 fh0Var;
        hm0 hm0Var = (hm0) obj;
        u5u u5uVar = this.f98273a;
        i5u i5uVar = u5uVar.f227120m;
        String str = (i5uVar == null || (ef81Var = i5uVar.f99023a) == null || (fh0Var = ef81Var.f58981a) == null) ? null : fh0Var.f69506a;
        if (str == null ? false : str.equals(hm0Var.f92788a.f69506a)) {
            i5u i5uVar2 = u5uVar.f227120m;
            if (i5uVar2 != null) {
                i5uVar2.f99024b = true;
            }
            this.f98274b.mo46962a(j5k0.f108994a);
            u4u.m82365b(this.f98275c, 7, hm0Var.f92788a, null, null, 12);
        }
        return w2a1.f247311a;
    }
}
