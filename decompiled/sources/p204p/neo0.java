package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;

/* JADX INFO: loaded from: classes.dex */
public final class neo0 implements kj30 {

    /* JADX INFO: renamed from: a */
    public final tfm0 f153036a;

    /* JADX INFO: renamed from: b */
    public final yz80 f153037b;

    /* JADX INFO: renamed from: c */
    public final Flowable f153038c;

    /* JADX INFO: renamed from: d */
    public final n6i f153039d;

    /* JADX INFO: renamed from: e */
    public final wek0 f153040e;

    /* JADX INFO: renamed from: f */
    public final gmx f153041f;

    /* JADX INFO: renamed from: g */
    public final jt70 f153042g;

    /* JADX INFO: renamed from: h */
    public final lwr f153043h = new lwr();

    /* JADX INFO: renamed from: i */
    public PlayerState f153044i = PlayerState.EMPTY;

    /* JADX INFO: renamed from: t */
    public boolean f153045t;

    public neo0(hc80 hc80Var, tfm0 tfm0Var, yz80 yz80Var, Flowable flowable, n6i n6iVar, wek0 wek0Var, gmx gmxVar, jt70 jt70Var) {
        this.f153036a = tfm0Var;
        this.f153037b = yz80Var;
        this.f153038c = flowable;
        this.f153039d = n6iVar;
        this.f153040e = wek0Var;
        this.f153041f = gmxVar;
        this.f153042g = jt70Var;
        hc80Var.getLifecycle().mo31986a(new leo0(this, hc80Var, 0));
    }

    /* JADX INFO: renamed from: b */
    public static final void m64265b(neo0 neo0Var, z650 z650Var, boolean z) {
        if (z && neo0Var.f153045t) {
            return;
        }
        wek0.m87885d(neo0Var.f153040e, z650Var);
    }

    @Override // p204p.kj30
    /* JADX INFO: renamed from: a */
    public final void mo44172a(mj30 mj30Var, zj30 zj30Var) {
        xul0 xul0VarPlayerOptionsOverride;
        PlayerOptionOverrides playerOptionOverrides;
        xul0 xul0VarShufflingContext;
        laz lazVar = laz.f131454V0;
        cyx cyxVar = cyx.f43383U0;
        fk30 fk30Var = zj30Var.f283345b;
        xf40 xf40Var = zj30Var.f283346c;
        String strString = mj30Var.data().string("uri");
        boolean zBoolValue = mj30Var.data().boolValue("openNPV", false);
        if (strString == null || strString.length() == 0) {
            return;
        }
        Context contextM79161s = srz.m79161s(mj30Var.data());
        String strUri = contextM79161s != null ? contextM79161s.uri() : null;
        Object obj = xf40Var.get("shouldPlay");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        Boolean bool2 = Boolean.TRUE;
        boolean zM88271j = wj50.m88271j(bool, bool2);
        Object obj2 = xf40Var.get("navigateToNpv");
        boolean zM88271j2 = wj50.m88271j(obj2 instanceof Boolean ? (Boolean) obj2 : null, bool2);
        Object obj3 = xf40Var.get("refreshPlaylist");
        boolean zM88271j3 = wj50.m88271j(obj3 instanceof Boolean ? (Boolean) obj3 : null, bool2);
        String strString2 = fk30Var.custom().string("restriction");
        boolean z = (strString2 != null ? f1h1.m40555u(strString2) : 0) != 0;
        wj30 wj30VarLogging = fk30Var.logging();
        q7k q7kVarM63779i = this.f153039d.m63779i(strString);
        boolean zEquals = strString.equals(hdi.m47210B(this.f153044i));
        tfm0 tfm0Var = this.f153036a;
        lwr lwrVar = this.f153043h;
        if (zEquals && wj50.m88271j(this.f153044i.contextUri(), strUri)) {
            if (!zM88271j) {
                lwrVar.m60127a(q7kVarM63779i.mo71859a().subscribe());
                tfm0Var.m80693g(strString, wj30VarLogging);
                return;
            }
            Single singleM64266c = m64266c(q7kVarM63779i, strUri, zM88271j3);
            z650 z650Var = tfm0Var.m80695i(strString, wj30VarLogging).f46380a;
            if (zBoolValue) {
                lwrVar.m60127a(singleM64266c.flatMap(cyxVar).filter(maz.f141731V0).subscribe(new meo0(this, z650Var, z, 1)));
                return;
            }
            if (!zM88271j2) {
                lwrVar.m60127a(singleM64266c.flatMap(cyxVar).subscribe());
                return;
            }
            Maybe maybeFilter = singleM64266c.flatMap(cyxVar).filter(lazVar);
            a5j0 a5j0Var = new a5j0(20, this, strString);
            maybeFilter.getClass();
            lwrVar.m60127a(new MaybeFlatten(maybeFilter, a5j0Var).subscribe(new meo0(this, z650Var, z, 0)));
            return;
        }
        if (contextM79161s != null) {
            if (!zM88271j) {
                lwrVar.m60127a(q7kVarM63779i.mo71859a().subscribe());
                tfm0Var.m80693g(strString, wj30VarLogging);
                return;
            }
            PreparePlayOptions preparePlayOptionsM79162t = srz.m79162t(mj30Var.data());
            d850 d850VarM80696k = (preparePlayOptionsM79162t == null || (xul0VarPlayerOptionsOverride = preparePlayOptionsM79162t.playerOptionsOverride()) == null || (playerOptionOverrides = (PlayerOptionOverrides) xul0VarPlayerOptionsOverride.mo49283h()) == null || (xul0VarShufflingContext = playerOptionOverrides.shufflingContext()) == null) ? false : wj50.m88271j(xul0VarShufflingContext.mo49283h(), bool2) ? tfm0Var.m80696k(strString, wj30VarLogging) : tfm0Var.m80694h(strString, wj30VarLogging);
            z650 z650Var2 = d850VarM80696k.f46380a;
            p7k p7kVar = new p7k(strString, contextM79161s, preparePlayOptionsM79162t, d850VarM80696k);
            Single singleM64266c2 = m64266c(q7kVarM63779i, contextM79161s.uri(), zM88271j3);
            if (zBoolValue) {
                lwrVar.m60127a(singleM64266c2.flatMap(new l3d0(p7kVar, 23)).filter(gyx.f85769W0).subscribe(new meo0(this, z650Var2, z, 2)));
                return;
            }
            if (!zM88271j2) {
                lwrVar.m60127a(singleM64266c2.flatMap(new l3d0(p7kVar, 23)).subscribe());
                return;
            }
            Maybe maybeFilter2 = singleM64266c2.flatMap(new l3d0(p7kVar, 23)).filter(lazVar);
            a5j0 a5j0Var2 = new a5j0(20, this, strString);
            maybeFilter2.getClass();
            lwrVar.m60127a(new MaybeFlatten(maybeFilter2, a5j0Var2).subscribe(new meo0(this, z650Var2, z, 0)));
        }
    }

    /* JADX INFO: renamed from: c */
    public final Single m64266c(q7k q7kVar, String str, boolean z) {
        if (!z || str == null) {
            Single singleFromSupplier = Single.fromSupplier(new yh1(q7kVar, 21));
            wj50.m88279p(singleFromSupplier);
            return singleFromSupplier;
        }
        Maybe maybeFilter = vjf1.m85770t(xsr.f265652b, new d2n0(this, str, (fbk) null, 18)).filter(wyx.f256381X0);
        maybeFilter.getClass();
        Single<R> map = new MaybeToSingle(maybeFilter, null).map(new bcm0(q7kVar, 5));
        wj50.m88279p(map);
        return map;
    }
}
