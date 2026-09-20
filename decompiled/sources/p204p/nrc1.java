package p204p;

import android.net.Uri;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class nrc1 implements Init, z591 {
    /* JADX INFO: renamed from: a */
    public static oof1 m65475a(r3f1 r3f1Var, Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null");
        }
        oof1 oof1Var = new oof1(r3f1Var, uri, 0);
        r3f1Var.f195505a.m80961d(0, oof1Var);
        return oof1Var;
    }

    @Override // p204p.z591
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        ven0 ven0Var = (ven0) obj;
        dks dksVar = xsa0.f265551a;
        ven0Var.toString();
        return First.m15574b(ven0Var);
    }
}
