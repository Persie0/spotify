package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;

/* JADX INFO: loaded from: classes10.dex */
public final class yc21 extends yb21 {

    /* JADX INFO: renamed from: f */
    public final bmm0 f271361f;

    /* JADX INFO: renamed from: g */
    public final qe70 f271362g;

    /* JADX INFO: renamed from: h */
    public final wc21 f271363h;

    /* JADX INFO: renamed from: i */
    public final Bundle f271364i;

    /* JADX INFO: renamed from: t */
    public final MobiusLoop.Controller f271365t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, p.gh00] */
    public yc21(bmm0 bmm0Var, gh00 gh00Var, wc21 wc21Var, Bundle bundle) {
        this.f271361f = bmm0Var;
        this.f271362g = (qe70) gh00Var;
        this.f271363h = wc21Var;
        Bundle bundle2 = bundle != null ? bundle.getBundle("mobius-model") : null;
        this.f271364i = bundle != null ? bundle.getBundle("uiholder") : null;
        this.f271365t = MobiusAndroid.m15618b((MobiusLoop.Factory) wc21Var.f249941a.invoke(bmm0Var), wc21Var.f249942b.invoke(bundle2), wc21Var.f249943c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.yb21
    /* JADX INFO: renamed from: f */
    public final hr91 mo80368f(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, a6j a6jVar) {
        hxi hxiVarMo34319a = ((ixi) this.f271362g.invoke(this.f271361f)).mo34319a(context, this.f271364i, layoutInflater, viewGroup);
        a6jVar.f12810c.mo31986a(new xc21(this, hxiVarMo34319a));
        return hxiVarMo34319a;
    }

    @Override // p204p.nsj
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        hr91 hr91Var = this.f271058a;
        Bundle bundleSerialize = hr91Var != null ? hr91Var.serialize() : null;
        if (bundleSerialize != null) {
            bundle.putBundle("uiholder", bundleSerialize);
        }
        gh00 gh00Var = this.f271363h.f249944d;
        if (gh00Var != null) {
            bundle.putBundle("mobius-model", (Bundle) gh00Var.invoke(this.f271365t.mo15602a()));
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
